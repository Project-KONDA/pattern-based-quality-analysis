package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.OperatorsFactory;
import qualitypatternmodel.operators.OperatorsPackage;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.xmltranslationtests.Test00;

public class EvalExdupl {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getExactDuplicatesMidasWer());
		completePatterns.add(getExactDuplicatesLido());
//		completePatterns.add(getExactDuplicatesTwoElementLido());
		
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);	
	}
	
	public static CompletePattern getExactDuplicatesAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		OperatorsPackage.eINSTANCE.eClass();
		OperatorsFactory operatorsFactory = OperatorsFactory.eINSTANCE;
		
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;		

		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = Test00.getBasePattern();
		completePattern.getGraph().getReturnNodes().get(0).addOutgoing().getTarget().addPrimitiveComparison();
		
		CountCondition countCondition = factory.createCountCondition();
		completePattern.setCondition(countCondition);		
		countCondition.getOption().getOptions().add(ComparisonOperator.GREATER);
		countCondition.getOption().setValue(ComparisonOperator.GREATER);
		
		CountPattern countPattern = factory.createCountPattern();

		NumberParam numberParam = parametersFactory.createNumberParam();
		numberParam.setValue(1.0);
		NumberElement numberElement = factory.createNumberElement();
		numberElement.setNumberParam(numberParam);
		countCondition.setCountPattern(countPattern);
		countCondition.setArgument2(numberElement);
		
		Node returnInCPattern = countPattern.getGraph().getNodes().get(0);
		
		ComplexNode otherRecord = graphFactory.createComplexNode();
		otherRecord.setGraph(countPattern.getGraph());
		otherRecord.addOutgoing().getTarget().addPrimitiveComparison();			
		countPattern.getGraph().getReturnNodes().get(0).setReturnNode(false);
		otherRecord.setReturnNode(true);
				
		Condition truecondition = factory.createTrueElement();
		countPattern.setCondition(truecondition);
		
		Comparison c = returnInCPattern.addComparison(otherRecord);
		c.getTypeOption().setValue(ReturnType.ELEMENT);
		
		completePattern.createXmlAdaption();
		
		return completePattern;
		
	}
	
