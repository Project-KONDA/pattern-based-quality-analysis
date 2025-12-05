package qualitypatternmodel.newservlets.patterns.link;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.javaoperators.JavaoperatorsFactory;
import qualitypatternmodel.javaoperators.LinkMimeTypeOperator;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.parameters.impl.BooleanParamImpl;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class LinkMimeTypeIsoPattern extends PatternClass {

	public LinkMimeTypeIsoPattern() {
		super (PatternConstants.LINKMIMETYPEISO_ID,
				PatternConstants.LINKMIMETYPEISO_NAME, 
				PatternConstants.LINKMIMETYPEISO_DESCR, 
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
		
		LinkMimeTypeOperator op4 = JavaoperatorsFactory.eINSTANCE.createLinkMimeTypeOperator();
		op4.setOperatorList(qc.getGraph().getOperatorList());
		BooleanParamImpl bpi = new BooleanParamImpl();
		op4.setOption(bpi);
		TextListParamImpl tlp = new TextListParamImpl();
		op4.setTextListParam(tlp);
		op4.setPrimitiveNode(field);
		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
