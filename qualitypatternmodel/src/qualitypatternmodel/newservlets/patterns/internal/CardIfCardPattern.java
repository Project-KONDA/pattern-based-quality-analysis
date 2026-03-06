package qualitypatternmodel.newservlets.patterns.internal;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.newservlets.ServletConstants;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.impl.NumberElementImpl;

public class CardIfCardPattern extends PatternClass {

	public CardIfCardPattern() {
		super(PatternConstants.CARDIFCARD_ID,
				PatternConstants.CARDIFCARD_NAME, 
				PatternConstants.CARDIFCARD_DESCR, 
				true, true, true, false);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		ComplexNode ret = pattern.getGraph().getReturnNodes().get(0).makeComplex();

		Formula formula = PatternstructureFactory.eINSTANCE.createFormula();
		formula.setOperator(LogicalOperator.AND);
		pattern.setCondition(formula);

		CountCondition count = PatternstructureFactory.eINSTANCE.createCountCondition();
		formula.setCondition1(count);
		count.createCountPattern();
		NumberElementImpl ne1 = new NumberElementImpl();
		count.setArgument2(ne1);
		ne1.createParameters();
		if (ServletConstants.FILL_VALUES) {
			ne1.getNumberParam().setValue(1.);
			count.getOption().setValue(ComparisonOperator.GREATER);
		}

		Node countReturn = ret.addOutgoing(count.getCountPattern().getGraph()).getTarget().makeComplex(); // .makePrimitive();
		countReturn.setReturnNode(true);

		NotCondition not = PatternstructureFactory.eINSTANCE.createNotCondition();
		formula.setCondition2(not);

		CountCondition count2 = PatternstructureFactory.eINSTANCE.createCountCondition();
		not.setCondition(count2);
		count2.createCountPattern();
		NumberElementImpl ne2 = new NumberElementImpl();
		count2.setArgument2(ne2);
		ne2.createParameters();
		if (ServletConstants.FILL_VALUES) {
			ne1.getNumberParam().setValue(1.);
			count.getOption().setValue(ComparisonOperator.GREATER);
		}

		Node countReturn2 = ret.addOutgoing(count2.getCountPattern().getGraph()).getTarget().makeComplex(); // .makePrimitive();
		countReturn2.setReturnNode(true);

		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
