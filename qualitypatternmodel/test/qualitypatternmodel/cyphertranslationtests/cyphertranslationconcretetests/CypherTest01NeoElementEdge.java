package qualitypatternmodel.cyphertranslationtests.cyphertranslationconcretetests;

import java.util.ArrayList;

import qualitypatternmodel.adaptionneo4j.NeoComplexEdge;
import qualitypatternmodel.adaptionneo4j.NeoDirection;
import qualitypatternmodel.adaptionneo4j.NeoElementEdge;
import qualitypatternmodel.adaptionneo4j.NeoElementNode;
import qualitypatternmodel.adaptionneo4j.NeoElementPathParam;
import qualitypatternmodel.adaptionneo4j.NeoPlace;
import qualitypatternmodel.adaptionneo4j.NeoSimpleEdge;
import qualitypatternmodel.cyphertranslationtests.CypherTranslation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;

//Integrate the tests for the NeoNode and NeoPropertyNode in this tests
//Codeabedeckung checken
//PATH abdeckung --> Beschreiben
//Am Modeldiagramm die entscheidungen getroffen
//Erklären welche Tests für das Metamodell gemacht habe
//Erfolgreich Test ja/nein --> Cypher querys beschreiben
public class CypherTest01NeoElementEdge extends CypherTranslation {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CypherTest01NeoElementEdge neoEdge = new CypherTest01NeoElementEdge();
		
		try {
			neoEdge.generalizedTests();         
			neoEdge.generalizedInvalidtyExceptionTests();
			
			//Specific test for the NeoEdge
			//Exception during Build-Pattern
			System.out.println("");
			System.out.println(BEGIN_BUILD_PATTERN_EXCEPTIONS);
			try {
				//List here all exceptions which occure while build + Naming
				System.out.println("Exception: Set NeoPathPart");
				CypherTest01NeoElementEdge.generateBuildNeoNeoNeedsAPathParamException();
				System.out.println("Exception: Setting the NeoDirection to null");
				CypherTest01NeoElementEdge.generateToCreateNeoDirectionErrorShallNotWorkException();
				System.out.println("");
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("");
			}
			System.out.println(END_BUILD_PATTERN_EXCEPTIONS);
			System.out.println("");
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}


