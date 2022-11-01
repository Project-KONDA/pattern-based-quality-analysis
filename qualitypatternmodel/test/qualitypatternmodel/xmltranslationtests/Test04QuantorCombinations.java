package qualitypatternmodel.xmltranslationtests;
import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.xmltestutility.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.adaptionxml.XmlPropertyKind;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.XmlPropertyNavigation;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.exceptions.*;

public class Test04QuantorCombinations {
	
	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternExistsInExistsFinal());
		completePatterns.add(getPatternForallInExists());
		completePatterns.add(getPatternExistsInForall());
		completePatterns.add(getPatternForallInForall());
		return completePatterns;
	}
	
    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		Test00.test(getPatterns());
	}
	
	public static CompletePattern getPatternExistsInExistsFinal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getPatternExistsInExists();
		
		completePattern.createXmlAdaption();
		
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		QuantifiedCondition quantifiedCondition2 = (QuantifiedCondition) quantifiedCondition.getCondition();
		
		XmlReference ref = quantifiedCondition2.getGraph().getRelations().get(0).adaptAsXmlReference();
		ref.setType(ReturnType.STRING);
		
		XmlProperty prop0 = (XmlProperty) quantifiedCondition2.getGraph().getNodes().get(4);
		Relation rel = prop0.getIncoming().get(0);
		if(rel instanceof XmlPropertyNavigation) {
			XmlPropertyNavigation nav = (XmlPropertyNavigation) rel;
			nav.getXmlPathParam().getXmlPropertyOptionParam().setValue(XmlPropertyKind.ATTRIBUTE);
			TextLiteralParam text = parametersFactory.createTextLiteralParam();
			text.setValue("demo:id");
			nav.getXmlPathParam().getXmlPropertyOptionParam().setAttributeName(text);
		}
		
		return completePattern;
	}

	public static CompletePattern getPatternExistsInExists() throws InvalidityException {
		
		// PatternStructure
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		CompletePattern completePattern = Test03Quantor.getPatternExists();
		QuantifiedCondition qcond = (QuantifiedCondition) completePattern.getCondition();
		QuantifiedCondition qcond2 =  factory.createQuantifiedCondition();
		qcond.setCondition(qcond2);
		
		// EXISTS 2 additional graph structure
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		Node e1q1 = qcond.getGraph().getNodes().get(0);
		Node e2q1 = qcond.getGraph().getNodes().get(1);
		Relation relation2 = e1q1.addOutgoing(e2q1);
		
		Node se3 = graphFactory.createNode();
		qcond2.getGraph().getNodes().add(se3);
		
		Node e2q2 = qcond2.getGraph().getNodes().get(1);
		e2q2.addOutgoing(se3);		
		
//		completePattern.createXMLAdaption();
//		relation2.adaptAsXMLNavigation();
//		XMLReference ref = relation.adaptAsXMLReference();
//		ref.setType(ReturnType.STRING);
//		completePattern.finalizeXMLAdaption();		
		
		return completePattern;
	}
	
	public static CompletePattern getPatternForallInExists() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternExistsInExistsFinal();
		((QuantifiedCondition)((QuantifiedCondition) completePattern.getCondition()).getCondition()).setQuantifier(Quantifier.FORALL);
		return completePattern;		
	}

	public static CompletePattern getPatternExistsInForall() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternExistsInExistsFinal();
		((QuantifiedCondition) completePattern.getCondition()).setQuantifier(Quantifier.FORALL);
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		quantifiedCondition.getGraph().getNodes().get(3).addPrimitiveComparison("demo:artist");;
		
		return completePattern;
	}
	public static CompletePattern getPatternForallInForall() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternForallInExists();
		((QuantifiedCondition) completePattern.getCondition()).setQuantifier(Quantifier.FORALL);
		return completePattern;
	}
	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();

		testPairs.add(new PatternTestPair("EXEX", 	getPatternExistsInExistsFinal(), "/*[./*[@*[name()=\"demo:id\"] = //*/data()]]"));
		testPairs.add(new PatternTestPair("EXFA", 	getPatternForallInExists(), "/*[./*]"));
		testPairs.add(new PatternTestPair("FAEX", 	getPatternExistsInForall(), "for $x in /* where every $y in $x/child::*[./name()=\"demo:artist\"] satisfies ($y[exists(./@*[name()=\"demo:id\"])] and /descendant::*[exists(./data())][$y/@*[name()=\"demo:id\"]=./data()]) return $x"));
		testPairs.add(new PatternTestPair("FAFA", 	getPatternForallInForall(), "for $var4 in /* where every $var7 in $var4/* satisfies ($var7[exists(./@*[name()=\"demo:id\"])]) return ($var4)"));
		
		// TODO: complete test cases
		
		return testPairs;		
	}
	
}
