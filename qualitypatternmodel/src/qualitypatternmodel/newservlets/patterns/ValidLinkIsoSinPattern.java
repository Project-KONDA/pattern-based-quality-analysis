package qualitypatternmodel.newservlets.patterns;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.javaoperators.impl.ValidateLinkOperatorImpl;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.parameters.impl.BooleanParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class ValidLinkIsoSinPattern extends PatternClass {

	public ValidLinkIsoSinPattern() {
		super (PatternConstants.VALIDLINKISOSIN_ID,
				PatternConstants.VALIDLINKISOSIN_NAME, 
				PatternConstants.VALIDLINKISOSIN_DESCR, 
				true, true, false, false);
	}

	@Override
	CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// Create Pattern
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId("/");
		pattern.setDescription("/");

		// Record Node
		PrimitiveNode field = pattern.getGraph().getReturnNodes().get(0).makePrimitive();
		field.setName("Field");
		
		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(qc);
		ValidateLinkOperatorImpl op4 = new ValidateLinkOperatorImpl();
		op4.setOperatorList(qc.getGraph().getOperatorList());
		BooleanParamImpl bpi = new BooleanParamImpl();
		op4.setOption(bpi);
//			bpi.setParameterList(pattern.getParameterList());
		op4.setPrimitiveNode(field);
		return pattern;
	}

}
