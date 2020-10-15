package qualitypatternmodel.translationtests;
import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.testutility.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.adaptionxml.PropertyKind;
import qualitypatternmodel.adaptionxml.RelationKind;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.adaptionxml.XmlProperty;
import qualitypatternmodel.adaptionxml.XmlReference;
import qualitypatternmodel.adaptionxml.impl.XmlNavigationImpl;
import qualitypatternmodel.exceptions.*;

public class Test04QuantorCombinations {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternExistsInExistsFinal());
		completePatterns.add(getPatternForallInExists());
		completePatterns.add(getPatternExistsInForall());
		completePatterns.add(getPatternForallInForall());

		Test00.test(completePatterns);
	}
	
	public static CompletePattern getPatternExistsInExistsFinal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternExistsInExists();
		QuantifiedCondition qcond = (QuantifiedCondition) completePattern.getCondition();
		QuantifiedCondition qcond2 = (QuantifiedCondition) qcond.getCondition();
		
		completePattern.createXMLAdaption();
		qcond.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		XmlReference ref = qcond2.getGraph().getRelations().get(0).adaptAsXMLReference();
		ref.setType(ReturnType.STRING);
		completePattern.finalizeXMLAdaption();		
		
		XmlNavigation navRoot = (XmlNavigation) completePattern.getGraph().getRelations().get(0);
//		navRoot.getOption().setValue(RelationKind.DESCENDANT);
		
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		QuantifiedCondition quantifiedCondition2 = (QuantifiedCondition) quantifiedCondition.getCondition();
		
		XmlProperty prop0 = (XmlProperty) quantifiedCondition2.getGraph().getElements().get(1).getProperties().get(0);
		prop0.getOption().setValue(PropertyKind.ATTRIBUTE);
		prop0.getAttributeName().setValue("demo:id");
		
		XmlNavigation nav1 = (XmlNavigation) quantifiedCondition2.getGraph().getRelations().get(3);
		nav1.getOption().setValue(RelationKind.DESCENDANT);
		
//		Comparison comp = (Comparison) quantifiedCondition2.getGraph().getOperatorList().getOperators().get(0);
//		comp.getOption().setValue(ComparisonOperator.NOTEQUAL);
		
		return completePattern;
	}

	public static CompletePattern getPatternExistsInExists() {
		
		// PatternStructure
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		CompletePattern completePattern = Test03Quantor.getPatternExists();
		QuantifiedCondition qcond = (QuantifiedCondition) completePattern.getCondition();
		QuantifiedCondition qcond2 =  factory.createQuantifiedCondition();
		qcond.setCondition(qcond2);
		TrueElement t = factory.createTrueElement();
		qcond2.setCondition(t);		
		
		// EXISTS 2 additional graph structure
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		Element e1q1 = qcond.getGraph().getElements().get(0);
		Element e2q1 = qcond.getGraph().getElements().get(1);
		
		Relation relation2 = graphFactory.createRelation();		
		relation2.setGraph(qcond.getGraph());
		relation2.setSource(e1q1);
		relation2.setTarget(e2q1);
		
		
		Element se3 = graphFactory.createElement();
		qcond2.getGraph().getElements().add(se3);
		
		Element e2q2 = qcond2.getGraph().getElements().get(1);
		
		Relation relation = graphFactory.createRelation();	
		relation.setGraph(qcond2.getGraph());
		relation.setSource(e2q2);
		relation.setTarget(se3);		
		
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
		quantifiedCondition.getGraph().getElements().get(1).addPrimitiveComparison("demo:artist");;
		
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
