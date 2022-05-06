package qualitypatternmodel.translationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.testutility.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.operators.*;
import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.AxisKind;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
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

	
	public static CompletePattern getPatternReferenceSimple() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;	
		
		CompletePattern completePattern = Test03Quantor.getPatternExists();
		Graph graph = ((QuantifiedCondition) completePattern.getCondition()).getGraph();

		Node element0 = graph.getNodes().get(0);
		Node element1 = graph.getNodes().get(1);
				
		Relation relation = graphstructureFactory.createRelation();
		relation.setGraph(graph);
		relation.setSource(element0);
		relation.setTarget(element1);	
		
		completePattern.createXMLAdaption();
		XmlReference reference = graph.getRelations().get(0).adaptAsXMLReference();	
		reference.setType(ReturnType.STRING);
		completePattern.finalizeXMLAdaption();
		
//		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getPathParam().getOptions().add(AxisKind.DESCENDANT);
		((XmlElementNavigation) completePattern.getGraph().getRelations().get(0)).getPathParam().setAxis(AxisKind.DESCENDANT, "");
		
//		((XmlNavigation) ((QuantifiedCondition) completePattern.getCondition()).getGraph().getRelations().get(2)).getPathParam().getOptions().add(AxisKind.DESCENDANT);
		((XmlElementNavigation) ((QuantifiedCondition) completePattern.getCondition()).getGraph().getRelations().get(2)).getPathParam().setAxis(AxisKind.DESCENDANT, "");
		
		return completePattern;		
	}
	
	public static CompletePattern getPatternReferenceTwoReference() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;	
		
		CompletePattern completePattern = Test03Quantor.getPatternExists();
		Graph graph = ((QuantifiedCondition) completePattern.getCondition()).getGraph();

		Node element0 = graph.getNodes().get(0);
		Node element1 = graph.getNodes().get(1);
		Node element2 = graphstructureFactory.createNode();
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
		
//		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getPathParam().getOptions().add(AxisKind.DESCENDANT);
		((XmlElementNavigation) completePattern.getGraph().getRelations().get(0)).getPathParam().setAxis(AxisKind.DESCENDANT, "");
		
//		((XmlNavigation) ((QuantifiedCondition) completePattern.getCondition()).getGraph().getRelations().get(3)).getPathParam().getOptions().add(AxisKind.DESCENDANT);
		((XmlElementNavigation) ((QuantifiedCondition) completePattern.getCondition()).getGraph().getRelations().get(3)).getPathParam().setAxis(AxisKind.DESCENDANT, "");
		
//		((XmlNavigation) ((QuantifiedCondition) completePattern.getCondition()).getGraph().getRelations().get(4)).getPathParam().getOptions().add(AxisKind.DESCENDANT);
		((XmlElementNavigation) ((QuantifiedCondition) completePattern.getCondition()).getGraph().getRelations().get(4)).getPathParam().setAxis(AxisKind.DESCENDANT, "");
		
		return completePattern;		
	}
	
	public static CompletePattern getPatternReferenceParallelNavigation() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;	
		
		CompletePattern completePattern = Test03Quantor.getPatternExists();
		Graph graph = ((QuantifiedCondition) completePattern.getCondition()).getGraph();

		Node element0 = graph.getNodes().get(0);
		Node element1 = graph.getNodes().get(1);
				
		Relation relation = graphstructureFactory.createRelation();
		relation.setGraph(graph);
		relation.setSource(element0);
		relation.setTarget(element1);	
		
		Relation relation2 = graphstructureFactory.createRelation();
		relation2.setGraph(graph);
		relation2.setSource(element0);
		relation2.setTarget(element1);	
		
		completePattern.createXMLAdaption();
		graph.getRelations().get(0).adaptAsXMLElementNavigation();
		XmlReference reference = graph.getRelations().get(0).adaptAsXMLReference();	
		reference.setType(ReturnType.STRING);
		completePattern.finalizeXMLAdaption();
		
		((XmlElementNavigation) completePattern.getGraph().getRelations().get(0)).getPathParam().setValue(AxisKind.TWOCHILD);
		
		reference.getSourcePropertyPath().getPropertyOptionParam().setValue(PropertyKind.ATTRIBUTE);
		reference.getSourcePropertyPath().getPropertyOptionParam().getAttributeName().setValue("demo:id");;
		
		return completePattern;		
	}
	
	public static CompletePattern getPatternReferencePropertyLocationsParallel() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;	
		
		CompletePattern completePattern = Test03Quantor.getPatternExists();
		Graph graph = ((QuantifiedCondition) completePattern.getCondition()).getGraph();

		Node element0 = graph.getNodes().get(0);
		Node element1 = graph.getNodes().get(1);
				
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
//		reference.getSourceProperty().getOption().getOptions().add(PropertyKind.ATTRIBUTE);
		reference.getSourcePropertyPath().getPropertyOptionParam().setValue(PropertyKind.ATTRIBUTE);
		reference.getSourcePropertyPath().getPropertyOptionParam().getAttributeName().setValue("demo:lang");
//		reference.getTargetProperty().getOption().getOptions().add(PropertyKind.ATTRIBUTE);
		reference.getTargetPropertyPath().getPropertyOptionParam().setValue(PropertyKind.ATTRIBUTE);
		reference.getTargetPropertyPath().getPropertyOptionParam().getAttributeName().setValue("demo:lang");
		
		XmlReference reference1 = graph.getRelations().get(0).adaptAsXMLReference();	
		reference1.setType(ReturnType.STRING);
//		reference1.getSourceProperty().getOption().getOptions().add(PropertyKind.TAG);
		reference1.getSourcePropertyPath().getPropertyOptionParam().setValue(PropertyKind.TAG);
//		reference1.getTargetProperty().getOption().getOptions().add(PropertyKind.TAG);
		reference1.getTargetPropertyPath().getPropertyOptionParam().setValue(PropertyKind.TAG);
		
		XmlReference reference2 = graph.getRelations().get(0).adaptAsXMLReference();	
		reference2.setType(ReturnType.STRING);
//		reference2.getSourceProperty().getOption().getOptions().add(PropertyKind.DATA);
		reference2.getSourcePropertyPath().getPropertyOptionParam().setValue(PropertyKind.DATA);
//		reference2.getTargetProperty().getOption().getOptions().add(PropertyKind.DATA);
		reference2.getTargetPropertyPath().getPropertyOptionParam().setValue(PropertyKind.DATA);
		completePattern.finalizeXMLAdaption();

		((XmlElementNavigation) completePattern.getGraph().getRelations().get(0)).getPathParam().setValue(AxisKind.THREECHILD);
		((XmlElementNavigation) ((QuantifiedCondition) completePattern.getCondition())
				.getGraph().getRelations().get(4)).getPathParam().setValue(AxisKind.THREECHILD);
		
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
	
	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		
		testPairs.add(new PatternTestPair("REF", getPatternReferenceSimple(), "//*[./text()]"));
		testPairs.add(new PatternTestPair("REFREF", getPatternReferenceTwoReference(), "//*[./text()]"));
		testPairs.add(new PatternTestPair("REFNAV", getPatternReferenceParallelNavigation(), "/*/*[./@*[name()='demo:id'] = ./*/data()]"));
		testPairs.add(new PatternTestPair("REFPROP", getPatternReferencePropertyLocationsParallel(), "/*/*/*[exists(./@*[name()=\"demo:lang\"])]"));
		
		return testPairs;
	}

}
