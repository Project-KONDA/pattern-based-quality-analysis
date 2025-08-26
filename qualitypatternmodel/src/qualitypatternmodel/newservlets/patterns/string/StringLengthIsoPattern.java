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

public class StringLengthIsoPattern extends PatternClass {

	public StringLengthIsoPattern() {
		super(PatternConstants.STRINGLENGTHISO_ID,
				PatternConstants.STRINGLENGTHISO_NAME, 
				PatternConstants.STRINGLENGTHISO_DESCR, 
				true, true, true, true);
	}
	
	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		pattern.getGraph().getReturnNodes().get(0).makeComplex();

		Node ret = pattern.getGraph().getReturnNodes().get(0);
		Node element1 = ret.addOutgoing().getTarget().makePrimitive();

		StringLength strlen = element1.addPrimitiveStringLength();

		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(quantifiedCondition);

		strlen.setOperatorList(quantifiedCondition.getGraph().getOperatorList());
		return pattern;
	}
}
