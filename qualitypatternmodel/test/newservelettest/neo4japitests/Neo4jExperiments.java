package newservelettest.neo4japitests;

import java.io.File;
import java.util.List;
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
import qualitypatternmodel.newservlets.initialisation.PatternBundle;
import qualitypatternmodel.newservlets.initialisation.PatternCollection;
import qualitypatternmodel.newservlets.patterns.CardPattern;
import qualitypatternmodel.newservlets.patterns.CompSetPattern;
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
	static boolean log = false;

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		boolean res1 = testSaveLoad(true);
		System.out.println("### 1 " + res1 + " ###\n");
		boolean res2 = testSaveLoad(false);
		System.out.println("### 2 " + res2 + " ###\n");
		boolean res3 = testVariantSaveLoad();
		System.out.println("### 3 " + res3 + " ###\n");
		boolean res4 = testXmlList();
		System.out.println("### 4 " + res4 + " ###\n");

		boolean res5 = testNeoVariants();
		System.out.println("### 5 " + res5 + " ###\n");
		boolean res6 = testRdfVariants();
		System.out.println("### 6 " + res6 + " ###\n");
		boolean res7 = testXmlVariants();
		System.out.println("### 7 " + res7 + " ###\n");
	}

	public static boolean testSaveLoad(boolean set) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternBundle.getConcrete(new CardPattern().getGeneric(), Language.NEO4J, "Card_neo4j", Map.of(), new String[] {}, new String[] {});

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

	private static boolean testVariantSaveLoad() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
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

		CompletePattern pattern = PatternBundle.getConcrete(new CardPattern().getGeneric(), Language.NEO4J, "Card_neo4j", Map.of(), new String[] {}, new String[] {});
//		CompletePattern pattern = GenericPatterns.getConcrete(GenericPatterns.getGenericContains(), Language.NEO4J, Map.of(), new String[] {}, new String[] {});

//		EList<Parameter> params = pattern.getParameterList().getParameters();
//		for (Parameter p: params)
//			System.out.println(p.getClass().getSimpleName());

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

	private static boolean testXmlList() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternBundle.getConcrete(new CompSetPattern().getGeneric(), Language.XML, "Comp_xml", Map.of(), new String[] {}, new String[] {});
		return testSaveAndLoad(pattern);
	}

	private static boolean testRdfVariants() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<CompletePattern> list = PatternCollection.getRdfPatterns();
		return testSaveAndLoadList(list);
	}
	private static boolean testNeoVariants() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<CompletePattern> list = PatternCollection.getNeoPatterns();
		return testSaveAndLoadList(list);
	}

	private static boolean testXmlVariants() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<CompletePattern> list = PatternCollection.getXmlPatterns();
		return testSaveAndLoadList(list);
	}

	private static boolean testSaveAndLoadList(List<CompletePattern> list) {
		int total = 0;
		int success = 0;
		boolean all = true;
		for (CompletePattern p: list) {
			boolean res = false;
			try {
				res = testSaveAndLoad(p);
			} catch (Exception e) {
				if (log) {
					e.printStackTrace();
				}
			}
			all &= res;
			System.out.println(p.getName() + " " + res);
			if (res) {
				success += 1;
			}
			total += 1;
		}
		System.out.println(success + " / " + total);
		return all;
	}

	private static boolean testSaveAndLoad(CompletePattern pattern) {
		String saved = pattern.myToString();

		String loaded = null;
		try {
			EMFModelSave.exportToFile2(pattern, "D:", "neotest", "patternstructure");
			CompletePattern pattern2 = EMFModelLoad.loadCompletePattern(PATH);
			loaded = pattern2.myToString();
		} catch (Exception e) {
			if (log) {
				e.printStackTrace();
			}
		}

		try {
	        File file = new File(PATH);
	        file.delete();
		} catch (Exception e) {
			if (log) {
				e.printStackTrace();
			}
		}

		if (log && !saved.equals(loaded)) {
			System.out.println(saved);
			System.out.println(loaded);
		}

		return saved.equals(loaded);
	}
}