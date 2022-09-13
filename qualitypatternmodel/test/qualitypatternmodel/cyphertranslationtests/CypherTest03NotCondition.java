package qualitypatternmodel.cyphertranslationtests;

import java.util.ArrayList;
import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JFactory;
import qualitypatternmodel.adaptionNeo4J.NeoDirection;
import qualitypatternmodel.adaptionNeo4J.NeoEdge;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.NeoPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoPlace;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyEdge;
import qualitypatternmodel.adaptionNeo4J.NeoPropertyPathParam;
import qualitypatternmodel.adaptionNeo4J.NeoSimpleEdge;
import qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JFactoryImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.parameters.impl.DateParamImpl;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Morphism;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;


//Think about to create a other test class just for the QuantifiedCond!
//Specelly for the exceptiontests 
public class CypherTest03NotCondition {
    public static final AdaptionNeo4JFactory FACTORY = new AdaptionNeo4JFactoryImpl();
    
    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
            //Tests
            System.out.println("");
            System.out.println("<<< BEGIN - Tests >>>");
            ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
            completePatterns.add(getTestPattern1());
            completePatterns.add(getTestPattern1WithConditions());
            completePatterns.add(getTestPattern2());
            completePatterns.add(getTestPattern5());
            completePatterns.add(getNotExistsExists());
            completePatterns.add(getNotNotPattern());
            completePatterns.add(getNotNotNotPattern());
            completePatterns.add(getNotNotNotNotPattern());
            completePatterns.add(getNotNotNotNotNotPattern());
            //Call tester from CypherTest00
            CypherTest00.test(completePatterns);
            System.out.println("<<< END - Tests >>>");
            System.out.println("");         
            
