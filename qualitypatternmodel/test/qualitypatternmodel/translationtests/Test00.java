package qualitypatternmodel.translationtests;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
//import org.graalvm.graphio.GraphStructure;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.testutility.PatternTestPair;
import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlElementNavigation;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.exceptions.*;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UntypedParameterValue;

public class Test00 {
	
	public static void test(ArrayList<CompletePattern> completePatterns) {
		for (CompletePattern completePattern : completePatterns) {
			replace(completePattern);
			try {
				completePattern.isValid(AbstractionLevel.CONCRETE);
				System.out.println("\n\n___PATTERN_(VALID)___");
				System.out.println(completePattern.myToString());
				System.out.print("\n___TRANSLATION___");
				System.out.println(completePattern.generateXQuery());
			} catch (Exception e) {
				e.printStackTrace();
				try {
				  System.out.println(completePattern.myToString());
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}
	
	public static void getQueries(ArrayList<CompletePattern> completePatterns) {
		for (CompletePattern completePattern : completePatterns) {
			replace(completePattern);
			try {
				completePattern.isValid(AbstractionLevel.CONCRETE);
//				System.out.println("\n\n___PATTERN_(VALID)___");
				System.out.println(completePattern.generateXQuery());
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
		completePatterns.add(getBasePatternCondConcrete("USA"));
		completePatterns.add(getBasePatternMatchConcrete("^New"));
		Test00.test(completePatterns);
	}

	public static CompletePattern getBasePatternFinal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
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
		CompletePattern completePattern = getBasePattern();
		Node se = completePattern.getGraph().getReturnNodes().get(0);
		se.addPrimitiveComparison(comp);
		completePattern.createXmlAdaption();
		return completePattern;
	}
	
	public static CompletePattern getBasePatternCondConcrete(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternCond(comp);
		XmlNavigation xmlNavigation = (XmlNavigation) completePattern.getGraph().getRelations().get(0);
		xmlNavigation.getXmlPathParam().setXmlAxis(XmlAxisKind.DESCENDANT, "");		
		return completePattern;		
	}
	
	public static CompletePattern getBasePatternMatch(String regex) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		Node se = completePattern.getGraph().getReturnNodes().get(0);
		se.addPrimitiveMatch(regex);
		completePattern.createXmlAdaption();
		return completePattern;
	}
	
	public static CompletePattern getBasePatternMatchConcrete(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternMatch(comp);
		XmlNavigation xmlNavigation = (XmlNavigation) completePattern.getGraph().getRelations().get(0);
		xmlNavigation.getXmlPathParam().setXmlAxis(XmlAxisKind.DESCENDANT, "");		
		return completePattern;		
	}
	
	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		testPairs.add(new PatternTestPair("BASE\t", getBasePatternFinal(), "/*"));
		testPairs.add(new PatternTestPair("BASE_COND", getBasePatternCondConcrete("USA"), "//*[./text() = \"USA\"]"));
		testPairs.add(new PatternTestPair("BASE_MATCH", getBasePatternMatchConcrete("^New"), "//*[matches(./text(), \"^New\")]"));
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
				((UntypedParameterValue) param).replace(text);
			}
		}
		return pattern;
	}
}
