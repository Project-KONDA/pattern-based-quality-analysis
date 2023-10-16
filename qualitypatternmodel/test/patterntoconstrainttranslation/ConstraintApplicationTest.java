package patterntoconstrainttranslation;

import java.util.ArrayList;
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
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.impl.BooleanParamImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

import static qualitypatternmodel.xmltestutility.DatabaseConstants.DEMO_DATABASE_NAME;
import static qualitypatternmodel.xmltestutility.DatabaseConstants.DEMO_DATA_PATH;
import static qualitypatternmodel.xmltestutility.DatabaseConstants.DEMO_XQUERY_RECORD_PATH;
import static qualitypatternmodel.xmltestutility.DatabaseConstants.DEMO_XQUERY_RECORD_SOURCE_PATH;

public class ConstraintApplicationTest {


	public static void main(String[] args) throws Exception {
		List<String> records = getRecords(0);
		for (String record: records)
			System.out.println(record);

		
		MeasurementConfiguration config = new MeasurementConfiguration().enableCompletenessMeasurement();
		CompletePattern pattern = getPatternSourceContainsWikipedia();
		
		BaseSchema schema = pattern.generateXmlConstraintSchema();
		String content = pattern.generateXmlConstraintYAMLFileContent();

		System.out.println("____\n" + content + "\n_____");
		
		CalculatorFacade calculator = new CalculatorFacade(config); // use configuration
		calculator.setSchema(schema).configure();
		
		List<Map<String, Object>> csvresults = new ArrayList<Map<String, Object>>();
		for (String record: records)
			csvresults.add(calculator.measureAsMap(record));
		for (Map<String, Object> csvresultmap: csvresults)
			System.out.println(csvresultmap);

	}
	
	private static List<String> getRecords(int max) {
		List<String> records = new ArrayList<String>();
		records = queryXmlDB(DEMO_DATABASE_NAME, DEMO_DATA_PATH, DEMO_XQUERY_RECORD_PATH, max);
		return records;
	}
	
	private static List<String> queryXmlDB(String databasename, String datapath, String query, Integer max){
		List<String> results = new ArrayList<String>();
		Context context = new Context();
		try {
			new CreateDB(databasename, datapath).execute(context);
	
			int i = 0;
			try (QueryProcessor proc = new QueryProcessor(query, context)) {
				Iter iter = proc.iter();
				for (Item item; ((item = iter.next()) != null) && (i < max || max == 0);) {
					results.add(item.serialize().toString());
					i++;
				}
			} 
			context.closeDB();
			context.close();
		} catch (Exception e) { // QueryIOException  QueryException BaseXException
			e.printStackTrace();
		}
		return results;
	}
	
	
	// Real Patterns
	
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
	
//	private static BaseSchema getBaseSchema(int i) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = ConstraintToStringTranslationTest.getTestPatternCreationFunctionCollection().get(i).apply();
//		return pattern.generateXmlConstraintSchema();
//	}

//	private static List<String> queryXmlDB(String databasename, String datapath, String query){
//		return queryXmlDB(databasename, datapath, query, 0);
//	}

}
