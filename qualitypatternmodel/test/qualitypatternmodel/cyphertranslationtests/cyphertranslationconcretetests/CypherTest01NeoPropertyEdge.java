package qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests;

import java.util.ArrayList;
import qualitypatternmodel.adaptionneo4j.NeoComplexEdge;
import qualitypatternmodel.adaptionneo4j.NeoDirection;
import qualitypatternmodel.adaptionneo4j.NeoElementNode;
import qualitypatternmodel.adaptionneo4j.NeoPropertyEdge;
import qualitypatternmodel.adaptionneo4j.NeoPropertyNode;
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
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class CypherTest01NeoPropertyEdge extends CypherTranslation {	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CypherTest01NeoPropertyEdge neoPropertyEdge = new CypherTest01NeoPropertyEdge();		
		try {
//			neoPropertyEdge.generalizedTests(); 
			neoPropertyEdge.generalizedComplexTests();
//			neoPropertyEdge.generalizedInvalidtyExceptionTests();
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}

	@Override
	public void buildPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatterns.add(getBlankSimpleEdge());
		completePatterns.add(getNeoPropertyEdge());
		completePatterns.add(getSimpleEdgeReturnOnlyProperty());
		completePatterns.add(getSimpleEdgeReturnOnlyMultiProperty());
		completePatterns.add(getSimpleEdgeWithLabels());
		completePatterns.add(getSimpleEdgeWithLabelsRight());
		completePatterns.add(getSimpleEdgeWithLabelsLeft());
		completePatterns.add(getSimpleEdgeWithTargetNodePropertyNProperty());
		completePatterns.add(getSimpleEdgeWithTargetNodePropertyNNeoPropertyEdgeNProperty());
		completePatterns.add(getComplexEdge());
		completePatterns.add(getComplexEdgeWithLabels());
		completePatterns.add(getComplexEdgeWithLabelsDiffrentDirections());
		completePatterns.add(getComplexEdgeWithLabelsDiffrentDirectionsAndAllReturns());
		
	}
	
	@Override
	public void buildToComplexQueryPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatterns.add(getMultiEdgesToNeoPropertyNodeWithConditon());
		completePatterns.add(getMultiEdgesToNeoPropertyNode());
		completePatterns.add(getMultiEdgesToTwoNeoPropertyNode());
		completePatterns.add(getMultiEdgesToTwoWithConditionNeoPropertyNode());
		completePatterns.add(getMultiEdgesToTwoWithConditionWithoutNewComplexNodeNeoPropertyNode());
	}
	
	@Override
	public void buildInvalidityExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatternsExceptions.add(generateSimpleException());
		completePatternsExceptions.add(generateSetComplexWithOutLastEdgeException());
		completePatternsExceptions.add(generateNeoPathPartsWithOutNeoTargetException());
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
	
	private CompletePattern getBasePatternMultiNeoPropertyEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTranslation.getBasePattern();
		ComplexNode complexNode1 = (ComplexNode) completePattern.getGraph().getNodes().get(0);
		Node node3 = completePattern.getGraph().addPrimitiveNode();
		completePattern.getGraph().addRelation(complexNode1, node3);
		Node node4 = completePattern.getGraph().addPrimitiveNode();
		completePattern.getGraph().addRelation(complexNode1, node4);
		completePattern.createNeo4jAdaption();
		
		return completePattern;
	}
	
	private CompletePattern getBlankSimpleEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoPropertyEdge.getBasePatternNeoPropertyEdge();
		//Warum oder Wie wird hier schon die NeoPropertyPathParam gesetzt?
		//NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		return completePattern;
	}
	
	//Test the Exception Case that not dopple printed the NeoNode
	private CompletePattern getSimpleEdgeReturnOnlyProperty() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoPropertyEdge.getBasePatternNeoPropertyEdge();
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("identifier");
		
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) completePattern.getGraph().getNodes().get(1);
		neoPropertyNode.setReturnNode(true);
		
		NeoElementNode neoNode = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
		neoNode.setReturnNode(false);
		
		return completePattern;
	}
	
	private CompletePattern getSimpleEdgeReturnOnlyMultiProperty() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternMultiNeoPropertyEdge();
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("identifier");
		
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) completePattern.getGraph().getNodes().get(1);
		neoPropertyNode.setReturnNode(true);
		
		neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(1);
		neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("date");
		
		neoPropertyNode = (NeoPropertyNode) completePattern.getGraph().getNodes().get(2);
		neoPropertyNode.setReturnNode(true);
		
		neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(2);
		neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("placeOfIssue");
		
		neoPropertyNode = (NeoPropertyNode) completePattern.getGraph().getNodes().get(3);
		neoPropertyNode.setReturnNode(true);
		
		NeoElementNode neoNode = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
		neoNode.setReturnNode(false);
		
		return completePattern;
	}
	
	private CompletePattern getNeoPropertyEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoPropertyEdge.getBasePatternNeoPropertyEdge();
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		NeoSimpleEdge neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.setNeoTargetNodeLabels(new TextListParamImpl());
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		
		return completePattern;
	}

	private CompletePattern getSimpleEdgeWithLabels() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoPropertyEdge.getBasePatternNeoPropertyEdge();
		NeoElementNode neoNode = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addNeoLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		NeoSimpleEdge neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge.addNeoTargetNodeLabel("Place");
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		
		return completePattern;
	}
	
	private CompletePattern getSimpleEdgeWithLabelsRight() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoPropertyEdge.getBasePatternNeoPropertyEdge();
		NeoElementNode neoNode = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addNeoLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		NeoSimpleEdge neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge.addNeoTargetNodeLabel("Place");
		neoSimpleEdge.setNeoDirection(NeoDirection.RIGHT);
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		
		return completePattern;
	}
	
	private CompletePattern getSimpleEdgeWithLabelsLeft() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoPropertyEdge.getBasePatternNeoPropertyEdge();
		NeoElementNode neoNode = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addNeoLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		NeoSimpleEdge neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.addNeoEdgeLabel("APPEARS_IN");
		
		neoSimpleEdge.addNeoTargetNodeLabel("IndexEntry");
		neoSimpleEdge.addNeoTargetNodeLabel("IndexPlace");
		neoSimpleEdge.setNeoDirection(NeoDirection.LEFT);
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		
		return completePattern;
	}
	
	private CompletePattern getSimpleEdgeWithTargetNodePropertyNProperty() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoPropertyEdge.getBasePatternNeoPropertyEdge();
		NeoElementNode neoNode = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addNeoLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("identifier");
		NeoSimpleEdge neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge.addNeoTargetNodeLabel("Place");
		neoSimpleEdge.setNeoDirection(NeoDirection.RIGHT);
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) completePattern.getGraph().getNodes().get(1);
		neoPropertyNode.setReturnNode(true);
		
		return completePattern;
	}
	
	private CompletePattern getSimpleEdgeWithTargetNodePropertyNNeoPropertyEdgeNProperty() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoPropertyEdge.getBasePatternNeoPropertyEdge();
		NeoElementNode neoNode = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addNeoLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		neoPropertyEdge.setReturnElement(true);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("identifier");
		NeoSimpleEdge neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge.addNeoTargetNodeLabel("Place");
		neoSimpleEdge.setNeoDirection(NeoDirection.RIGHT);
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) completePattern.getGraph().getNodes().get(1);
		neoPropertyNode.setReturnNode(true);
		
		return completePattern;
	}
		
	private CompletePattern getComplexEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoPropertyEdge.getBasePatternNeoPropertyEdge();
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("path");
		NeoComplexEdge neoComplexEdge = NEO_FACTORY.createNeoComplexEdge();
		NeoSimpleEdge neoSimpleEdge1 = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge1.setNeoTargetNodeLabels(new TextListParamImpl());
		NeoSimpleEdge neoSimpleEdge2 = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge2.setNeoTargetNodeLabels(new TextListParamImpl());
		
		neoComplexEdge.addNeoPathPart(neoSimpleEdge1);
		neoComplexEdge.addNeoPathPart(neoSimpleEdge2);
		neoPropertyPathParam.setNeoPathPart(neoComplexEdge);
		
		return completePattern;
	}
	
	private CompletePattern getComplexEdgeWithLabels() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoPropertyEdge.getBasePatternNeoPropertyEdge();
		NeoElementNode neoNode = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addNeoLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("path");
		NeoComplexEdge neoComplexEdge = NEO_FACTORY.createNeoComplexEdge();
		NeoSimpleEdge neoSimpleEdge1 = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge1.addNeoEdgeLabel("APPEARS_IN");
		neoSimpleEdge1.addNeoTargetNodeLabel("IndexEntry"); 
		neoSimpleEdge1.addNeoTargetNodeLabel("IndexPlace");
		NeoSimpleEdge neoSimpleEdge2 = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge2.addNeoEdgeLabel("IS_SUB_OF");
		neoSimpleEdge2.addNeoTargetNodeLabel("IndexEntry"); 
		neoSimpleEdge2.addNeoTargetNodeLabel("IndexPerson");
		
		neoComplexEdge.addNeoPathPart(neoSimpleEdge1);
		neoComplexEdge.addNeoPathPart(neoSimpleEdge2);
		neoPropertyPathParam.setNeoPathPart(neoComplexEdge);
		
		return completePattern;
	}
	
	private CompletePattern getComplexEdgeWithLabelsDiffrentDirections() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoPropertyEdge.getBasePatternNeoPropertyEdge();
		NeoElementNode neoNode = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addNeoLabel("Regesta");
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("path");
		NeoComplexEdge neoComplexEdge = NEO_FACTORY.createNeoComplexEdge();
		NeoSimpleEdge neoSimpleEdge1 = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge1.addNeoEdgeLabel("APPEARS_IN");
		neoSimpleEdge1.addNeoTargetNodeLabel("IndexEntry"); 
		neoSimpleEdge1.addNeoTargetNodeLabel("IndexPlace");
		neoSimpleEdge1.setNeoDirection(NeoDirection.LEFT);
		NeoSimpleEdge neoSimpleEdge2 = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge2.addNeoEdgeLabel("IS_SUB_OF");
		neoSimpleEdge2.addNeoTargetNodeLabel("IndexEntry"); 
		neoSimpleEdge2.addNeoTargetNodeLabel("IndexPerson");
		neoSimpleEdge2.setNeoDirection(NeoDirection.LEFT);
		
		neoComplexEdge.addNeoPathPart(neoSimpleEdge1);
		neoComplexEdge.addNeoPathPart(neoSimpleEdge2);
		neoPropertyPathParam.setNeoPathPart(neoComplexEdge);
		
		return completePattern;
	}
	
	private CompletePattern getComplexEdgeWithLabelsDiffrentDirectionsAndAllReturns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoPropertyEdge.getBasePatternNeoPropertyEdge();
		NeoElementNode neoNode = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
		neoNode.addNeoLabel("Regesta");
		NeoPropertyNode neoPropertyNode = (NeoPropertyNode) completePattern.getGraph().getNodes().get(1);
		neoPropertyNode.setReturnNode(true);
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		neoPropertyEdge.setReturnElement(true);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("path");
		NeoComplexEdge neoComplexEdge = NEO_FACTORY.createNeoComplexEdge();
		NeoSimpleEdge neoSimpleEdge1 = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge1.addNeoEdgeLabel("APPEARS_IN");
		neoSimpleEdge1.addNeoTargetNodeLabel("IndexEntry"); 
		neoSimpleEdge1.addNeoTargetNodeLabel("IndexPlace");
		neoSimpleEdge1.setNeoDirection(NeoDirection.LEFT);
		NeoSimpleEdge neoSimpleEdge2 = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge2.addNeoEdgeLabel("IS_SUB_OF");
		neoSimpleEdge2.addNeoTargetNodeLabel("IndexEntry"); 
		neoSimpleEdge2.addNeoTargetNodeLabel("IndexPerson");
		neoSimpleEdge2.setNeoDirection(NeoDirection.LEFT);
		
		neoComplexEdge.addNeoPathPart(neoSimpleEdge1);
		neoComplexEdge.addNeoPathPart(neoSimpleEdge2);
		neoPropertyPathParam.setNeoPathPart(neoComplexEdge);
		
		return completePattern;
	}
	
	private CompletePattern getMultiEdgesToNeoPropertyNode() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = buildMultiEdgesToNeoPropertyNode();
		completePattern.createNeo4jAdaption();
		
		concretizesMultiEdgesToNeoPropertyNode(completePattern);
		return completePattern;
	}
	
	private CompletePattern getMultiEdgesToTwoNeoPropertyNode() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = buildMultiEdgesToNeoPropertyNode();
		
		Graph g = completePattern.getGraph();
		PrimitiveNode primitiveNode = g.addPrimitiveNode();
		ComplexNode complexNode1 = (ComplexNode) g.getNodes().get(0);
		g.addRelation(complexNode1, primitiveNode);
		ComplexNode complexNode2 = (ComplexNode) g.getNodes().get(0);
		g.addRelation(complexNode2, primitiveNode);
		ComplexNode complexNode3 = (ComplexNode) g.getNodes().get(2);
		g.addRelation(complexNode3, primitiveNode);
		
		completePattern.createNeo4jAdaption();
		
		concretizesMultiEdgesToNeoPropertyNode(completePattern);
		g = completePattern.getGraph();
		NeoPropertyEdge npe = (NeoPropertyEdge) g.getRelations().get(g.getRelations().size() - 3);
		npe.getNeoPropertyPathParam().setNeoPropertyName("TestValue1");
		npe = (NeoPropertyEdge) g.getRelations().get(g.getRelations().size() - 2);
		npe.getNeoPropertyPathParam().setNeoPropertyName("TestValue2");
		npe = (NeoPropertyEdge) g.getRelations().get(g.getRelations().size() - 1);
		npe.getNeoPropertyPathParam().setNeoPropertyName("TestValue3");
		
		return completePattern;
	}
	
	private CompletePattern getMultiEdgesToTwoWithConditionNeoPropertyNode() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = buildMultiEdgesToNeoPropertyNode();
		
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
		
		concretizesMultiEdgesToNeoPropertyNode(completePattern);
		
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
	
	private CompletePattern getMultiEdgesToTwoWithConditionWithoutNewComplexNodeNeoPropertyNode() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = buildMultiEdgesToNeoPropertyNode();
		
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
		
		concretizesMultiEdgesToNeoPropertyNode(completePattern);
		
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

	private CompletePattern getMultiEdgesToNeoPropertyNodeWithConditon() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = buildMultiEdgesToNeoPropertyNode();
		completePattern.getGraph().addPrimitiveNode();
		NotCondition notCondition = PatternstructureFactory.eINSTANCE.createNotCondition();
		completePattern.setCondition(notCondition);
		
		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		notCondition.setCondition(quantifiedCondition);
		ComplexNode complexNode1 = (ComplexNode) quantifiedCondition.getGraph().getNodes().get(0);
		quantifiedCondition.getGraph().addRelation(complexNode1, quantifiedCondition.getGraph().getNodes().get(5));
		ComplexNode complexNode2 = (ComplexNode) quantifiedCondition.getGraph().getNodes().get(2);
		quantifiedCondition.getGraph().addRelation(complexNode2, quantifiedCondition.getGraph().getNodes().get(5));
		
		completePattern.createNeo4jAdaption();
		concretizesMultiEdgesToNeoPropertyNode(completePattern);
		
		NeoPropertyEdge neoPropertyEdge1 = (NeoPropertyEdge) quantifiedCondition.getGraph().getRelations().get(4); 
		neoPropertyEdge1.getNeoPropertyPathParam().setNeoPropertyName("placeOfIssue");
		NeoPropertyEdge neoPropertyEdge2 = (NeoPropertyEdge) quantifiedCondition.getGraph().getRelations().get(5); 
		neoPropertyEdge2.getNeoPropertyPathParam().setNeoPropertyName("placeOfIssue");
		
		return completePattern;
	}
	
	
	
	
	//Exceptions
	//No Property-Name is set
	private CompletePattern generateSimpleException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoPropertyEdge.getBasePatternNeoPropertyEdge();
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		NeoSimpleEdge neoSimpleEdge = NEO_FACTORY.createNeoSimpleEdge();
		neoPropertyPathParam.setNeoPathPart(neoSimpleEdge);
		
		return completePattern;
	}
	
	//Last Edge has to be set - NeoPropertyEdge
	private CompletePattern generateSetComplexWithOutLastEdgeException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoPropertyEdge.getBasePatternNeoPropertyEdge();
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		NeoComplexEdge neoComplexEdge = NEO_FACTORY.createNeoComplexEdge();
		NeoSimpleEdge neoSimpleEdge1 = NEO_FACTORY.createNeoSimpleEdge();
		NeoSimpleEdge neoSimpleEdge2 = NEO_FACTORY.createNeoSimpleEdge();
		
		neoComplexEdge.addNeoPathPart(neoSimpleEdge1);
		neoComplexEdge.addNeoPathPart(neoSimpleEdge2);
		neoPropertyPathParam.setNeoPathPart(neoComplexEdge);
		
		return completePattern;
	}
	
	//If in the NeoPropertyEdge a NeoPathPart is introduced there is a need for a TargetNode - NeoPropertyEdge
	private CompletePattern generateNeoPathPartsWithOutNeoTargetException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoPropertyEdge.getBasePatternNeoPropertyEdge();
		
		NeoPropertyEdge neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(0);
		NeoPropertyPathParam neoPropertyPathParam = neoPropertyEdge.getNeoPropertyPathParam();
		neoPropertyPathParam.setNeoPropertyName("path");
		NeoComplexEdge neoComplexEdge = NEO_FACTORY.createNeoComplexEdge();
		NeoSimpleEdge neoSimpleEdge1 = NEO_FACTORY.createNeoSimpleEdge();
		NeoSimpleEdge neoSimpleEdge2 = NEO_FACTORY.createNeoSimpleEdge();
		
		neoComplexEdge.addNeoPathPart(neoSimpleEdge1);
		neoComplexEdge.addNeoPathPart(neoSimpleEdge2);
		neoPropertyPathParam.setNeoPathPart(neoComplexEdge);
		
		return completePattern;
	}
		
	
	//FACTORY-METHOD
	private static CompletePattern getBasePatternNeoPropertyEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTranslation.getBasePattern();
		completePattern.createNeo4jAdaption();
		
		return completePattern;
	}
	
	protected static CompletePattern buildMultiEdgesToNeoPropertyNode() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTranslation.getBasePattern();
		Graph g = completePattern.getGraph();
		PrimitiveNode primitiveNode = (PrimitiveNode) g.getNodes().get(1);
		ComplexNode complexNode1 = g.addComplexNode();
		g.addRelation(complexNode1, primitiveNode);
		ComplexNode complexNode2 = g.addComplexNode();
		g.addRelation(complexNode2, primitiveNode);
		ComplexNode complexNode3 = g.addComplexNode();
		g.addRelation(complexNode3, primitiveNode);
		
		return completePattern;
	}
	
	protected static void concretizesMultiEdgesToNeoPropertyNode(CompletePattern completePattern) throws InvalidityException {
		NeoPropertyEdge neoPropertyEdge = null;
		for (Relation r : completePattern.getGraph().getRelations()) {
			neoPropertyEdge = (NeoPropertyEdge) r;
			neoPropertyEdge.getNeoPropertyPathParam().setNeoPropertyName("placeOfIssue");
		}
		neoPropertyEdge.getNeoPropertyPathParam().createParameters();
		((NeoSimpleEdge) neoPropertyEdge.getNeoPropertyPathParam().getNeoPathPart()).addNeoTargetNodeLabel("Regesta");
		
		neoPropertyEdge = (NeoPropertyEdge) completePattern.getGraph().getRelations().get(2);
		neoPropertyEdge.getNeoPropertyPathParam().createParameters();
		((NeoSimpleEdge) neoPropertyEdge.getNeoPropertyPathParam().getNeoPathPart()).addNeoTargetNodeLabel("Regesta");
	}
}
