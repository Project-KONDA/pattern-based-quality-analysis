package newservelettest.neo4japitests;

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
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

public class Neo4jExperiments {
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException, IOException {
		boolean res1 = test(true);
		boolean res2 = test(false);
		System.out.println(res1 + " " + res2);
	}
	public static boolean test(boolean set) throws InvalidityException, OperatorCycleException, MissingPatternContainerException, IOException {
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
		
		String saved = pattern.myToString();
		System.out.println(saved);
		try {
			System.out.println(pattern.generateCypher());
		} catch (InvalidityException e) {
			System.out.println("no Cypher: " + e.getMessage());
		}
		
		EMFModelSave.exportToFile2(pattern, "D:", "neotest", "patternstructure");
		
		CompletePattern pattern2 = EMFModelLoad.loadCompletePattern("D:/neotest.patternstructure");
		String loaded = pattern2.myToString();
		System.out.println(loaded);
		return saved.equals(loaded);
	}
}