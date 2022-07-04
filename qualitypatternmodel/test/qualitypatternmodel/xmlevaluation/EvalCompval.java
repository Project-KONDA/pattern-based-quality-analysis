package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPropertyOptionParam;
import qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl;
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
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParameterList;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.parameters.impl.ComparisonOptionParamImpl;
import qualitypatternmodel.parameters.impl.ParameterValueImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.parameters.impl.TypeOptionParamImpl;
import qualitypatternmodel.parameters.impl.UntypedParameterValueImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.xmltranslationtests.Test00;
import qualitypatternmodel.xmltranslationtests.Test03Quantor;

public class EvalCompval {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCompvalAbstract());
		completePatterns.add(getCompvalMidas5230Objekt());
		completePatterns.add(getCompvalMidas5230Objekt());
		completePatterns.add(getCompvalMidas5230Schloss());
		completePatterns.add(getCompvalMidas5230Print());
		completePatterns.add(getCompvalLidoEventPlace());
		
		completePatterns.add(getCompvalSetMidas3270());
		completePatterns.add(getCompsetMIDAS3140());
		completePatterns.add(getCompsetLidoGenderActor());
		
		completePatterns.add(getCompvalThreeElementsAbstract()); 
		completePatterns.add(getCompvalLidoObjectWorkTypeObjekt());
		completePatterns.add(getCompvalLidoObjectWorkTypeSchloss());
		completePatterns.add(getCompvalLidoObjectWorkTypePrint());
		completePatterns.add(getCompvalSetLidoAppellationValue());

//		Test00.getQueries(completePatterns);
		Test00.test(completePatterns);		
	}

	public static CompletePattern getCompvalAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		CompletePattern completePattern = Test03Quantor.getPatternExistsWithRelation();
		Node returnElementInReturnGraph = completePattern.getGraph().getNodes().get(0);
		returnElementInReturnGraph.addOutgoing().getTarget().addPrimitiveComparison();

		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();

		Node next1 = graph1.getNodes().get(0).makeComplex();
		next1.addOutgoing().getTarget().addPrimitiveComparison();
		next1.addOutgoing().getTarget().addPrimitiveComparison();

		completePattern.createXmlAdaption();

		return completePattern;
	}

	public static CompletePattern getCompvalThreeElementsAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;

		CompletePattern completePattern = Test03Quantor.getPatternExistsWithRelation();
		Node returnElementInReturnGraph = completePattern.getGraph().getNodes().get(0);
		returnElementInReturnGraph.addOutgoing().getTarget().addPrimitiveComparison();

		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();

		Node element1 = graph1.getNodes().get(0).makeComplex();
		element1.addOutgoing().getTarget().addPrimitiveComparison();
		
		Node element2 = element1.addOutgoing().getTarget().makeComplex();
		element2.addOutgoing().getTarget().addPrimitiveComparison();
		element2.addOutgoing().getTarget().addPrimitiveComparison();
		
		completePattern.createXmlAdaption();

		return completePattern;
	}
	
	public static CompletePattern getCompvalThreeElementsConcrete(
			XmlAxisKind[] element1Axis,
			XmlPropertyKind attribute1Kind, String attribute1Name, String attribute1Value,
			XmlAxisKind[] element2Axis,
			XmlPropertyKind attribute2Kind, String attribute2Name, String attribute2Value,
			XmlAxisKind[] element3Axis,
			XmlPropertyKind attribute3Kind, String attribute3Name, String attribute3Value,
			XmlPropertyKind attribute4Kind, String attribute4Name, String attribute4Value
			) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getCompvalThreeElementsAbstract();

		List<Parameter> params = completePattern.getParameterList().getParameters();

		UntypedParameterValueImpl p0 = ((UntypedParameterValueImpl) params.get(0));
		ComparisonOptionParamImpl p1 = ((ComparisonOptionParamImpl) params.get(1));
		TypeOptionParamImpl p2 = ((TypeOptionParamImpl) params.get(2));
		UntypedParameterValueImpl p3 = ((UntypedParameterValueImpl) params.get(3));
		ComparisonOptionParamImpl p4 = ((ComparisonOptionParamImpl) params.get(4));
		TypeOptionParamImpl p5 = ((TypeOptionParamImpl) params.get(5));
		UntypedParameterValueImpl p6 = ((UntypedParameterValueImpl) params.get(6));
		ComparisonOptionParamImpl p7 = ((ComparisonOptionParamImpl) params.get(7));
		TypeOptionParamImpl p8 = ((TypeOptionParamImpl) params.get(8));
		UntypedParameterValueImpl p9 = ((UntypedParameterValueImpl) params.get(9));
		ComparisonOptionParamImpl p10 = ((ComparisonOptionParamImpl) params.get(10));
		TypeOptionParamImpl p11 = ((TypeOptionParamImpl) params.get(11));
		
		XmlPathParamImpl p12 = ((XmlPathParamImpl) params.get(12));
		XmlPathParamImpl p13 = ((XmlPathParamImpl) params.get(13));
		XmlPathParamImpl p14 = ((XmlPathParamImpl) params.get(14));
		XmlPathParamImpl p15 = ((XmlPathParamImpl) params.get(15));
		XmlPathParamImpl p16 = ((XmlPathParamImpl) params.get(16));
		XmlPathParamImpl p17 = ((XmlPathParamImpl) params.get(17));
		XmlPathParamImpl p18 = ((XmlPathParamImpl) params.get(18));
				
		p0.replace(new TextLiteralParamImpl(attribute1Value));
		p3.replace(new TextLiteralParamImpl(attribute2Value));
		p6.replace(new TextLiteralParamImpl(attribute3Value));
		p9.replace(new TextLiteralParamImpl(attribute4Value));
		
		p13.setXmlAxis(element1Axis);
		p14.setXmlAxis(element2Axis);
		p16.setXmlAxis(element3Axis);
		
		XmlPropertyOptionParam pop12 = p12.getXmlPropertyOptionParam();
		pop12.setValue(attribute1Kind);
		if (attribute1Kind == XmlPropertyKind.ATTRIBUTE)
			pop12.getAttributeName().setValue(attribute1Name);

		XmlPropertyOptionParam pop15 = p15.getXmlPropertyOptionParam();
		pop15.setValue(attribute2Kind);
		if (attribute2Kind == XmlPropertyKind.ATTRIBUTE)
			pop15.getAttributeName().setValue(attribute2Name);	
		
		XmlPropertyOptionParam pop17 = p17.getXmlPropertyOptionParam();
		pop17.setValue(attribute3Kind);
		if (attribute3Kind == XmlPropertyKind.ATTRIBUTE)
			pop17.getAttributeName().setValue(attribute3Name);	
		
		XmlPropertyOptionParam pop18 = p18.getXmlPropertyOptionParam();
		pop18.setValue(attribute4Kind);
		if (attribute4Kind == XmlPropertyKind.ATTRIBUTE)
			pop18.getAttributeName().setValue(attribute4Name);	
		
		System.out.println(completePattern.myToString());
		return completePattern;
	}

	public static CompletePattern getCompvalConcrete(String returnElementType, XmlAxisKind[] returnElementAxis,
			String attribute1Name, XmlPropertyKind attribute1Kind, String element2Type, XmlAxisKind[] element2Axis,
			String attribute2Name, XmlPropertyKind attribute2Kind, String attribute3Name, XmlPropertyKind attribute3Kind,
			String value) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;

		CompletePattern completePattern = getCompvalAbstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		UntypedParameterValueImpl p0 = ((UntypedParameterValueImpl) params.get(0));
