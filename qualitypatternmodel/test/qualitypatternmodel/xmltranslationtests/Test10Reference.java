package qualitypatternmodel.xmltranslationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.utility.PatternUtility;
import qualitypatternmodel.xmltestutility.PatternTestPair;

public class Test10Reference {

	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternReferenceSimple());
		completePatterns.add(getPatternReferenceTwoReference());
//		completePatterns.add(getPatternReferenceParallelNavigation());
//		completePatterns.add(getPatternReferencePropertyLocationsParallel());
//		completePatterns.add(getPatternReferenceSameProp()); // TODO: this case seems unrealistic in practice since one property represents the reference and the other a unique identifier
		return completePatterns;
	}

    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternUtility.testPatterns(getPatterns());
	}

	public static CompletePattern getPatternReferenceSimple() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		QuantifiedCondition qcon = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(qcon);
		Graph g0 = pattern.getGraph();
		Graph g1 = qcon.getGraph();
		ComplexNode n1 = g0.getNodes().get(0).makeComplex();
		n1.addOutgoing(g1).getTarget().makeComplex();
		
		pattern.createXmlAdaption();
		g1.getRelations().get(0).adaptAsXmlReference();

//		reference.setType(ReturnType.STRING);
		List<Parameter> params = pattern.getParameterList().getParameters();
		((XmlPathParam) params.get(0)).setValueFromString("/*/demo:artist");
		((XmlPathParam) params.get(1)).setValueFromString("/@demo:id"); // Property
		((XmlPathParam) params.get(2)).setValueFromString("/demo:creator/text()"); // Property
		((XmlPathParam) params.get(3)).setValueFromString("/demo:data/demo:painting");

		return pattern;
	}

	public static CompletePattern getPatternReferenceTwoReference() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		QuantifiedCondition qcon = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(qcon);
		Graph g0 = pattern.getGraph();
		Graph g1 = qcon.getGraph();
		ComplexNode n1 = g0.getNodes().get(0).makeComplex();
		ComplexNode n2 = n1.addOutgoing(g1).getTarget().makeComplex();

		n1.addOutgoing(n2);
		n1.addOutgoing(n2);
		
		pattern.createXmlAdaption();
		pattern.getNamespaces().put("demo", "demo");
		g1.getRelations().get(1).adaptAsXmlReference();
		g1.getRelations().get(0).adaptAsXmlReference();
		
		List<Parameter> params = pattern.getParameterList().getParameters();
		((XmlPathParam) params.get(0)).setValueFromString("/demo:data/demo:artist");
		((XmlPathParam) params.get(1)).setValueFromString("/demo:data/*");
		((XmlPathParam) params.get(2)).setValueFromString("/@demo:id"); // Property
		((XmlPathParam) params.get(3)).setValueFromString("/demo:creator/text()"); // Property
		((XmlPathParam) params.get(4)).setValueFromString("/demo:famousworkref/text()"); // Property
		((XmlPathParam) params.get(5)).setValueFromString("/@demo:id"); // Property

		return pattern;
	}

//	public static CompletePattern getPatternReferenceParallelNavigation() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		GraphstructurePackage.eINSTANCE.eClass();
////		GraphstructureFactory graphstructureFactory = GraphstructureFactory.eINSTANCE;
//
//		CompletePattern completePattern = Test03Quantor.getPatternExists();
//		Graph graph = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
//
//		Node element0 = completePattern.getGraph().getNodes().get(0).makeComplex();
//		Node element1 = graph.getNodes().get(0);
//		element0.addOutgoing(element1);
//
//		element0.addOutgoing(element1);
//
//		completePattern.createXmlAdaption();
//
//		XmlReference reference = graph.getRelations().get(0).adaptAsXmlReference();
//		reference.setType(ReturnType.STRING);
//
//		((XmlElementNavigation) completePattern.getGraph().getRelations().get(0)).getXmlPathParam().setXmlAxis(XmlAxisKind.CHILD, "");
//
//		reference.getSourcePropertyPath().getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
//		reference.getSourcePropertyPath().getXmlPropertyOptionParam().getAttributeName().setValue("demo:id");
//
//		return completePattern;
//	}

//	public static CompletePattern getPatternReferencePropertyLocationsParallel() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		GraphstructurePackage.eINSTANCE.eClass();
//
//		CompletePattern completePattern = Test03Quantor.getPatternExists();
//		Graph graph = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
//
//		Node element0 = completePattern.getGraph().getNodes().get(0).makeComplex();
//		Node element1 = graph.getNodes().get(0);
//		element0.addOutgoing(element1);
//
//		element0.addOutgoing(element1);
//		element0.addOutgoing(element1);
//
//		completePattern.createXmlAdaption();
//
//		XmlReference reference = graph.getRelations().get(0).adaptAsXmlReference();
//		reference.setType(ReturnType.STRING);
////		reference.getSourceProperty().getOption().getOptions().add(PropertyKind.ATTRIBUTE);
//		reference.getSourcePropertyPath().getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
//		reference.getSourcePropertyPath().getXmlPropertyOptionParam().getAttributeName().setValue("demo:lang");
////		reference.getTargetProperty().getOption().getOptions().add(PropertyKind.ATTRIBUTE);
//		reference.getTargetPropertyPath().getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
//		reference.getTargetPropertyPath().getXmlPropertyOptionParam().getAttributeName().setValue("demo:lang");
//
//		XmlReference reference1 = graph.getRelations().get(0).adaptAsXmlReference();
//		reference1.setType(ReturnType.STRING);
////		reference1.getSourceProperty().getOption().getOptions().add(PropertyKind.TAG);
//		reference1.getSourcePropertyPath().getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
////		reference1.getTargetProperty().getOption().getOptions().add(PropertyKind.TAG);
//		reference1.getTargetPropertyPath().getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
//
//		XmlReference reference2 = graph.getRelations().get(0).adaptAsXmlReference();
//		reference2.setType(ReturnType.STRING);
////		reference2.getSourceProperty().getOption().getOptions().add(PropertyKind.DATA);
//		reference2.getSourcePropertyPath().getXmlPropertyOptionParam().setValue(XmlPropertyKind.DATA);
////		reference2.getTargetProperty().getOption().getOptions().add(PropertyKind.DATA);
//		reference2.getTargetPropertyPath().getXmlPropertyOptionParam().setValue(XmlPropertyKind.DATA);
//
//		((XmlElementNavigation) completePattern.getGraph().getRelations().get(0)).getXmlPathParam().setXmlAxis(XmlAxisKind.CHILD, "");
////		((XmlElementNavigation) ((QuantifiedCondition) completePattern.getCondition())
////				.getGraph().getRelations().get(4)).getPathParam().setAxis(AxisKind.CHILD, "");
//
//		return completePattern;
//	}


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
		List<PatternTestPair> testPairs = new ArrayList<>();

		testPairs.add(new PatternTestPair("10", "Ref", getPatternReferenceSimple(), "declare namespace demo = \"demo\"; /demo:data/demo:artist[./@demo:id = /demo:data/demo:painting/demo:creator/text()]"));
		testPairs.add(new PatternTestPair("10", "RefRef", getPatternReferenceTwoReference(), "declare namespace demo = \"demo\"; //demo:artist[./demo:famousworkref/text() = /demo:data/*/@demo:id]"));
		return testPairs;
	}

}
