package qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests;


import java.lang.reflect.Field;
import java.util.ArrayList;

import qualitypatternmodel.adaptionneo4j.NeoElementEdge;
import qualitypatternmodel.adaptionneo4j.NeoElementNode;
import qualitypatternmodel.adaptionneo4j.NeoElementPathParam;
import qualitypatternmodel.adaptionneo4j.NeoSimpleEdge;
import qualitypatternmodel.cyphertranslationtests.CypherTranslation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.impl.NumberParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.impl.FormulaImpl;

public class CypherTest04Formula extends CypherTranslation {
    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
    	CypherTest04Formula formula = new CypherTest04Formula();
    	try {
//    		formula.tester();
        	formula.invalidtyExceptionTester();
    	} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
    }

    @Override
	public void buildPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		for (LogicalOperator lo: LogicalOperator.VALUES) {
			completePatterns.add(getFormulaPattern(lo, false));
		}

		for (LogicalOperator lo: LogicalOperator.VALUES) {
			completePatterns.add(getFormulaPattern(lo, true));
		}

		completePatterns.add(getTestPattern3());
	}

	@Override
	public void buildInvalidityExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatternsExceptions.add(generateOperatorIsNullException());
		completePatternsExceptions.add(generateNotExistingOperatorException());
		completePatternsExceptions.add(generateCond1IsNullException());
		completePatternsExceptions.add(generateCond2IsNullException());
		completePatternsExceptions.add(generatecond1Andcond2IsNullException());
	}

	@Override
	public void buildUnsupportedException(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatternsExceptions.add(generateFormulaCondContainsCountPatternExceptionInArg1());
		completePatternsExceptions.add(generateFormulaCondContainsCountPatternExceptionInArg2());
		completePatternsExceptions.add(generateFormulaCondContainsCountPatternExceptionInArg1And2());
	}

	private CompletePattern getFormulaPattern(LogicalOperator lo, boolean clamped) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		CompletePattern completePattern = CypherTranslation.getBasePattern();

		Formula formula = PatternstructureFactory.eINSTANCE.createFormula();
		completePattern.setCondition(formula);
		formula.setOperator(lo);
		formula.setClamped(clamped);

		QuantifiedCondition quantifiedCond1 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		formula.setCondition1(quantifiedCond1);
		ComplexNode complexNode0;

		complexNode0 = (ComplexNode) quantifiedCond1.getGraph().getNodes().get(0);
		ComplexNode complexNode1 = quantifiedCond1.getGraph().addComplexNode();
		quantifiedCond1.getGraph().addRelation(complexNode0, complexNode1);

		QuantifiedCondition quantifiedCond2 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		formula.setCondition2(quantifiedCond2);

		complexNode0 = (ComplexNode) quantifiedCond2.getGraph().getNodes().get(0);
		ComplexNode complexNode2 = quantifiedCond2.getGraph().addComplexNode();
		quantifiedCond2.getGraph().addRelation(complexNode0, complexNode2);

		completePattern.createNeo4jAdaption();

		NeoElementNode neoNode = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addNeoLabel("Regesta");

		NeoElementEdge neoEdge;
		NeoElementPathParam neoPathParam;
		NeoSimpleEdge neoSimpleEdge;

		neoNode = (NeoElementNode) quantifiedCond1.getGraph().getNodes().get(2);
		neoNode.addNeoLabel("Place");
		neoEdge = (NeoElementEdge) quantifiedCond1.getGraph().getRelations().get(1);
		neoPathParam = neoEdge.getNeoElementPathParam();
		neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoPathParam.setNeoPathPart(neoSimpleEdge);

		neoNode = (NeoElementNode) quantifiedCond2.getGraph().getNodes().get(2);
		neoNode.addNeoLabel("IndexEntry");
		neoNode.addNeoLabel("IndexPlace");
		neoEdge = (NeoElementEdge) quantifiedCond2.getGraph().getRelations().get(1);
		neoPathParam = neoEdge.getNeoElementPathParam();
		neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.addNeoEdgeLabel("APPEARS_IN");
		neoPathParam.setNeoPathPart(neoSimpleEdge);

		return completePattern;

	}

