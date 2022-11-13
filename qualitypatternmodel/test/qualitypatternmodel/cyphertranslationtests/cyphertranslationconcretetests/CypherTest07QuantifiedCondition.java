package qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests;

import java.util.ArrayList;

import qualitypatternmodel.adaptionneo4j.NeoNode;
import qualitypatternmodel.adaptionneo4j.NeoPropertyEdge;
import qualitypatternmodel.adaptionneo4j.NeoSimpleEdge;
import qualitypatternmodel.cyphertranslationtests.CypherAbstractTranslation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;

public class CypherTest07QuantifiedCondition extends CypherAbstractTranslation {
	//Add BooleanOperators Test here
	//Add more neasted tests
	//Add a beginning in the morph which is not the end to thest the pattern-match generation alg
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CypherTest07QuantifiedCondition quantifiedCond = new CypherTest07QuantifiedCondition();
		//In the notCond is also a lot of QuantifiedTesting inside. Thus it is also executed here to check the codecoverage for the QuantifiedCond
		CypherTest03NotCondition notCond = new CypherTest03NotCondition();
		try {
			quantifiedCond.generalizedTests();         
//			quantifiedCond.generalizedInvalidtyExceptionTests();
			quantifiedCond = null;
			notCond.generalizedTests();         
//			notCond.generalizedInvalidtyExceptionTests(); 
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
	
	@Override
	public void buildPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatterns.add(getNodesWhereExits(false));
		completePatterns.add(getNodesWhereExits(true));
		completePatterns.add(getNodesWhereMultiplePropertyExistsChecks(false));
		completePatterns.add(getNodesWhereMultiplePropertyExistsChecks(true));
		completePatterns.add(getExistsMatchWithSamePropertyName(false));
		completePatterns.add(getExistsMatchWithSamePropertyName(true));
		completePatterns.add(getExistsMatchWithExistsProperty(true));
		completePatterns.add(getExistsMatchWithExistsProperty(false));
		completePatterns.add(getExistsMatchWithExistsPropertyWithExternalProperty(false));
		//Build a check for NeoPropertyNode internal / external and with two quantified conds
	}
	

