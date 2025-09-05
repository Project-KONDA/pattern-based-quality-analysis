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
				true, true, false, false);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		// search for ...
		ComplexNode main = pattern.getGraph().getReturnNodes().get(0).makeComplex();
		
		// that does not contain
		NotCondition not = PatternstructureFactory.eINSTANCE.createNotCondition();
		pattern.setCondition(not);
		
		// either
		Formula or = PatternstructureFactory.eINSTANCE.createFormula();
		or.setOperator(LogicalOperator.OR);
		not.setCondition(or);
		
		// an text
		QuantifiedCondition qctext = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		or.setCondition1(qctext);
		PrimitiveNode text = main.addOutgoing(qctext.getGraph()).getTarget().makePrimitive();
		text.setName("text");

		// or an element
		QuantifiedCondition qcelement = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		or.setCondition2(qcelement);
		ComplexNode contentelement = main.addOutgoing(qcelement.getGraph()).getTarget().makeComplex();
		contentelement.setName("content");

		return pattern;
	}
}
