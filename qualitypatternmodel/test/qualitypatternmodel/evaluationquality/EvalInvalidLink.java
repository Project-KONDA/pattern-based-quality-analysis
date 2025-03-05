package qualitypatternmodel.evaluationquality;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.xmltranslationtests.Test00;

public class EvalInvalidLink {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();

		completePatterns.add(getInvalidLinkGeneric());

		for (CompletePattern cp: completePatterns)
		 {
			Test00.printGenericPatternExampleXQuery(cp);
//			System.out.println(cp.myToString());
		}
	}

	public static CompletePattern getInvalidLinkGeneric() throws InvalidityException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setPatternId("invalidlink_generic");
		completePattern.setAbstractId("invalidlink_generic");
		completePattern.setDescription("Allows detecting invalid urls");

		// Context graph of pattern:
		Node ret = completePattern.getGraph().getReturnNodes().get(0).makeComplex();

		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);
		Graph g2 = quantifiedCondition.getGraph();

		Node element1 = ret.addOutgoing(g2).getTarget().makePrimitive();
		element1.setName("Element1");

		element1.addPrimitiveValidateLink();

//		Comparison comp2 = (Comparison)
//		quantifiedCondition.getGraph().getOperatorList().getOperators().get(0);
//		comp2.getOption().getOptions().add(ComparisonOperator.GREATER);
//		comp2.getOption().getOptions().add(ComparisonOperator.LESS);
//		comp2.getOption().getOptions().add(ComparisonOperator.GREATEROREQUAL);
//		comp2.getOption().getOptions().add(ComparisonOperator.LESSOREQUAL);

		return completePattern;
	}
}
