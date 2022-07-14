package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;
import java.util.List;

import com.sun.xml.internal.bind.v2.model.core.PropertyKind;

import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.operators.BooleanOperator;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.xmltranslationtests.Test00;
import qualitypatternmodel.xmltranslationtests.Test03Quantor;

public class EvalMatch {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getMatchAbstract());
		completePatterns.add(getMatchMidas5360());
		completePatterns.add(getMatchMidas5064());
		completePatterns.add(getMatchMidas3270());
		completePatterns.add(getMatchMidas3270Imprecise());
		completePatterns.add(getMatchMidas3100Abbreviation());
		completePatterns.add(getMatchMidas5060());
		completePatterns.add(getMatchLidoMeasurementValue());
		completePatterns.add(getMatchLidoMeasurementUnit());
		completePatterns.add(getMatchLidoEarliestDate());
		completePatterns.add(getMatchLidoNamePlaceSet());
		completePatterns.add(getMatchLidoAppellationValue());
		
		completePatterns.add(getMatchMidasOb30Child());
				
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);
	}

	public static CompletePattern getMatchAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		
		Graph g0 = completePattern.getGraph();
		Node return0 = g0.getReturnNodes().get(0);
		return0.addOutgoing().getTarget().addPrimitiveComparison();
		
		QuantifiedCondition qc = factory.createQuantifiedCondition();
		completePattern.setCondition(qc);
		Graph g1 = qc.getGraph();
		
		Node return1 = g1.getReturnNodes().get(0).makeComplex();
		Node node1 = return1.addOutgoing().getTarget().makeComplex();
		node1.addOutgoing().getTarget().addPrimitiveComparison();
		node1.addOutgoing().getTarget().addPrimitiveMatch();

		completePattern.createXmlAdaption();
		return completePattern;
	}

	public static CompletePattern getMatchAbstractThreeElements() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		
		Graph g0 = completePattern.getGraph();
		Node return0 = g0.getReturnNodes().get(0);
		return0.addOutgoing().getTarget().addPrimitiveComparison();
		
		QuantifiedCondition qc = factory.createQuantifiedCondition();
		completePattern.setCondition(qc);
		Graph g1 = qc.getGraph();
		
		Node return1 = g1.getReturnNodes().get(0).makeComplex();
		Node node1 = return1.addOutgoing().getTarget().makeComplex();
		node1.addOutgoing().getTarget().addPrimitiveComparison();
		Node node2 = node1.addOutgoing().getTarget().makeComplex();
		node2.addOutgoing().getTarget().addPrimitiveComparison();
		node2.addOutgoing().getTarget().addPrimitiveMatch();

		return completePattern;
	}

	public static CompletePattern getMatchConcrete(String returnElementType, XmlAxisKind[] returnElementAxis,
			String attribute1Name, XmlPropertyKind attribute1Kind, String element2Type, XmlAxisKind[] element2Axis,
			String attribute2Name, XmlPropertyKind attribute2Kind, String attribute3Name, XmlPropertyKind attribute3Kind,
			String regex) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getMatchAbstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
//		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
//		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
		UntypedParameterValue p3 = ((UntypedParameterValue) params.get(3));
