package qualitypatternmodel.evaluation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.translationtests.Test03Quantor;

public class EvalCompval {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCompvalMidas5230Objekt());
		completePatterns.add(getCompvalMidas5230Schloss());
		completePatterns.add(getCompvalMidas5230Print());
		completePatterns.add(getCompvalSetMidas3270());
		completePatterns.add(getCompvalLidoEventPlace());
		completePatterns.add(getCompvalLidoObjectWorkTypeObjekt());
		completePatterns.add(getCompvalLidoObjectWorkTypeSchloss());
		completePatterns.add(getCompvalLidoObjectWorkTypePrint());
		completePatterns.add(getCompvalSetLidoAppellationValue());
		
		completePatterns.add(getCompsetMIDAS3140());
		completePatterns.add(getCompsetLidoGenderActor());
		
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);		
	}

	public static CompletePattern getCompvalAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		CompletePattern completePattern = Test03Quantor.getPatternExistsWithRelation();
		Node returnElementInReturnGraph = completePattern.getGraph().getNodes().get(0);
		returnElementInReturnGraph.addPrimitiveComparison();

		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();

		Node next1 = graph1.getNodes().get(1);
		next1.addPrimitiveComparison();
		next1.addPrimitiveComparison();

		completePattern.createXMLAdaption();
		graph1.getRelations().get(0).adaptAsXmlElementNavigation();
		completePattern.finalizeXMLAdaption();

		return completePattern;
	}

	public static CompletePattern getCompvalThreeElementsAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;

		CompletePattern completePattern = Test03Quantor.getPatternExistsWithRelation();
		Node returnElementInReturnGraph = completePattern.getGraph().getNodes().get(0);
		returnElementInReturnGraph.addPrimitiveComparison();

		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();

		Node element1 = graph1.getNodes().get(1);
		element1.addPrimitiveComparison();
		

		Node element2 = graphFactory.createNode();
		element2.setGraph(graph1);
		element2.addPrimitiveComparison();
		element2.addPrimitiveComparison();

		Relation relation = graphFactory.createRelation();
		relation.setGraph(graph1);
		relation.setSource(element1);
		relation.setTarget(element2);

		completePattern.createXMLAdaption();
		graph1.getRelations().get(0).adaptAsXmlElementNavigation();
		relation.adaptAsXmlElementNavigation();
		completePattern.finalizeXMLAdaption();

		return completePattern;
	}

	public static CompletePattern getCompvalThreeElementsConcrete(String returnElementType,
			XmlAxisKind returnElementAxis, String attribute1Name, XmlPropertyKind attribute1Kind, String element2Type,
			XmlAxisKind element2Axis, String attribute2Name, XmlPropertyKind attribute2Kind, String element3Type,
			XmlAxisKind element3Axis, String attribute3Name, XmlPropertyKind attribute3Kind, String attribute4Name,
			XmlPropertyKind attribute4Kind, String value) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;

		CompletePattern completePattern = getCompvalThreeElementsAbstract();

		Node returnElementInReturnGraph = completePattern.getGraph().getNodes().get(0);
		((XmlElementNavigation) completePattern.getGraph().getRelations().get(0)).getXmlPathParam().setXmlAxis(returnElementAxis, "");

		Comparison comparisonReturnElementInReturnGraph = (Comparison) returnElementInReturnGraph.getPredicates()
				.get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue(returnElementType);
		((UntypedParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1))
				.replace(concreteInputValue);
		if (attribute1Kind == XmlPropertyKind.ATTRIBUTE) {
			((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getAttributeName()
					.setValue(attribute1Name);
		}
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(attribute1Kind);

		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();

		Node element2 = graph1.getNodes().get(1);
		((XmlElementNavigation) graph1.getRelations().get(0)).getXmlPathParam().setXmlAxis(element2Axis, "");

		Comparison comp1 = (Comparison) element2.getPredicates().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue(element2Type);
		((UntypedParameterValue) comp1.getArguments().get(1)).replace(concreteInputValue2);
		if (attribute2Kind == XmlPropertyKind.ATTRIBUTE) {
			((XmlProperty) element2.getProperties().get(0)).getAttributeName().setValue(attribute2Name);
		}
		((XmlProperty) element2.getProperties().get(0)).getOption().setValue(attribute2Kind);

		Node element3 = graph1.getNodes().get(2);
		((XmlElementNavigation) graph1.getRelations().get(1)).getXmlPathParam().setXmlAxis(element3Axis, "");

		Comparison comp2 = (Comparison) element3.getPredicates().get(0);
		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue(element3Type);
		((UntypedParameterValue) comp2.getArguments().get(1)).replace(concreteInputValue3);
		if (attribute3Kind == XmlPropertyKind.ATTRIBUTE) {
			((XmlProperty) element3.getProperties().get(0)).getAttributeName().setValue(attribute3Name);
		}
		((XmlProperty) element3.getProperties().get(0)).getOption().setValue(attribute3Kind);

		Comparison comp3 = (Comparison) element3.getPredicates().get(1);
		TextLiteralParam concreteInputValue4 = parametersFactory.createTextLiteralParam();
		concreteInputValue4.setValue(value);
		((UntypedParameterValue) comp3.getArguments().get(1)).replace(concreteInputValue4);
		if (attribute3Kind == XmlPropertyKind.ATTRIBUTE) {
			((XmlProperty) element3.getProperties().get(1)).getAttributeName().setValue(attribute4Name);
		}
		((XmlProperty) element3.getProperties().get(1)).getOption().setValue(attribute4Kind);

		return completePattern;
	}

	public static CompletePattern getCompvalConcrete(String returnElementType, XmlAxisKind returnElementAxis,
			String attribute1Name, XmlPropertyKind attribute1Kind, String element2Type, XmlAxisKind element2Axis,
			String attribute2Name, XmlPropertyKind attribute2Kind, String attribute3Name, XmlPropertyKind attribute3Kind,
			String value) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;

		CompletePattern completePattern = getCompvalAbstract();

		Node element2 = concretize(returnElementType, returnElementAxis, attribute1Name, attribute1Kind,
				element2Type, element2Axis, attribute2Name, attribute2Kind, attribute3Name, attribute3Kind, parametersFactory,
				completePattern);

		Comparison comp2 = (Comparison) element2.getPredicates().get(1);

		TextLiteralParam concreteInputValue3 = parametersFactory.createTextLiteralParam();
		concreteInputValue3.setValue(value);
		((UntypedParameterValue) comp2.getArguments().get(1)).replace(concreteInputValue3);

		return completePattern;
	}

	public static CompletePattern getCompvalSetConcrete(String returnElementType, XmlAxisKind returnElementAxis,
			String attribute1Name, XmlPropertyKind attribute1Kind, String element2Type, XmlAxisKind element2Axis,
			String attribute2Name, XmlPropertyKind attribute2Kind, String attribute3Name, XmlPropertyKind attribute3Kind,
			List<String> values) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;

		CompletePattern completePattern = getCompvalAbstract();

		Node element2 = concretize(returnElementType, returnElementAxis, attribute1Name, attribute1Kind,
				element2Type, element2Axis, attribute2Name, attribute2Kind, attribute3Name, attribute3Kind, parametersFactory,
				completePattern);

		Comparison comp2 = (Comparison) element2.getPredicates().get(1);

		TextListParam concreteInputValue3 = parametersFactory.createTextListParam();
		for (String str : values) {
			concreteInputValue3.getValues().add(str);
		}
		((UntypedParameterValue) comp2.getArguments().get(1)).replace(concreteInputValue3);

		return completePattern;
	}

	private static Node concretize(String returnElementType, XmlAxisKind returnElementAxis, String attribute1Name,
			XmlPropertyKind attribute1Kind, String element2Type, XmlAxisKind element2Axis, String attribute2Name, XmlPropertyKind attribute2Kind,
			String attribute3Name, XmlPropertyKind attribute3Kind, ParametersFactory parametersFactory,
			CompletePattern completePattern) {

		Node returnElementInReturnGraph = completePattern.getGraph().getNodes().get(0);
		((XmlElementNavigation) completePattern.getGraph().getRelations().get(0)).getXmlPathParam().setXmlAxis(returnElementAxis, "");

		Comparison comparisonReturnElementInReturnGraph = (Comparison) returnElementInReturnGraph.getPredicates()
				.get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue(returnElementType);
		((UntypedParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1))
				.replace(concreteInputValue);
		if (attribute1Kind == XmlPropertyKind.ATTRIBUTE) {
			((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getAttributeName()
					.setValue(attribute1Name);
		}
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(attribute1Kind);

		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();

		Node element2 = graph1.getNodes().get(1);
		((XmlElementNavigation) graph1.getRelations().get(0)).getXmlPathParam().setXmlAxis(element2Axis, "");

		Comparison comp1 = (Comparison) element2.getPredicates().get(0);
		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
		concreteInputValue2.setValue(element2Type);
		((UntypedParameterValue) comp1.getArguments().get(1)).replace(concreteInputValue2);
		if (attribute2Kind == XmlPropertyKind.ATTRIBUTE) {
			((XmlProperty) element2.getProperties().get(0)).getAttributeName().setValue(attribute2Name);
		}
		((XmlProperty) element2.getProperties().get(0)).getOption().setValue(attribute2Kind);

		if (attribute3Kind == XmlPropertyKind.ATTRIBUTE) {
			((XmlProperty) element2.getProperties().get(1)).getAttributeName().setValue(attribute3Name);
		}
		((XmlProperty) element2.getProperties().get(1)).getOption().setValue(attribute3Kind);
		return element2;
	}

	public static CompletePattern getCompvalMidas5230Objekt() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getCompvalConcrete("obj", XmlAxisKind.THREECHILD, "Type", XmlPropertyKind.ATTRIBUTE, "5230",
				XmlAxisKind.CHILD, "Type", XmlPropertyKind.ATTRIBUTE, "Value", XmlPropertyKind.ATTRIBUTE, "Objekt");
	}

	public static CompletePattern getCompvalMidas5230Schloss() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getCompvalConcrete("obj", XmlAxisKind.THREECHILD, "Type", XmlPropertyKind.ATTRIBUTE, "5230",
				XmlAxisKind.CHILD, "Type", XmlPropertyKind.ATTRIBUTE, "Value", XmlPropertyKind.ATTRIBUTE, "Schloss");
	}

	public static CompletePattern getCompvalMidas5230Print() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getCompvalConcrete("obj", XmlAxisKind.THREECHILD, "Type", XmlPropertyKind.ATTRIBUTE, "5230",
				XmlAxisKind.CHILD, "Type", XmlPropertyKind.ATTRIBUTE, "Value", XmlPropertyKind.ATTRIBUTE, "Print");
	}

	public static CompletePattern getCompvalSetMidas3270() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<String> values = Arrays.asList("unbekannt", "x", "y", "?");
		return getCompvalSetConcrete("kue", XmlAxisKind.THREECHILD, "Type", XmlPropertyKind.ATTRIBUTE, "3270",
				XmlAxisKind.CHILD, "Type", XmlPropertyKind.ATTRIBUTE, "Value", XmlPropertyKind.ATTRIBUTE, values);
	}

	public static CompletePattern getCompvalLidoEventPlace() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getCompvalConcrete("lido:lido", XmlAxisKind.TWOCHILD, null, XmlPropertyKind.TAG, "lido:eventPlace",
				XmlAxisKind.FIVECHILD, null, XmlPropertyKind.TAG, "lido:type", XmlPropertyKind.ATTRIBUTE, "alternative");
	}

	public static CompletePattern getCompvalLidoObjectWorkTypeObjekt() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getCompvalThreeElementsConcrete("lido:lido", XmlAxisKind.TWOCHILD, null, XmlPropertyKind.TAG,
				"lido:objectWorkType", XmlAxisKind.FOURCHILD, null, XmlPropertyKind.TAG,
				"lido:term", XmlAxisKind.CHILD, null, XmlPropertyKind.TAG, 
				null, XmlPropertyKind.DATA, "Objekt");
	}
	
	public static CompletePattern getCompvalLidoObjectWorkTypeSchloss() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getCompvalThreeElementsConcrete("lido:lido", XmlAxisKind.TWOCHILD, null, XmlPropertyKind.TAG,
				"lido:objectWorkType", XmlAxisKind.FOURCHILD, null, XmlPropertyKind.TAG,
				"lido:term", XmlAxisKind.CHILD, null, XmlPropertyKind.TAG, 
				null, XmlPropertyKind.DATA, "Schloss");
	}
	
	public static CompletePattern getCompvalLidoObjectWorkTypePrint() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getCompvalThreeElementsConcrete("lido:lido", XmlAxisKind.TWOCHILD, null, XmlPropertyKind.TAG,
				"lido:objectWorkType", XmlAxisKind.FOURCHILD, null, XmlPropertyKind.TAG,
				"lido:term", XmlAxisKind.CHILD, null, XmlPropertyKind.TAG, 
				null, XmlPropertyKind.DATA, "Print");
	}
	
	public static CompletePattern getCompvalSetLidoAppellationValue() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<String> values = Arrays.asList("unbekannt", "x", "unknown", "?");
		return getCompvalSetConcrete("lido:lido", XmlAxisKind.TWOCHILD, null, XmlPropertyKind.TAG, 
				"lido:appellationValue", XmlAxisKind.FIVECHILD, null, XmlPropertyKind.TAG, null, XmlPropertyKind.DATA, values);
	}
	
	public static CompletePattern getCompsetAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;

		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;		
				
		CompletePattern completePattern = Test03Quantor.getPatternExists();
		TrueElement t = (TrueElement) ((QuantifiedCondition) completePattern.getCondition()).getCondition();
		QuantifiedCondition qc1 = (QuantifiedCondition) completePattern.getCondition(); 
		NotCondition n = factory.createNotCondition();
		QuantifiedCondition qc2 = factory.createQuantifiedCondition();
				
		qc1.setCondition(n);
		n.setCondition(qc2);
		qc2.setCondition(t);
		
		Node e1g0 = completePattern.getGraph().getNodes().get(0);
		e1g0.addPrimitiveComparison();
		
		Node e1g1 = qc1.getGraph().getNodes().get(0);	
		
		Node e2g1 = qc1.getGraph().getNodes().get(1);	
		e2g1.addPrimitiveComparison();
		
		Relation relation = graphFactory.createRelation();
		relation.setGraph(qc1.getGraph());
		relation.setSource(e1g1);
		relation.setTarget(e2g1);
		
		Node e2g2 = qc2.getGraph().getNodes().get(1);
		e2g2.addPrimitiveComparison();
		
		completePattern.createXMLAdaption();
		relation.adaptAsXmlElementNavigation();	
		completePattern.finalizeXMLAdaption();	
		
		return completePattern; 
	}
	
	public static CompletePattern getCompsetConcrete(String returnElementType, XmlAxisKind returnElementAxis, String attribute1Name, XmlPropertyKind attribute1Kind,
			String element2Type, XmlAxisKind element2Axis, String attribute2Name, XmlPropertyKind attribute2Kind, String attribute3Name, XmlPropertyKind attribute3Kind, List<String> values) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getCompsetAbstract();
		
		Node returnElementInReturnGraph = completePattern.getGraph().getNodes().get(0);	
		((XmlElementNavigation) completePattern.getGraph().getRelations().get(0)).getXmlPathParam().setXmlAxis(returnElementAxis, "");
		Comparison comparisonReturnElementInReturnGraph = (Comparison) returnElementInReturnGraph.getPredicates().get(0);
		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
		concreteInputValue.setValue(returnElementType);
		((UntypedParameterValue) comparisonReturnElementInReturnGraph.getArguments().get(1)).replace(concreteInputValue);
		if (attribute1Kind == XmlPropertyKind.ATTRIBUTE) {
			((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getAttributeName().setValue(attribute1Name);
		}
		((XmlProperty) returnElementInReturnGraph.getProperties().get(0)).getOption().setValue(attribute1Kind);
		
		QuantifiedCondition condition = (QuantifiedCondition) completePattern.getCondition();
		Graph graph1 = condition.getGraph();
		Node nextToReturnElementInGraph1 =  graph1.getNodes().get(1);
		((XmlElementNavigation) graph1.getRelations().get(0)).getXmlPathParam().setXmlAxis(element2Axis, "");
		
		Comparison comparison1 = (Comparison) nextToReturnElementInGraph1.getPredicates().get(0);
		TextLiteralParam concreteInputValue1 = parametersFactory.createTextLiteralParam();
		concreteInputValue1.setValue(element2Type);
		((UntypedParameterValue) comparison1.getArguments().get(1)).replace(concreteInputValue1);
		if (attribute2Kind == XmlPropertyKind.ATTRIBUTE) {
			((XmlProperty) nextToReturnElementInGraph1.getProperties().get(0)).getAttributeName().setValue(attribute2Name);
		}
		((XmlProperty) nextToReturnElementInGraph1.getProperties().get(0)).getOption().setValue(attribute2Kind);
	
		NotCondition notCondition = (NotCondition) condition.getCondition();
		QuantifiedCondition condition2 = (QuantifiedCondition) notCondition.getCondition();
		Graph graph2 = condition2.getGraph();
		Node nextToReturnElementInGraph2 = graph2.getNodes().get(1);
		
		Comparison comparison2 = (Comparison) nextToReturnElementInGraph2.getPredicates().get(0);
		TextListParam concreteInputValue2 = parametersFactory.createTextListParam();
		for(String str : values) {
			concreteInputValue2.getValues().add(str);
		}

		((UntypedParameterValue) comparison2.getArguments().get(1)).replace(concreteInputValue2);
		if (attribute3Kind == XmlPropertyKind.ATTRIBUTE) {
			((XmlProperty) nextToReturnElementInGraph2.getProperties().get(0)).getAttributeName().setValue(attribute3Name);
		}
		((XmlProperty) nextToReturnElementInGraph2.getProperties().get(0)).getOption().setValue(attribute3Kind);		
		
		return completePattern;
	}
	
	public static CompletePattern getCompsetMIDAS3140() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {			
		List<String> values = Arrays.asList("m","f","unbekannt","m?","f?","?");		
		return getCompsetConcrete("kue", XmlAxisKind.THREECHILD, "Type", XmlPropertyKind.ATTRIBUTE, "3140", XmlAxisKind.CHILD, "Type", XmlPropertyKind.ATTRIBUTE, "Value", XmlPropertyKind.ATTRIBUTE, values);
	}
	
	public static CompletePattern getCompsetLidoGenderActor() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {			
		List<String> values = Arrays.asList("male","männlich","weiblich","female","unknown","not applicable");		
		return getCompsetConcrete("lido:lido", XmlAxisKind.TWOCHILD, null, XmlPropertyKind.TAG, "lido:genderActor", XmlAxisKind.EIGHTCHILD, 
				null, XmlPropertyKind.TAG, null, XmlPropertyKind.DATA, values);
	}

}
