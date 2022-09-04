package qualitypatternmodel.cyphertranslationtests;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;

import qualitypatternmodel.adaptionNeo4J.AdaptionNeo4JFactory;
import qualitypatternmodel.adaptionNeo4J.NeoNode;
import qualitypatternmodel.adaptionNeo4J.impl.AdaptionNeo4JFactoryImpl;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Morphism;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;

public class CypherTest03NotCondition {
	public static final AdaptionNeo4JFactory factory = new AdaptionNeo4JFactoryImpl();
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		//Tests
		System.out.println("");
		System.out.println("<<< BEGIN - Tests >>>");
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
//		completePatterns.add(getNotQuantifierPattern(Quantifier.EXISTS));
//		completePatterns.add(getNotQuantifierPattern(Quantifier.FORALL));
//		completePatterns.add(getNotQuantifierPattern(Quantifier.EXISTS, Quantifier.EXISTS));
//		completePatterns.add(getNotQuantifierPattern(Quantifier.FORALL, Quantifier.FORALL));
//		completePatterns.add(getNotNotPattern());
//		completePatterns.add(getNotNotNotPattern());
//		completePatterns.add(getNotNotNotNotPattern());
//		completePatterns.add(getNotNotNotNotNotPattern());
		completePatterns.add(testPatternQuery1());
		//Call tester from CypherTest00
		CypherTest00.test(completePatterns);
		System.out.println("<<< END - Tests >>>");
		System.out.println("");		
	}

	public static CompletePattern getNotQuantifierPattern(Quantifier q) {
		CompletePattern completePattern = null;
		
		
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
