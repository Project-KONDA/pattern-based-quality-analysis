package qualitypatternmodel.newservlets.patterns.link;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class LinkMimeTypeIfCompSetPattern extends PatternClass {

	public LinkMimeTypeIfCompSetPattern() {
		super(PatternConstants.LINKMIMETYPEIFCOMPSET_ID,
				PatternConstants.LINKMIMETYPEIFCOMPSET_NAME, 
				PatternConstants.LINKMIMETYPEIFCOMPSET_DESCR, 
				true, true, false, false);
	}
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		new LinkMimeTypeIfCompSetPattern().getXmlPattern().printParameters(false);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		ComplexNode main = pattern.getGraph().getReturnNodes().get(0).makeComplex();

		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(qc);
		
		PrimitiveNode field1 = main.addOutgoing(qc.getGraph()).getTarget().makePrimitive();
		TextListParamImpl tlp = new TextListParamImpl();
		field1.addPrimitiveComparison(tlp);
		
		PrimitiveNode field2 = main.addOutgoing(qc.getGraph()).getTarget().makePrimitive();
		field2.addPrimitiveLinkMimeType();
		
		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
