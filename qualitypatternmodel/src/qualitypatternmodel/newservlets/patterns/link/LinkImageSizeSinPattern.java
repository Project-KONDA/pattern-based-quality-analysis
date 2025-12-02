package qualitypatternmodel.newservlets.patterns.link;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class LinkImageSizeSinPattern extends PatternClass {

	public LinkImageSizeSinPattern() {
		super (PatternConstants.LINKIMAGESIZESIN_ID,
				PatternConstants.LINKIMAGESIZESIN_NAME, 
				PatternConstants.LINKIMAGESIZESIN_DESCR, 
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

		field.addPrimitiveLinkImageSize();

		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
