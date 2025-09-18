package qualitypatternmodel.newservlets.patterns.mand;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class MandElePattern extends PatternClass {

	public MandElePattern() {
		super(PatternConstants.MANDELE_ID,
				PatternConstants.MANDELE_NAME, 
				PatternConstants.MANDELE_DESCR, 
				true, true, true, true);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		ComplexNode main = pattern.getGraph().getReturnNodes().get(0).makeComplex();
		main.setName("element");

		NotCondition not = PatternstructureFactory.eINSTANCE.createNotCondition();
		pattern.setCondition(not);

		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		not.setCondition(qc);

		ComplexNode field = main.addOutgoing(qc.getGraph()).getTarget().makeComplex();
		field.setName("subelement");

		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____
}
