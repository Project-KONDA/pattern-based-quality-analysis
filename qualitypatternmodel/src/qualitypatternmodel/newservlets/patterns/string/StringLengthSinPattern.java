package qualitypatternmodel.newservlets.patterns.string;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.operators.StringLength;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class StringLengthSinPattern extends PatternClass {

	public StringLengthSinPattern() {
		super(PatternConstants.STRINGLENGTHSIN_ID,
				PatternConstants.STRINGLENGTHSIN_NAME, 
				PatternConstants.STRINGLENGTHSIN_DESCR, 
				true, true, false, false);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		PrimitiveNode ret = pattern.getGraph().getReturnNodes().get(0).makePrimitive();

		StringLength str = ret.addPrimitiveStringLength();

		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(quantifiedCondition);

		str.setOperatorList(quantifiedCondition.getGraph().getOperatorList());
		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
