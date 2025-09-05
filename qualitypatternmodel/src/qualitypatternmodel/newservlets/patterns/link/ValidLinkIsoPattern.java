package qualitypatternmodel.newservlets.patterns.link;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.javaoperators.impl.ValidateLinkOperatorImpl;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.parameters.impl.BooleanParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class ValidLinkIsoPattern extends PatternClass {

	public ValidLinkIsoPattern() {
		super (PatternConstants.VALIDLINKISO_ID,
				PatternConstants.VALIDLINKISO_NAME, 
				PatternConstants.VALIDLINKISO_DESCR, 
				true, true, false, false);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		ComplexNode record = pattern.getGraph().getReturnNodes().get(0).makeComplex();
		record.setReturnNode(false);
		PrimitiveNode field = record.addOutgoing().getTarget().makePrimitive();
		field.setReturnNode(true);
		
		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(qc);
		
		ValidateLinkOperatorImpl op4 = new ValidateLinkOperatorImpl();
		op4.setOperatorList(qc.getGraph().getOperatorList());
		BooleanParamImpl bpi = new BooleanParamImpl();
		op4.setOption(bpi);
		op4.setPrimitiveNode(field);
		return pattern;
	}
}
