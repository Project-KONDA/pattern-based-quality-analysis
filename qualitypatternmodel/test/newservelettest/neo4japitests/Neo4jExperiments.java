package newservelettest.neo4japitests;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.adaptionneo4j.Adaptionneo4jFactory;
import qualitypatternmodel.adaptionneo4j.NeoComplexEdge;
import qualitypatternmodel.adaptionneo4j.NeoEdgeLabelParam;
import qualitypatternmodel.adaptionneo4j.NeoNodeLabelsParam;
import qualitypatternmodel.adaptionneo4j.NeoPathParam;
import qualitypatternmodel.adaptionneo4j.NeoSimpleEdge;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.initialisation.GenericPatterns;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.textrepresentation.ParameterFragment;
import qualitypatternmodel.textrepresentation.ParameterPredefinition;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.textrepresentation.TextFragment;
import qualitypatternmodel.textrepresentation.TextrepresentationFactory;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

public class Neo4jExperiments {
	static String PATH = "D:/neotest.patternstructure";
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException, IOException {
		boolean res1 = testSaveLoad(true);
		System.out.println(res1);
		boolean res2 = testSaveLoad(false);
		System.out.println(res2);
		boolean res3 = testVariantSaveLoad();
		System.out.println(res3);
		boolean res4 = testXmlList();
		System.out.println(res4);
	}

	public static boolean testSaveLoad(boolean set) throws InvalidityException, OperatorCycleException, MissingPatternContainerException, IOException {
		CompletePattern pattern = GenericPatterns.getConcrete(GenericPatterns.getGenericCard(), Language.NEO4J, Map.of(), new String[] {}, new String[] {});
		
		EList<Parameter> params = pattern.getParameterList().getParameters();
		ComparisonOptionParam comp = (ComparisonOptionParam) params.get(0);
		NumberParam numb = (NumberParam) params.get(1);
		NeoNodeLabelsParam lab1 = (NeoNodeLabelsParam) params.get(2);
		NeoNodeLabelsParam lab2 = (NeoNodeLabelsParam) params.get(3);
		NeoPathParam path = (NeoPathParam) params.get(4);
		if (set) {
			comp.setValue(ComparisonOperator.EQUAL);
			numb.setValue(1.);
			lab1.getValues().add("ABC");
			lab2.getValues().add("DEF");
			
			NeoComplexEdge edge = Adaptionneo4jFactory.eINSTANCE.createNeoComplexEdge();
			NeoSimpleEdge simple1 = Adaptionneo4jFactory.eINSTANCE.createNeoSimpleEdge();
			NeoSimpleEdge simple2 = Adaptionneo4jFactory.eINSTANCE.createNeoSimpleEdge();
			NeoEdgeLabelParam label1 = Adaptionneo4jFactory.eINSTANCE.createNeoEdgeLabelParam();
			NeoEdgeLabelParam label2 = Adaptionneo4jFactory.eINSTANCE.createNeoEdgeLabelParam();
			label1.setValue("Label1");
			label2.setValue("Label2");
			simple1.setNeoEdgeLabel(label1);
			simple2.setNeoEdgeLabel(label2);
			
			edge.addNeoPathPart(simple1);
			edge.addNeoPathPart(simple2);
			path.setNeoPathPart(edge);
		} else {
			comp.clear();
			numb.clear();
			lab1.clear();
			lab2.clear();
			path.clear();
		}
		
		return testSaveAndLoad(pattern);
	}
	
	private static boolean testVariantSaveLoad() throws InvalidityException, OperatorCycleException, MissingPatternContainerException, IOException {
//		String neodefault = 
//				"{\"template\":\"Card_neo4j\","
//				+ "\"language\":\"neo4j\","
//				+ "\"name\":\"default-antipattern\","
//				+ "\"fragments\":["
//					+ "{\"text\":\"Done.\"},"
//					+ "{\"value\":\"1\",\"params\":[0,1,2,3,4]}]}";
//				"{\"template\":\"Card_neo4j\","
//				+ "\"language\":\"neo4j\","
//				+ "\"name\":\"default-antipattern\","
//				+ "\"fragments\":["
//					+ "{\"text\":\"Search for\"},"
//					+ "{\"name\":\"elements\",\"params\":[2]},"
//					+ "{\"text\":\"where the number of\"},"
//					+ "{\"name\":\"node\",\"params\":[3]},"
//					+ "{\"text\":\"that are connected via \"},"
//					+ "{\"name\":\"a dependancy\",\"params\":[4]},"
//					+ "{\"text\":\"is\"},"
//					+ "{\"name\":\"compared to\",\"params\":[0]},"
//					+ "{\"name\":\"a specific number\",\"params\":[1]},"
//					+ "{\"text\":\".\"}]}";
//		CompletePattern pattern = GenericPatterns.getConcrete(GenericPatterns.getGenericCard(), Language.NEO4J, Map.of(), new String[] {neodefault}, new String[] {});

		CompletePattern pattern = GenericPatterns.getConcrete(GenericPatterns.getGenericCard(), Language.NEO4J, Map.of(), new String[] {}, new String[] {});
//		CompletePattern pattern = GenericPatterns.getConcrete(GenericPatterns.getGenericContains(), Language.NEO4J, Map.of(), new String[] {}, new String[] {});
		
		EList<Parameter> params = pattern.getParameterList().getParameters();
		for (Parameter p: params)
			System.out.println(p.getClass().getSimpleName());
		
		PatternText text = TextrepresentationFactory.eINSTANCE.createPatternText();
		TextFragment textfrag = TextrepresentationFactory.eINSTANCE.createTextFragment();
		textfrag.setText("hallo");
		ParameterFragment paramfrag = TextrepresentationFactory.eINSTANCE.createParameterFragment();
//		"0": "Boolean",
//		"1": "Text",
//		"2": "NeoNodeLabel",
//		"3": "NeoPropertyPath"

		paramfrag.setName("textfrag");
//		paramfrag.getParameter().add(params.get(0));
//		paramfrag.getParameter().add(params.get(1));
//		paramfrag.getParameter().add(params.get(2));
//		paramfrag.getParameter().add(params.get(3));
//		paramfrag.getParameter().add(params.get(4));
		ParameterPredefinition predef = TextrepresentationFactory.eINSTANCE.createParameterPredefinition();
		text.addFragment(textfrag);
		text.addFragment(paramfrag);
		text.getParameterPredefinitions().add(predef);
		pattern.getText().add(text);

		return testSaveAndLoad(pattern);
	}
	
	private static boolean testXmlList() throws IOException, InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getConcrete(GenericPatterns.getGenericCompSet(), Language.XML, Map.of(), new String[] {}, new String[] {});
		return testSaveAndLoad(pattern);
	}
	
	private static boolean testSaveAndLoad(CompletePattern pattern) throws IOException {
		String saved = pattern.myToString();
		
		EMFModelSave.exportToFile2(pattern, "D:", "neotest", "patternstructure");

		String loaded = null;
		try {
			CompletePattern pattern2 = EMFModelLoad.loadCompletePattern(PATH);
			loaded = pattern2.myToString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
	        File file = new File(PATH);
	        file.delete();
		} catch (Exception e) {}
		
		return saved.equals(loaded);
		
	}
}