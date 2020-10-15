package qualitypatternmodel;

import java.io.IOException;
import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.RelationKind;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterValue;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;

public class DemoPatterns {
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException, IOException {
		exportAllDemoPatterns();
		printAllDemoPatternQueries();
	}

	private static void exportAllDemoPatterns()
			throws IOException, InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		CompletePattern compGeneric = getGenericCompPattern();
		Util.exportToFile(compGeneric,"instances/demo/comp_generic.patternstructure");
		CompletePattern compAbstract = getAbstractCompPattern();
		Util.exportToFile(compAbstract,"instances/demo/comp_abstract.patternstructure");
		CompletePattern compConcrete = getConcreteCompPattern();				
		Util.exportToFile(compConcrete,"instances/demo/comp_concrete.patternstructure");
		
		CompletePattern cardGeneric = getGenericCardPattern();
		Util.exportToFile(cardGeneric,"instances/demo/card_generic.patternstructure");
		CompletePattern cardAbstract = getAbstractCardPattern();
		Util.exportToFile(cardAbstract,"instances/demo/card_abstract.patternstructure");
		CompletePattern cardConcrete = getConcreteCardPattern();				
		Util.exportToFile(cardConcrete,"instances/demo/card_concrete.patternstructure");
	}

	private static void printAllDemoPatternQueries()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		CompletePattern compConcrete = getConcreteCompPattern();
		printPatternQuery(compConcrete);
		
		CompletePattern cardConcrete = getConcreteCardPattern();
		printPatternQuery(cardConcrete);
	}
	
	private static void printPatternQuery(CompletePattern pattern)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		pattern.isValid(AbstractionLevel.CONCRETE);
		System.out.println("\n*** "+pattern.getName()+" ***");
		System.out.println(pattern.generateQuery());
	}
	
	// ---------- COMP pattern ----------
	
	public static CompletePattern getGenericCompPattern() {
		
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setName("Comp [generic]");
		
		// Context graph of pattern:
		Element element0 = completePattern.getGraph().getElements().get(0);
		element0.addPrimitiveComparison();
		
		Comparison comp0 = (Comparison) completePattern.getGraph().getOperatorList().getOperators().get(0);
		comp0.getOption().setValue(ComparisonOperator.EQUAL);
		comp0.getOption().setPredefined(true);
		
		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);
		
		// Graph of quantified condition:		
		Element element0Copy = quantifiedCondition.getGraph().getElements().get(0);
		
		Element element1 = GraphstructureFactory.eINSTANCE.createElement();
		element1.setGraph(quantifiedCondition.getGraph());		
		
		Relation relation = GraphstructureFactory.eINSTANCE.createRelation();
		relation.setGraph(quantifiedCondition.getGraph());		
		relation.setSource(element0Copy);
		relation.setTarget(element1);
		
		element1.addPrimitiveComparison();
		element1.addPrimitiveComparison();
		
		Comparison comp1 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(0);
		comp1.getOption().setValue(ComparisonOperator.EQUAL);
		comp1.getOption().setPredefined(true);
		
		Comparison comp2 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(1);
		comp2.getOption().getOptions().add(ComparisonOperator.GREATER);
		comp2.getOption().getOptions().add(ComparisonOperator.LESS);
		comp2.getOption().getOptions().add(ComparisonOperator.GREATEROREQUAL);
		comp2.getOption().getOptions().add(ComparisonOperator.LESSOREQUAL);
		
		// Condition of quantified condition:
		TrueElement trueElement = PatternstructureFactory.eINSTANCE.createTrueElement();
		quantifiedCondition.setCondition(trueElement);
		
		return completePattern;			
	}
	
	public static CompletePattern getAbstractCompPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getGenericCompPattern();
		completePattern.setName("Comp [abstract]");
		
		completePattern.createXMLAdaption();
		
		// Specify relation between Element 0 and Element 1:
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		quantifiedCondition.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		
		completePattern.finalizeXMLAdaption();
		
		return completePattern;
	}

	public static CompletePattern getConcreteCompPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getAbstractCompPattern();
		completePattern.setName("Comp [concrete]");
		
		// Context graph of pattern:
		XmlElement element0 = (XmlElement) completePattern.getGraph().getElements().get(0);
		XmlProperty property0 = (XmlProperty) element0.getProperties().get(0);
		property0.getOption().setValue(PropertyKind.TAG);
		
		ParameterValue value0 = (ParameterValue) completePattern.getParameterList().getParameters().get(0);
		TextLiteralParam textValue0 = ParametersFactory.eINSTANCE.createTextLiteralParam();
		textValue0.setValue("architect");
		value0.replace(textValue0);
		
		XmlNavigation navigationRootElement0 = (XmlNavigation) completePattern.getGraph().getRelations().get(0);
		navigationRootElement0.getOption().setValue(RelationKind.DESCENDANT);
		
		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		
		// Graph of quantified condition:
		XmlElement element1 = (XmlElement) quantifiedCondition.getGraph().getElements().get(1);
		XmlProperty property1 = (XmlProperty) element1.getProperties().get(0);
		property1.getOption().setValue(PropertyKind.TAG);
		
		ParameterValue value1 = (ParameterValue) completePattern.getParameterList().getParameters().get(2);
		TextLiteralParam textValue1 = ParametersFactory.eINSTANCE.createTextLiteralParam();
		textValue1.setValue("birthyear");
		value1.replace(textValue1);
		
		XmlProperty property2 = (XmlProperty) element1.getProperties().get(0);
		property2.getOption().setValue(PropertyKind.TAG);
		
		ParameterValue value2 = (ParameterValue) completePattern.getParameterList().getParameters().get(4);
		NumberParam numberValue = ParametersFactory.eINSTANCE.createNumberParam();
		numberValue.setValue(2020.0);
		value2.replace(numberValue);
		
		Comparison comp2 = (Comparison) quantifiedCondition.getGraph().getOperatorList().getOperators().get(1);
		comp2.getOption().setValue(ComparisonOperator.GREATER);	
		
		XmlNavigation navigationElement0Element1 = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(0);
		navigationElement0Element1.getOption().setValue(RelationKind.CHILD);	
				
		return completePattern;
	}
	
	
	// ---------- CARD pattern ----------
	
	public static CompletePattern getGenericCardPattern() {
		
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setName("Card [generic]");
		
		// Context graph of pattern:
		Element element0 = completePattern.getGraph().getElements().get(0);
		element0.addPrimitiveComparison();
		
		Comparison comp0 = (Comparison) completePattern.getGraph().getOperatorList().getOperators().get(0);
		comp0.getOption().setValue(ComparisonOperator.EQUAL);
		comp0.getOption().setPredefined(true);
		
		// First-order logic condition of pattern:
		CountCondition countCondition = PatternstructureFactory.eINSTANCE.createCountCondition();
		completePattern.setCondition(countCondition);
		
		countCondition.createCountPattern();
		CountPattern countPattern = countCondition.getCountPattern();
		TrueElement trueElement = PatternstructureFactory.eINSTANCE.createTrueElement();
		countPattern.setCondition(trueElement);		
		
		countCondition.createParameters();		
		countCondition.getOption().getOptions().add(ComparisonOperator.GREATER);
		countCondition.getOption().getOptions().add(ComparisonOperator.LESS);
		countCondition.getOption().getOptions().add(ComparisonOperator.GREATEROREQUAL);
		countCondition.getOption().getOptions().add(ComparisonOperator.LESSOREQUAL);
		
		NumberElement numberElement = PatternstructureFactory.eINSTANCE.createNumberElement();
		countCondition.setArgument2(numberElement);
		
		NumberParam numberParam = ParametersFactory.eINSTANCE.createNumberParam();
		completePattern.getParameterList().add(numberParam);
		
		numberElement.setNumberParam(numberParam);		
		
		// Graph of inner pattern:
		Element element0Copy = countPattern.getGraph().getElements().get(0);
		
		Element element1 = GraphstructureFactory.eINSTANCE.createElement();
		element1.setGraph(countPattern.getGraph());		
		
		Relation relation = GraphstructureFactory.eINSTANCE.createRelation();
		relation.setGraph(countPattern.getGraph());		
		relation.setSource(element0Copy);
		relation.setTarget(element1);
		
		element1.addPrimitiveComparison();
		
		Comparison comp1 = (Comparison) countPattern.getGraph().getOperatorList().getOperators().get(0);
		comp1.getOption().setValue(ComparisonOperator.EQUAL);
		comp1.getOption().setPredefined(true);		
		
		return completePattern;
	}
	
	public static CompletePattern getAbstractCardPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getGenericCardPattern();
		completePattern.setName("Card [abstract]");
		
		completePattern.createXMLAdaption();
		
		// Specify relation between Element 0 and Element 1:
		CountCondition countCondition = (CountCondition) completePattern.getCondition();		
		countCondition.getCountPattern().getGraph().getRelations().get(0).adaptAsXMLNavigation();
		
		completePattern.finalizeXMLAdaption();
		
		return completePattern;
	}
	
	public static CompletePattern getConcreteCardPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getAbstractCardPattern();
		completePattern.setName("Card [concrete]");
		
		// Context graph of pattern:
		XmlElement element0 = (XmlElement) completePattern.getGraph().getElements().get(0);
		XmlProperty property0 = (XmlProperty) element0.getProperties().get(0);
		property0.getOption().setValue(PropertyKind.TAG);
		
		ParameterValue value0 = (ParameterValue) completePattern.getParameterList().getParameters().get(0);
		TextLiteralParam textValue0 = ParametersFactory.eINSTANCE.createTextLiteralParam();
		textValue0.setValue("artist");
		value0.replace(textValue0);
		
		XmlNavigation navigationRootElement0 = (XmlNavigation) completePattern.getGraph().getRelations().get(0);
		navigationRootElement0.getOption().setValue(RelationKind.DESCENDANT);
		
		// First-order logic condition of pattern:
		CountCondition countCondition = (CountCondition) completePattern.getCondition();		
		
		countCondition.getOption().setValue(ComparisonOperator.GREATER);
		NumberElement numberElement = (NumberElement) countCondition.getArgument2();
		numberElement.getNumberParam().setValue(1.0);
		
		CountPattern countPattern = countCondition.getCountPattern();
		
		// Graph of inner pattern:
		XmlElement element1 = (XmlElement) countPattern.getGraph().getElements().get(1);
		XmlProperty property1 = (XmlProperty) element1.getProperties().get(0);
		property1.getOption().setValue(PropertyKind.TAG);
		
		ParameterValue value1 = (ParameterValue) completePattern.getParameterList().getParameters().get(4);
		TextLiteralParam textValue1 = ParametersFactory.eINSTANCE.createTextLiteralParam();
		textValue1.setValue("birthyear");
		value1.replace(textValue1);	
		
		XmlNavigation navigationElement0Element1 = (XmlNavigation) countPattern.getGraph().getRelations().get(0);
		navigationElement0Element1.getOption().setValue(RelationKind.CHILD);	
				
		return completePattern;
	}
	
	
	// ---------- FUNC pattern ----------

}
