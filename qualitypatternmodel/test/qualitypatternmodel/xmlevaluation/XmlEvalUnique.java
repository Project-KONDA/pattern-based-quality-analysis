package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.evaluationquality.EvalUnique;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.xmltranslationtests.Test00;

public class XmlEvalUnique {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		
		completePatterns.add(getUniqueAbstract());
		completePatterns.add(getUniqueMidas());
		completePatterns.add(getUniqueLidoLidoRecId());
		completePatterns.add(getUniqueLidoObjectPublishedId());
		completePatterns.add(getUniqueComplexLidoNameActorSet());
		
		Test00.getQueries(completePatterns);
//		Test00.test(completePatterns);
	}

	private static CompletePattern getUniqueAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalUnique.getUniqueGeneric();
		completePattern.createXmlAdaption();
		return completePattern;
	}
		
	private static CompletePattern concretizeUniqueAbstract(
			String elementname, XmlAxisKind[] elementaxis, 
			String elementfield, XmlAxisKind[] elementfieldaxis,
			XmlPropertyKind fieldtype, String fieldtypename,
			XmlPropertyKind fieldvalue, String fieldvaluename
			) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		CompletePattern completePattern = getUniqueAbstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
//		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
//		NumberParam p1 = ((NumberParam) params.get(1));
//		ComparisonOptionParam p2 = ((ComparisonOptionParam) params.get(2));
//		TypeOptionParam p3 = ((TypeOptionParam) params.get(3));
		XmlPathParam p4 = ((XmlPathParam) params.get(4));
		XmlPathParam p5 = ((XmlPathParam) params.get(5));
		XmlPathParam p6 = ((XmlPathParam) params.get(6));
		XmlPathParam p7 = ((XmlPathParam) params.get(7));
		
		

		p4.specifyAxis(elementaxis, fieldtype, fieldtypename, elementname);
		p7.specifyAxis(elementaxis, fieldtype, fieldtypename, elementname);
		p5.specifyAxis(elementfieldaxis, fieldtype, fieldtypename, elementfield);
		p6.specifyAxis(elementfieldaxis, fieldtype, fieldtypename, elementfield);

		p5.getXmlPropertyOptionParam().setValue(fieldvalue);
		p6.getXmlPropertyOptionParam().setValue(fieldvalue);
		if (fieldvalue == XmlPropertyKind.ATTRIBUTE) {
			p5.getXmlPropertyOptionParam().getAttributeName().setValue(fieldvaluename);
			p6.getXmlPropertyOptionParam().getAttributeName().setValue(fieldvaluename);			
		}
		
		return completePattern;
	}
	

	static CompletePattern getUniqueMidas() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getUniqueAbstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
