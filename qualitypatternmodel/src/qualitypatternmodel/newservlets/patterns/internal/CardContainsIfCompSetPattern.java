package qualitypatternmodel.newservlets.patterns.internal;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.NotCondition;

public class CardContainsIfCompSetPattern extends PatternClass {

	public CardContainsIfCompSetPattern() {
		super(PatternConstants.CARDCONTAINSIFCOMPSET_ID,
				PatternConstants.CARDCONTAINSIFCOMPSET_NAME, 
				PatternConstants.CARDCONTAINSIFCOMPSET_DESCR, 
				true, true, true, false);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = new CardIfCompSetPattern().getPattern();
		Formula formula = (Formula) pattern.getCondition();
		NotCondition notCondition = (NotCondition) formula.getCondition2();
		CountCondition count = (CountCondition) notCondition.getCondition();
		CountPattern countpattern = count.getCountPattern();
		PrimitiveNode nodeB = countpattern.getGraph().getReturnNodes().get(0).makePrimitive();
		nodeB.addPrimitiveContains();
		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
