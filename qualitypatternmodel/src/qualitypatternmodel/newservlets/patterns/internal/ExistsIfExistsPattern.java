package qualitypatternmodel.newservlets.patterns.internal;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class ExistsIfExistsPattern extends PatternClass {

	public ExistsIfExistsPattern() {
		super(PatternConstants.EXISTSIFEXISTS_ID,
				PatternConstants.EXISTSIFEXISTS_NAME, 
				PatternConstants.EXISTSIFEXISTS_DESCR, 
				true, true, true, true);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		CompletePattern pattern = factory.createCompletePattern();
		ComplexNode ret = pattern.getGraph().getReturnNodes().get(0).makeComplex();
		
		Formula form = factory.createFormula();
		pattern.setCondition(form);
		QuantifiedCondition qc = factory.createQuantifiedCondition();
		form.setCondition1(qc);
		PrimitiveNode conditionnode = ret.addOutgoing(qc.getGraph()).getTarget().makePrimitive();
		conditionnode.setName("conditionProperty");

		NotCondition not = factory.createNotCondition();
		form.setCondition2(not);
		QuantifiedCondition qc2 = factory.createQuantifiedCondition();
		not.setCondition(qc2);
		PrimitiveNode requirednode = ret.addOutgoing(qc2.getGraph()).getTarget().makePrimitive();
		requirednode.setName("requiredProperty");

		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