//		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
//		NumberParam p1 = ((NumberParam) params.get(1));
//		ComparisonOptionParam p2 = ((ComparisonOptionParam) params.get(2));
//		TypeOptionParam p3 = ((TypeOptionParam) params.get(3));
		XmlPathParam p4 = ((XmlPathParam) params.get(4));
		XmlPathParam p5 = ((XmlPathParam) params.get(5));
		XmlPathParam p6 = ((XmlPathParam) params.get(6));
		XmlPathParam p7 = ((XmlPathParam) params.get(7));

		p4.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Type", "wer");
		p7.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Type", "wer");
		p5.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Type", "3600");
		p6.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD}, XmlPropertyKind.ATTRIBUTE, "Type", "3600");

		p5.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p5.getXmlPropertyOptionParam().getAttributeName().setValue("Value");
		p6.getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
		p6.getXmlPropertyOptionParam().getAttributeName().setValue("Value");
		
		return completePattern;
	}
	
	private static CompletePattern getUniqueLidoConcrete(XmlAxisKind[] returnRel, String returnElementName, String elementName) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return concretizeUniqueAbstract(returnElementName, returnRel,
				elementName, new XmlAxisKind[] {XmlAxisKind.CHILD}, XmlPropertyKind.TAG, null, XmlPropertyKind.DATA, null);
	}
	
	static CompletePattern getUniqueLidoLidoRecId() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {		
		// not used for evaluation anymore
		return getUniqueLidoConcrete(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "lido:lido", "lido:lidoRecID");
	}
	
	static CompletePattern getUniqueLidoObjectPublishedId() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {		
		return getUniqueLidoConcrete(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "lido:lido", "lido:objectPublishedID");
	}
	
	static CompletePattern getUniqueComplexLidoNameActorSet() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		CompletePattern completePattern = getUniqueAbstract();
		
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
//		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
//		NumberParam p1 = ((NumberParam) params.get(1));
//		ComparisonOptionParam p2 = ((ComparisonOptionParam) params.get(2));
//		TypeOptionParam p3 = ((TypeOptionParam) params.get(3));
		XmlPathParam p4 = ((XmlPathParam) params.get(4));
		XmlPathParam p5 = ((XmlPathParam) params.get(5));
		XmlPathParam p6 = ((XmlPathParam) params.get(6));
		XmlPathParam p7 = ((XmlPathParam) params.get(7));
		

		p4.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, XmlPropertyKind.TAG, null, "lido:lido");
		p7.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, XmlPropertyKind.TAG, null, "lido:lido");
		
		p5.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, XmlPropertyKind.TAG, null, "lido:actor");
		p6.specifyAxis(new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, XmlPropertyKind.TAG, null, "lido:actor");

		p5.addXmlAxis(XmlAxisKind.CHILD, "lido:nameActorSet");
		p6.addXmlAxis(XmlAxisKind.CHILD, "lido:nameActorSet");
		p5.addXmlAxis(XmlAxisKind.CHILD, "lido:appellationValue");
		p6.addXmlAxis(XmlAxisKind.CHILD, "lido:appellationValue");

		p5.getXmlPropertyOptionParam().setValue(XmlPropertyKind.DATA);
		p6.getXmlPropertyOptionParam().setValue(XmlPropertyKind.DATA);
		
		
		return completePattern;
	}
	
//	private static CompletePattern getUniqueRunningExample() { // replaced by CARD
//		ParametersPackage.eINSTANCE.eClass();
//		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
//		
//		CompletePattern completePattern = getUniqueAbstract();
//		Element returnElementInReturnGraph = completePattern.getGraph().getReturnElements().get(0);	
//		returnElementInReturnGraph.getProperties().get(0).getOption().setValue(PropertyKind.TAG);
//		TextLiteralParam concreteInputValue = parametersFactory.createTextLiteralParam();
//		concreteInputValue.setValue("artist");
//		((UnknownParameterValue) ((Comparison) returnElementInReturnGraph.getPredicates().get(0)).getArgument2()).replace(concreteInputValue);
//		
//		CountCondition countCondition = (CountCondition) completePattern.getCondition();		
//		CountPattern countPattern = (CountPattern) countCondition.getCountPattern();
//		
//		Element returnInCPattern = countPattern.getGraph().getRootElement().getNextElements().get(0);
//		Element rootInCPattern = countPattern.getGraph().getRootElement();
//		Element nextToRootInCPattern = rootInCPattern.getNextElements().get(1);	
//		nextToRootInCPattern.getProperties().get(0).getOption().setValue(PropertyKind.TAG);
//		TextLiteralParam concreteInputValue2 = parametersFactory.createTextLiteralParam();
//		concreteInputValue2.setValue("artist");
//		((UnknownParameterValue) ((Comparison) nextToRootInCPattern.getPredicates().get(0)).getArgument2()).replace(concreteInputValue2);
//		
//		returnInCPattern.getProperties().get(0).getOption().setValue(PropertyKind.ATTRIBUTE);
//		returnInCPattern.getProperties().get(0).getAttributeName().setValue("id");
//		
//		nextToRootInCPattern.getProperties().get(1).getOption().setValue(PropertyKind.ATTRIBUTE);
//		nextToRootInCPattern.getProperties().get(1).getAttributeName().setValue("id");
//		
//		((Comparison) nextToRootInCPattern.getPredicates().get(1)).setType(ReturnType.STRING);
//		
//		return completePattern;
//	}
}
