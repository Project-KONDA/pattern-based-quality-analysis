package qualitypatternmodel.evaluationquality;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.xmltranslationtests.Test00;

public class EvalCompSet {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();

		completePatterns.add(getCompSetGeneric());

		for (CompletePattern cp: completePatterns)
		 {
			Test00.printGenericPatternExampleXQuery(cp);
//			System.out.println(cp.myToString());
		}
	}

	public static CompletePattern getCompSetGeneric() throws InvalidityException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setPatternId("compset_generic");
		completePattern.setAbstractId("compset_generic");
		completePattern.setDescription("Allows evaluating whether values are within a list of allowed/restricted values");

		// Context graph of pattern:
		Node ret = completePattern.getGraph().getReturnNodes().get(0).makeComplex();

		// First-order logic condition of pattern:
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);
		Graph g2 = quantifiedCondition.getGraph();

		Node element1 = ret.addOutgoing(g2).getTarget().makePrimitive();
		element1.setName("Element1");

		UntypedParameterValue p = element1.addPrimitiveComparison();
		p.replace(new TextListParamImpl());

		return completePattern;
	}
}
