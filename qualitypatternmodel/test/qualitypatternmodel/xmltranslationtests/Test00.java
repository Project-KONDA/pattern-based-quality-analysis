package qualitypatternmodel.xmltranslationtests;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
//import org.graalvm.graphio.GraphStructure;

import qualitypatternmodel.adaptionxml.XmlAxisPart;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.xmltestutility.PatternTestPair;

public class Test00 {
	
	public static void test(ArrayList<CompletePattern> completePatterns) {
		for (CompletePattern completePattern : completePatterns) {
			replace(completePattern);
			try {
				completePattern.isValid(AbstractionLevel.CONCRETE);
				String result = completePattern.myToString();
				System.out.println("\n\n___PATTERN_(VALID)___");
				System.out.println(result);
				System.out.print("\n___TRANSLATION___");
				System.out.println(completePattern.generateXQuery());
			} catch (Exception e) {
				System.out.print("\n####### PATTERN INVALID #######");
				try {
				  System.out.println(completePattern.myToString());
					e.printStackTrace();
				} catch (Exception e2) {
					System.out.print("\n####### PATTERN PRINTING FAILED #######");
					e2.printStackTrace();
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void getQueries(ArrayList<CompletePattern> completePatterns) {
		for (CompletePattern completePattern : completePatterns) {
			replace(completePattern);

			try {
				completePattern.isValid(AbstractionLevel.CONCRETE);
				String result = completePattern.generateXQuery();
				System.out.println("\n\n___PATTERN_(VALID)___");
				System.out.println(result);
			} catch (Exception e) {
				System.out.println("\n\n___PATTERN_(InVALID)___");
				e.printStackTrace();
				System.out.println(completePattern.myToString());
			}
		}
	}
	

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getBasePatternFinal());
		completePatterns.add(getBasePatternCond("USA"));
		completePatterns.add(getBasePatternMatch("^New"));
		Test00.test(completePatterns);
	}

	public static CompletePattern getBasePatternFinal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.createXmlAdaption();
		return completePattern;
	}

	public static CompletePattern getBasePattern() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		// PATTERN
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.setName("MyPattern");
				
//		// FIRST CONDITION
//		Condition truecondition = factory.createTrueElement();
//		completePattern.setCondition(truecondition);
		
		return completePattern;
	}
	
	public static CompletePattern getBasePatternCond(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();;
		Node se = completePattern.getGraph().getReturnNodes().get(0);
		se.addOutgoing().getTarget().addPrimitiveComparison(comp);
		completePattern.createXmlAdaption();
		return completePattern;
	}
	
	public static CompletePattern getBasePatternMatch(String regex) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();;
		Node se = completePattern.getGraph().getReturnNodes().get(0);
		se.addOutgoing().getTarget().addPrimitiveMatch(regex);
		completePattern.createXmlAdaption();
		return completePattern;
	}
	
	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		testPairs.add(new PatternTestPair("BASE\t", getBasePatternFinal(), "/*"));
		testPairs.add(new PatternTestPair("BASE_COND", getBasePatternCond("USA"), "//*[./text() = \"USA\"]"));
		testPairs.add(new PatternTestPair("BASE_MATCH", getBasePatternMatch("^New"), "//*[matches(./text(), \"^New\")]"));
		return testPairs;		
	}
	
	public static CompletePattern replace(CompletePattern pattern) {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		EList<Parameter> params = pattern.getParameterList().getParameters();
		for (int i = params.size()-1; i > -1; i--) {
			Parameter param = pattern.getParameterList().getParameters().get(i);
			if (param instanceof UntypedParameterValue) {
				TextLiteralParam text = parametersFactory.createTextLiteralParam();
				text.setValue("unknown");
				try {
					((UntypedParameterValue) param).replace(text);
				} catch (InvalidityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (param instanceof TextLiteralParam) {
				TextLiteralParam text = (TextLiteralParam) param;
				if(text.getValue() == null) {
					text.setValue("something");
				}
			}
			if (param instanceof BooleanParam) {
				BooleanParam bool = (BooleanParam) param;
				if(bool.getValue() == null) {
					bool.setValue(true);
				}
			}
			if (param instanceof NumberParam) {
				NumberParam number = (NumberParam) param;
				if(number.getValue() == null) {
					number.setValue(0.0);
				}
			}
			if (param instanceof XmlPathParam) {
				XmlPathParam xmlPathParam = (XmlPathParam) param;
				for(XmlAxisPart pair : xmlPathParam.getXmlAxisParts()) {
					if(pair.getTextLiteralParam().getValue() == null) {
						pair.getTextLiteralParam().setValue("");
					}
				}
			}
			if (param instanceof TypeOptionParam) {
				TypeOptionParam typeOptionParam = (TypeOptionParam) param;
				if(typeOptionParam.getValue() == null || typeOptionParam.getValue() == ReturnType.UNSPECIFIED) {
					typeOptionParam.setValue(ReturnType.STRING);
				}
			}
		}
		return pattern;
	}

	public static void printGenericPatternExampleXQuery(CompletePattern pattern) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		pattern.createXmlAdaption();
		replace(pattern);
		ArrayList<CompletePattern> patternlist = new ArrayList<CompletePattern> ();
		patternlist.add(pattern);
		test(patternlist);
//		System.out.println(pattern.generateXQuery());
		
	}
}
