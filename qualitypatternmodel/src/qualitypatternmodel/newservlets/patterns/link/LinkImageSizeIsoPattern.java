package qualitypatternmodel.newservlets.patterns.link;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.javaoperators.JavaoperatorsFactory;
import qualitypatternmodel.javaoperators.LinkImageMinSizeOperator;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.parameters.impl.BooleanParamImpl;
import qualitypatternmodel.parameters.impl.NumberParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class LinkImageSizeIsoPattern extends PatternClass {

	public LinkImageSizeIsoPattern() {
		super (PatternConstants.LINKIMAGESIZEISO_ID,
				PatternConstants.LINKIMAGESIZEISO_NAME, 
				PatternConstants.LINKIMAGESIZEISO_DESCR, 
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
		
		LinkImageMinSizeOperator op4 = JavaoperatorsFactory.eINSTANCE.createLinkImageMinSizeOperator();
		op4.setOperatorList(qc.getGraph().getOperatorList());
		BooleanParamImpl bpi = new BooleanParamImpl();
		op4.setOption(bpi);
		NumberParamImpl np1 = new NumberParamImpl();
		op4.setNumber1(np1);
		NumberParamImpl np2 = new NumberParamImpl();
		op4.setNumber2(np2);
		op4.setPrimitiveNode(field);
		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
