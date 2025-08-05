package qualitypatternmodel.newservlets.patterns;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class CompValPattern extends PatternClass {

	@Override
	CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		ComplexNode main = pattern.getGraph().getReturnNodes().get(0).makeComplex();
		main.setName("main");

		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(qc);

		PrimitiveNode field = main.addOutgoing(qc.getGraph()).getTarget().makePrimitive();
		field.setName("field");

		field.addPrimitiveComparison();

		return pattern;
	}

	@Override
	public String id() {
		return PatternConstants.COMPVAL_ID;
	}

	@Override
	String name() {
		return PatternConstants.COMPVAL_NAME;
	}

	@Override
	String description() {
		return PatternConstants.COMPVAL_DESCR;
	}

	@Override
	public Boolean genericValid() {
		return true;
	}

	@Override
	public Boolean xmlValid() {
		return false;
	}

	@Override
	public Boolean rdfValid() {
		return false;
	}

	@Override
	public Boolean neoValid() {
		return false;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
