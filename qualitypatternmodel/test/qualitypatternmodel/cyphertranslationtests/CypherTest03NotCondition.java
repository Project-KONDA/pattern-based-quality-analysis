package qualitypatternmodel.cyphertranslationtests;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JFactory;
import qualitypatternmodel.adaptionNeo4J.NeoEdge;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyNode;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;
import qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JFactoryImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Morphism;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;
import qualitypatternmodel.rdftranslationtests.RdfTest00;

public class CypherTest03NotCondition {
        public static final AdaptionNeo4JFactory FACTORY = new AdaptionNeo4JFactoryImpl();
        
        public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
                //Tests
                System.out.println("");
                System.out.println("<<< BEGIN - Tests >>>");
                ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
//                getNotQuantifierPattern(Quantifier.EXISTS);
                completePatterns.add(getTestPattern());
//                completePatterns.add(getNotQuantifierPattern(Quantifier.FORALL));
//                completePatterns.add(getNotQuantifierPattern(Quantifier.EXISTS, Quantifier.EXISTS));
//                completePatterns.add(getNotQuantifierPattern(Quantifier.FORALL, Quantifier.FORALL));
//                completePatterns.add(getNotNotPattern());
//                completePatterns.add(getNotNotNotPattern());
//                completePatterns.add(getNotNotNotNotPattern());
//                completePatterns.add(getNotNotNotNotNotPattern());
//                completePatterns.add(testPatternQuery1());
                //Call tester from CypherTest00
                CypherTest00.test(completePatterns);
                System.out.println("<<< END - Tests >>>");
                System.out.println("");                
        }

//        MATCH (n:Regesta)
//        WHERE NOT EXISTS{ //The following need to be added to the graph generateCypher() //Dann die frage wie unterscheide ich es zu OPTIONAL MATCH
                                  //Da bisher nur linear durchgegangen wird
//            MATCH (n)-[:APPEARS_IN]-(:IndexPerson), (n)-[:ACTION]-(:Action), (n)-[:RECIPIENT_IN]-(:IndexPlace)
                //How to consider if the original pattern is longer and just from n should be started
                //How to handle dopple printing of the original pattern
//        }
//        RETURN n

        
        
        public static CompletePattern getTestPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
    		PatternstructurePackage.eINSTANCE.eClass();
    		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
    		
    		CompletePattern completePattern = factory.createCompletePattern();
    		completePattern.setName("MyPattern");
    		ComplexNode complexNode1 = completePattern.getGraph().getNodes().get(0).makeComplex();
