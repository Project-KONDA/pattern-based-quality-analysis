package patterntoconstrainttranslation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.basex.core.Context;
import org.basex.core.cmd.CreateDB;
import org.basex.query.QueryProcessor;
import org.basex.query.iter.Iter;
import org.basex.query.value.item.Item;
import org.eclipse.emf.common.util.EList;

import de.gwdg.metadataqa.api.calculator.CalculatorFacade;
import de.gwdg.metadataqa.api.configuration.MeasurementConfiguration;
import de.gwdg.metadataqa.api.schema.BaseSchema;
import qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.impl.BooleanParamImpl;
import qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl;
import qualitypatternmodel.parameters.impl.NumberParamImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.impl.NumberElementImpl;

import static qualitypatternmodel.xmltestutility.DatabaseConstants.DEMO_DATABASE_NAME;
import static qualitypatternmodel.xmltestutility.DatabaseConstants.DEMO_DATA_PATH;
import static qualitypatternmodel.xmltestutility.DatabaseConstants.DEMO_XQUERY_RECORD_PATH;
import static qualitypatternmodel.xmltestutility.DatabaseConstants.DEMO_XQUERY_RECORD_SOURCE_PATH;

public class ConstraintApplicationTest {

	private static String RECORD_PATH = "/*[name() = \"demo:data\"]/*";
	private static String SOURCEFIELD_PATH = "/*[name() = \"demo:source\"]/data()";

	public static void main(String[] args) throws Exception {
		evaluatePatternConstraintTranslation(cardinalityPattern(), "ruleCatalog:FieldNode:minCount:1");
//		evaluatePatternConstraintTranslation(getPatternSourceContainsWikipedia(), "ruleCatalog:ruleCatalog:score");
	}	
		
	
	public static void evaluatePatternConstraintTranslation(CompletePattern pattern, String feature) throws InvalidityException {
		List<String> records = getRecords();
		
		List<Boolean> patternResultIndices = calculatePatternBooleanResults(pattern);
		
		List<Map<String, Object>> constraintResults = calculateConstraintResults( pattern.generateXmlConstraintSchema(), records);
		List<Boolean> constraintResultIndices = getConstraintResultIndices(constraintResults, feature);
		
		List<Boolean> comparisonResults =  compareResults(patternResultIndices, constraintResultIndices);
		if (!comparisonResults.contains(false)) {
			System.out.println("TEST SUCCESS");
		}
		else {
			System.out.println("TEST FAILED");
			System.out.println("Fail/Ptt/Cst/Map");
			for (int i = 0; i < comparisonResults.size(); i++)
				System.out.println(
					"  " + (comparisonResults.get(i)? " ": "X") + "   "
					+ (patternResultIndices.get(i)? "1": "0") + "   "
					+ (constraintResultIndices.get(i)? "1": "0") + "  "
					+ constraintResults.get(i));
		}
	}
	
	
	
	private static List<Map<String, Object>> calculateConstraintResults(BaseSchema schema, List<String> records) {

		MeasurementConfiguration config = new MeasurementConfiguration().enableRuleCatalogMeasurement();

		Map<String, String> namespaces = new HashMap<String,String>();
		schema.setNamespaces(namespaces);

		CalculatorFacade calculator = new CalculatorFacade(config); // use configuration
		calculator.setSchema(schema);
		calculator.configure();
		
		List<Map<String, Object>> csvresults = new ArrayList<Map<String, Object>>();
		for (String record: records)
			csvresults.add(calculator.measureAsMap(record));
		
		return csvresults;
	}
	
	private static List<Boolean> getConstraintResultIndices(List<Map<String, Object>> csvresultmap, String feature){
		List<Boolean> result = new ArrayList<Boolean>();
		for (Map<String, Object> map: csvresultmap) {
			if (map.get(feature) == null){
				throw new NullPointerException("Feature not correctly defined: " + feature + " is not in: " + map.keySet());
			}
			Boolean bi = map.get(feature).toString().equals("1");
			result.add(bi);
		}
		return result;
	}
	
	private static List<String> getRecords() {
		return queryXmlDB(DEMO_DATABASE_NAME, DEMO_DATA_PATH, DEMO_XQUERY_RECORD_PATH);
	}
	
