package qualitypatternmodel.newservlets.patterns.external;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.impl.NumberElementImpl;

public class UniqueSinPattern extends PatternClass {

	public UniqueSinPattern() {
		super(PatternConstants.UNIQUESIN_ID,
				PatternConstants.UNIQUESIN_NAME, 
				PatternConstants.UNIQUESIN_DESCR, 
				true, true, true, false);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		// Context graph of pattern:
		Node returnNode = pattern.getGraph().getNodes().get(0).makePrimitive();

		// First-order logic condition of pattern:
		CountCondition countCondition = PatternstructureFactory.eINSTANCE.createCountCondition();
		pattern.setCondition(countCondition);
		countCondition.createCountPattern();
		NumberElementImpl ne = new NumberElementImpl();
		countCondition.setArgument2(ne);
		ne.createParameters();

		Node countReturn = countCondition.getCountPattern().getGraph().addNode().makePrimitive();
		Comparison c = countReturn.addComparison(returnNode);
		countReturn.setReturnNode(true);
		
		c.getOption().setValue(ComparisonOperator.EQUAL);
		c.getOption().setPredefined(true);
		countCondition.getOption().setValue(ComparisonOperator.NOTEQUAL);
		countCondition.getOption().setPredefined(true);
		ne.getNumberParam().setValue(1.);
		ne.getNumberParam().setPredefined(true);
		

		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
