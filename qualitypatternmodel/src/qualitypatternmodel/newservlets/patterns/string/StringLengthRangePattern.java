package qualitypatternmodel.newservlets.patterns.string;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class StringLengthRangePattern extends PatternClass {

	public StringLengthRangePattern() {
		super(PatternConstants.STRINGLENGTHRANGE_ID,
				PatternConstants.STRINGLENGTHRANGE_NAME, 
				PatternConstants.STRINGLENGTHRANGE_DESCR, 
				true, true, false, false);
	}
	
	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		ComplexNode main = pattern.getGraph().getReturnNodes().get(0).makeComplex();

		NotCondition not = PatternstructureFactory.eINSTANCE.createNotCondition();
		pattern.setCondition(not);
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		not.setCondition(quantifiedCondition);

		PrimitiveNode field = main.addOutgoing(quantifiedCondition.getGraph()).getTarget().makePrimitive();

		field.addPrimitiveStringLength();
		field.addPrimitiveStringLength();

		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
