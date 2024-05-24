package qualitypatternmodel.xmlevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.evaluationquality.EvalCompval;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.XmlPatternUtility;

public class XmlEvalCompval {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCompvalMidas5230Objekt());
		completePatterns.add(getCompvalMidas5230ApsObjekt());
		completePatterns.add(getCompvalMidas5230Schloss());
		completePatterns.add(getCompvalMidas5230ApsSchloss());
		completePatterns.add(getCompvalMidas5230Print());
		completePatterns.add(getCompvalMidas5230ApsPrint());
		completePatterns.add(getCompvalLidoEventPlace());
		
		completePatterns.add(getCompvalLidoObjectWorkTypeObjekt());
		completePatterns.add(getCompvalLidoObjectWorkTypeSchloss());
		completePatterns.add(getCompvalLidoObjectWorkTypePrint());

		XmlPatternUtility.getQueries(completePatterns);
//		Test00.test(completePatterns);		
	}
	
	public static CompletePattern getCompval2Abstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalCompval.getCompval2Generic();
		completePattern.createXmlAdaption();
		return completePattern;
	}
	
	public static CompletePattern getCompval3Abstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalCompval.getCompval3Generic();
		completePattern.createXmlAdaption();
		return completePattern;
	}
	
	public static CompletePattern getCompval3Concrete(
			XmlAxisKind[] element1Axis,
			XmlPropertyKind attribute1Kind, String attribute1Name, String attribute1Value,
			XmlAxisKind[] element2Axis,
			XmlPropertyKind attribute2Kind, String attribute2Name, String attribute2Value,
			XmlAxisKind[] element3Axis,
			XmlPropertyKind attribute3Kind, String attribute3Name, String attribute3Value,
			XmlPropertyKind attribute4Kind, String attribute4Name, String attribute4Value
			) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getCompval3Abstract();

		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
//		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
//		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		XmlPathParam p4 = ((XmlPathParam) params.get(4));
		XmlPathParam p5 = ((XmlPathParam) params.get(5));
		
		p0.setValue(attribute4Value);
		p3.specifyAxis(element1Axis, attribute1Kind, attribute1Name, attribute1Value);
		p4.specifyAxis(element2Axis, attribute2Kind, attribute2Name, attribute2Value);
		p5.specifyAxis(element3Axis, attribute3Kind, attribute3Name, attribute3Value);
		p5.getXmlPropertyOptionParam().setValue(attribute4Kind);
		if (attribute4Kind == XmlPropertyKind.ATTRIBUTE)
			p5.getXmlPropertyOptionParam().getAttributeName().setValue(attribute4Name);
		
		return completePattern;
	}
	
	public static CompletePattern getCompval2Concrete(String returnElementType, XmlAxisKind[] returnElementAxis,
			String attribute1Name, XmlPropertyKind attribute1Kind, String element2Type, XmlAxisKind[] element2Axis,
			String attribute2Name, XmlPropertyKind attribute2Kind, String attribute3Name, XmlPropertyKind attribute3Kind,
			String value) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		CompletePattern completePattern = getCompval2Abstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();
				
		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
//		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
//		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		XmlPathParam p4 = ((XmlPathParam) params.get(4));

		p0.setValue(value);
		p3.specifyAxis(returnElementAxis, attribute1Kind, attribute1Name, returnElementType);
		p4.specifyAxis(element2Axis, attribute2Kind, attribute2Name, element2Type);
		p4.getXmlPropertyOptionParam().setValue(attribute3Kind);
		if (attribute3Kind == XmlPropertyKind.ATTRIBUTE)
			p4.getXmlPropertyOptionParam().getAttributeName().setValue(attribute3Name);
		
		return completePattern;
	}
	
	public static CompletePattern getCompval2Concrete(String returnElementType, XmlAxisKind[] returnElementAxis, String element2Type,
			XmlAxisKind[] element2Axis, String value) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		CompletePattern completePattern = getCompval2Abstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
//		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
//		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		XmlPathParam p4 = ((XmlPathParam) params.get(4));
		
		p0.setValue(value);
		p3.setXmlAxis(returnElementAxis, returnElementType);
		p4.setXmlAxis(element2Axis, element2Type);
		
		return completePattern;
	}
	
	public static CompletePattern getCompvalMidas5230Objekt() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getCompval2Concrete("obj", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, 
				"5230", new XmlAxisKind[] {XmlAxisKind.CHILD}, "Type",  XmlPropertyKind.ATTRIBUTE,  
				"Value", XmlPropertyKind.ATTRIBUTE,  "Objekt");
	}
	
	public static CompletePattern getCompvalMidas5230ApsObjekt() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getCompval2Concrete("obj", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD},  
				"a5230", new XmlAxisKind[] {XmlAxisKind.CHILD}, "Objekt");
	}

	public static CompletePattern getCompvalMidas5230Schloss() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getCompval2Concrete("obj", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, 
				"5230", new XmlAxisKind[] {XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, 
				"Value", XmlPropertyKind.ATTRIBUTE, "Schloss");
	}
	
	public static CompletePattern getCompvalMidas5230ApsSchloss() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getCompval2Concrete("obj", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD},  
				"a5230", new XmlAxisKind[] {XmlAxisKind.CHILD}, "Schloss");
	}

	public static CompletePattern getCompvalMidas5230Print() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getCompval2Concrete("obj", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, 
				"5230", new XmlAxisKind[] {XmlAxisKind.CHILD}, "Type", XmlPropertyKind.ATTRIBUTE, 
				"Value", XmlPropertyKind.ATTRIBUTE, "Print");
	}
	
	public static CompletePattern getCompvalMidas5230ApsPrint() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getCompval2Concrete("obj", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD},  
				"a5230", new XmlAxisKind[] {XmlAxisKind.CHILD}, "Print");
	}

	public static CompletePattern getCompvalLidoEventPlace() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getCompval2Concrete("lido:lido", new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD}, null, XmlPropertyKind.TAG, "lido:eventPlace",
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD}, 
				null, XmlPropertyKind.TAG, "lido:type", XmlPropertyKind.ATTRIBUTE, "alternative");
	}

	public static CompletePattern getCompvalLidoObjectWorkTypeObjekt() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getCompval3Concrete(
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD},
				XmlPropertyKind.TAG, null, "lido:lido",
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD},
				XmlPropertyKind.TAG, null, "lido:objectWorkType",
				new XmlAxisKind[] {XmlAxisKind.CHILD},  
				XmlPropertyKind.TAG, null, "lido:term", 
				XmlPropertyKind.DATA, null, "Objekt");
	}
	
	public static CompletePattern getCompvalLidoObjectWorkTypeSchloss() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getCompval3Concrete(
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD},
				XmlPropertyKind.TAG, null, "lido:lido",
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD},
				XmlPropertyKind.TAG, null, "lido:objectWorkType",
				new XmlAxisKind[] {XmlAxisKind.CHILD},  
				XmlPropertyKind.TAG, null, "lido:term", 
				XmlPropertyKind.DATA, null, "Schloss");
	}
	
	public static CompletePattern getCompvalLidoObjectWorkTypePrint() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getCompval3Concrete(
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD},
				XmlPropertyKind.TAG, null, "lido:lido",
				new XmlAxisKind[] {XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD, XmlAxisKind.CHILD},
				XmlPropertyKind.TAG, null, "lido:objectWorkType",
				new XmlAxisKind[] {XmlAxisKind.CHILD},  
				XmlPropertyKind.TAG, null, "lido:term", 
				XmlPropertyKind.DATA, null, "Print");
	}

}
