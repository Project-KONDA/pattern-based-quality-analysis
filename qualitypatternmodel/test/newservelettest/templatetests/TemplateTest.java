package newservelettest.templatetests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
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
		ObjectNode config = Util.loadJson(pathConfig);
		ObjectNode configMissing = Util.jsonCreateObject();

		for (PatternClass patternclazz: getPatternClazzes()) {
//			if (config.has(patternclazz.id) && config.getJSONArray(patternclazz.id).isEmpty()) {
//				config.remove(patternclazz.id);
//				System.out.println( "'" + patternclazz.id + "' empty");
//				missingArray = true;
//			}
			if (!config.has(patternclazz.id) || !config.get(patternclazz.id).isArray() || config.get(patternclazz.id).size() == 0) {
				EList<Parameter> params = patternclazz.getXmlPattern().getParameterList().getParameters();
				ObjectNode paramjson = Util.jsonCreateObject();
				for (int i = 0; i<params.size(); i++) {
					paramjson.put(""+i, params.get(i).getClass().getSimpleName().replace("ParamImpl", ""));
				}
				configMissing.set(patternclazz.id, paramjson);
				config.set(patternclazz.id, Util.jsonCreateArray());
			}
		}
//		if (missingArray) {
//			Util.exportJson(config, pathConfig);
//		}
		Util.exportJson(configMissing, pathConfigMissing);
		System.out.println(configMissing.size() + " out of " + getPatternClazzes().size() + " templates not tested");
	}



    static List<Arguments> argumentProvider() throws IOException {
		ObjectNode config = Util.loadJson(pathConfig);
    	List<Arguments> args = new ArrayList<Arguments>();
    	int no = 0;
		for (String key : Util.jsonKeySet(config)) {
			
			ArrayNode array = (ArrayNode) config.get(key);
			for (int i = 0; i<array.size(); i++) {
				ObjectNode json = (ObjectNode) array.get(i);
				boolean isTest = json.has(TEST) && json.get(TEST).asBoolean();
				boolean isActive = !json.has(DEACTIVATED) || !json.get(DEACTIVATED).asBoolean();
				
				if ((ignoreDeactivated || isActive) && (!onlyTest || isTest)) {
					args.add(Arguments.of(key, no, json.get(PARAMS), json.get(EXPECTED), json.has(TEST)));
					no++;
				}
						
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
	public void testPattern(String id, int no, ObjectNode params, ObjectNode expected, boolean debug) throws InvalidityException, OperatorCycleException, MissingPatternContainerException, InvalidServletCallException, FailedServletCallException {
		CompletePattern pattern;
		try{
			pattern = findPattern(id);
		} catch (Exception e) {
			System.err.println("Pattern '" + id + "' is missing"); 
			return;
		}
		parameterizePattern(pattern, params);
		ObjectNode query = ServletUtilities.generateQueryJson(pattern);
		Long time = System.currentTimeMillis();
		ObjectNode result = XQueryProcessorSaxon.queryConstraintsFilePaths(Arrays.asList(query), Arrays.asList(pathData));
		time = System.currentTimeMillis() - time;
		System.out.println(no + "\t" + id + "\t" + time); // + "\t" + params.toString());
		if (debug) {
			if (debugShowQuery) {
				System.out.println("\nQUERY");
				System.out.println(Util.jsonPretty(query));
			}
			System.out.println("\nRESULT");
			ObjectNode res = new com.fasterxml.jackson.databind.ObjectMapper().createObjectNode();
			res.set("totalIncidents", result.get("totalIncidents"));
			res.set("totalFindings", result.get("totalFindings"));
			res.set("incidents", result.get("result").get(0).get("incidents"));
			System.out.println(res.toPrettyString());
			System.out.println("\nEXPECTED");
			System.out.println(expected.toPrettyString());
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
 
	private static void parameterizePattern(CompletePattern pattern, ObjectNode nodeObject) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ParameterList params = pattern.getParameterList();
		for (String key: Util.jsonKeySet(nodeObject)) {
			int paramid = Integer.parseInt(key);
			String value = nodeObject.get(key).asText();
			try {
				params.getParameters().get(paramid).setValueFromString(value);
			} catch (InvalidityException e) {
				throw new InvalidityException(pattern.getAbstractId() + " (param " + paramid + "): " + e.getMessage(), e);
			}
		}
		pattern.isValid(AbstractionLevel.CONCRETE);
	}

	private static void assertJSONObject(ObjectNode expected, ObjectNode result) {
		for (String key : Util.jsonKeySet(expected)) {
			assert(result.has(key));
			switch(expected.get(key).isObject() ? "Object" : expected.get(key).isArray() ? "Array" : "Value") {
			case "Value":
					assertEquals(expected.get(key), result.get(key), key);
					break;
				case "Object":
					assertJSONObject((ObjectNode) expected.get(key), (ObjectNode) result.get(key));
					break;
				case "Array":
					int len = expected.get(key).size();
					assertEquals(len, result.get(key).size(), key);
					for (int i = 0; i<len; i++) {
						assert(((ArrayNode) expected.get(key)).get(i) instanceof ObjectNode);
						assert(((ArrayNode) result.get(key)).get(i) instanceof ObjectNode);
						assertJSONObject((ObjectNode) ((ArrayNode) expected.get(key)).get(i), (ObjectNode) ((ArrayNode) result.get(key)).get(i));
					}
					break;
				default:
					System.out.println(expected.get(key).getClass().getSimpleName() + " not found");
					
			}
		}
	}
}
