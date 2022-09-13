package qualitypatternmodel.rdftranslationtests;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.xmltranslationtests.Test00;

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
		
		ComplexNode complexNode = quantifiedCond.getGraph().getNodes().get(1).makeComplex();
		Node node2 = quantifiedCond.getGraph().addNode();
		quantifiedCond.getGraph().addRelation(complexNode, node2);	
		
		QuantifiedCondition quantifiedCond2 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		formula.setCondition2(quantifiedCond2);
		
		ComplexNode complexNode2 = quantifiedCond2.getGraph().getNodes().get(1).makeComplex();
		Node node3 = quantifiedCond2.getGraph().addNode();
		quantifiedCond2.getGraph().addRelation(complexNode2, node3);	
		
		completePattern.createRdfAdaption();
		return completePattern;
			
	}

}
