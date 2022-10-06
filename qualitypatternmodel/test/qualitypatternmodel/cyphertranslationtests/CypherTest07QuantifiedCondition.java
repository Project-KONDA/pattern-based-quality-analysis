package qualitypatternmodel.cyphertranslationtests;

import java.util.ArrayList;

import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyNode;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;

public class CypherTest07QuantifiedCondition {
	//Add BooleanOperators Test here
	//Add a beginning in the morph which is not the end to thest the pattern-match generation alg
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		//Tests
		System.out.println("");
		System.out.println("<<< BEGIN - Tests >>>");
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		buildPatterns(completePatterns);
		//Call tester from CypherTest00
		CypherTest00.test(completePatterns);
		System.out.println("<<< END - Tests >>>");
		System.out.println("");
		
		//Exception tests
		System.out.println("");
		System.out.println("<<< BEGIN - Exception Tests >>>");
		ArrayList<CompletePattern> completePatternsExceptions = new ArrayList<CompletePattern>();
		buildExceptionPatterns(completePatternsExceptions);
		//Call Exception Handler
		CypherTest00.exceptionHandler(completePatternsExceptions);
		System.out.println("<<< END - Exception Tests >>>");
		System.out.println("");
	}

	
	//CHECKING WHAT HAPPENS IF THE GRAPH HAS ALSO CONDITIONS --> Build test with multiple properties!
	protected static void buildExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatternsExceptions.add(getNodesWhereExits(true));
		completePatternsExceptions.add(tryNodesWhereMultiplePropertyExistsChecks(true));
		completePatternsExceptions.add(tryNodesWhereNoBeginnings(false));
		completePatternsExceptions.add(tryNodesWhereNoBeginnings(true));
		completePatternsExceptions.add(tryWithForAllPropertyExistence());
	}

	protected static void buildPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatterns.add(getNodesWhereExits(false));
		completePatterns.add(getNodesWhereMultiplePropertyExistsChecks(false));
		completePatterns.add(getNodesWhereMultiplePropertyExistsChecks(true));
	}
	
	private static CompletePattern getBasePattern() throws InvalidityException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.setName("MyPattern");
		
		ComplexNode complexNode1 = completePattern.getGraph().getNodes().get(0).makeComplex();
		PrimitiveNode pn = completePattern.getGraph().addPrimitiveNode();
		completePattern.getGraph().addRelation(complexNode1, pn);
	
		return completePattern;	
	}
	
	//PATTERN where to identifie a missing element with exists
	private static CompletePattern getNodesWhereExits(boolean not) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		QuantifiedCondition quantifiedCond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		quantifiedCond.setQuantifier(Quantifier.EXISTS);
		if (not) {
			NotCondition notCond = PatternstructureFactory.eINSTANCE.createNotCondition();
			completePattern.setCondition(notCond);
			notCond.setCondition(quantifiedCond);
		} else {
			completePattern.setCondition(quantifiedCond);
		}
		
		completePattern.createNeo4jAdaption();
		
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addStringLabel("Regesta");
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		neoPropertyEdge.getNeoPropertyPathParam().setNeoPropertyName("origPlaceOfIssue");
		
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) quantifiedCond.getGraph().getNodes().get(1);
		neoPropertyNode.setNodePlace(NeoPlace.BEGINNING);
		
		return completePattern;	
	}
	
	
	private static CompletePattern getNodesWhereMultiplePropertyExistsChecks(boolean not) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return tryNodesWhereMultiplePropertyExistsChecks(false);
	}
	
	
	//Exception
	private static CompletePattern tryNodesWhereMultiplePropertyExistsChecks(boolean not) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
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
		neoNode.addStringLabel("Regesta");
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		neoPropertyEdge.getNeoPropertyPathParam().setNeoPropertyName("origPlaceOfIssue");
		
		neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(1);
		neoPropertyEdge.getNeoPropertyPathParam().setNeoPropertyName("origPlaceOfIssue");
		
		neoPropertyEdge = (NeoPropertyEdge) quantifiedCond.getGraph().getRelations().get(2);
		neoPropertyEdge.getNeoPropertyPathParam().setNeoPropertyName("origPlaceOfIssue");
		
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) quantifiedCond.getGraph().getNodes().get(1);
		neoPropertyNode.setNodePlace(NeoPlace.BEGINNING);
		
		neoPropertyNode = (NeoPropertyNode) quantifiedCond.getGraph().getNodes().get(2);
		neoPropertyNode.setNodePlace(NeoPlace.BEGINNING);
		
		neoPropertyNode = (NeoPropertyNode) quantifiedCond.getGraph().getNodes().get(3);
		neoPropertyNode.setNodePlace(NeoPlace.BEGINNING);
		
		return completePattern;	
	}
	
	private static CompletePattern tryWithForAllPropertyExistence() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = tryNodesWhereMultiplePropertyExistsChecks(false);
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		quantifiedCondition.setQuantifier(Quantifier.FORALL);
		return completePattern;
	}
	
	private static CompletePattern tryNodesWhereNoBeginnings(boolean not) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
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
		neoNode.addStringLabel("Regesta");
	
		
		return completePattern;	
	}
}
