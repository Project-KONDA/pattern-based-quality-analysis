package qualitypatternmodel.cyphertranslationtests;

import java.util.ArrayList;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JFactory;
import qualitypatternmodel.adaptionNeo4J.NeoEdge;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;
import qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JFactoryImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.LogicalOperator;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.rdftranslationtests.RdfTest00;

public class CypherTest04Formula {
    public static final AdaptionNeo4JFactory FACTORY = new AdaptionNeo4JFactoryImpl();
    
    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
            //Tests
            System.out.println("");
            System.out.println("<<< BEGIN - Tests >>>");
            ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
    		
            for (LogicalOperator lo: LogicalOperator.VALUES) {
    			completePatterns.add(getFormulaPattern(lo, false));
    		}
            
            for (LogicalOperator lo: LogicalOperator.VALUES) {
    			completePatterns.add(getFormulaPattern(lo, true));
    		}
            
            completePatterns.add(getTestPattern3());
            
            CypherTest00.test(completePatterns);
            System.out.println("<<< END - Tests >>>");
            System.out.println("");         
            
            //INTRODUCE THE EXCEPTION TESTS
    }
    
	private static CompletePattern getFormulaPattern(LogicalOperator lo, boolean clamped) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		CompletePattern completePattern = CypherTest00.getBasePattern();
		
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
		
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addStringLabel("Regesta");
		
		NeoEdge neoEdge;
		NeoPathParam neoPathParam;
		NeoSimpleEdge neoSimpleEdge;
		
		
		neoNode = (NeoNode) quantifiedCond1.getGraph().getNodes().get(0);
		neoNode.setNodePlace(NeoPlace.BEGINNING);
		
		neoNode = (NeoNode) quantifiedCond1.getGraph().getNodes().get(2);
		neoNode.addStringLabel("Place");
		neoEdge = (NeoEdge) quantifiedCond1.getGraph().getRelations().get(1);
		neoPathParam = neoEdge.getNeoPathParam();
		neoSimpleEdge = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoPathParam.setNeoPathPart(neoSimpleEdge);
		
		
		neoNode = (NeoNode) quantifiedCond2.getGraph().getNodes().get(0);
		neoNode.setNodePlace(NeoPlace.BEGINNING);
		
		neoNode = (NeoNode) quantifiedCond2.getGraph().getNodes().get(2);
		neoNode.addStringLabel("IndexEntry");
		neoNode.addStringLabel("IndexPlace");
		neoEdge = (NeoEdge) quantifiedCond2.getGraph().getRelations().get(1);
		neoPathParam = neoEdge.getNeoPathParam();
		neoSimpleEdge = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.addNeoEdgeLabel("APPEARS_IN");
		neoPathParam.setNeoPathPart(neoSimpleEdge);
		
		return completePattern;
			
	}
		
//	//PATTERN 3
//	MATCH (r:IndexPlace)
//	WHERE (Exists{MATCH(r)-[:IS_SUB_OF]-(:IndexPlace)} OR EXISTS{MATCH (r)-[:placeOfIssue]-(:Regesta)})
//	RETURN r
	private static CompletePattern getTestPattern3() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest00.getBasePattern();
		
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
		
		NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addStringLabel("IndexPlace");
		
		NeoEdge neoEdge;
		NeoPathParam neoPathParam;
		NeoSimpleEdge neoSimpleEdge;
		
		
		neoNode = (NeoNode) quantifiedCond1.getGraph().getNodes().get(0);
		neoNode.setNodePlace(NeoPlace.BEGINNING);
		neoNode = (NeoNode) quantifiedCond1.getGraph().getNodes().get(2);
		neoNode.addStringLabel("IndexPlace");
		neoEdge = (NeoEdge) quantifiedCond1.getGraph().getRelations().get(1);
		neoPathParam = neoEdge.getNeoPathParam();
		neoSimpleEdge = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.addNeoEdgeLabel("IS_SUB_OF");
		neoPathParam.setNeoPathPart(neoSimpleEdge);
		
		
		neoNode = (NeoNode) quantifiedCond2.getGraph().getNodes().get(0);
		neoNode.setNodePlace(NeoPlace.BEGINNING);

		neoNode = (NeoNode) quantifiedCond2.getGraph().getNodes().get(2);
		neoNode.addStringLabel("Regesta");
		neoEdge = (NeoEdge) quantifiedCond2.getGraph().getRelations().get(1);
		neoPathParam = neoEdge.getNeoPathParam();
		neoSimpleEdge = FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.addNeoEdgeLabel("placeOfIssue");
		neoPathParam.setNeoPathPart(neoSimpleEdge);
		
		return completePattern;
	}
	
}

