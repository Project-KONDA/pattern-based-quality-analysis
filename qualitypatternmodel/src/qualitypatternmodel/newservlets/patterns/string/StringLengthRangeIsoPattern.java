package qualitypatternmodel.newservlets.patterns.string;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.operators.StringLength;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class StringLengthRangeIsoPattern extends PatternClass {

	public StringLengthRangeIsoPattern() {
		super(PatternConstants.STRINGLENGTHRANGEISO_ID,
				PatternConstants.STRINGLENGTHRANGEISO_NAME, 
				PatternConstants.STRINGLENGTHRANGEISO_DESCR, 
				true, true, false, false);
	}
	
	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		Node ret = pattern.getGraph().getReturnNodes().get(0);
		Node element1 = ret.addOutgoing().getTarget().makePrimitive();
		element1.setReturnNode(true);
		ret.setReturnNode(false);

		StringLength strlen = element1.addPrimitiveStringLength();

		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(quantifiedCondition);

		strlen.setOperatorList(quantifiedCondition.getGraph().getOperatorList());
		return pattern;
	}
}