            //INTRODUCE THE EXCEPTION TESTS ???
    }

	public static CompletePattern getTestPattern1() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.setName("MyPattern");
		ComplexNode complexNode1 = completePattern.getGraph().getNodes().get(0).makeComplex();
		
	    complexNode1 = completePattern.getGraph().getNodes().get(0).makeComplex();
	    NotCondition notCond = PatternstructureFactory.eINSTANCE.createNotCondition();
	    completePattern.setCondition(notCond);
	    
	    QuantifiedCondition quantifiedCond1 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
	    notCond.setCondition(quantifiedCond1);
	    quantifiedCond1.setQuantifier(Quantifier.FORALL);
	    Node complexNode2 = (Node) quantifiedCond1.getGraph().getNodes().get(0);
	    Node complexNode3 = (Node) quantifiedCond1.getGraph().addComplexNode();
	    quantifiedCond1.getGraph().addRelation((ComplexNode) complexNode2, complexNode3);
	    
	    
	    QuantifiedCondition quantifiedCond2 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
	    quantifiedCond1.setCondition(quantifiedCond2);
	    quantifiedCond2.setQuantifier(Quantifier.EXISTS);
	    Node complexNode4 = (Node) quantifiedCond2.getGraph().getNodes().get(1);
	    Node complexNode5 = (Node) quantifiedCond2.getGraph().addComplexNode();
	    quantifiedCond2.getGraph().addRelation((ComplexNode) complexNode4, complexNode5);
	    
	    
	    //ADAPT TO NEO4J
	    completePattern.createNeo4jAdaption();
	
	    NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
	    neoNode.addStringLabel("Literature");
	    
	    //Node Specification - FORALL
	    neoNode = (NeoNode) quantifiedCond1.getGraph().getNodes().get(0);
	    neoNode.setNodePlace(NeoPlace.BEGINNING);
	    neoNode = (NeoNode) quantifiedCond1.getGraph().getNodes().get(1);
	    neoNode.addStringLabel("Regesta");
	    
	    //Edge Specification - FORALL
	    NeoEdge neoEdge = (NeoEdge) quantifiedCond1.getGraph().getRelations().get(0);
	    NeoPathParam neoPathParam = neoEdge.getNeoPathParam();
	    NeoSimpleEdge neoSimpleEdge = FACTORY.createNeoSimpleEdge();
	    neoSimpleEdge.setNeoDirection(NeoDirection.LEFT);
	    neoPathParam.setNeoPathPart(neoSimpleEdge);
	   	
	    
	    //Node Specification - INNER EXISTS
	    neoNode = (NeoNode) quantifiedCond2.getGraph().getNodes().get(1);
	    neoNode.setNodePlace(NeoPlace.BEGINNING);
	    neoNode = (NeoNode) quantifiedCond2.getGraph().getNodes().get(2);
	    neoNode.addStringLabel("Reference");
	    
	    
	    //Edge Specification - INNER EXISTS
	    neoEdge = (NeoEdge) quantifiedCond2.getGraph().getRelations().get(1);
	    neoPathParam = neoEdge.getNeoPathParam();
	    neoSimpleEdge = FACTORY.createNeoSimpleEdge();
	    neoSimpleEdge.setNeoDirection(NeoDirection.RIGHT);
	    neoPathParam.setNeoPathPart(neoSimpleEdge);
	    
	    return completePattern;
	}
	
	public static CompletePattern getTestPattern1WithConditions() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.setName("MyPattern");
		ComplexNode complexNode1 = completePattern.getGraph().getNodes().get(0).makeComplex();
		PrimitiveNode primitiveNode1 = completePattern.getGraph().addPrimitiveNode();
		PrimitiveNode primitiveNode2 = completePattern.getGraph().addPrimitiveNode();
		completePattern.getGraph().addRelation(complexNode1, primitiveNode1);
		completePattern.getGraph().addRelation(complexNode1, primitiveNode2);
		
	    TextLiteralParam tlp = new TextLiteralParamImpl();
	    tlp.setValueFromString("BATTENBERG");
	    primitiveNode1.addPrimitiveComparison(tlp);
	    tlp = new TextLiteralParamImpl();
	    tlp.setValueFromString("http://opac.regesta-imperii.de/lang_de/kurztitelsuche_r.php?kurztitel=battenberg,_solmser_urkunden_1");
	    primitiveNode2.addPrimitiveComparison(tlp);
	    
	    complexNode1 = completePattern.getGraph().getNodes().get(0).makeComplex();
	    NotCondition notCond = PatternstructureFactory.eINSTANCE.createNotCondition();
	    completePattern.setCondition(notCond);
	    
	    QuantifiedCondition quantifiedCond1 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
	    notCond.setCondition(quantifiedCond1);
	    quantifiedCond1.setQuantifier(Quantifier.FORALL);
	    Node complexNode2 = (Node) quantifiedCond1.getGraph().getNodes().get(0);
	    Node complexNode3 = (Node) quantifiedCond1.getGraph().addComplexNode();
		PrimitiveNode pn = quantifiedCond1.getGraph().addPrimitiveNode();
	    quantifiedCond1.getGraph().addRelation((ComplexNode) complexNode2, complexNode3);
	    quantifiedCond1.getGraph().addRelation((ComplexNode) complexNode3, pn);
	    
		DateParamImpl dp = new DateParamImpl();
		dp.setValue("1439-12-20");
		pn.addPrimitiveComparison(dp);
	    
	    QuantifiedCondition quantifiedCond2 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
	    quantifiedCond1.setCondition(quantifiedCond2);
	    quantifiedCond2.setQuantifier(Quantifier.EXISTS);
	    Node complexNode4 = (Node) quantifiedCond2.getGraph().getNodes().get(3);
	    Node complexNode5 = (Node) quantifiedCond2.getGraph().addComplexNode();
	    pn = quantifiedCond2.getGraph().addPrimitiveNode();
	    quantifiedCond2.getGraph().addRelation((ComplexNode) complexNode4, complexNode5);
	    quantifiedCond2.getGraph().addRelation((ComplexNode) complexNode5, pn);
	    
	    tlp = new TextLiteralParamImpl();
	    tlp.setValueFromString("Kulpis Documenta S. 181f.");
	    pn.addPrimitiveComparison(tlp);
	    
	    //ADAPT TO NEO4J
	    completePattern.createNeo4jAdaption();
	
	    NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
	    neoNode.addStringLabel("Literature");
	    
	    NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
	    NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
	    neoPropertyPathParam.setNeoPropertyName("title");
	    neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(1);
	    neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
	    neoPropertyPathParam.setNeoPropertyName("url");
	    
	    //Node Specification - FORALL
	    neoNode = (NeoNode) quantifiedCond1.getGraph().getNodes().get(0);
	    neoNode.setNodePlace(NeoPlace.BEGINNING);
	    neoNode = (NeoNode) quantifiedCond1.getGraph().getNodes().get(3);
	    neoNode.addStringLabel("Regesta");
	    
	    
	    //Edge Specification - FORALL
	    NeoEdge neoEdge = (NeoEdge) quantifiedCond1.getGraph().getRelations().get(2);
	    NeoPathParam neoPathParam = neoEdge.getNeoPathParam();
	    NeoSimpleEdge neoSimpleEdge = FACTORY.createNeoSimpleEdge();
	    neoSimpleEdge.setNeoDirection(NeoDirection.LEFT);
	    neoPathParam.setNeoPathPart(neoSimpleEdge);
	    
	    neoPropertyEdge = (NeoPropertyEdge) quantifiedCond1.getGraph().getRelations().get(3);
	    neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
	    neoPropertyPathParam.setNeoPropertyName("isoStartDate");
	   	
	    
	    //Node Specification - INNER EXISTS
	    neoNode = (NeoNode) quantifiedCond2.getGraph().getNodes().get(3);
	    neoNode.setNodePlace(NeoPlace.BEGINNING);
	    neoNode = (NeoNode) quantifiedCond2.getGraph().getNodes().get(5);
	    neoNode.addStringLabel("Reference");
	    
	    
	    //Edge Specification - INNER EXISTS
	    neoEdge = (NeoEdge) quantifiedCond2.getGraph().getRelations().get(4);
	    neoPathParam = neoEdge.getNeoPathParam();
	    neoSimpleEdge = FACTORY.createNeoSimpleEdge();
	    neoSimpleEdge.setNeoDirection(NeoDirection.RIGHT);
	    neoPathParam.setNeoPathPart(neoSimpleEdge);  
	    
	    neoPropertyEdge = (NeoPropertyEdge) quantifiedCond2.getGraph().getRelations().get(5);
	    neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
	    neoPropertyPathParam.setNeoPropertyName("title");
	    
	    return completePattern;
	}
	
	
	public static CompletePattern getTestPattern2() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
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
	    NeoEdge neoEdge = (NeoEdge) quantifiedCond1.getGraph().getRelations().get(0);
	    NeoPathParam neoPathParam = neoEdge.getNeoPathParam();
	    NeoSimpleEdge neoSimpleEdge = FACTORY.createNeoSimpleEdge();
	    neoSimpleEdge.addNeoEdgeLabel("APPEARS_IN");
	    neoPathParam.setNeoPathPart(neoSimpleEdge);
	    
	    //Second Edge Specification
	    neoEdge = (NeoEdge) quantifiedCond1.getGraph().getRelations().get(1);
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
      
	
	public static CompletePattern getTestPattern5() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.setName("MyPattern");
		ComplexNode complexNode1 = completePattern.getGraph().getNodes().get(0).makeComplex();
		
	    complexNode1 = completePattern.getGraph().getNodes().get(0).makeComplex();
	    QuantifiedCondition quantifiedCond1 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
	    completePattern.setCondition(quantifiedCond1);
	    
	    quantifiedCond1.setQuantifier(Quantifier.EXISTS);
	    Node complexNode2 = (Node) quantifiedCond1.getGraph().getNodes().get(0);
	    Node complexNode3 = (Node) quantifiedCond1.getGraph().addComplexNode();
	    Node complexNode4 = (Node) quantifiedCond1.getGraph().addComplexNode();
	    quantifiedCond1.getGraph().addRelation((ComplexNode) complexNode2, complexNode3);
	    quantifiedCond1.getGraph().addRelation((ComplexNode) complexNode3, complexNode4);
	    
	    quantifiedCond1.getGraph().addRelation((ComplexNode) complexNode2, complexNode4);
	    
	    //ADAPT TO NEO4J
	    completePattern.createNeo4jAdaption();
	
	    NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
	    neoNode.addStringLabel("Regesta");
	    
	    //Node Specification
	    neoNode = (NeoNode) quantifiedCond1.getGraph().getNodes().get(0);
	    neoNode.setNodePlace(NeoPlace.BEGINNING);
	    neoNode = (NeoNode) quantifiedCond1.getGraph().getNodes().get(1);
	    neoNode.addStringLabel("IndexPerson");
	    neoNode = (NeoNode) quantifiedCond1.getGraph().getNodes().get(2);
	    neoNode.addStringLabel("IndexPlace");
	    
	    //First Edge Specification
	    NeoEdge neoEdge = (NeoEdge) quantifiedCond1.getGraph().getRelations().get(0);
	    NeoPathParam neoPathParam = neoEdge.getNeoPathParam();
	    NeoSimpleEdge neoSimpleEdge = FACTORY.createNeoSimpleEdge();
	    neoSimpleEdge.addNeoEdgeLabel("APPEARS_IN");
	    neoSimpleEdge.setNeoDirection(NeoDirection.LEFT);
	    neoPathParam.setNeoPathPart(neoSimpleEdge);
	    
	    //Second Edge Specification
	    neoEdge = (NeoEdge) quantifiedCond1.getGraph().getRelations().get(1);
	    neoPathParam = neoEdge.getNeoPathParam();
	    neoSimpleEdge = FACTORY.createNeoSimpleEdge();
	    neoSimpleEdge.addNeoEdgeLabel("IS_SUB_OF");
	    neoPathParam.setNeoPathPart(neoSimpleEdge);
	    
	    //Third Edge Specification
	    neoEdge = (NeoEdge) quantifiedCond1.getGraph().getRelations().get(2);
	    neoPathParam = neoEdge.getNeoPathParam();
	    neoSimpleEdge = FACTORY.createNeoSimpleEdge();
	    neoSimpleEdge.addNeoEdgeLabel("RECIPIENT_IN");
	    neoPathParam.setNeoPathPart(neoSimpleEdge);
	            
	    return completePattern;
	}	
	
	public static CompletePattern getNotExistsExists() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest00.getBasePattern();
		
	    NotCondition notCond = PatternstructureFactory.eINSTANCE.createNotCondition();
	    completePattern.setCondition(notCond);
	    
	    QuantifiedCondition quantifiedCond1 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
	    notCond.setCondition(quantifiedCond1);
	    
	    quantifiedCond1.setQuantifier(Quantifier.EXISTS);
	    Node complexNode2 = (Node) quantifiedCond1.getGraph().getNodes().get(0);
	    Node complexNode3 = (Node) quantifiedCond1.getGraph().addComplexNode();
	    quantifiedCond1.getGraph().addRelation((ComplexNode) complexNode2, complexNode3);
	    
	    QuantifiedCondition quantifiedCond2 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
	    quantifiedCond1.setCondition(quantifiedCond2);
	    
	    quantifiedCond2.setQuantifier(Quantifier.EXISTS);
	    Node complexNode4 = (Node) quantifiedCond2.getGraph().getNodes().get(2);
	    Node complexNode5 = (Node) quantifiedCond2.getGraph().addComplexNode();
	    quantifiedCond2.getGraph().addRelation((ComplexNode) complexNode4, complexNode5);
	    
	    completePattern.createNeo4jAdaption();
	    
	    NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
	    neoNode.addStringLabel("Regesta");
	    
	    
	    //Das Beginning löst hier das Problem, dass vorherige Nodes oder Relations nichts angedruckt werden
	    //Da der generateCypher nur OutGoing-Relations berücksichtigt und nicht vorrangehenede Relations
	    //Bei einem nicht Verwenden des beginnings müsste es über die vorgehenden Relations geregelt werden
	    //Jede vorrangehende Relation müsste wissen, ob sie für die Conditions relevant ist, was mehr oder gleich viel Aufwand ist wie ein Beginning zu setzen
	    //Alg's müssten angepasst werden
	    neoNode = (NeoNode) quantifiedCond1.getGraph().getNodes().get(0);
	    neoNode.setNodePlace(NeoPlace.BEGINNING);
	    neoNode = (NeoNode) quantifiedCond1.getGraph().getNodes().get(2);
	    neoNode.addStringLabel("IndexPerson");
	    
	    neoNode = (NeoNode) quantifiedCond2.getGraph().getNodes().get(2);
	    neoNode.setNodePlace(NeoPlace.BEGINNING);
	    neoNode = (NeoNode) quantifiedCond2.getGraph().getNodes().get(3);
	    neoNode.addStringLabel("Regesta");
	    
	    
	    //First Edge Specification
	    NeoEdge neoEdge = (NeoEdge) quantifiedCond1.getGraph().getRelations().get(1);
	    NeoPathParam neoPathParam = neoEdge.getNeoPathParam();
	    NeoSimpleEdge neoSimpleEdge = FACTORY.createNeoSimpleEdge();
	    neoSimpleEdge.addNeoEdgeLabel("APPEARS_IN");
