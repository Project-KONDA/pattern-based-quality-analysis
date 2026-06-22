package newservelettest.templatetests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.ServletUtilities;
import qualitypatternmodel.newservlets.initialisation.PatternCollection;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.Util;
import qualitypatternmodel.utility.xmlprocessors.XQueryProcessorSaxon;

public class TemplateTest {

	static String PARAMS = "params";
	static String EXPECTED = "expected";
	static String DEACTIVATED = "deactivated";
	static String TEST = "test";
	static boolean onlyTest = false;
	static boolean addTestPatterns = true;
	static boolean ignoreDeactivated = true;
	static boolean debugShowQuery = false;

	static String pathConfig = "test\\newservelettest\\templatetests\\template-config.json";
	static String pathConfigMissing = "test\\newservelettest\\templatetests\\template-config-missing.json";
	static String pathData = "test\\newservelettest\\templatetests\\template-data.xml";

	private static List<PatternClass> getPatternClazzes() {
		List<PatternClass> patternClazzes = PatternCollection.getPatternClassInstances();
		if (addTestPatterns)
			patternClazzes.addAll(PatternCollection.getPatternClassTestInstances());
		return patternClazzes;
	}
	
	public static void main(String[] args) throws IOException, InvalidityException, OperatorCycleException, MissingPatternContainerException {
		JSONObject config = Util.loadJson(pathConfig);
		JSONObject configMissing = new JSONObject();

		for (PatternClass patternclazz: getPatternClazzes()) {
//			if (config.has(patternclazz.id) && config.getJSONArray(patternclazz.id).isEmpty()) {
//				config.remove(patternclazz.id);
//				System.out.println( "'" + patternclazz.id + "' empty");
//				missingArray = true;
//			}
			if (!config.has(patternclazz.id) || config.getJSONArray(patternclazz.id).isEmpty()) {
				EList<Parameter> params = patternclazz.getXmlPattern().getParameterList().getParameters();
				JSONObject paramjson = new JSONObject();
				for (int i = 0; i<params.size(); i++) {
					paramjson.put(""+i, params.get(i).getClass().getSimpleName().replace("ParamImpl", ""));
				}
				configMissing.put(patternclazz.id, paramjson);
				config.put(patternclazz.id, new JSONArray());
			}
		}
//		if (missingArray) {
//			Util.exportJson(config, pathConfig);
//		}
		Util.exportJson(configMissing, pathConfigMissing);
		System.out.println(configMissing.length() + " out of " + getPatternClazzes().size() + " templates not tested");
	}



    static List<Arguments> argumentProvider() throws IOException {
		JSONObject config = Util.loadJson(pathConfig);
    	List<Arguments> args = new ArrayList<Arguments>();
		for (String key : config.keySet()) {
			
			JSONArray array = config.getJSONArray(key);
			for (int i = 0; i<array.length(); i++) {
				JSONObject json = array.getJSONObject(i);
				boolean isTest = json.has(TEST) && json.getBoolean(TEST);
				boolean isActive = !json.has(DEACTIVATED) || !json.getBoolean(DEACTIVATED);
				
				if ((ignoreDeactivated || isActive) && (!onlyTest || isTest))
						args.add(Arguments.of(key, json.getJSONObject(PARAMS), json.getJSONObject(EXPECTED), json.has(TEST)));
			}
		}
		if (onlyTest && args.size() == 0) {
			System.err.println("NO TESTS FOUND, EXECUTING ALL TESTS");
			onlyTest = false;
			return argumentProvider();
		}	
        return args;
    }

	@ParameterizedTest
    @MethodSource("argumentProvider")
	public void testPattern(String id, JSONObject params, JSONObject expected, boolean debug) throws InvalidityException, OperatorCycleException, MissingPatternContainerException, JSONException, InvalidServletCallException, FailedServletCallException {
		CompletePattern pattern;
		try{
			pattern = findPattern(id);
		} catch (Exception e) {
			System.err.println("Pattern '" + id + "' is missing"); 
			return;
		}
		parameterizePattern(pattern, params);
		JSONObject query = ServletUtilities.generateQueryJson(pattern);
		JSONObject result = XQueryProcessorSaxon.queryConstraintsFilePaths(Arrays.asList(query), Arrays.asList(pathData));
		if (debug) {
			if (debugShowQuery) {
				System.out.println("\nQUERY");
				System.out.println(query.toString(2));
			}
			System.out.println("\nRESULT");
			System.out.println(result.toString(2));
			System.out.println("\nEXPECTED");
			System.out.println(expected.toString(2));
		}
		assertJSONObject(expected, result);
	}

	private static CompletePattern findPattern(String id) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		for (PatternClass patternclazz: getPatternClazzes()) {
			if (patternclazz.id.equals(id)) {
				return patternclazz.getXmlPattern();
			}
		}
		throw new InvalidityException("No pattern '" + id + "' found in PatternCollection");
	}
 
	private static void parameterizePattern(CompletePattern pattern, JSONObject jsonObject) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ParameterList params = pattern.getParameterList();
		for (String key: jsonObject.keySet()) {
			int paramid = Integer.parseInt(key);
			String value = jsonObject.getString(key);
			try {
				params.getParameters().get(paramid).setValueFromString(value);
			} catch (InvalidityException e) {
				throw new InvalidityException(pattern.getAbstractId() + " (param " + paramid + "): " + e.getMessage(), e);
			}
		}
		pattern.isValid(AbstractionLevel.CONCRETE);
	}

	private static void assertJSONObject(JSONObject expected, JSONObject result) {
		for (String key : expected.keySet()) {
			assert(result.has(key));
			switch(expected.get(key).getClass().getSimpleName()) {
			case "String":
			case "Integer":
					assertEquals(expected.get(key), result.get(key), key);
					break;
				case "JSONObject":
					assertJSONObject(expected.getJSONObject(key), result.getJSONObject(key));
					break;
				case "JSONArray":
					int len = expected.getJSONArray(key).length();
					assertEquals(len, result.getJSONArray(key).length(), key);
					for (int i = 0; i<len; i++) {
						assert(expected.getJSONArray(key).get(i) instanceof JSONObject);
						assert(result.getJSONArray(key).get(i) instanceof JSONObject);
						assertJSONObject(expected.getJSONArray(key).getJSONObject(i), result.getJSONArray(key).getJSONObject(i));
					}
					break;
				default:
					System.out.println(expected.get(key).getClass().getSimpleName() + " not found");
					
			}
		}
	}
}
