package qualitypatternmodel.newservlets.patterns.mand;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class MandContSinPattern extends PatternClass {

	public MandContSinPattern() {
		super(PatternConstants.MANDCONTSIN_ID,
				PatternConstants.MANDCONTSIN_NAME, 
				PatternConstants.MANDCONTSIN_DESCR, 
				true, true, true, true);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		// search for ...
		ComplexNode main = pattern.getGraph().getReturnNodes().get(0).makeComplex();

		// that does not contain
		Formula or = PatternstructureFactory.eINSTANCE.createFormula();
		or.setOperator(LogicalOperator.AND);
		pattern.setCondition(or);

		NotCondition not1 = PatternstructureFactory.eINSTANCE.createNotCondition();
		NotCondition not2 = PatternstructureFactory.eINSTANCE.createNotCondition();
		or.setCondition1(not1);
		or.setCondition2(not2);

		// either an text
		QuantifiedCondition qctext = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		not1.setCondition(qctext);
		PrimitiveNode text = main.addOutgoing(qctext.getGraph()).getTarget().makePrimitive();
		text.setName("text");

		// or an element
		QuantifiedCondition qcelement = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		not2.setCondition(qcelement);
		ComplexNode contentelement = main.addOutgoing(qcelement.getGraph()).getTarget().makeComplex();
		contentelement.setName("content");

		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