//		ComparisonOptionParam p4 = ((ComparisonOptionParam) params.get(4));
//		TypeOptionParam p5 = ((TypeOptionParam) params.get(5));
		BooleanParam p6 = ((BooleanParam) params.get(6));
		TextLiteralParam p7 = ((TextLiteralParam) params.get(7));
		XmlPathParamImpl p8 = ((XmlPathParamImpl) params.get(8));
		XmlPathParamImpl p9 = ((XmlPathParamImpl) params.get(9));
		XmlPathParamImpl p10 = ((XmlPathParamImpl) params.get(10));
		XmlPathParamImpl p11 = ((XmlPathParamImpl) params.get(11));
		XmlPathParamImpl p12 = ((XmlPathParamImpl) params.get(12));

		p0.setValue(returnElementType);
		p3.setValue(element2Type);
		p6.setValue(true);
		p7.setValue(regex);
		
		p9.setXmlAxis(returnElementAxis);
		p10.setXmlAxis(element2Axis);
		
		p8.getXmlPropertyOptionParam().setValue(attribute1Kind);
		if (attribute1Kind == XmlPropertyKind.ATTRIBUTE)
			p8.getXmlPropertyOptionParam().getAttributeName().setValue(attribute1Name);
		p11.getXmlPropertyOptionParam().setValue(attribute2Kind);
		if (attribute2Kind == XmlPropertyKind.ATTRIBUTE)
			p11.getXmlPropertyOptionParam().getAttributeName().setValue(attribute2Name);
		p12.getXmlPropertyOptionParam().setValue(attribute3Kind);
		if (attribute3Kind == XmlPropertyKind.ATTRIBUTE)
			p12.getXmlPropertyOptionParam().getAttributeName().setValue(attribute3Name);
		
		return completePattern;
	}
	
	public static CompletePattern getMatchThreeElementsConcrete(String returnElementType,
			XmlAxisKind[] returnElementAxis, String attribute1Name, XmlPropertyKind attribute1Kind, 
			String element2Type, XmlAxisKind[] element2Axis, String attribute2Name, XmlPropertyKind attribute2Kind, 
			XmlAxisKind[] element3Axis, String attributeMatchName, XmlPropertyKind attributeMatchKind, String regex) 
					throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		CompletePattern completePattern = getMatchAbstractThreeElements();
		completePattern.createXmlAdaption();
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
		BooleanParam p9 = ((BooleanParam) params.get(9));
		TextLiteralParam p10 = ((TextLiteralParam) params.get(10));
		XmlPathParamImpl p11 = ((XmlPathParamImpl) params.get(11));
		XmlPathParamImpl p12 = ((XmlPathParamImpl) params.get(12));
		XmlPathParamImpl p13 = ((XmlPathParamImpl) params.get(13));
		XmlPathParamImpl p14 = ((XmlPathParamImpl) params.get(14));
		XmlPathParamImpl p15 = ((XmlPathParamImpl) params.get(15));
		XmlPathParamImpl p16 = ((XmlPathParamImpl) params.get(16));
		XmlPathParamImpl p17 = ((XmlPathParamImpl) params.get(17));
		
		p0.setValue(returnElementType);
		p3.setValue(element2Type);
		p6.setValue(element2Type);
		p9.setValue(true);
		p10.setValue(regex);

		p11.getXmlPropertyOptionParam().setValue(attribute1Kind);
		if (attribute1Kind == XmlPropertyKind.ATTRIBUTE)
			p11.getXmlPropertyOptionParam().getAttributeName().setValue(attribute1Name);
		p14.getXmlPropertyOptionParam().setValue(attribute2Kind);
		if (attribute2Kind == XmlPropertyKind.ATTRIBUTE)
			p14.getXmlPropertyOptionParam().getAttributeName().setValue(attribute2Name);
		p16.getXmlPropertyOptionParam().setValue(attributeMatchKind);
		if (attributeMatchKind == XmlPropertyKind.ATTRIBUTE)
			p16.getXmlPropertyOptionParam().getAttributeName().setValue(attributeMatchName);		
		p17.getXmlPropertyOptionParam().setValue(attributeMatchKind);
		if (attributeMatchKind == XmlPropertyKind.ATTRIBUTE)
			p17.getXmlPropertyOptionParam().getAttributeName().setValue(attributeMatchName);

		p12.setXmlAxis(returnElementAxis);
		p13.setXmlAxis(element2Axis);
		p15.setXmlAxis(element3Axis);
		
		return completePattern;
	}
	
	public static CompletePattern getMatchMidas5064() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchConcrete("obj", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, "5064",
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, "Value", XmlPropertyKind.ATTRIBUTE,
				".*[a-zA-Z ]{10}.*");
	}

	public static CompletePattern getMatchMidas5360() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchConcrete("obj", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, "5360",
				new XmlAxisKind[] {XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, "Value", XmlPropertyKind.ATTRIBUTE,
				"^[0-9]+(,[0-9]+)?( x [0-9]+(,[0-9]+)?)? (m|mm)( \\([a-zA-Z‰¸ˆƒ‹÷ ]+\\))?$");
	}

	public static CompletePattern getMatchMidas3270() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchConcrete("kue", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, "3270",
				new XmlAxisKind[] {XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, "Value", XmlPropertyKind.ATTRIBUTE, "\\?$");
	}

	public static CompletePattern getMatchMidas3270Imprecise() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchConcrete("kue", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, "3270",
				new XmlAxisKind[] {XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, "Value", XmlPropertyKind.ATTRIBUTE, "[0-9]/[0-9]");
	}

	public static CompletePattern getMatchMidas3100Abbreviation() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchConcrete("kue", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, "3100",
				new XmlAxisKind[] {XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, "Value", XmlPropertyKind.ATTRIBUTE, "\\.");
	}

	public static CompletePattern getMatchMidas5060() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchConcrete("obj", new XmlAxisKind[] {XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, "5060",
				new XmlAxisKind[] {XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, "Value", XmlPropertyKind.ATTRIBUTE, "^[0-9/]+$");
	}

	public static CompletePattern getMatchMidasOb30Child() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchThreeElementsConcrete("obj", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE,
				"ob30", new XmlAxisKind[] {XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, new XmlAxisKind[] {XmlAxisKind.CHILD}, "Type",
				XmlPropertyKind.ATTRIBUTE, "^[12456789]");
	}

	public static CompletePattern getMatchLidoMeasurementValue() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchConcrete("lido:lido", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, null, XmlPropertyKind.TAG, "lido:measurementValue",
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, null, XmlPropertyKind.TAG, null, XmlPropertyKind.DATA, "[a-zA-Z¸ˆ‰‹÷ƒ]");
	}

	public static CompletePattern getMatchLidoMeasurementUnit() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchConcrete("lido:lido", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, null, XmlPropertyKind.TAG, "lido:measurementUnit",
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, null, XmlPropertyKind.TAG, null, XmlPropertyKind.DATA, "[0-9]");
	}

	public static CompletePattern getMatchLidoEarliestDate() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchConcrete("lido:lido", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, null, XmlPropertyKind.TAG, "lido:earliestDate",
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, null, XmlPropertyKind.TAG, null, XmlPropertyKind.DATA, "^[0-9]{4}$");
	}

	public static CompletePattern getMatchLidoNamePlaceSet() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchConcrete("lido:lido", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, null, XmlPropertyKind.TAG, "lido:namePlaceSet",
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, null, XmlPropertyKind.TAG, null, XmlPropertyKind.DATA, ",");
	}

	public static CompletePattern getMatchLidoAppellationValue() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getMatchConcrete("lido:lido", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, null, XmlPropertyKind.TAG, "lido:appellationValue",
				new XmlAxisKind[] {XmlAxisKind.DESCENDANT}, null, XmlPropertyKind.TAG, null, XmlPropertyKind.DATA, "\\?$");
	}

}