	@Override
	public void buildPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatterns.add(getUnspecifiedEdge());
		completePatterns.add(getSimpleEdge());
		completePatterns.add(getSimpleEdgeWithLabels());
		completePatterns.add(getSimpleEdgeWithLabelsRight());
		completePatterns.add(getSimpleEdgeWithLabelsLeft());
		completePatterns.add(getSimpleEdgeWithTargetNode());
		completePatterns.add(getComplexEdge());
		completePatterns.add(getComplexEdgeWithDoppleEnding());
		completePatterns.add(getComplexEdgeWithTargeAtEndAndLabels());
		completePatterns.add(getComplexEdgeWithLabelsDiffrentDirectionsAndLabels());
		completePatterns.add(getMultipleGraphPatterns());
		completePatterns.add(getSimpleEdgeWithTargetNodeAndDopple());
	}
	
	@Override
	public void buildInvalidityExceptionPatterns(ArrayList<CompletePattern> completePatternsExceptions)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		completePatternsExceptions.add(generateNoNeoAdaptionException());
		completePatternsExceptions.add(generateNoBeginningException());
		completePatternsExceptions.add(generateNeoNeoPathPartIsSetWithEmptyComplexEdgeException());
	}
	
	private CompletePattern getUnspecifiedEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoElementEdge.getBasePatternNeoEdge();
		NeoElementEdge	neoEdge	= (NeoElementEdge) completePattern.getGraph().getRelations().get(0);
		NeoElementPathParam neoPathParam = neoEdge.getNeoElementPathParam();
		neoPathParam.setNeoPathPart(null);
		return completePattern;
	}
		
	private CompletePattern getSimpleEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoElementEdge.getBasePatternNeoEdge();
		NeoElementEdge neoEdge = (NeoElementEdge) completePattern.getGraph().getRelations().get(0);	
		neoEdge.setReturnElement(true);
		NeoElementNode neoNode = (NeoElementNode) completePattern.getGraph().getNodes().get(1);
		neoNode.setReturnNode(true);
		
		return completePattern;
	}
	
	private CompletePattern getSimpleEdgeWithLabels() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoElementEdge.getBasePatternNeoEdge();
		NeoElementEdge neoEdge = (NeoElementEdge) completePattern.getGraph().getRelations().get(0);
		neoEdge.setReturnElement(true);
		NeoElementPathParam neoPathParam = neoEdge.getNeoElementPathParam();
		NeoSimpleEdge neoSimpleEdge = (NeoSimpleEdge) neoPathParam.getNeoPathPart();
		neoSimpleEdge.addNeoEdgeLabel("PLACE_OF_ISSUE");
		
		NeoElementNode neoNode1 = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
		NeoElementNode neoNode2 = (NeoElementNode) completePattern.getGraph().getNodes().get(1);
		
		neoNode1.addNeoLabel("Regesta");
		neoNode2.addNeoLabel("Place");
		neoNode2.setReturnNode(true);
		
		return completePattern;
	}
	
	private CompletePattern getSimpleEdgeWithLabelsRight() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoElementEdge.getBasePatternNeoEdge();
		NeoElementEdge neoEdge = (NeoElementEdge) completePattern.getGraph().getRelations().get(0);
		neoEdge.setReturnElement(true);
		NeoElementPathParam neoPathParam = neoEdge.getNeoElementPathParam();
		NeoSimpleEdge neoSimpleEdge = (NeoSimpleEdge) neoPathParam.getNeoPathPart();
		neoSimpleEdge.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge.setNeoDirection(NeoDirection.RIGHT);
		
		NeoElementNode neoNode1 = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
		NeoElementNode neoNode2 = (NeoElementNode) completePattern.getGraph().getNodes().get(1);
		
		neoNode1.addNeoLabel("Regesta");
		neoNode2.addNeoLabel("Place");
		neoNode2.setReturnNode(true);
		
		return completePattern;
	}
	
	private CompletePattern getSimpleEdgeWithLabelsLeft() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoElementEdge.getBasePatternNeoEdge();
		NeoElementEdge neoEdge = (NeoElementEdge) completePattern.getGraph().getRelations().get(0);
		neoEdge.setReturnElement(true);
		NeoElementPathParam neoPathParam = neoEdge.getNeoElementPathParam();
		NeoSimpleEdge neoSimpleEdge = (NeoSimpleEdge) neoPathParam.getNeoPathPart();
		neoSimpleEdge.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge.setNeoDirection(NeoDirection.LEFT);
		
		NeoElementNode neoNode1 = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
		NeoElementNode neoNode2 = (NeoElementNode) completePattern.getGraph().getNodes().get(1);
		
		neoNode1.addNeoLabel("Place");
		neoNode2.addNeoLabel("Regesta");
		neoNode2.setReturnNode(true);
		
		return completePattern;
	}
	
	
	private CompletePattern getSimpleEdgeWithTargetNodeAndDopple() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoElementEdge.getBasePatternNeoEdge();
		NeoElementEdge neoEdge = (NeoElementEdge) completePattern.getGraph().getRelations().get(0);
		neoEdge.setReturnElement(true);
		NeoElementPathParam neoPathParam = neoEdge.getNeoElementPathParam();
		NeoSimpleEdge neoSimpleEdge = (NeoSimpleEdge) neoPathParam.getNeoPathPart();
		TextListParam labels = new TextListParamImpl();
		labels.addStringValue("Place");
		neoSimpleEdge.setNeoTargetNodeLabels(labels);
		neoSimpleEdge.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge.setNeoDirection(NeoDirection.RIGHT);
		
		
		NeoElementNode neoNode1 = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
		NeoElementNode neoNode2 = (NeoElementNode) completePattern.getGraph().getNodes().get(1);
		neoNode2.setReturnNode(true);
		
		neoNode1.addNeoLabel("Regesta");
		neoNode2.addNeoLabel("Regesta");
		
		return completePattern;
	}
	
	private CompletePattern getSimpleEdgeWithTargetNode() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoElementEdge.getBasePatternNeoEdge();
		NeoElementEdge neoEdge = (NeoElementEdge) completePattern.getGraph().getRelations().get(0);
		neoEdge.setReturnElement(true);
		NeoElementPathParam neoPathParam = neoEdge.getNeoElementPathParam();
		NeoSimpleEdge neoSimpleEdge = (NeoSimpleEdge) neoPathParam.getNeoPathPart();
		TextListParam labels = new TextListParamImpl();
		labels.addStringValue("Place");
		neoSimpleEdge.setNeoTargetNodeLabels(labels);
		neoSimpleEdge.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge.setNeoDirection(NeoDirection.RIGHT);
		
		
		NeoElementNode neoNode1 = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
		NeoElementNode neoNode2 = (NeoElementNode) completePattern.getGraph().getNodes().get(1);
		neoNode2.setReturnNode(true);
		
		neoNode1.addNeoLabel("Regesta");
		neoNode2.addNeoLabel("Regesta");
		
		return completePattern;
	}
	
