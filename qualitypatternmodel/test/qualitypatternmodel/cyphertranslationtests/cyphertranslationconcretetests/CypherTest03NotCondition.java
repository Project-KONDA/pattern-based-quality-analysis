package qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests;

import java.util.ArrayList;

import qualitypatternmodel.adaptionneo4j.NeoDirection;
import qualitypatternmodel.adaptionneo4j.NeoElementEdge;
import qualitypatternmodel.adaptionneo4j.NeoElementNode;
import qualitypatternmodel.adaptionneo4j.NeoElementPathParam;
import qualitypatternmodel.adaptionneo4j.NeoPropertyEdge;
import qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam;
import qualitypatternmodel.adaptionneo4j.NeoSimpleEdge;
import qualitypatternmodel.cyphertranslationtests.CypherTranslation;
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


//Think about to create a other test class just for the QuantifiedCond! --> Done
//Specelly for the exceptiontests 
public class CypherTest03NotCondition extends CypherTranslation {    
    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
    	CypherTranslation not = new CypherTest03NotCondition();
    	try {
        	not.generalizedTests();  
//        	not.generalizedComplexTests();
//        	not.generalizedInvalidtyExceptionTests();
    	} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
    }

    @Override
	public void buildPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatterns.add(getTestPattern1());
		completePatterns.add(getTestPattern1WithConditions());
		completePatterns.add(getTestPattern2());
		completePatterns.add(getTestPattern5());
		completePatterns.add(getNotExistsExists());
		completePatterns.add(getNotNotPattern());
		completePatterns.add(getNotNotNotPattern());
		completePatterns.add(getNotNotNotNotPattern());
		completePatterns.add(getNotNotNotNotNotPattern());
	}
    
	@Override
	public void buildToComplexQueryPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatterns.add(getMultiEdgesToTwoWithNotConditionNeoPropertyNode());
		completePatterns.add(getMultiEdgesToTwoWithNotConditionWithoutNewComplexNodeNeoPropertyNode());
	}
    
	@Override
	public void buildInvalidityExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatternsExceptions.add(generateNotCondDoesNotContainConndititonException());
		completePatternsExceptions.add(generateNotCondContainsTrueElementException());
		completePatternsExceptions.add(generateNotCondContainsCountPatternException());
	}

	private CompletePattern getTestPattern1() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.setName("MyPattern");
		completePattern.getGraph().getNodes().get(0).makeComplex();
		
	    completePattern.getGraph().getNodes().get(0).makeComplex();
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
	
	    NeoElementNode neoNode = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
	    neoNode.addNeoLabel("Literature");
	    
	    neoNode = (NeoElementNode) quantifiedCond1.getGraph().getNodes().get(1);
	    neoNode.addNeoLabel("Regesta");
	    
	    //Edge Specification - FORALL
	    NeoElementEdge neoEdge = (NeoElementEdge) quantifiedCond1.getGraph().getRelations().get(0);
	    NeoElementPathParam neoPathParam = neoEdge.getNeoElementPathParam();
	    NeoSimpleEdge neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
	    neoSimpleEdge.setNeoDirection(NeoDirection.LEFT);
	    neoPathParam.setNeoPathPart(neoSimpleEdge);
	   	
	    neoNode = (NeoElementNode) quantifiedCond2.getGraph().getNodes().get(2);
	    neoNode.addNeoLabel("Reference");
	    
	    
	    //Edge Specification - INNER EXISTS
	    neoEdge = (NeoElementEdge) quantifiedCond2.getGraph().getRelations().get(1);
	    neoPathParam = neoEdge.getNeoElementPathParam();
	    neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
	    neoSimpleEdge.setNeoDirection(NeoDirection.RIGHT);
	    neoPathParam.setNeoPathPart(neoSimpleEdge);
	    
	    return completePattern;
	}
	
	private CompletePattern getTestPattern1WithConditions() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
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
	
	    NeoElementNode neoNode = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
	    neoNode.addNeoLabel("Literature");
	    
	    NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
	    NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
	    neoPropertyPathParam.setNeoPropertyName("title");
	    neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(1);
	    neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
	    neoPropertyPathParam.setNeoPropertyName("url");
	    
	    //Node Specification - FORALL
	    neoNode = (NeoElementNode) quantifiedCond1.getGraph().getNodes().get(3);
	    neoNode.addNeoLabel("Regesta");
	    
	    
	    //Edge Specification - FORALL
	    NeoElementEdge neoEdge = (NeoElementEdge) quantifiedCond1.getGraph().getRelations().get(2);
	    NeoElementPathParam neoPathParam = neoEdge.getNeoElementPathParam();
	    NeoSimpleEdge neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
	    neoSimpleEdge.setNeoDirection(NeoDirection.LEFT);
	    neoPathParam.setNeoPathPart(neoSimpleEdge);
	    
	    neoPropertyEdge = (NeoPropertyEdge) quantifiedCond1.getGraph().getRelations().get(3);
	    neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
	    neoPropertyPathParam.setNeoPropertyName("isoStartDate");
	   	
	    
	    //Node Specification - INNER EXISTS
	    neoNode = (NeoElementNode) quantifiedCond2.getGraph().getNodes().get(5);
	    neoNode.addNeoLabel("Reference");
	    
	    
	    //Edge Specification - INNER EXISTS
	    neoEdge = (NeoElementEdge) quantifiedCond2.getGraph().getRelations().get(4);
	    neoPathParam = neoEdge.getNeoElementPathParam();
	    neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
	    neoSimpleEdge.setNeoDirection(NeoDirection.RIGHT);
	    neoPathParam.setNeoPathPart(neoSimpleEdge);  
	    
	    neoPropertyEdge = (NeoPropertyEdge) quantifiedCond2.getGraph().getRelations().get(5);
	    neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
	    neoPropertyPathParam.setNeoPropertyName("title");
	    
	    return completePattern;
	}
	
	
	private CompletePattern getTestPattern2() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.setName("MyPattern");
		completePattern.getGraph().getNodes().get(0).makeComplex();
		
	    completePattern.getGraph().getNodes().get(0).makeComplex();
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
	
	    NeoElementNode neoNode = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
	    neoNode.addNeoLabel("Regesta");
	    
	    //Node Specification
	    neoNode = (NeoElementNode) quantifiedCond1.getGraph().getNodes().get(1);
	    neoNode.addNeoLabel("IndexPerson");
	    neoNode = (NeoElementNode) quantifiedCond1.getGraph().getNodes().get(2);
	    neoNode.addNeoLabel("Action");
	    neoNode = (NeoElementNode) quantifiedCond1.getGraph().getNodes().get(3);
	    neoNode.addNeoLabel("IndexPlace");
	    
	    //First Edge Specification
	    NeoElementEdge neoEdge = (NeoElementEdge) quantifiedCond1.getGraph().getRelations().get(0);
	    NeoElementPathParam neoPathParam = neoEdge.getNeoElementPathParam();
	    NeoSimpleEdge neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
	    neoSimpleEdge.addNeoEdgeLabel("APPEARS_IN");
	    neoPathParam.setNeoPathPart(neoSimpleEdge);
	    
	    //Second Edge Specification
	    neoEdge = (NeoElementEdge) quantifiedCond1.getGraph().getRelations().get(1);
	    neoPathParam = neoEdge.getNeoElementPathParam();
	    neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
	    neoSimpleEdge.addNeoEdgeLabel("ACTION");
	    neoPathParam.setNeoPathPart(neoSimpleEdge);
	    
	    //Third Edge Specification
	    neoEdge = (NeoElementEdge) quantifiedCond1.getGraph().getRelations().get(2);
	    neoPathParam = neoEdge.getNeoElementPathParam();
	    neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
	    neoSimpleEdge.addNeoEdgeLabel("RECIPIENT_IN");
	    neoPathParam.setNeoPathPart(neoSimpleEdge);
	            
	    return completePattern;
	}
      
	
	private CompletePattern getTestPattern5() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.setName("MyPattern");
		completePattern.getGraph().getNodes().get(0).makeComplex();
		
	    completePattern.getGraph().getNodes().get(0).makeComplex();
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
	
	    NeoElementNode neoNode = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
	    neoNode.addNeoLabel("Regesta");
	    
	    //Node Specification
	    neoNode = (NeoElementNode) quantifiedCond1.getGraph().getNodes().get(1);
	    neoNode.addNeoLabel("IndexPerson");
	    neoNode = (NeoElementNode) quantifiedCond1.getGraph().getNodes().get(2);
	    neoNode.addNeoLabel("IndexPlace");
	    
	    //First Edge Specification
	    NeoElementEdge neoEdge = (NeoElementEdge) quantifiedCond1.getGraph().getRelations().get(0);
	    NeoElementPathParam neoPathParam = neoEdge.getNeoElementPathParam();
	    NeoSimpleEdge neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
	    neoSimpleEdge.addNeoEdgeLabel("APPEARS_IN");
	    neoSimpleEdge.setNeoDirection(NeoDirection.LEFT);
	    neoPathParam.setNeoPathPart(neoSimpleEdge);
	    
	    //Second Edge Specification
	    neoEdge = (NeoElementEdge) quantifiedCond1.getGraph().getRelations().get(1);
	    neoPathParam = neoEdge.getNeoElementPathParam();
	    neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
	    neoSimpleEdge.addNeoEdgeLabel("IS_SUB_OF");
	    neoPathParam.setNeoPathPart(neoSimpleEdge);
	    
	    //Third Edge Specification
	    neoEdge = (NeoElementEdge) quantifiedCond1.getGraph().getRelations().get(2);
	    neoPathParam = neoEdge.getNeoElementPathParam();
	    neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
	    neoSimpleEdge.addNeoEdgeLabel("RECIPIENT_IN");
	    neoPathParam.setNeoPathPart(neoSimpleEdge);
	            
	    return completePattern;
	}	
	
	private CompletePattern getNotExistsExists() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTranslation.getBasePattern();
		
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
	    
	    NeoElementNode neoNode = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
	    neoNode.addNeoLabel("Regesta");
	    
	    
	    //Das Beginning löst hier das Problem, dass vorherige Nodes oder Relations nichts angedruckt werden
	    //Da der generateCypher nur OutGoing-Relations berücksichtigt und nicht vorrangehenede Relations
	    //Bei einem nicht Verwenden des beginnings müsste es über die vorgehenden Relations geregelt werden
	    //Jede vorrangehende Relation müsste wissen, ob sie für die Conditions relevant ist, was mehr oder gleich viel Aufwand ist wie ein Beginning zu setzen
	    //Alg's müssten angepasst werden
	    neoNode = (NeoElementNode) quantifiedCond1.getGraph().getNodes().get(2);
	    neoNode.addNeoLabel("IndexPerson");
	    
	    neoNode = (NeoElementNode) quantifiedCond2.getGraph().getNodes().get(3);
	    neoNode.addNeoLabel("Regesta");
	    
	    
	    //First Edge Specification
	    NeoElementEdge neoEdge = (NeoElementEdge) quantifiedCond1.getGraph().getRelations().get(1);
	    NeoElementPathParam neoPathParam = neoEdge.getNeoElementPathParam();
	    NeoSimpleEdge neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
	    neoSimpleEdge.addNeoEdgeLabel("APPEARS_IN");