//	//PATTERN 3
//	MATCH (r:IndexPlace)
//	WHERE (Exists{MATCH(r)-[:IS_SUB_OF]-(:IndexPlace)} OR EXISTS{MATCH (r)-[:placeOfIssue]-(:Regesta)})
//	RETURN r
	private CompletePattern getTestPattern3() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTranslation.getBasePattern();

		Formula formula = PatternstructureFactory.eINSTANCE.createFormula();
		completePattern.setCondition(formula);
		formula.setOperator(LogicalOperator.OR);
		formula.setClamped(true);

		QuantifiedCondition quantifiedCond1 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		formula.setCondition1(quantifiedCond1);
		ComplexNode complexNode0;

		complexNode0 = (ComplexNode) quantifiedCond1.getGraph().getNodes().get(0);
		ComplexNode complexNode1 = quantifiedCond1.getGraph().addComplexNode();
		quantifiedCond1.getGraph().addRelation(complexNode0, complexNode1);

		QuantifiedCondition quantifiedCond2 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		formula.setCondition2(quantifiedCond2);

		complexNode0 = (ComplexNode) quantifiedCond2.getGraph().getNodes().get(0);
		ComplexNode complexNode2 = quantifiedCond2.getGraph().addComplexNode();
		quantifiedCond2.getGraph().addRelation(complexNode0, complexNode2);

		completePattern.createNeo4jAdaption();

		NeoElementNode neoNode = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addNeoLabel("IndexPlace");

		NeoElementEdge neoEdge;
		NeoElementPathParam neoPathParam;
		NeoSimpleEdge neoSimpleEdge;

		neoNode = (NeoElementNode) quantifiedCond1.getGraph().getNodes().get(2);
		neoNode.addNeoLabel("IndexPlace");
		neoEdge = (NeoElementEdge) quantifiedCond1.getGraph().getRelations().get(1);
		neoPathParam = neoEdge.getNeoElementPathParam();
		neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.addNeoEdgeLabel("IS_SUB_OF");
		neoPathParam.setNeoPathPart(neoSimpleEdge);

		neoNode = (NeoElementNode) quantifiedCond2.getGraph().getNodes().get(2);
		neoNode.addNeoLabel("Regesta");
		neoEdge = (NeoElementEdge) quantifiedCond2.getGraph().getRelations().get(1);
		neoPathParam = neoEdge.getNeoElementPathParam();
		neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.addNeoEdgeLabel("placeOfIssue");
		neoPathParam.setNeoPathPart(neoSimpleEdge);

		return completePattern;
	}


	//Exception Tests --> Rework all of them!

	//Needs rework
	private CompletePattern generateOperatorIsNullException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTranslation.getBasePattern();

		Formula formula = PatternstructureFactory.eINSTANCE.createFormula();
		completePattern.setCondition(formula);

		completePattern.createNeo4jAdaption();

		try {
			Class<FormulaImpl> c = FormulaImpl.class;
			Field f = c.getDeclaredField("operator");
			f.setAccessible(true);
			f.set(formula, null);
			f.setAccessible(false);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		return completePattern;
	}

	//Rework???
	private CompletePattern generateNotExistingOperatorException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTranslation.getBasePattern();
//		Formula formula = PatternstructureFactory.eINSTANCE.createFormula();
//		completePattern.setCondition(formula);
//		formula.setOperator(LogicalOperator.NOTHING);
//
		return completePattern;
	}

	private CompletePattern generateCond1IsNullException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTranslation.getBasePattern();
		Formula formula = PatternstructureFactory.eINSTANCE.createFormula();
		completePattern.setCondition(formula);
		formula.setCondition2(PatternstructureFactory.eINSTANCE.createQuantifiedCondition());

		completePattern.createNeo4jAdaption();

		formula.setCondition1(null);

		return completePattern;
	}

	private CompletePattern generateCond2IsNullException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTranslation.getBasePattern();
		Formula formula = PatternstructureFactory.eINSTANCE.createFormula();
		completePattern.setCondition(formula);
		formula.setCondition1(PatternstructureFactory.eINSTANCE.createQuantifiedCondition());

		completePattern.createNeo4jAdaption();

		formula.setCondition2(null);

		return completePattern;
	}

	private CompletePattern generatecond1Andcond2IsNullException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTranslation.getBasePattern();
		Formula formula = PatternstructureFactory.eINSTANCE.createFormula();
		completePattern.setCondition(formula);
		formula.setOperator(LogicalOperator.OR);

		completePattern.createNeo4jAdaption();
		formula.setCondition1(null);
		formula.setCondition2(null);
		return completePattern;
	}

	private CompletePattern generateFormulaCondContainsCountPatternExceptionInArg1() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTranslation.getBasePattern();
		completePattern.setCondition(PatternstructureFactory.eINSTANCE.createFormula());
		CypherTranslation.setCountCounditionInsideOfAnotherCondition(completePattern);

		completePattern.createNeo4jAdaption();

		return completePattern;
	}
	private CompletePattern generateFormulaCondContainsCountPatternExceptionInArg2() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTranslation.getBasePattern();
		completePattern.setCondition(PatternstructureFactory.eINSTANCE.createFormula());
		CypherTest04Formula.setCountConditionOfArg2(completePattern);

		completePattern.createNeo4jAdaption();

		return completePattern;
	}
	private CompletePattern generateFormulaCondContainsCountPatternExceptionInArg1And2() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTranslation.getBasePattern();
		completePattern.setCondition(PatternstructureFactory.eINSTANCE.createFormula());
		CypherTranslation.setCountCounditionInsideOfAnotherCondition(completePattern);
		CypherTest04Formula.setCountConditionOfArg2(completePattern);

		completePattern.createNeo4jAdaption();

		return completePattern;
	}

	//FACTORY-METHODS
	private static Condition setCountConditionOfArg2(CompletePattern completePattern) {
		CountCondition countCondition = PatternstructureFactory.eINSTANCE.createCountCondition();
		Condition cond = completePattern.getCondition();
		if (cond instanceof Formula) {
			((Formula) cond).setCondition2(countCondition);
		} else {
			throw new UnsupportedOperationException();
		}
		CountPattern countPattern = PatternstructureFactory.eINSTANCE.createCountPattern();

		NumberElement numberElement = PatternstructureFactory.eINSTANCE.createNumberElement();
		countCondition.setCountPattern(countPattern);
		NumberParam nb = new NumberParamImpl();
		nb.setValue(1.);
		numberElement.setNumberParam(nb);

		countCondition.setArgument2(numberElement);

		return countCondition;
	}

	@Override
	public void buildTooComplexQueryPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// TODO Auto-generated method stub

	}

	@Override
	public void buildOtherException(ArrayList<CompletePattern> completePatternsExceptions) throws InvalidityException {
		// TODO Auto-generated method stub

	}
}

