package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.operators.OperatorsFactory;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.xmltranslationtests.Test00;
import qualitypatternmodel.xmltranslationtests.Test03Quantor;
import qualitypatternmodel.xmltranslationtests.Test06NotElement;

public class EvalMandstruc {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getMandstrucThreeElementsAbstract());
		completePatterns.add(getMandstrucThreeElementsMidas());
		
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);		
	}
	
	public static CompletePattern getMandstrucThreeElementsAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		
		Graph g0 = completePattern.getGraph();
		Node return0 = g0.getReturnNodes().get(0).makeComplex();
		return0.addOutgoing().getTarget().addPrimitiveComparison();
		
		NotCondition not = factory.createNotCondition();
		completePattern.setCondition(not);
		QuantifiedCondition qc = factory.createQuantifiedCondition();
		not.setCondition(qc);
		Graph g1 = qc.getGraph();
		
		Node return1 = g1.getReturnNodes().get(0).makeComplex();
		Node node1 = return1.addOutgoing().getTarget().makeComplex();
		node1.addOutgoing().getTarget().addPrimitiveComparison();
		Node node2 = node1.addOutgoing().getTarget().makeComplex();
		node2.addOutgoing().getTarget().addPrimitiveComparison();
		
		completePattern.createXmlAdaption();
		
		return completePattern;
	}
	
	public static CompletePattern getMandstrucThreeElementsMidas() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getMandstrucThreeElementsAbstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
		UntypedParameterValue p3 = ((UntypedParameterValue) params.get(3));
		ComparisonOptionParam p4 = ((ComparisonOptionParam) params.get(4));
		TypeOptionParam p5 = ((TypeOptionParam) params.get(5));
		UntypedParameterValue p6 = ((UntypedParameterValue) params.get(6));
		ComparisonOptionParam p7 = ((ComparisonOptionParam) params.get(7));
		TypeOptionParam p8 = ((TypeOptionParam) params.get(8));
		XmlPathParamImpl p9 = ((XmlPathParamImpl) params.get(9));
		XmlPathParamImpl p10 = ((XmlPathParamImpl) params.get(10));
		XmlPathParamImpl p11 = ((XmlPathParamImpl) params.get(11));
		XmlPathParamImpl p12 = ((XmlPathParamImpl) params.get(12));
		XmlPathParamImpl p13 = ((XmlPathParamImpl) params.get(13));
		XmlPathParamImpl p14 = ((XmlPathParamImpl) params.get(14));
		
		p0.setValue("obj");
		p3.setValue("ob30");
		p6.setValue("3100");
		
		p9.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p9.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p12.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p12.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p14.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p14.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		
		p10.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD});
		p11.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});
		p13.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD});

		return completePattern;
	}
	
//	public static CompletePattern getMandstrucAbstract() {
//		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
//		
//		FunctionsPackage.eINSTANCE.eClass();
//		FunctionsFactory functionsFactory = FunctionsFactory.eINSTANCE;		
//		
//		PatternstructurePackage.eINSTANCE.eClass();
//		PatternstructureFactory patternstructureFactory = PatternstructureFactory.eINSTANCE;		
//		
//		CompletePattern completePattern = Test03Quantor.getPatternExists();
//		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);			
//		returnElementInReturnGraph.addPrimitiveComparison(); 
//		
//		NotCondition notCondition = patternstructureFactory.createNotCondition();
//		completePattern.setCondition(notCondition);
//		
//		Formula formula = patternstructureFactory.createFormula();
//		formula.setOperator(LogicalOperator.OR);
//		notCondition.setCondition(formula);
//		
//		QuantifiedCondition quantifiedCondition1 = patternstructureFactory.createQuantifiedCondition();		
//		formula.setCondition1(quantifiedCondition1);
//		QuantifiedCondition quantifiedCondition2 = patternstructureFactory.createQuantifiedCondition();
//		formula.setCondition2(quantifiedCondition2);
//		TrueElement t1 = patternstructureFactory.createTrueElement();
//		quantifiedCondition1.setCondition(t1);
//		TrueElement t2 = patternstructureFactory.createTrueElement();
//		quantifiedCondition2.setCondition(t2);
//		
//		Graph graph1 = quantifiedCondition1.getGraph();
//		Element element1 = graphFactory.createNode();
//		graph1.getReturnElements().get(0).getNextElements().add(element1);
//		element1.addPrimitiveComparison();
//		
//		Graph graph2 = quantifiedCondition2.getGraph();
//		Element element2 = graphFactory.createNode();
//		graph2.getReturnElements().get(0).getNextElements().add(element2);
//		element2.addPrimitiveComparison();		
//		
//		return completePattern;
//	}
}