//	    neoSimpleEdge.setNeoDirection(NeoDirection.LEFT);
	    neoPathParam.setNeoPathPart(neoSimpleEdge);
	    
	    //Second Edge Specification
	    neoEdge = (NeoEdge) quantifiedCond2.getGraph().getRelations().get(2);
	    neoPathParam = neoEdge.getNeoPathParam();
	    neoSimpleEdge = FACTORY.createNeoSimpleEdge();
//	    neoSimpleEdge.addNeoEdgeLabel("APPEARS_IN");
	    neoPathParam.setNeoPathPart(neoSimpleEdge);
		
		return completePattern;
	}
	
	public static CompletePattern getBasePattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest00.getBasePattern();
		
	    NotCondition notCond = PatternstructureFactory.eINSTANCE.createNotCondition();
	    completePattern.setCondition(notCond);
	    
	    return completePattern;
	}
	
	
	public static CompletePattern getNotNotPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest03NotCondition.getBasePattern();
		
	    NotCondition notCond = PatternstructureFactory.eINSTANCE.createNotCondition();
	    ((NotCondition) completePattern.getCondition()).setCondition(notCond);
	    
	    QuantifiedCondition quantifiedCond1 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
	    notCond.setCondition(quantifiedCond1);
	    
	    quantifiedCond1.setQuantifier(Quantifier.EXISTS);
	    Node complexNode2 = (Node) quantifiedCond1.getGraph().getNodes().get(0);
	    Node complexNode3 = (Node) quantifiedCond1.getGraph().addComplexNode();
	    quantifiedCond1.getGraph().addRelation((ComplexNode) complexNode2, complexNode3);
	    
	    //Adapt to Neo4J
	    completePattern.createNeo4jAdaption();	    
	    NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
	    Graph graph = quantifiedCond1.getGraph();
	    neoNode = (NeoNode) graph.getNodes().get(0);
	    neoNode.setNodePlace(NeoPlace.BEGINNING);
	    
		return completePattern;
	}
	
	public static CompletePattern getNotNotNotPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest03NotCondition.getBasePattern();
		
	    NotCondition notCond1 = PatternstructureFactory.eINSTANCE.createNotCondition();
	    ((NotCondition) completePattern.getCondition()).setCondition(notCond1);
	    
	    NotCondition notCond2 = PatternstructureFactory.eINSTANCE.createNotCondition();
	    notCond1.setCondition(notCond2);
	    
	    QuantifiedCondition quantifiedCond1 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
	    notCond2.setCondition(quantifiedCond1);
	    
	    quantifiedCond1.setQuantifier(Quantifier.EXISTS);
	    Node complexNode2 = (Node) quantifiedCond1.getGraph().getNodes().get(0);
	    Node complexNode3 = (Node) quantifiedCond1.getGraph().addComplexNode();
	    quantifiedCond1.getGraph().addRelation((ComplexNode) complexNode2, complexNode3);
	    
	    //Adapt to Neo4J
	    completePattern.createNeo4jAdaption();	    
	    NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
	    Graph graph = quantifiedCond1.getGraph();
	    neoNode = (NeoNode) graph.getNodes().get(0);
	    neoNode.setNodePlace(NeoPlace.BEGINNING);
	    
		return completePattern;
	}
	
	public static CompletePattern getNotNotNotNotPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest03NotCondition.getBasePattern();
		
	    NotCondition notCond1 = PatternstructureFactory.eINSTANCE.createNotCondition();
	    ((NotCondition) completePattern.getCondition()).setCondition(notCond1);
	    
	    NotCondition notCond2 = PatternstructureFactory.eINSTANCE.createNotCondition();
	    notCond1.setCondition(notCond2);
	    
	    NotCondition notCond3 = PatternstructureFactory.eINSTANCE.createNotCondition();
	    notCond2.setCondition(notCond3);
	    
	    QuantifiedCondition quantifiedCond1 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
	    notCond3.setCondition(quantifiedCond1);
	    
	    quantifiedCond1.setQuantifier(Quantifier.EXISTS);
	    Node complexNode2 = (Node) quantifiedCond1.getGraph().getNodes().get(0);
	    Node complexNode3 = (Node) quantifiedCond1.getGraph().addComplexNode();
	    quantifiedCond1.getGraph().addRelation((ComplexNode) complexNode2, complexNode3);
	    
	    //Adapt to Neo4J
	    completePattern.createNeo4jAdaption();	    
	    NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
	    Graph graph = quantifiedCond1.getGraph();
	    neoNode = (NeoNode) graph.getNodes().get(0);
	    neoNode.setNodePlace(NeoPlace.BEGINNING);
	    
		return completePattern;
	}	
	
	public static CompletePattern getNotNotNotNotNotPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest03NotCondition.getBasePattern();
		
	    NotCondition notCond1 = PatternstructureFactory.eINSTANCE.createNotCondition();
	    ((NotCondition) completePattern.getCondition()).setCondition(notCond1);
	    
	    NotCondition notCond2 = PatternstructureFactory.eINSTANCE.createNotCondition();
	    notCond1.setCondition(notCond2);
	    
	    NotCondition notCond3 = PatternstructureFactory.eINSTANCE.createNotCondition();
	    notCond2.setCondition(notCond3);
	    
	    NotCondition notCond4 = PatternstructureFactory.eINSTANCE.createNotCondition();
	    notCond3.setCondition(notCond4);
	    
	    QuantifiedCondition quantifiedCond1 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
	    notCond4.setCondition(quantifiedCond1);
	    
	    quantifiedCond1.setQuantifier(Quantifier.EXISTS);
	    Node complexNode2 = (Node) quantifiedCond1.getGraph().getNodes().get(0);
	    Node complexNode3 = (Node) quantifiedCond1.getGraph().addComplexNode();
	    quantifiedCond1.getGraph().addRelation((ComplexNode) complexNode2, complexNode3);
	    
	    //Adapt to Neo4J
	    completePattern.createNeo4jAdaption();	    
	    NeoNode neoNode = (NeoNode) completePattern.getGraph().getNodes().get(0);
	    Graph graph = quantifiedCond1.getGraph();
	    neoNode = (NeoNode) graph.getNodes().get(0);
	    neoNode.setNodePlace(NeoPlace.BEGINNING);
	    
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
}