//    		Node node2 = completePattern.getGraph().addNode(); --> Problem der Redundanten Edges Lösen
//    		completePattern.getGraph().addRelation(complexNode1, node2); --> Nutzen des Counters aus der NeoPropertyNode
    		
             complexNode1 = completePattern.getGraph().getNodes().get(0).makeComplex();
            NotCondition notCond = PatternstructureFactory.eINSTANCE.createNotCondition();
            completePattern.setCondition(notCond);
            
            QuantifiedCondition quantifiedCond1 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
            notCond.setCondition(quantifiedCond1);
            quantifiedCond1.setQuantifier(Quantifier.EXISTS);
            Node complexNode2 = (Node) quantifiedCond1.getGraph().getNodes().get(0);
            Node complexNode3 = (Node) quantifiedCond1.getGraph().addComplexNode();
            Node complexNode4 = (Node) quantifiedCond1.getGraph().addComplexNode();
            Node complexNode5 = (Node) quantifiedCond1.getGraph().addComplexNode();
            quantifiedCond1.getGraph().addRelation((ComplexNode) complexNode2, complexNode3);
            quantifiedCond1.getGraph().addRelation((ComplexNode) complexNode2, complexNode4);
            quantifiedCond1.getGraph().addRelation((ComplexNode) complexNode2, complexNode5);
            
            //ADAPT TO NEO4J
            completePattern.createNeo4jAdaption();

            NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
            neoNode.setNodePlace(NeoPlace.BEGINNING);
            neoNode.addStringLabel("Regesta");
            
            //Node Specification
	        neoNode = (NeoNode) quantifiedCond1.getGraph().getNodes().get(0);
	        neoNode.setNodePlace(NeoPlace.BEGINNING);
            neoNode = (NeoNode) quantifiedCond1.getGraph().getNodes().get(1);
            neoNode.addStringLabel("IndexPerson");
            neoNode = (NeoNode) quantifiedCond1.getGraph().getNodes().get(2);
            neoNode.addStringLabel("Action");
            neoNode = (NeoNode) quantifiedCond1.getGraph().getNodes().get(3);
            neoNode.addStringLabel("IndexPlace");
            
            //First Edge Specification
            NeoEdge neoEdge = (NeoEdge) quantifiedCond1.getGraph().getRelations().get(1);
            NeoPathParam neoPathParam = neoEdge.getNeoPathParam();
            NeoSimpleEdge neoSimpleEdge = FACTORY.createNeoSimpleEdge();
            neoSimpleEdge.addNeoEdgeLabel("APPEARS_IN");
            neoPathParam.setNeoPathPart(neoSimpleEdge);
            
            //Second Edge Specification
            neoEdge = (NeoEdge) quantifiedCond1.getGraph().getRelations().get(2);
            neoPathParam = neoEdge.getNeoPathParam();
            neoSimpleEdge = FACTORY.createNeoSimpleEdge();
            neoSimpleEdge.addNeoEdgeLabel("ACTION");
            neoPathParam.setNeoPathPart(neoSimpleEdge);
            
            //Third Edge Specification
            neoEdge = (NeoEdge) quantifiedCond1.getGraph().getRelations().get(2);
            neoPathParam = neoEdge.getNeoPathParam();
            neoSimpleEdge = FACTORY.createNeoSimpleEdge();
            neoSimpleEdge.addNeoEdgeLabel("RECIPIENT_IN");
            neoPathParam.setNeoPathPart(neoSimpleEdge);
                    
            return completePattern;
        }
	
	public static CompletePattern getNotQuantifierPattern(Quantifier q, Quantifier q2) {
		CompletePattern completePattern = null;
		
		
		return completePattern;
	}	
	
	public static CompletePattern getNotNotPattern() {
		CompletePattern completePattern = null;
		
		
		return completePattern;
	}
	
	public static CompletePattern getNotNotNotPattern() {
		CompletePattern completePattern = null;
		
		
		return completePattern;
	}
	
	public static CompletePattern getNotNotNotNotPattern() {
		CompletePattern completePattern = null;
		
		
		return completePattern;
	}	
	
	public static CompletePattern getNotNotNotNotNotPattern() {
		CompletePattern completePattern = null;
		
		
		return completePattern;
	}	
	
	public static CompletePattern testPatternQuery1Generic() throws InvalidityException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.setName("MyPattern");
		
		ComplexNode complexNode1 = completePattern.getGraph().getNodes().get(0).makeComplex();
	
		return completePattern;		
	}
	
	public static CompletePattern testPatternQuery1GenericPrepairCon() throws InvalidityException {		
		CompletePattern completePattern = testPatternQuery1Generic();
		Graph graph = completePattern.getGraph();
		ComplexNode complexnode1 = (ComplexNode) graph.getNodes().get(0);
		
		//Configure NotCondition
		NotCondition notCond = 	PatternstructureFactory.eINSTANCE.createNotCondition();
		completePattern.setCondition(notCond);
		

		//Morpisim
		Morphism morphism1 = PatternstructureFactory.eINSTANCE.createMorphism();
		Morphism morphism2 = PatternstructureFactory.eINSTANCE.createMorphism();
//		graph.setOutgoingMorphisms(morphism1);
//		graph.setOutgoingMorphisms(morphism2);
		
		
		//Configure QuantifiedCondition --> How to get the QuantifiedCondition structure better?
		QuantifiedCondition quantifiedCond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		notCond.setCondition(quantifiedCond);
		quantifiedCond.setQuantifier(Quantifier.FORALL);
		Graph quantifiedCondGraph = (Graph) quantifiedCond.getGraph();
		ComplexNode complexNode2 = (ComplexNode) quantifiedCondGraph.getNodes().get(0).makeComplex();
		Node complexNode3 = (ComplexNode) quantifiedCondGraph.addComplexNode();
		quantifiedCondGraph.addRelation(complexNode2, complexNode3);
		morphism1.setSource(graph);
		morphism1.setTarget(quantifiedCondGraph);
		morphism1.addMapping(complexnode1, complexNode2);
		quantifiedCondGraph.setIncomingMorphism(morphism1);
		
		//Configure InnerQuantifiedCondition --> How to get the structure better
		QuantifiedCondition innerQuantifiedCond = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		innerQuantifiedCond.setQuantifier(Quantifier.FORALL);
		Graph innerQuantifiedCondGraph = (Graph) innerQuantifiedCond.getGraph();
		ComplexNode complexNode4 = (ComplexNode) innerQuantifiedCondGraph.addComplexNode();
		Node complexNode5 = (ComplexNode) innerQuantifiedCondGraph.addComplexNode();
		innerQuantifiedCondGraph.addRelation(complexNode4, complexNode5);
		morphism2.setSource(graph);
		morphism2.setTarget(innerQuantifiedCondGraph);
		morphism2.addMapping(complexNode3, complexNode4);
//		innerQuantifiedCondGraph.setIncomingMorphism(morphism2);
		quantifiedCondGraph.setQuantifiedCondition(innerQuantifiedCond);
		
		notCond.setCondition(quantifiedCond);
		return completePattern;		
	}
	
	//Show Arno --> Dopple Edge with direction is not Possible in the Current Version
	public static CompletePattern testPatternQuery1() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = testPatternQuery1GenericPrepairCon();
		//Make Abstract
		completePattern.createNeo4jAdaption();
		
		//Make Concrete
		NeoNode neoNode1 = (NeoNode) completePattern.getGraph().getNodes().get(0);
		neoNode1.addStringLabel("Literature");
		NotCondition notCond = (NotCondition) completePattern.getCondition();
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) notCond.getCondition();
		Graph graph1 = quantifiedCondition.getGraph();
		QuantifiedCondition innerquantifiedCond = (QuantifiedCondition) quantifiedCondition.getCondition();
		Graph graph2 = innerquantifiedCond.getGraph();
		
		//Specified quantifiedCondition
		NeoNode neoNode2 = (NeoNode) graph1.getNodes().get(1);
		neoNode2.addStringLabel("Reference");
		
		//SpecifiedInnerquantifiedCond
		NeoNode neoNode3 = (NeoNode) graph1.getNodes().get(1);
		neoNode3.addStringLabel("Regesta");
		
		return completePattern;		
	}
	
//	MATCH (n:Literature)
//	WHERE NOT 
//	  NOT EXISTS { (ÄUßERE CONDITION)
//	    MATCH (n)<--(m:Reference)
//	    WHERE NOT 
//	      EXISTS{ (INNERE CONDITION)
//	        MATCH (m)-->(o:Regesta)
//	      }
//	  }
//	RETURN n
}