//	private CompletePattern getSimpleEdgeWithkeyValueParams() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		return null;
//	}
	
//	private CompletePattern getSimpleEdgeWithOptionalMatch() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		return null;
//	}
	
	//Combine with NeoPropertyEdge
	private CompletePattern getComplexEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoElementEdge.getBasePatternNeoEdge();
		NeoElementEdge neoEdge = (NeoElementEdge) completePattern.getGraph().getRelations().get(0);
		neoEdge.setReturnElement(true);
		NeoElementPathParam neoPathParam = neoEdge.getNeoElementPathParam();
		NeoComplexEdge neoComplexEdge = NEO_FACTORY.createNeoComplexEdge();
		NeoSimpleEdge neoSimpleEdge1 = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge1.addNeoTargetNodeLabel("Place");
		neoSimpleEdge1.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge1.setNeoDirection(NeoDirection.RIGHT);
		NeoSimpleEdge neoSimpleEdge2 = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge2.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge2.setNeoDirection(NeoDirection.LEFT);
		
		
		neoComplexEdge.addNeoPathPart(neoSimpleEdge1);
		neoComplexEdge.addNeoPathPart(neoSimpleEdge2);
		neoPathParam.setNeoPathPart(neoComplexEdge);
		
		
		NeoElementNode neoNode1 = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
		NeoElementNode neoNode2 = (NeoElementNode) completePattern.getGraph().getNodes().get(1);
		neoNode2.setReturnNode(true);
		
		neoNode1.addNeoLabel("Regesta");
		neoNode2.addNeoLabel("Regesta");
		
		return completePattern;
	}
	
	private CompletePattern getComplexEdgeWithDoppleEnding() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoElementEdge.getBasePatternNeoEdge();
		NeoElementEdge neoEdge = (NeoElementEdge) completePattern.getGraph().getRelations().get(0);
		neoEdge.setReturnElement(true);
		NeoElementPathParam neoPathParam = neoEdge.getNeoElementPathParam();
		NeoComplexEdge neoComplexEdge = NEO_FACTORY.createNeoComplexEdge();
		NeoSimpleEdge neoSimpleEdge1 = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge1.addNeoTargetNodeLabel("Place");
		neoSimpleEdge1.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge1.setNeoDirection(NeoDirection.RIGHT);
		NeoSimpleEdge neoSimpleEdge2 = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge2.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge2.setNeoDirection(NeoDirection.LEFT);
		
		
		neoComplexEdge.addNeoPathPart(neoSimpleEdge1);
		neoComplexEdge.addNeoPathPart(neoSimpleEdge2);
		neoPathParam.setNeoPathPart(neoComplexEdge);
		
		
		NeoElementNode neoNode1 = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
		NeoElementNode neoNode2 = (NeoElementNode) completePattern.getGraph().getNodes().get(1);
		neoNode2.setReturnNode(true);
		
		neoNode1.addNeoLabel("Regesta");
		neoNode2.addNeoLabel("Regesta");
		
		return completePattern;
	}
	
	private CompletePattern getComplexEdgeWithTargeAtEndAndLabels() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoElementEdge.getBasePatternNeoEdge();
		NeoElementEdge neoEdge = (NeoElementEdge) completePattern.getGraph().getRelations().get(0);
		neoEdge.setReturnElement(true);
		NeoElementPathParam neoPathParam = neoEdge.getNeoElementPathParam();
		NeoComplexEdge neoComplexEdge = NEO_FACTORY.createNeoComplexEdge();
		NeoSimpleEdge neoSimpleEdge1 = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge1.addNeoTargetNodeLabel("Place");
		neoSimpleEdge1.addNeoEdgeLabel("PLACE_OF_ISSUE");
		NeoSimpleEdge neoSimpleEdge2 = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge2.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge2.addNeoTargetNodeLabel("Regesta");
		NeoSimpleEdge neoSimpleEdge3 = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge3.addNeoEdgeLabel("APPEARS_IN");
		
		neoComplexEdge.addNeoPathPart(neoSimpleEdge1);
		neoComplexEdge.addNeoPathPart(neoSimpleEdge2);
		neoComplexEdge.addNeoPathPart(neoSimpleEdge3);
		neoPathParam.setNeoPathPart(neoComplexEdge);
		
		
		NeoElementNode neoNode1 = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
		NeoElementNode neoNode2 = (NeoElementNode) completePattern.getGraph().getNodes().get(1);
		neoNode2.setReturnNode(true);
		
		neoNode1.addNeoLabel("Regesta");
		neoNode2.addNeoLabel("IndexEntry");
		neoNode2.addNeoLabel("IndexPerson");
		
		return completePattern;
	}
	
	private CompletePattern getComplexEdgeWithLabelsDiffrentDirectionsAndLabels() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoElementEdge.getBasePatternNeoEdge();
		NeoElementEdge neoEdge = (NeoElementEdge) completePattern.getGraph().getRelations().get(0);
		neoEdge.setReturnElement(true);
		NeoElementPathParam neoPathParam = neoEdge.getNeoElementPathParam();
		NeoComplexEdge neoComplexEdge = NEO_FACTORY.createNeoComplexEdge();
		NeoSimpleEdge neoSimpleEdge1 = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge1.addNeoTargetNodeLabel("Place");
		neoSimpleEdge1.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge1.setNeoDirection(NeoDirection.RIGHT);
		NeoSimpleEdge neoSimpleEdge2 = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge2.addNeoEdgeLabel("PLACE_OF_ISSUE");
		neoSimpleEdge2.setNeoDirection(NeoDirection.LEFT);
		neoSimpleEdge2.addNeoTargetNodeLabel("Regesta");
		NeoSimpleEdge neoSimpleEdge3 = NEO_FACTORY.createNeoSimpleEdge();
		neoSimpleEdge3.addNeoEdgeLabel("APPEARS_IN");
		neoSimpleEdge3.setNeoDirection(NeoDirection.LEFT);
		
		neoComplexEdge.addNeoPathPart(neoSimpleEdge1);
		neoComplexEdge.addNeoPathPart(neoSimpleEdge2);
		neoComplexEdge.addNeoPathPart(neoSimpleEdge3);
		neoPathParam.setNeoPathPart(neoComplexEdge);
		
		
		NeoElementNode neoNode1 = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
		NeoElementNode neoNode2 = (NeoElementNode) completePattern.getGraph().getNodes().get(1);
		neoNode2.setReturnNode(true);
		
		neoNode1.addNeoLabel("Regesta");
		neoNode2.addNeoLabel("IndexEntry");
		neoNode2.addNeoLabel("IndexPerson");
		
		return completePattern;
	}
	
	//Multiple Graph-Patterns
	private CompletePattern getMultipleGraphPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTranslation.getBasePatternComplex();
		completePattern.getGraph().addNode();
		ComplexNode complexNode1 = completePattern.getGraph().getNodes().get(2).makeComplex();
		completePattern.getGraph().addNode();
		ComplexNode complexNode2 = completePattern.getGraph().getNodes().get(3).makeComplex();
		completePattern.getGraph().addRelation(complexNode1, complexNode2);
		completePattern.createNeo4jAdaption();
		
		return completePattern;
	}
	
	//Exceptions
	//No adaption of the Graphstructure is done, thus an exception has to be thrown
	//Error occures in Graph
	private CompletePattern generateNoNeoAdaptionException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTranslation.getBasePatternComplex();
		return completePattern;
	}
	
	//No starting Point has been set
	//Error occurs in PatternElement
	//Has to be reworked since with the automatical setting of beginnings the Beginning will be set
	private CompletePattern generateNoBeginningException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTranslation.getBasePatternComplex();
		completePattern.createNeo4jAdaption();
		NeoElementNode neoNode  = (NeoElementNode) completePattern.getGraph().getNodes().get(0);
		neoNode.setNeoPlace(NeoPlace.FOLLOWING);
		
		return completePattern;
	}
	
	//Exception In the NeoNode
	//ComplexNode can not be empty
	private CompletePattern generateNeoNeoPathPartIsSetWithEmptyComplexEdgeException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoElementEdge.getBasePatternNeoEdge();
		NeoElementEdge neoEdge = (NeoElementEdge) completePattern.getGraph().getRelations().get(0);
		NeoElementPathParam neoPathParam = neoEdge.getNeoElementPathParam();
		NeoComplexEdge neoComplexEdge = NEO_FACTORY.createNeoComplexEdge();
		neoPathParam.setNeoPathPart(neoComplexEdge);
		
		return completePattern;
	}
	
	//Build time exceptions
	//Exeption in NeoEdge 
	//NeoEdge needs a NeoPathParam
	//Doesn't work since the Framework does not allow to remove the NeoPathParam / to set a new One after once set
	public static CompletePattern generateBuildNeoNeoNeedsAPathParamException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoElementEdge.getBasePatternNeoEdge();
		NeoElementEdge neoEdge = (NeoElementEdge) completePattern.getGraph().getRelations().get(0);
		neoEdge.setNeoElementPathParam(null);
		
		return completePattern;
	}
	
	//NeoSimpleEdge
	//Something went wrong in the SimpleNeoEdge - direction has not been set correctly
	//The setter catches null inputs and thus it leads not to an Exception.
	public static CompletePattern generateToCreateNeoDirectionErrorShallNotWorkException() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTest01NeoElementEdge.getBasePatternNeoEdge();
		NeoElementEdge	neoEdge	= (NeoElementEdge) completePattern.getGraph().getRelations().get(0);
		NeoElementPathParam neoPathParam = neoEdge.getNeoElementPathParam();
		NeoSimpleEdge neoSimpleEdge = (NeoSimpleEdge) neoPathParam.getNeoPathPart();
		neoSimpleEdge.setNeoDirection(null);
		
		return completePattern;
	}
	
	//FACTORY-METHOD
	private static CompletePattern getBasePatternNeoEdge() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = CypherTranslation.getBasePatternComplex();
		completePattern.createNeo4jAdaption();		
		return completePattern;
	}


	@Override
	public void buildToComplexQueryPatterns(ArrayList<CompletePattern> completePatterns)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		// TODO Auto-generated method stub
		
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
