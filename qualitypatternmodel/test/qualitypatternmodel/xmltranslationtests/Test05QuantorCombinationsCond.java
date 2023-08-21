package qualitypatternmodel.xmltranslationtests;
import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.xmltestutility.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.operators.*;
import qualitypatternmodel.exceptions.*;

public class Test05QuantorCombinationsCond {
	
	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
//		completePatterns.add(getPatternExistsInExistsCond());
//		completePatterns.add(getPatternForallInExistsCond());
//		completePatterns.add(getPatternExistsInForallCond());
		completePatterns.add(getPatternForallInForallCond());
		return completePatterns;
	}
	
    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		Test00.test(getPatterns());
	}

	public static CompletePattern getPatternExistsInExistsCond() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {		
		// PatternStructure
		CompletePattern completePattern = Test04QuantorCombinations.getPatternExistsInExists();
		Graph graph0 = completePattern.getGraph();
		QuantifiedCondition qcond = (QuantifiedCondition) completePattern.getCondition();
		Graph graph1 = qcond.getGraph();
		QuantifiedCondition qcond2 = (QuantifiedCondition) qcond.getCondition();
		Graph graph2 = qcond2.getGraph();
//		// comparisons
		Node e0 = graph0.getNodes().get(0).makeComplex();
		Node e1 = graph1.getNodes().get(0).makeComplex();
		Node e2 = graph1.getNodes().get(0).makeComplex();
		Node se = graph2.getNodes().get(0).makeComplex();
		
		
		Node e0_p = e0.addOutgoing().getTarget();
		e0_p.addPrimitiveComparison("101");
		Node e1_p = e1.addOutgoing().getTarget();
		e1_p.addPrimitiveComparison("demo:building");
		Node e1_p2 = e1.addOutgoing().getTarget();
		e1_p2.addPrimitiveComparison("abc");
		Node e2_p = e2.addOutgoing().getTarget();
		e2_p.addPrimitiveComparison("USA");
		Node se_p = se.addOutgoing().getTarget();
		se_p.addPrimitiveComparison("demo:country");
				
		((Comparison) graph1.getOperatorList().getOperators().get(1)).getOption().setValue(ComparisonOperator.NOTEQUAL);
				
		completePattern.createXmlAdaption();
//		
////		XmlProperty property = (XmlProperty) graph0.getNodes().get(0).getProperties().get(0);
////		property.getAttributeName().setValue("demo:id");
////		property.getOption().getOptions().add(PropertyKind.ATTRIBUTE);
////		property.getOption().setValue(PropertyKind.ATTRIBUTE);
////	
////		XmlProperty property1 = (XmlProperty) graph1.getNodes().get(0).getProperties().get(0);
////		property1.getOption().getOptions().add(PropertyKind.TAG);
////		property1.getOption().setValue(PropertyKind.TAG);
////		
////		XmlProperty property2 = (XmlProperty) graph1.getNodes().get(0).getProperties().get(1);
////		property2.getOption().getOptions().add(PropertyKind.TAG);
////		property2.getOption().setValue(PropertyKind.TAG);
////		
////		qcond.getGraph().getRelations().get(0).adaptAsXMLElementNavigation();
////		XmlReference ref = qcond2.getGraph().getRelations().get(0).adaptAsXMLReference();
////		ref.setType(ReturnType.STRING);
////		completePattern.finalizeXMLAdaption();		
////		
////		((XmlProperty) graph2.getNodes().get(2).getProperties().get(0)).getOption().setValue(PropertyKind.TAG);
////		((XmlElementNavigation)completePattern.getGraph().getRelations().get(0)).getPathParam().setValue(AxisKind.TWOCHILD);
////		((XmlElementNavigation) graph2.getRelations().get(3)).getPathParam().setValue(AxisKind.THREECHILD);
		
		return completePattern;
	}
	
	public static CompletePattern getPatternForallInExistsCond() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternExistsInExistsCond();
		((QuantifiedCondition)((QuantifiedCondition) completePattern.getCondition()).getCondition()).setQuantifier(Quantifier.FORALL);
		return completePattern;		
	}

	public static CompletePattern getPatternExistsInForallCond() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternExistsInExistsCond();
		((QuantifiedCondition) completePattern.getCondition()).setQuantifier(Quantifier.FORALL);
		return completePattern;
	}
	public static CompletePattern getPatternForallInForallCond() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getPatternForallInExistsCond();
		((QuantifiedCondition) completePattern.getCondition()).setQuantifier(Quantifier.FORALL);
		return completePattern;
	}
	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		
		testPairs.add(new PatternTestPair("EXEXCON", 	getPatternExistsInExistsCond(), "/*/*[./@*[name()=\"demo:id\"]=\"101\" and ./name()=\"demo:building\" and ./name()!=\"abc\"and ./*[./data()=\"USA\"]/data()= /*/*/*[./name()=\"demo:country\"]/data()]"));
		testPairs.add(new PatternTestPair("EXFACON", 	getPatternForallInExistsCond(), "/*/*[./@*[name()=\"demo:id\"]=\"101\"and ./name()=\"demo:building\" and ./name()!=\"abc\" and ./child::*[data()=\"USA\"]]"));
		testPairs.add(new PatternTestPair("FAEXCON", 	getPatternExistsInForallCond(), "for $v in /*/* [./@*[name()=\"demo:id\"]=\"101\"] where  not( $v [name()=\"demo:building\" and name()!=\"abc\"]) or ( not( $v/child::*[./data()=\"USA\"]) or (exists(/*/*/* [name()=\"demo:country\" and data()=\"USA\"]))) return $v"));
		testPairs.add(new PatternTestPair("FAFACON", 	getPatternForallInForallCond(), "/*/*[./@*[name()=\"demo:id\"]=\"101\"]"));
			
		return testPairs;		
	}
	
}
