package qualitypatternmodel.newservlets.patterns.link;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.javaoperators.JavaoperatorsFactory;
import qualitypatternmodel.javaoperators.ValidateLinkOperator;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.parameters.impl.BooleanParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class ValidLinkSinPattern extends PatternClass {

	public ValidLinkSinPattern() {
		super (PatternConstants.VALIDLINKSIN_ID,
				PatternConstants.VALIDLINKSIN_NAME, 
				PatternConstants.VALIDLINKSIN_DESCR, 
				true, true, false, false);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// Create Pattern
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId("/");
		pattern.setDescription("/");

		// Record Node
		PrimitiveNode field = pattern.getGraph().getReturnNodes().get(0).makePrimitive();
		field.setName("Field");
		
		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(qc);
		ValidateLinkOperator op4 = JavaoperatorsFactory.eINSTANCE.createValidateLinkOperator();
		op4.setOperatorList(qc.getGraph().getOperatorList());
		BooleanParamImpl bpi = new BooleanParamImpl();
		op4.setOption(bpi);
		op4.setPrimitiveNode(field);
		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