	private static List<Boolean> calculatePatternBooleanResults(CompletePattern pattern) throws InvalidityException{
		List<Boolean> booleans = new ArrayList<Boolean>();
		List<String> records = getRecords();
		List<String> patternresults = queryXmlDB(DEMO_DATABASE_NAME, DEMO_DATA_PATH, pattern.generateXQuery());
		
		for (int i = 0; i< records.size(); i++)
			booleans.add(!patternresults.contains(records.get(i)));
		// only records in the result list are flawed
		
		return booleans;
	}
	
	private static List<String> queryXmlDB(String databasename, String datapath, String query){
		List<String> results = new ArrayList<String>();
		Context context = new Context();
		try {
			new CreateDB(databasename, datapath).execute(context);
	
			try (QueryProcessor proc = new QueryProcessor(query, context)) {
				Iter iter = proc.iter();
				for (Item item; ((item = iter.next()) != null);) {
					results.add(item.serialize().toString());
				}
			}
			context.closeDB();
			context.close();
		} catch (Exception e) { // QueryIOException  QueryException BaseXException
			e.printStackTrace();
		}
		return results;
	}

	static List<Boolean> compareResults(List<Boolean> patternBooleanResults, List<Boolean> constraintBooleanResults){
		List<Boolean> result = new ArrayList<Boolean>();
		for (int i = 0; i < patternBooleanResults.size() && i < constraintBooleanResults.size() ; i++)
			result.add(patternBooleanResults.get(i) == constraintBooleanResults.get(i));
		return result;
	}
	
	
	
	
	// Real Patterns
	
	@SuppressWarnings("unused")
	private static CompletePattern getPatternSourceContainsWikipedia() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setDescription("Source-Contains-Wikipedia-Comparison:");
		QuantifiedCondition cond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(cond);
		Graph g = cond.getGraph();
		
		Node ret = completePattern.getGraph().getNodes().get(0);
		Node n2 = ret.addOutgoing(g).getTarget().makePrimitive();
		
		n2.addPrimitiveContains();
		
		completePattern.createXmlAdaption();
		
		EList<Parameter> params = completePattern.getParameterList().getParameters();
		BooleanParamImpl p0 = (BooleanParamImpl) params.get(0);
		TextLiteralParamImpl p1 = (TextLiteralParamImpl) params.get(1);
		XmlPathParamImpl p2 = (XmlPathParamImpl) params.get(2);
		XmlPathParamImpl p3 = (XmlPathParamImpl) params.get(3);
		
		p0.setValue(false);
		p1.setValue("wikipedia");
		p2.setValueFromString(DEMO_XQUERY_RECORD_PATH); // path to record
		p3.setValueFromString(DEMO_XQUERY_RECORD_SOURCE_PATH); // path record to field
		
		return completePattern;
	}
	
	private static CompletePattern cardinalityPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setDescription("Count lessthan 1");
		CountCondition ccond = PatternstructureFactory.eINSTANCE.createCountCondition();
		completePattern.setCondition(ccond);
		CountPattern cp = ccond.getCountPattern();
		ccond.setArgument2(new NumberElementImpl());
				
		Graph g1 = completePattern.getGraph();
		Graph g2 = cp.getGraph();
		
		Node ret = g1.getNodes().get(0).makeComplex();
		ret.setName("RecordNode");
		
		Node recCopy = g2.addPrimitiveNode();
		ret.addOutgoing(recCopy);
		recCopy.setName("FieldNode");
		recCopy.setReturnNode(true);
		
		completePattern.createXmlAdaption();
		
		EList<Parameter> params = completePattern.getParameterList().getParameters();
//		for (Parameter p: params)
//			System.out.println(p.getClass().getSimpleName() + " p" + params.indexOf(p) + " = (" + p.getClass().getSimpleName()+ ") params.get(" + params.indexOf(p) + ");" );
		
		ComparisonOptionParamImpl p0 = (ComparisonOptionParamImpl) params.get(0);
		NumberParamImpl p1 = (NumberParamImpl) params.get(1);
		XmlPathParamImpl p2 = (XmlPathParamImpl) params.get(2);
		XmlPathParamImpl p3 = (XmlPathParamImpl) params.get(3);
		
		
		p0.setValue(ComparisonOperator.LESS);
		p1.setValue(1.);
		p2.setValueFromString(RECORD_PATH);
		p3.setValueFromString(SOURCEFIELD_PATH);
		
//		System.out.println(completePattern.myToString());
		
		return completePattern;
	}

}