//		ComparisonOptionParamImpl p1 = ((ComparisonOptionParamImpl) params.get(1));
//		TypeOptionParamImpl p2 = ((TypeOptionParamImpl) params.get(2));
		UntypedParameterValueImpl p3 = ((UntypedParameterValueImpl) params.get(3));
//		ComparisonOptionParamImpl p4 = ((ComparisonOptionParamImpl) params.get(4));
//		TypeOptionParamImpl p5 = ((TypeOptionParamImpl) params.get(5));
		UntypedParameterValueImpl p6 = ((UntypedParameterValueImpl) params.get(6));
//		ComparisonOptionParamImpl p7 = ((ComparisonOptionParamImpl) params.get(7));
//		TypeOptionParamImpl p8 = ((TypeOptionParamImpl) params.get(8));
		XmlPathParamImpl p9 = ((XmlPathParamImpl) params.get(9));
//		XmlPathParamImpl p10 = ((XmlPathParamImpl) params.get(10));
//		XmlPathParamImpl p11 = ((XmlPathParamImpl) params.get(11));
		XmlPathParamImpl p12 = ((XmlPathParamImpl) params.get(12));
		XmlPathParamImpl p13 = ((XmlPathParamImpl) params.get(13));

		p0.replace(new TextLiteralParamImpl(returnElementType));
		p3.replace(new TextLiteralParamImpl(element2Type));
		p6.replace(new TextLiteralParamImpl(value));
		
		XmlPropertyOptionParam pop9 = p9.getXmlPropertyOptionParam();
		pop9.setValue(attribute1Kind);
		if (attribute1Kind == XmlPropertyKind.ATTRIBUTE)
			pop9.getAttributeName().setValue(attribute1Name);
		
		XmlPropertyOptionParam pop12 = p12.getXmlPropertyOptionParam();
		pop12.setValue(attribute2Kind);
		if (attribute2Kind == XmlPropertyKind.ATTRIBUTE)
			pop12.getAttributeName().setValue(attribute2Name);

		XmlPropertyOptionParam pop13 = p13.getXmlPropertyOptionParam();
		pop13.setValue(attribute3Kind);
		if (attribute3Kind == XmlPropertyKind.ATTRIBUTE)
			pop13.getAttributeName().setValue(attribute3Name);

		return completePattern;
	}
	
	public static CompletePattern getCompvalSetConcrete(String returnElementType, XmlAxisKind[] returnElementAxis,
			String attribute1Name, XmlPropertyKind attribute1Kind, String element2Type, XmlAxisKind[] element2Axis,
			String attribute2Name, XmlPropertyKind attribute2Kind, String attribute3Name, XmlPropertyKind attribute3Kind,
			List<String> values) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getCompvalConcrete(returnElementType, returnElementAxis, attribute1Name, attribute1Kind, 
				element2Type, element2Axis, attribute2Name, attribute2Kind, attribute3Name, attribute3Kind, "" );
		List<Parameter> params = completePattern.getParameterList().getParameters();

		TextListParam testlist = parametersFactory.createTextListParam();
		for (String str : values) {
			testlist.getValues().add(str);
		}
		((ParameterValueImpl) params.get(6)).replace(testlist);
		
		return completePattern;
	}

	public static CompletePattern getCompvalMidas5230Objekt() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getCompvalConcrete("obj", 
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, 
				"Type", XmlPropertyKind.ATTRIBUTE, "5230",
				new XmlAxisKind[] {XmlAxisKind.CHILD},  "Type",  XmlPropertyKind.ATTRIBUTE,  "Value", 
				XmlPropertyKind.ATTRIBUTE,  "Objekt");
	}

	public static CompletePattern getCompvalMidas5230Schloss() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getCompvalConcrete("obj",
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, "5230",
				new XmlAxisKind[] {XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, "Value", XmlPropertyKind.ATTRIBUTE, "Schloss");
	}

	public static CompletePattern getCompvalMidas5230Print() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getCompvalConcrete("obj", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, "5230",
				new XmlAxisKind[] {XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, "Value", XmlPropertyKind.ATTRIBUTE, "Print");
	}

	public static CompletePattern getCompvalSetMidas3270() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<String> values = Arrays.asList("unbekannt", "x", "y", "?");
		return getCompvalSetConcrete("kue", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, "3270",
				new XmlAxisKind[] {XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, "Value", XmlPropertyKind.ATTRIBUTE, values);
	}

	public static CompletePattern getCompvalLidoEventPlace() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getCompvalConcrete("lido:lido", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, null, XmlPropertyKind.TAG, "lido:eventPlace",
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, 
				null, XmlPropertyKind.TAG, "lido:type", XmlPropertyKind.ATTRIBUTE, "alternative");
	}

	public static CompletePattern getCompvalLidoObjectWorkTypeObjekt() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getCompvalThreeElementsConcrete(
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD},
				XmlPropertyKind.TAG, null, "lido:lido",
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD},
				XmlPropertyKind.TAG, null, "lido:objectWorkType",
				new XmlAxisKind[] {XmlAxisKind.CHILD},  
				XmlPropertyKind.TAG, null, "lido:term", 
				XmlPropertyKind.DATA, null, "Objekt");
	}
	
	public static CompletePattern getCompvalLidoObjectWorkTypeSchloss() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getCompvalThreeElementsConcrete(
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD},
				XmlPropertyKind.TAG, null, "lido:lido",
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD},
				XmlPropertyKind.TAG, null, "lido:objectWorkType",
				new XmlAxisKind[] {XmlAxisKind.CHILD},  
				XmlPropertyKind.TAG, null, "lido:term", 
				XmlPropertyKind.DATA, null, "Schloss");
	}
	
	public static CompletePattern getCompvalLidoObjectWorkTypePrint() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getCompvalThreeElementsConcrete(
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD},
				XmlPropertyKind.TAG, null, "lido:lido",
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD},
				XmlPropertyKind.TAG, null, "lido:objectWorkType",
				new XmlAxisKind[] {XmlAxisKind.CHILD},  
				XmlPropertyKind.TAG, null, "lido:term", 
				XmlPropertyKind.DATA, null, "Print");
	}
	
	public static CompletePattern getCompvalSetLidoAppellationValue() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<String> values = Arrays.asList("unbekannt", "x", "unknown", "?");
		return getCompvalSetConcrete("lido:lido", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, null, XmlPropertyKind.TAG, 
				"lido:appellationValue", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, null, XmlPropertyKind.TAG, null, XmlPropertyKind.DATA, values);
	}
		
	public static CompletePattern getCompsetMIDAS3140() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {			
		List<String> values = Arrays.asList("m","f","unbekannt","m?","f?","?");		
		return getCompvalSetConcrete("kue", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, 
				"3140", new XmlAxisKind[] {XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, "Value", XmlPropertyKind.ATTRIBUTE, values);
	}
	
	public static CompletePattern getCompsetLidoGenderActor() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {			
		List<String> values = Arrays.asList("male","männlich","weiblich","female","unknown","not applicable");		
		return getCompvalSetConcrete("lido:lido", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, null, XmlPropertyKind.TAG, "lido:genderActor", 
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, 
				null, XmlPropertyKind.TAG, null, XmlPropertyKind.DATA, values);
	}

}
