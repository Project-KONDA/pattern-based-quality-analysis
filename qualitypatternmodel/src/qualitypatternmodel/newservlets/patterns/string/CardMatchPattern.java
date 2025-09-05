package qualitypatternmodel.newservlets.patterns.string;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.newservlets.ServletConstants;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.impl.NumberElementImpl;

public class CardMatchPattern extends PatternClass {

	public CardMatchPattern() {
		super(PatternConstants.CARDMATCH_ID,
				PatternConstants.CARDMATCH_NAME, 
				PatternConstants.CARDMATCH_DESCR, 
				true, true, false, false);
	}

	@Override
	public CompletePattern getPattern()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		// Each <Element> 
		ComplexNode returnNode = pattern.getGraph().getNodes().get(0).makeComplex();

		// contains <at least> <1> <Property> 
		CountCondition countCondition = PatternstructureFactory.eINSTANCE.createCountCondition();
		pattern.setCondition(countCondition);
		countCondition.createCountPattern();
		NumberElementImpl ne = new NumberElementImpl();
		countCondition.setArgument2(ne);
		ne.createParameters();
		PrimitiveNode countReturn = returnNode.addOutgoing(countCondition.getCountPattern().getGraph()).getTarget().makePrimitive();
		countReturn.setReturnNode(true);
		
		// that <does / does not> match <a specific pattern (RegEx)>.
		countReturn.addPrimitiveMatch();
		
		if (ServletConstants.FILL_VALUES) {
			ne.getNumberParam().setValue(1.);
			countCondition.getOption().setValue(ComparisonOperator.GREATER);
		}

		return pattern;
	}
}
