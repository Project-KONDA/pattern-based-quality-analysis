package qualitypatternmodel.cyphertranslationtests_new;
import java.util.ArrayList;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;

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
		Node se = graph2.getNodes().get(1).makeComplex();


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

		completePattern.createNeo4jAdaption();
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
}