	@Override
	public void buildInvalidityExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		//completePatternsExceptions.add(generateNodesWhereNoBeginningsException(false));
		completePatternsExceptions.add(generateNodesWhereNoBeginningsException(true));
		completePatternsExceptions.add(generateWithForAllPropertyExistenceException());
		completePatternsExceptions.add(generateNoNodesAreDefinedInTheGraphException());
		completePatternsExceptions.add(generateQuantifiedCondContainsCountPatternException());
		completePatternsExceptions.add(generateExistsPropertyWithSameNeoPropertyException(false));
		completePatternsExceptions.add(generateExistsPropertyWithSameNeoPropertyException(true));		
	}
	
	//Does not throw an Exception --> have a deeper look inside again what it does
	//PATTERN where to identifie a missing element with exists
	private CompletePattern getNodesWhereExits(boolean not) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherAbstractTranslation.getCompBasePattern();
		QuantifiedCondition quantifiedCond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		quantifiedCond.setQuantifier(Quantifier.EXISTS);
		if (not) {
			NotCondition notCond = PatternstructureFactory.eINSTANCE.createNotCondition();
			completePattern.setCondition(notCond);
			notCond.setCondition(quantifiedCond);
		} else {
			completePattern.setCondition(quantifiedCond);
		}
		quantifiedCond.getGraph().addRelation((ComplexNode) quantifiedCond.getGraph().getNodes().get(0), quantifiedCond.getGraph().addPrimitiveNode());
		completePattern.createNeo4jAdaption();
		
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addNeoLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		neoPropertyEdge.getNeoPropertyPathParam().setNeoPropertyName("placeOfIssue");
		neoPropertyEdge = (NeoPropertyEdge) quantifiedCond.getGraph().getRelations().get(1);
		neoPropertyEdge.getNeoPropertyPathParam().setNeoPropertyName("origPlaceOfIssue");
		
		return completePattern;	
	}
	
	
	private CompletePattern getNodesWhereMultiplePropertyExistsChecks(boolean not) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return generateNodesWhereMultiplePropertyExistsChecksException(not);
	}
	
	private CompletePattern getExistsMatchWithSamePropertyName(boolean not) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = notSpecifiedneoPropertyNamesToTheSameNeoPopertyNode(not);
		completePattern.createNeo4jAdaption();
		Graph g = completePattern.getGraph();
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) g.getRelations().get(0);
		neoPropertyEdge.getNeoPropertyPathParam().setNeoPropertyName("date");
		
		if (completePattern.getCondition() instanceof NotCondition) {
			g = ((QuantifiedCondition)((NotCondition) completePattern.getCondition()).getCondition()).getGraph();
		} else {
			g = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
		}

		neoPropertyEdge = (NeoPropertyEdge) g.getRelations().get(1);
		neoPropertyEdge.getNeoPropertyPathParam().setNeoPropertyName("startDate");
		neoPropertyEdge = (NeoPropertyEdge) g.getRelations().get(2);
		neoPropertyEdge.getNeoPropertyPathParam().setNeoPropertyName("isoStartDate");
		
		return completePattern;
	}
	
	private CompletePattern getExistsMatchWithExistsProperty(boolean not) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		Graph g = quantifiedCondition.getGraph();
		if (not) {
			NotCondition notCond = PatternstructureFactory.eINSTANCE.createNotCondition();
			completePattern.setCondition(notCond);
			notCond.setCondition(quantifiedCondition);
		} else {
			completePattern.setCondition(quantifiedCondition);
		}
		ComplexNode cn = g.addComplexNode();
		g.addRelation((ComplexNode) g.getNodes().get(0), cn);
		PrimitiveNode pn = g.addPrimitiveNode();
		g.addRelation(cn, pn);

		pn = g.addPrimitiveNode();
		g.addRelation(cn, pn);
		
		completePattern.createNeo4jAdaption();
		
		NeoPropertyEdge npe = (NeoPropertyEdge) g.getRelations().get(2);
		npe.getNeoPropertyPathParam().setNeoPropertyName("startDate");
		
		npe = (NeoPropertyEdge) g.getRelations().get(3);
		npe.getNeoPropertyPathParam().setNeoPropertyName("endDate");
		((NeoPropertyEdge) g.getRelations().get(2)).getTarget().addPrimitiveContains("1613");
		
		return completePattern;
	}
	
	private CompletePattern getExistsMatchWithExistsPropertyWithExternalProperty(boolean not) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		Graph g = quantifiedCondition.getGraph();
		if (not) {
			NotCondition notCond = PatternstructureFactory.eINSTANCE.createNotCondition();
			completePattern.setCondition(notCond);
			notCond.setCondition(quantifiedCondition);
		} else {
			completePattern.setCondition(quantifiedCondition);
		}
		ComplexNode cn = g.addComplexNode();
		g.addRelation((ComplexNode) g.getNodes().get(0), cn);
		PrimitiveNode pn = g.addPrimitiveNode();
		g.addRelation(cn, pn);
		
		pn = g.addPrimitiveNode();
		g.addRelation(cn, pn);
		
		completePattern.createNeo4jAdaption();
		
		NeoPropertyEdge npe = (NeoPropertyEdge) g.getRelations().get(2);
		npe.getNeoPropertyPathParam().setNeoPropertyName("startDate");
		npe.getNeoPropertyPathParam().createParameters();
		((NeoSimpleEdge) npe.getNeoPropertyPathParam().getNeoPathPart()).addNeoTargetNodeLabel("DateNode");
		
		npe = (NeoPropertyEdge) g.getRelations().get(3);
		npe.getNeoPropertyPathParam().createParameters();
		((NeoSimpleEdge) npe.getNeoPropertyPathParam().getNeoPathPart()).addNeoTargetNodeLabel("DateNode");
		npe.getNeoPropertyPathParam().setNeoPropertyName("endDate");
		((NeoPropertyEdge) g.getRelations().get(2)).getTarget().addPrimitiveContains("1613");
		((NeoPropertyEdge) g.getRelations().get(3)).getTarget().addPrimitiveContains("1614");
		
		return completePattern;
	}
		
	
	//Exceptions
	private CompletePattern generateWithForAllPropertyExistenceException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = generateNodesWhereMultiplePropertyExistsChecksException(false);
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		quantifiedCondition.setQuantifier(Quantifier.FORALL);
		return completePattern;
	}
	
	private CompletePattern generateExistsPropertyWithSameNeoPropertyException(boolean not) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = notSpecifiedneoPropertyNamesToTheSameNeoPopertyNode(not);
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
	
	@Deprecated
	private CompletePattern generateNodesWhereNoBeginningsException(boolean not) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherAbstractTranslation.getCompBasePattern();
		PrimitiveNode pn = completePattern.getGraph().addPrimitiveNode();
		ComplexNode cn = (ComplexNode) completePattern.getGraph().getNodes().get(0);
		completePattern.getGraph().addRelation(cn, pn);
		QuantifiedCondition quantifiedCond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		quantifiedCond.setQuantifier(Quantifier.EXISTS);
		if (not) {
			NotCondition notCond = PatternstructureFactory.eINSTANCE.createNotCondition();
			completePattern.setCondition(notCond);
			notCond.setCondition(quantifiedCond);
		} else {
			completePattern.setCondition(quantifiedCond);
		}
		
		pn = quantifiedCond.getGraph().addPrimitiveNode();
		cn = (ComplexNode) quantifiedCond.getGraph().getNodes().get(0);
		quantifiedCond.getGraph().addRelation(cn, pn);
		
		completePattern.createNeo4jAdaption();
		
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addNeoLabel("Regesta");
	
		
		return completePattern;	
	}
	
	
	private CompletePattern generateNoNodesAreDefinedInTheGraphException() throws InvalidityException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.setGraph(null);
		
		return completePattern;
	}
	
	private CompletePattern generateQuantifiedCondContainsCountPatternException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherAbstractTranslation.getCompBasePattern();
		completePattern.setCondition(PatternstructureFactory.eINSTANCE.createQuantifiedCondition());
		CypherAbstractTranslation.setCountCounditionInsideOfAnotherCondition(completePattern);		
		
		completePattern.createNeo4jAdaption();
	
		return completePattern;
	}
	
	//FACTORY-METHODS 
	private static CompletePattern generateNodesWhereMultiplePropertyExistsChecksException(boolean not) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherAbstractTranslation.getCompBasePattern();
		QuantifiedCondition quantifiedCond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		quantifiedCond.setQuantifier(Quantifier.EXISTS);
		if (not) {
			NotCondition notCond = PatternstructureFactory.eINSTANCE.createNotCondition();
			completePattern.setCondition(notCond);
			notCond.setCondition(quantifiedCond);
		} else {
			completePattern.setCondition(quantifiedCond);
		}
		
		PrimitiveNode pn = quantifiedCond.getGraph().addPrimitiveNode();
		ComplexNode cn = (ComplexNode) quantifiedCond.getGraph().getNodes().get(0);
		quantifiedCond.getGraph().addRelation(cn, pn);
		
		pn = quantifiedCond.getGraph().addPrimitiveNode();
		cn = (ComplexNode) quantifiedCond.getGraph().getNodes().get(0);
		quantifiedCond.getGraph().addRelation(cn, pn);

		pn = quantifiedCond.getGraph().addPrimitiveNode();
		cn = (ComplexNode) quantifiedCond.getGraph().getNodes().get(0);
		quantifiedCond.getGraph().addRelation(cn, pn);
		
		completePattern.createNeo4jAdaption();
		
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addNeoLabel("Regesta");
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) quantifiedCond.getGraph().getRelations().get(1);
		neoPropertyEdge.getNeoPropertyPathParam().setNeoPropertyName("origPlaceOfIssue");
		
		neoPropertyEdge = (NeoPropertyEdge) quantifiedCond.getGraph().getRelations().get(2);
		neoPropertyEdge.getNeoPropertyPathParam().setNeoPropertyName("startDate");
		
		neoPropertyEdge = (NeoPropertyEdge) quantifiedCond.getGraph().getRelations().get(3);
		neoPropertyEdge.getNeoPropertyPathParam().setNeoPropertyName("endDate");
		
		return completePattern;	
	}
	
	private static CompletePattern notSpecifiedneoPropertyNamesToTheSameNeoPopertyNode(boolean not)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		if (not) {
			NotCondition notCond = PatternstructureFactory.eINSTANCE.createNotCondition();
			completePattern.setCondition(notCond);
			notCond.setCondition(quantifiedCondition);
		} else {
			completePattern.setCondition(quantifiedCondition);
		}
		ComplexNode cn1 = quantifiedCondition.getGraph().addComplexNode();
		quantifiedCondition.getGraph().addRelation(cn1, quantifiedCondition.getGraph().getNodes().get(1));
		ComplexNode cn2 = quantifiedCondition.getGraph().addComplexNode();
		quantifiedCondition.getGraph().addRelation(cn2, quantifiedCondition.getGraph().getNodes().get(1));
		
		return completePattern;
	}
}