//	public static CompletePattern getExactDuplicatesTwoElementsAbstract() {	
//		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
//		
//		OperatorsPackage.eINSTANCE.eClass();
//		OperatorsFactory operatorsFactory = OperatorsFactory.eINSTANCE;
//		
//		PatternstructurePackage.eINSTANCE.eClass();
//		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;		
//
//		ParametersPackage.eINSTANCE.eClass();
//		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
//		
//		CompletePattern completePattern = Test00.getBasePattern();
//		Element e0InReturnGraph = completePattern.getGraph().getElements().get(0);
////		e0InReturnGraph.addPrimitiveComparison();
//		
//		Element ret = graphFactory.createNode();
//		ret.setGraph(completePattern.getGraph());
//		ret.addPrimitiveComparison();	
//		Relation relation = graphFactory.createRelation();
//		relation.setGraph(completePattern.getGraph());
//		relation.setSource(e0InReturnGraph);
//		relation.setTarget(ret);
//		completePattern.getGraph().getReturnElements().clear();
//		completePattern.getGraph().getReturnElements().add(ret);
//		
//		CountCondition countCondition = factory.createCountCondition();
//		completePattern.setCondition(countCondition);		
//		countCondition.getOption().getOptions().add(ComparisonOperator.GREATER);
//		countCondition.getOption().setValue(ComparisonOperator.GREATER);
//		
//		CountPattern countPattern = factory.createCountPattern();
//
//		NumberParam numberParam = parametersFactory.createNumberParam();
//		numberParam.setValue(1.0);
//		NumberElement numberElement = factory.createNumberElement();
//		numberElement.setNumberParam(numberParam);
//		countCondition.setCountPattern(countPattern);
//		countCondition.setArgument2(numberElement);
//		
//		Element e0InCPattern = countPattern.getGraph().getElements().get(0);
//		Element retInCPattern = countPattern.getGraph().getElements().get(1);
//		
//		Element parentInCPattern = graphFactory.createNode();
//		parentInCPattern.setGraph(countPattern.getGraph());
////		parentInCPattern.addPrimitiveComparison();		
//		
//		Element otherRecord = graphFactory.createNode();
//		otherRecord.setGraph(countPattern.getGraph());
//		otherRecord.addPrimitiveComparison();		
//		Relation relation2 = graphFactory.createRelation();
//		relation2.setGraph(countPattern.getGraph());
//		relation2.setSource(parentInCPattern);
//		relation2.setTarget(otherRecord);
//		countPattern.getGraph().getReturnElements().clear();
//		countPattern.getGraph().getReturnElements().add(otherRecord);
//				
//		Condition truecondition = factory.createTrueElement();
//		countPattern.setCondition(truecondition);
//		
//
//		Comparison comp = operatorsFactory.createComparison();		
//		countPattern.getGraph().getOperatorList().add(comp);
//		comp.createParameters();
//		comp.setArgument1(retInCPattern);
//		comp.setArgument2(otherRecord);
//		
//		
//		completePattern.createXMLAdaption();
//		relation.adaptAsXMLNavigation();
//		relation2.adaptAsXMLNavigation();
//		completePattern.finalizeXMLAdaption();
//		
//		return completePattern;
//		
//	}
	
	public static CompletePattern getExactDuplicatesMidasWer() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		
		CompletePattern completePattern = getExactDuplicatesAbstract();
		
		EList<Parameter> params = completePattern.getParameterList().getParameters();
		
		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
		ComparisonOptionParam p3 = ((ComparisonOptionParam) params.get(3));
		NumberParam p4 = ((NumberParam) params.get(4));
		UntypedParameterValue p5 = ((UntypedParameterValue) params.get(5));
		ComparisonOptionParam p6 = ((ComparisonOptionParam) params.get(6));
		TypeOptionParam p7 = ((TypeOptionParam) params.get(7));
		ComparisonOptionParam p8 = ((ComparisonOptionParam) params.get(8));
		TypeOptionParam p9 = ((TypeOptionParam) params.get(9));
		XmlPathParamImpl p10 = ((XmlPathParamImpl) params.get(10));
		XmlPathParamImpl p11 = ((XmlPathParamImpl) params.get(11));
		XmlPathParamImpl p12 = ((XmlPathParamImpl) params.get(12));
		XmlPathParamImpl p13 = ((XmlPathParamImpl) params.get(13));
		
		p0.setValue("wer");
		p4.setValue(1.0);
		p5.setValue("wer");
		p10.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p10.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p11.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD});
		p12.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p12.getXmlPropertyOptionParam().getAttributeName().setValue("Type");
		p13.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD});
		
		return completePattern;
	}
	
	public static CompletePattern getExactDuplicatesLido() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		// not used for evaluation anymore
		
		CompletePattern completePattern = getExactDuplicatesAbstract();

		EList<Parameter> params = completePattern.getParameterList().getParameters();
		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
		ComparisonOptionParam p3 = ((ComparisonOptionParam) params.get(3));
		NumberParam p4 = ((NumberParam) params.get(4));
		UntypedParameterValue p5 = ((UntypedParameterValue) params.get(5));
		ComparisonOptionParam p6 = ((ComparisonOptionParam) params.get(6));
		TypeOptionParam p7 = ((TypeOptionParam) params.get(7));
		ComparisonOptionParam p8 = ((ComparisonOptionParam) params.get(8));
		TypeOptionParam p9 = ((TypeOptionParam) params.get(9));
		XmlPathParamImpl p10 = ((XmlPathParamImpl) params.get(10));
		XmlPathParamImpl p11 = ((XmlPathParamImpl) params.get(11));
		XmlPathParamImpl p12 = ((XmlPathParamImpl) params.get(12));
		XmlPathParamImpl p13 = ((XmlPathParamImpl) params.get(13));

		p0.setValue("lido:lido");
		p4.setValue(1.0);
		p5.setValue("lido:lido");
		p10.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p11.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD});
		p12.getXmlPropertyOptionParam().setValue(XmlPropertyKind.TAG);
		p13.setXmlAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD});
				
		return completePattern;
	}
	
//	public static CompletePattern getExactDuplicatesTwoElementLido() {	
//		ParametersPackage.eINSTANCE.eClass();
//		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
//		
//		CompletePattern completePattern = getExactDuplicatesTwoElementsAbstract();
//		
//		Element e0InReturnGraph = completePattern.getGraph().getElements().get(0);	
//		((XmlNavigation) completePattern.getGraph().getRelations().get(1)).getOption().setValue(RelationKind.CHILD);
////		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getAttributeName().setValue("Type");
//		
//		Element retInReturnGraph = completePattern.getGraph().getElements().get(1);	
//		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getOption().setValue(RelationKind.CHILD);
//		((XmlProperty) retInReturnGraph.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
//		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
//		concreteInputValue.setValue("lido:lido");
//		((UnknownParameterValue) ((Comparison) retInReturnGraph.getPredicates().get(0)).getArgument2()).replace(concreteInputValue);
//		
//		CountCondition countCondition = (CountCondition) completePattern.getCondition();
//		CountPattern countPattern = countCondition.getCountPattern();
//		Graph graph1 = countPattern.getGraph();
//		
//		Element parent = graph1.getElements().get(2);	
//		((XmlNavigation) graph1.getRelations().get(3)).getOption().setValue(RelationKind.CHILD);
//		
//		Element element2 = graph1.getElements().get(3);	
//		((XmlNavigation) graph1.getRelations().get(1)).getOption().setValue(RelationKind.CHILD);
////		((XmlProperty) element2.getProperties().get(0)).getAttributeName().setValue("Type");
//		((XmlProperty) element2.getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
//		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
//		concreteInputValue2.setValue("lido:lido");
//		((UnknownParameterValue) ((Comparison) element2.getPredicates().get(0)).getArgument2()).replace(concreteInputValue2);
//		
//		return completePattern;
//	}
}
