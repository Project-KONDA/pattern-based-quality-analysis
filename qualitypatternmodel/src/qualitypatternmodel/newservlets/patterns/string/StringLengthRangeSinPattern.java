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

public class StringLengthRangeSinPattern extends PatternClass {

	public StringLengthRangeSinPattern() {
		super(PatternConstants.STRINGLENGTHRANGESIN_ID,
				PatternConstants.STRINGLENGTHRANGESIN_NAME, 
				PatternConstants.STRINGLENGTHRANGESIN_DESCR, 
				true, true, false, false);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		PrimitiveNode ret = pattern.getGraph().getReturnNodes().get(0).makePrimitive();

		StringLength str1 = ret.addPrimitiveStringLength();
		StringLength str2 = ret.addPrimitiveStringLength();

		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(quantifiedCondition);

		str1.setOperatorList(quantifiedCondition.getGraph().getOperatorList());
		str2.setOperatorList(quantifiedCondition.getGraph().getOperatorList());
		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
