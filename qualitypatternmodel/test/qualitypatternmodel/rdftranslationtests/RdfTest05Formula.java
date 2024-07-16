package qualitypatternmodel.rdftranslationtests;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class RdfTest05Formula {

	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		for (LogicalOperator lo: LogicalOperator.VALUES) {
			completePatterns.add(getFormulaPattern(lo));
		}
		return completePatterns;
	}

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		RdfTest00.test(getPatterns());
	}

	private static CompletePattern getFormulaPattern(LogicalOperator lo) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		CompletePattern completePattern = RdfTest00.getBasePattern();

		Formula formula = PatternstructureFactory.eINSTANCE.createFormula();
		completePattern.setCondition(formula);
		formula.setOperator(lo);

		QuantifiedCondition quantifiedCond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		formula.setCondition1(quantifiedCond);

		ComplexNode complexNode = completePattern.getGraph().getNodes().get(1).makeComplex();
		complexNode.addOutgoing(quantifiedCond.getGraph());

		QuantifiedCondition quantifiedCond2 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		formula.setCondition2(quantifiedCond2);

		complexNode.addOutgoing(quantifiedCond2.getGraph());

		completePattern.createRdfAdaption();
		return completePattern;
	}

}
