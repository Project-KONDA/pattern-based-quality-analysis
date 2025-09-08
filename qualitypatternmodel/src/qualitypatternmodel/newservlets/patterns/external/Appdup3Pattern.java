package qualitypatternmodel.newservlets.patterns.external;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class Appdup3Pattern extends PatternClass {

	public Appdup3Pattern() {
		super(PatternConstants.APPDUP3_ID,
				PatternConstants.APPDUP3_NAME, 
				PatternConstants.APPDUP3_DESCR, 
				false, false, false, false);
	}

	@Override
	public CompletePattern getPattern()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = new Appdup2Pattern().getPattern();

		Graph g0 = pattern.getGraph();
		QuantifiedCondition qc1 = (QuantifiedCondition) pattern.getCondition();
		Graph g1 = qc1.getGraph();

		Node main = g0.getNodes().get(0);
		Node other = g0.getNodes().get(1);

		Node n2 = main.addOutgoing(g1).getTarget().makePrimitive();
		other.addOutgoing(n2);

		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
