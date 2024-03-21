package qualitypatternmodel.xmltranslationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.utility.XmlPatternUtility;
import qualitypatternmodel.xmltestutility.PatternTestPair;

public class Test10Reference {
	
	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternReferenceSimple());
		completePatterns.add(getPatternReferenceTwoReference());
		completePatterns.add(getPatternReferenceParallelNavigation());
		completePatterns.add(getPatternReferencePropertyLocationsParallel());
//		completePatterns.add(getPatternReferenceSameProp()); // TODO: this case seems unrealistic in practice since one property represents the reference and the other a unique identifier
		return completePatterns;
	}
	
    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		XmlPatternUtility.testPatterns(getPatterns());
	}
	
	public static CompletePattern getPatternReferenceSimple() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		GraphstructurePackage.eINSTANCE.eClass();
		
		CompletePattern completePattern = Test03Quantor.getPatternExists();
		Graph graph = ((QuantifiedCondition) completePattern.getCondition()).getGraph();

		Node element0 = completePattern.getGraph().getNodes().get(0);
		Node element1 = graph.getNodes().get(0);
		
		element0.addOutgoing(element1);	
		
		completePattern.createXmlAdaption();
		XmlReference reference = graph.getRelations().get(0).adaptAsXmlReference();	
		reference.setType(ReturnType.STRING);
		
//		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getPathParam().getOptions().add(AxisKind.DESCENDANT);
		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getXmlPathParam().setXmlAxis(XmlAxisKind.DESCENDANT, "");
		
//		((XmlNavigation) ((QuantifiedCondition) completePattern.getCondition()).getGraph().getRelations().get(2)).getPathParam().getOptions().add(AxisKind.DESCENDANT);
		((XmlNavigation) ((QuantifiedCondition) completePattern.getCondition()).getGraph().getRelations().get(3)).getXmlPathParam().setXmlAxis(XmlAxisKind.DESCENDANT, "");
		
		return completePattern;		
	}
	
	public static CompletePattern getPatternReferenceTwoReference() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;	
		
		CompletePattern completePattern = Test03Quantor.getPatternExists();
		Graph graph = ((QuantifiedCondition) completePattern.getCondition()).getGraph();

		Node element0 = completePattern.getGraph().getNodes().get(0);
		Node element1 = graph.getNodes().get(0);
		
		element0.addOutgoing(element1);	
		
		Node element2 = element1.addOutgoing().getTarget();
		
		element2.addOutgoing(element1);
		
		completePattern.createXmlAdaption();
		XmlReference reference = graph.getRelations().get(0).adaptAsXmlReference();	
		reference.setType(ReturnType.STRING);
		XmlReference reference2 = graph.getRelations().get(0).adaptAsXmlReference();	
		reference2.setType(ReturnType.STRING);
		
		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getXmlPathParam().setXmlAxis(XmlAxisKind.DESCENDANT, "");
		((XmlNavigation) ((QuantifiedCondition) completePattern.getCondition()).getGraph().getRelations().get(1)).getXmlPathParam().setXmlAxis(XmlAxisKind.DESCENDANT, "");
		((XmlNavigation) ((QuantifiedCondition) completePattern.getCondition()).getGraph().getRelations().get(4)).getXmlPathParam().setXmlAxis(XmlAxisKind.DESCENDANT, "");
		
		return completePattern;		
	}
	
	public static CompletePattern getPatternReferenceParallelNavigation() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;	
		
		CompletePattern completePattern = Test03Quantor.getPatternExists();
		Graph graph = ((QuantifiedCondition) completePattern.getCondition()).getGraph();

		Node element0 = completePattern.getGraph().getNodes().get(0).makeComplex();
		Node element1 = graph.getNodes().get(0);
		element0.addOutgoing(element1);
		
		element0.addOutgoing(element1);	
		
		completePattern.createXmlAdaption();
		
		XmlReference reference = graph.getRelations().get(0).adaptAsXmlReference();	
		reference.setType(ReturnType.STRING);
		
		((XmlElementNavigation) completePattern.getGraph().getRelations().get(0)).getXmlPathParam().setXmlAxis(XmlAxisKind.CHILD, "");
		
		reference.getSourcePropertyPath().getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		reference.getSourcePropertyPath().getXmlPropertyOptionParam().getAttributeName().setValue("demo:id");;
		
		return completePattern;		
	}
	
	public static CompletePattern getPatternReferencePropertyLocationsParallel() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		GraphstructurePackage.eINSTANCE.eClass();
		
		CompletePattern completePattern = Test03Quantor.getPatternExists();
		Graph graph = ((QuantifiedCondition) completePattern.getCondition()).getGraph();

		Node element0 = completePattern.getGraph().getNodes().get(0).makeComplex();
		Node element1 = graph.getNodes().get(0);
		element0.addOutgoing(element1);
		
		element0.addOutgoing(element1);	
		element0.addOutgoing(element1);
		
		completePattern.createXmlAdaption();
		
		XmlReference reference = graph.getRelations().get(0).adaptAsXmlReference();	
		reference.setType(ReturnType.STRING);
//		reference.getSourceProperty().getOption().getOptions().add(PropertyKind.ATTRIBUTE);
		reference.getSourcePropertyPath().getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		reference.getSourcePropertyPath().getXmlPropertyOptionParam().getAttributeName().setValue("demo:lang");
//		reference.getTargetProperty().getOption().getOptions().add(PropertyKind.ATTRIBUTE);
		reference.getTargetPropertyPath().getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		reference.getTargetPropertyPath().getXmlPropertyOptionParam().getAttributeName().setValue("demo:lang");
		
		XmlReference reference1 = graph.getRelations().get(0).adaptAsXmlReference();	
		reference1.setType(ReturnType.STRING);
//		reference1.getSourceProperty().getOption().getOptions().add(PropertyKind.TAG);
		reference1.getSourcePropertyPath().getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
//		reference1.getTargetProperty().getOption().getOptions().add(PropertyKind.TAG);
		reference1.getTargetPropertyPath().getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		
		XmlReference reference2 = graph.getRelations().get(0).adaptAsXmlReference();	
		reference2.setType(ReturnType.STRING);
//		reference2.getSourceProperty().getOption().getOptions().add(PropertyKind.DATA);
		reference2.getSourcePropertyPath().getXmlPropertyOptionParam().setValue(XmlPropertyKind.DATA);
//		reference2.getTargetProperty().getOption().getOptions().add(PropertyKind.DATA);
		reference2.getTargetPropertyPath().getXmlPropertyOptionParam().setValue(XmlPropertyKind.DATA);

		((XmlElementNavigation) completePattern.getGraph().getRelations().get(0)).getXmlPathParam().setXmlAxis(XmlAxisKind.CHILD, "");
//		((XmlElementNavigation) ((QuantifiedCondition) completePattern.getCondition())
//				.getGraph().getRelations().get(4)).getPathParam().setAxis(AxisKind.CHILD, "");
		
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
