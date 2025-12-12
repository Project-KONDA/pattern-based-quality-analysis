package qualitypatternmodel.newservlets.patterns.internal;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.NotCondition;

public class CardCompSetIfCompSetPattern extends PatternClass {

	public CardCompSetIfCompSetPattern() {
		super(PatternConstants.CARDCOMPSETIFCOMPSET_ID,
				PatternConstants.CARDCOMPSETIFCOMPSET_NAME, 
				PatternConstants.CARDCOMPSETIFCOMPSET_DESCR, 
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
		TextListParam list2 = new TextListParamImpl();
		nodeB.addComparison(list2);
		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