//	    neoSimpleEdge.setNeoDirection(NeoDirection.LEFT);
	    neoPathParam.setNeoPathPart(neoSimpleEdge);
	    
	    //Second Edge Specification
	    neoEdge = (NeoElementEdge) quantifiedCond2.getGraph().getRelations().get(2);
	    neoPathParam = neoEdge.getNeoElementPathParam();
	    neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
//	    neoSimpleEdge.addNeoEdgeLabel("APPEARS_IN");
	    neoPathParam.setNeoPathPart(neoSimpleEdge);
		
		return completePattern;
	}
		
	private CompletePattern getNotNotPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest03NotCondition.getNotCondBasePattern();
		
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
	    
		return completePattern;
	}
	
	private CompletePattern getNotNotNotPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest03NotCondition.getNotCondBasePattern();
		
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
	    
		return completePattern;
	}
	
	private CompletePattern getNotNotNotNotPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest03NotCondition.getNotCondBasePattern();
		
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
	    
		return completePattern;
	}	
	
	private CompletePattern getNotNotNotNotNotPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest03NotCondition.getNotCondBasePattern();
		
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
	    
		return completePattern;
	}	
	
	private CompletePattern testPatternQuery1Generic() throws InvalidityException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.setName("MyPattern");
		
		completePattern.getGraph().getNodes().get(0).makeComplex();
	
		return completePattern;		
	}
	
	private CompletePattern generateNotCondDoesNotContainConndititonException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern comp = CypherTranslation.getBasePattern();
		NotCondition notCond = PatternstructureFactory.eINSTANCE.createNotCondition();
		notCond.setCondition(null);
		comp.createNeo4jAdaption();
		comp.setCondition(notCond);
		return comp;
	}
	
	private CompletePattern generateNotCondContainsTrueElementException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern comp = CypherTranslation.getBasePattern();
		comp.setCondition(PatternstructureFactory.eINSTANCE.createNotCondition());
		comp.createNeo4jAdaption();
		return comp;
	}
	
	private CompletePattern generateNotCondContainsCountPatternException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest03NotCondition.getNotCondBasePattern();
		completePattern.setCondition(PatternstructureFactory.eINSTANCE.createNotCondition());
		CypherTranslation.setCountCounditionInsideOfAnotherCondition(completePattern);		
		
		completePattern.createNeo4jAdaption();
	
		return completePattern;
	}
	
	//Build on
	//	- CypherTest01NeoPropertyEdge.buildMultiEdgesToNeoPropertyNode()
	//	- CypherTest01NeoPropertyEdge.concretizesMultiEdgesToNeoPropertyNode(completePattern);

	private CompletePattern getMultiEdgesToTwoWithNotConditionNeoPropertyNode() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoPropertyEdge.buildMultiEdgesToNeoPropertyNode();
		
		Graph g = completePattern.getGraph();
		PrimitiveNode primitiveNode = g.addPrimitiveNode();
		ComplexNode complexNode1 = (ComplexNode) g.getNodes().get(0);
		g.addRelation(complexNode1, primitiveNode);
		ComplexNode complexNode2 = (ComplexNode) g.getNodes().get(0);
		g.addRelation(complexNode2, primitiveNode);
		ComplexNode complexNode3 = (ComplexNode) g.getNodes().get(2);
		g.addRelation(complexNode3, primitiveNode);
		
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);
		PrimitiveNode innerPrimitiveNode = (PrimitiveNode) quantifiedCondition.getGraph().getNodes().get(1);
		ComplexNode innerComplexNode1 = quantifiedCondition.getGraph().addComplexNode();
		quantifiedCondition.getGraph().addRelation(innerComplexNode1, innerPrimitiveNode);
		
		completePattern.createNeo4jAdaption();
		
		CypherTest01NeoPropertyEdge.concretizesMultiEdgesToNeoPropertyNode(completePattern);
		
		g = completePattern.getGraph();
		NeoPropertyEdge npe = (NeoPropertyEdge) g.getRelations().get(g.getRelations().size() - 3);
		npe.getNeoPropertyPathParam().setNeoPropertyName("TestValue1");
		npe = (NeoPropertyEdge) g.getRelations().get(g.getRelations().size() - 2);
		npe.getNeoPropertyPathParam().setNeoPropertyName("TestValue2");
		npe = (NeoPropertyEdge) g.getRelations().get(g.getRelations().size() - 1);
		npe.getNeoPropertyPathParam().setNeoPropertyName("TestValue3");
		
		g = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
		npe = (NeoPropertyEdge) g.getRelations().get(g.getRelations().size() - 1);
		npe.getNeoPropertyPathParam().setNeoPropertyName("TestValue4");
		
		return completePattern;
	}
	
	//Build on
	//	- CypherTest01NeoPropertyEdge.buildMultiEdgesToNeoPropertyNode()
	//	- CypherTest01NeoPropertyEdge.concretizesMultiEdgesToNeoPropertyNode(completePattern);
	private CompletePattern getMultiEdgesToTwoWithNotConditionWithoutNewComplexNodeNeoPropertyNode() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoPropertyEdge.buildMultiEdgesToNeoPropertyNode();
		
		Graph g = completePattern.getGraph();
		PrimitiveNode primitiveNode = g.addPrimitiveNode();
		ComplexNode complexNode1 = (ComplexNode) g.getNodes().get(0);
		g.addRelation(complexNode1, primitiveNode);
		ComplexNode complexNode2 = (ComplexNode) g.getNodes().get(0);
		g.addRelation(complexNode2, primitiveNode);
		ComplexNode complexNode3 = (ComplexNode) g.getNodes().get(2);
		g.addRelation(complexNode3, primitiveNode);
		
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);
		PrimitiveNode innerPrimitiveNode = (PrimitiveNode) quantifiedCondition.getGraph().getNodes().get(1);
		ComplexNode innerComplexNode1 = (ComplexNode) quantifiedCondition.getGraph().getNodes().get(0);
		quantifiedCondition.getGraph().addRelation(innerComplexNode1, innerPrimitiveNode);
		
		completePattern.createNeo4jAdaption();
		
		CypherTest01NeoPropertyEdge.concretizesMultiEdgesToNeoPropertyNode(completePattern);
		
		g = completePattern.getGraph();
		NeoPropertyEdge npe = (NeoPropertyEdge) g.getRelations().get(g.getRelations().size() - 3);
		npe.getNeoPropertyPathParam().setNeoPropertyName("TestValue1");
		npe = (NeoPropertyEdge) g.getRelations().get(g.getRelations().size() - 2);
		npe.getNeoPropertyPathParam().setNeoPropertyName("TestValue2");
		npe = (NeoPropertyEdge) g.getRelations().get(g.getRelations().size() - 1);
		npe.getNeoPropertyPathParam().setNeoPropertyName("TestValue3");
		
		g = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
		npe = (NeoPropertyEdge) g.getRelations().get(g.getRelations().size() - 1);
		npe.getNeoPropertyPathParam().setNeoPropertyName("TestValue4");
		
		return completePattern;
	}
	
	//FACTORY-METHODS
	private static CompletePattern getNotCondBasePattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTranslation.getBasePattern();
		
	    NotCondition notCond = PatternstructureFactory.eINSTANCE.createNotCondition();
	    completePattern.setCondition(notCond);
	    
	    return completePattern;
	}

	@Override
	public void buildUnsupportedException(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildOtherException(ArrayList<CompletePattern> completePatternsExceptions) throws InvalidityException {
		// TODO Auto-generated method stub
		
	}
}
