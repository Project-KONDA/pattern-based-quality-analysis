package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.RelationKind;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlNavigation;
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
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
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
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.translationtests.Test03Quantor;
import qualitypatternmodel.translationtests.Test06NotElement;

public class EvalMandstruc {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getMandstrucThreeElementsMidas());
		
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);				
	}
	
	public static CompletePattern getMandstrucThreeElementsAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = Test06NotElement.getPatternNotExistsAbstract();
		
		Node returnElementInReturnGraph = completePattern.getGraph().getNodes().get(0);			
		returnElementInReturnGraph.addPrimitiveComparison();
		
		NotCondition not = (NotCondition) completePattern.getCondition();
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) not.getCondition();
		Graph graph1 = quantifiedCondition.getGraph();
		
		Node element2 = graph1.getNodes().get(1);
		element2.addPrimitiveComparison();
		
		Node element3 = graphFactory.createNode();
		element3.setGraph(graph1);
		element3.addPrimitiveComparison();
		Relation relation = graphFactory.createRelation();
		relation.setGraph(graph1);
		relation.setSource(element2);
		relation.setTarget(element3);	
		
		completePattern.createXMLAdaption();
		graph1.getRelations().get(0).adaptAsXMLNavigation();
		relation.adaptAsXMLNavigation();
		completePattern.finalizeXMLAdaption();	
		
		return completePattern;
	}
	
	public static CompletePattern getMandstrucThreeElementsMidas() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getMandstrucThreeElementsAbstract();
		
		XmlElement returnElementInReturnGraph = (XmlElement) completePattern.getGraph().getNodes().get(0);
		((XmlNavigation) completePattern.getGraph().getRelations().get(0)).getOption().setValue(RelationKind.THREECHILD);
		BooleanOperator comparisonReturnElementInReturnGraph = returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue("obj");
		((UntypedParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1))
				.replace(concreteInputValue);
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getAttributeName().setValue("Type");
		
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		NotCondition not = (NotCondition) completePattern.getCondition();
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) not.getCondition();
		Graph graph1 = quantifiedCondition.getGraph();
		
		XmlElement element2 = (XmlElement) graph1.getNodes().get(1);
		((XmlNavigation) graph1.getRelations().get(0)).getOption().setValue(RelationKind.CHILD);
		BooleanOperator comparisonElement2 = element2.getPredicates().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue("ob30");
		((UntypedParameterValue) comparisonElement2.getArguments().get(1)).replace(concreteInputValue2);
		((XmlProperty) element2.getProperties().get(0)).getAttributeName().setValue("Type");		
		((XmlProperty) element2.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
		XmlElement element3 = (XmlElement) graph1.getNodes().get(2);
		((XmlNavigation) graph1.getRelations().get(0)).getOption().setValue(RelationKind.CHILD);
		BooleanOperator comparisonElement3 = element3.getPredicates().get(0);
		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue("3100");
		((UntypedParameterValue) comparisonElement3.getArguments().get(1)).replace(concreteInputValue3);
		((XmlProperty) element3.getProperties().get(0)).getAttributeName().setValue("Type");		
		((XmlProperty) element3.getProperties().get(0)).getOption().setValue(PropertyKind.ATTRIBUTE);
		
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
