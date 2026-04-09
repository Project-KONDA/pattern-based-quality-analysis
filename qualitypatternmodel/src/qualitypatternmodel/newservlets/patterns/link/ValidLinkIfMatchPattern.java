package qualitypatternmodel.newservlets.patterns.link;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.utility.PatternUtility;

public class ValidLinkIfMatchPattern extends PatternClass {

	public ValidLinkIfMatchPattern() {
		super(PatternConstants.VALIDLINKIFMATCH_ID,
				PatternConstants.VALIDLINKIFMATCH_NAME, 
				PatternConstants.VALIDLINKIFMATCH_DESCR, 
				true, true, false, false);
	}
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternUtility.testPattern(new ValidLinkIfMatchPattern().getXmlPattern(), true);
		new ValidLinkIfMatchPattern().getXmlPattern().printParameters(false);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = new ValidLinkPattern().getPattern();
		Node field = ((QuantifiedCondition) pattern.getCondition()).getGraph().getNodes().get(0);
		field.addPrimitiveMatch();

		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____
}
