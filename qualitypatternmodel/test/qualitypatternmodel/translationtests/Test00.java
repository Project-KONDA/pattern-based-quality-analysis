package qualitypatternmodel.translationtests;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.graalvm.graphio.GraphStructure;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.testutilityclasses.PatternTestPair;
import qualitypatternmodel.adaptionxml.AdaptionxmlFactory;
import qualitypatternmodel.adaptionxml.AdaptionxmlPackage;
import qualitypatternmodel.adaptionxml.XMLElement;
import qualitypatternmodel.adaptionxml.XMLNavigation;
import qualitypatternmodel.adaptionxml.XMLRoot;
import qualitypatternmodel.adaptionxml.impl.XMLElementImpl;
import qualitypatternmodel.adaptionxml.impl.XMLNavigationImpl;
import qualitypatternmodel.adaptionxml.impl.XMLRootImpl;
import qualitypatternmodel.exceptions.*;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.UnknownParameterValue;

//import qualitypatternmodel.patternstructure.*;
//import qualitypatternmodel.patternstructure.impl.*;
//import qualitypatternmodel.graphstructure.*;
//import qualitypatternmodel.graphstructure.impl.*;
//import qualitypatternmodel.functions.*;
//import qualitypatternmodel.functions.impl.*;
//import qualitypatternmodel.inputfields.*;
//import qualitypatternmodel.inputfields.impl.*;
//import qualitypatternmodel.exceptions.*;

public class Test00 {
	
	public static void test(ArrayList<CompletePattern> completePatterns) {
		for (CompletePattern completePattern : completePatterns) {
			concretize(completePattern);
			try {
				completePattern.isValid(true);
				System.out.println("\n\n___PATTERN_(VALID)___");
				System.out.println(completePattern.myToString());
				System.out.print("\n___TRANSLATION___");
				System.out.println(completePattern.generateQuery());
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
	

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getBasePatternFinal());
		completePatterns.add(getBasePatternCond("my_cond"));
		completePatterns.add(getBasePatternMatch("my_regex"));
		Test00.test(completePatterns);
	}

	public static CompletePattern getBasePatternFinal() {
		CompletePattern completePattern = getBasePattern();
		completePattern.createXMLAdaption();
		completePattern.finalizeXMLAdaption();
		return completePattern;
	}

	public static CompletePattern getBasePattern() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		// PATTERN
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.setName("MyPattern");
				
		// FIRST CONDITION
		Condition truecondition = factory.createTrueElement();
		completePattern.setCondition(truecondition);
		
		return completePattern;
	}
	
	public static CompletePattern getBasePatternCond(String comp) {
		CompletePattern completePattern = getBasePattern();
		Element se = completePattern.getGraph().getReturnElements().get(0);
		se.addPrimitiveComparison(comp);
		completePattern.createXMLAdaption();
		completePattern.finalizeXMLAdaption();
		return completePattern;
	}
	
	public static CompletePattern getBasePatternMatch(String regex) {
		CompletePattern completePattern = getBasePattern();
		Element se = completePattern.getGraph().getReturnElements().get(0);
		se.addPrimitiveMatch(regex);
		completePattern.createXMLAdaption();
		completePattern.finalizeXMLAdaption();
		return completePattern;
	}
	
	public static List<PatternTestPair> getTestPairs(){
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		testPairs.add(new PatternTestPair("BASE", getBasePattern(), "/*"));
		return testPairs;		
	}
	
	public static CompletePattern concretize(CompletePattern pattern) {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		EList<Parameter> params = pattern.getParameterList().getParameters();
		for (int i = params.size()-1; i > -1; i--) {
			Parameter param = pattern.getParameterList().getParameters().get(i);
			if (param instanceof UnknownParameterValue) {
				TextLiteralParam text = parametersFactory.createTextLiteralParam();
				text.setValue("unknown");
				((UnknownParameterValue) param).concretize(text);
			}
		}
		return pattern;
	}
}
