package qualitypatternmodel.newservlets.patterns.internal;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class CompSetIfMatchPattern extends PatternClass {
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException  {
		CompletePattern pattern = new CompSetIfMatchPattern().getPattern();
		pattern.isValid(AbstractionLevel.GENERIC);
		pattern.createXmlAdaption();
		System.out.println(pattern.myToString());
		pattern.isValid(AbstractionLevel.SEMI_CONCRETE);
	}

	public CompSetIfMatchPattern() {
		super(PatternConstants.COMPSETIFMATCH_ID,
				PatternConstants.COMPSETIFMATCH_NAME, 
				PatternConstants.COMPSETIFMATCH_DESCR, 
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
		conditionnode.addPrimitiveMatch();

		NotCondition not = factory.createNotCondition();
		form.setCondition2(not);
		QuantifiedCondition qc2 = factory.createQuantifiedCondition();
		not.setCondition(qc2);
		PrimitiveNode requirednode = ret.addOutgoing(qc2.getGraph()).getTarget().makePrimitive();
		requirednode.setName("requiredProperty");
		requirednode.addPrimitiveComparison(new TextListParamImpl());

		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
