package qualitypatternmodel.translationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.testutilityclasses.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.operators.*;
import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;

public class Test10Reference {

	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternReferenceSimple());
		completePatterns.add(getPatternReferenceTwoReference());
		completePatterns.add(getPatternReferenceParallelNavigation());
		completePatterns.add(getPatternReferencePropertyLocationsParallel());
//		completePatterns.add(getPatternReferenceSameProp()); // TODO: this case seems unrealistic in practice since one property represents the reference and the other a unique identifier		
		Test00.test(completePatterns);
	}

	
	public static CompletePattern getPatternReferenceSimple() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;	
		
		CompletePattern completePattern = Test03Quantor.getPatternExists();
		Graph graph = ((QuantifiedCondition) completePattern.getCondition()).getGraph();

		Element element0 = graph.getElements().get(0);
		Element element1 = graph.getElements().get(1);
				
		Relation relation = graphstructureFactory.createRelation();
		relation.setGraph(graph);
		relation.setSource(element0);
		relation.setTarget(element1);	
		
		completePattern.createXMLAdaption();
		XmlReference reference = graph.getRelations().get(0).adaptAsXMLReference();	
		reference.setType(ReturnType.STRING);
		completePattern.finalizeXMLAdaption();
		
		return completePattern;		
	}
	
	public static CompletePattern getPatternReferenceTwoReference() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;	
		
		CompletePattern completePattern = Test03Quantor.getPatternExists();
		Graph graph = ((QuantifiedCondition) completePattern.getCondition()).getGraph();

		Element element0 = graph.getElements().get(0);
		Element element1 = graph.getElements().get(1);
		Element element2 = graphstructureFactory.createElement();
		element2.setGraph(graph);
				
		Relation relation = graphstructureFactory.createRelation();
		relation.setGraph(graph);
		relation.setSource(element0);
		relation.setTarget(element1);	
		
		Relation relation2 = graphstructureFactory.createRelation();
		relation2.setGraph(graph);
		relation2.setSource(element2);
		relation2.setTarget(element1);
		
		completePattern.createXMLAdaption();
		XmlReference reference = graph.getRelations().get(0).adaptAsXMLReference();	
		reference.setType(ReturnType.STRING);
		XmlReference reference2 = graph.getRelations().get(0).adaptAsXMLReference();	
		reference2.setType(ReturnType.STRING);
		completePattern.finalizeXMLAdaption();
		
		return completePattern;		
	}
	
	public static CompletePattern getPatternReferenceParallelNavigation() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;	
		
		CompletePattern completePattern = Test03Quantor.getPatternExists();
		Graph graph = ((QuantifiedCondition) completePattern.getCondition()).getGraph();

		Element element0 = graph.getElements().get(0);
		Element element1 = graph.getElements().get(1);
				
		Relation relation = graphstructureFactory.createRelation();
		relation.setGraph(graph);
		relation.setSource(element0);
		relation.setTarget(element1);	
		
		Relation relation2 = graphstructureFactory.createRelation();
		relation2.setGraph(graph);
		relation2.setSource(element0);
		relation2.setTarget(element1);	
		
		completePattern.createXMLAdaption();
		graph.getRelations().get(0).adaptAsXMLNavigation();
		XmlReference reference = graph.getRelations().get(0).adaptAsXMLReference();	
		reference.setType(ReturnType.STRING);
		completePattern.finalizeXMLAdaption();
		
		return completePattern;		
	}
	
	public static CompletePattern getPatternReferencePropertyLocationsParallel() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;	
		
		CompletePattern completePattern = Test03Quantor.getPatternExists();
		Graph graph = ((QuantifiedCondition) completePattern.getCondition()).getGraph();

		Element element0 = graph.getElements().get(0);
		Element element1 = graph.getElements().get(1);
				
		Relation relation = graphstructureFactory.createRelation();
		relation.setGraph(graph);
		relation.setSource(element0);
		relation.setTarget(element1);
		
		Relation relation1 = graphstructureFactory.createRelation();
		relation1.setGraph(graph);
		relation1.setSource(element0);
		relation1.setTarget(element1);	
		
		Relation relation2 = graphstructureFactory.createRelation();
		relation2.setGraph(graph);
		relation2.setSource(element0);
		relation2.setTarget(element1);	
		
		completePattern.createXMLAdaption();
		XmlReference reference = graph.getRelations().get(0).adaptAsXMLReference();	
		reference.setType(ReturnType.STRING);
		reference.getSourceProperty().getOption().getOptions().add(PropertyKind.ATTRIBUTE);
		reference.getSourceProperty().getOption().setValue(PropertyKind.ATTRIBUTE);
		reference.getSourceProperty().getAttributeName().setValue("prop");
		XmlReference reference1 = graph.getRelations().get(0).adaptAsXMLReference();	
		reference1.setType(ReturnType.STRING);
		reference1.getSourceProperty().getOption().getOptions().add(PropertyKind.TAG);
		reference1.getSourceProperty().getOption().setValue(PropertyKind.TAG);
		XmlReference reference2 = graph.getRelations().get(0).adaptAsXMLReference();	
		reference2.setType(ReturnType.STRING);
		reference2.getSourceProperty().getOption().getOptions().add(PropertyKind.DATA);
		reference2.getSourceProperty().getOption().setValue(PropertyKind.DATA);
		completePattern.finalizeXMLAdaption();
		
		return completePattern;		
	}

	
//	public static CompletePattern getPatternReferenceSameProp() {
//		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;
//		OperatorsPackage.eINSTANCE.eClass();
//		OperatorsFactory operatorFactory = OperatorsFactory.eINSTANCE;
//		
//		
//		CompletePattern pattern = Test03Quantor.getPatternExists();
//		Graph graph = ((QuantifiedCondition) pattern.getCondition()).getGraph();
//		OperatorList oplist = graph.getOperatorList();
//		Element ret = graph.getReturnElements().get(0);
//		Element ele = ret.getNextElements().get(0);
//		
//		ReferenceOperator refop = operatorFactory.createReferenceOperator();
//
//		Property prop1 = graphstructureFactory.createProperty();		
//		prop1.setElement(ret);
//		prop1.createParameters();
//		
//		Property prop2 = graphstructureFactory.createProperty();		
//		prop2.setElement(ele);
//		prop2.setAttributeName(prop1.getAttributeName());
//		prop2.setOption(prop1.getOption());
//		
//		oplist.add(refop);
//		refop.setProperty1(prop2);	
//		refop.setProperty2(prop1);
//		return pattern;		
//	}
	
	public static List<PatternTestPair> getTestPairs() {
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		
		testPairs.add(new PatternTestPair("REF", getPatternReferenceSimple(), ""));
		testPairs.add(new PatternTestPair("REFREF", getPatternReferenceTwoReference(), ""));
		testPairs.add(new PatternTestPair("REFNAV", getPatternReferenceParallelNavigation(), ""));
		testPairs.add(new PatternTestPair("REFPROP", getPatternReferencePropertyLocationsParallel(), ""));
		
		// TODO: complete test cases
		
		return testPairs;
	}

}
