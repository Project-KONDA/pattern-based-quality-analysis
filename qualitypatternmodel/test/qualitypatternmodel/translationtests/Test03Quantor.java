package qualitypatternmodel.translationtests;
import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.testutilityclasses.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.operators.*;
import qualitypatternmodel.parameters.*;

public class Test03Quantor {

	public static void main(String[] args) {
//		System.out.println(getPatternExists().myToString());
		
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
//		completePatterns.add(getPatternExistsFinal());
		completePatterns.add(getPatternExistsNavigation());
//		completePatterns.add(getPatternExistsCondFinal());
//		completePatterns.add(getPatternForall());
//		completePatterns.add(getPatternForallCond());

		Test00.test(completePatterns);
	}
	
	public static CompletePattern getPatternExistsFinal() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		// Pattern Structure
		CompletePattern completePattern = getPatternExists();	
		
		completePattern.createXMLAdaption();
		completePattern.finalizeXMLAdaption();		
				
		return completePattern;
	}
	
	public static CompletePattern getPatternExistsNavigation() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		// Pattern Structure
		CompletePattern completePattern = getPatternExists();	
		QuantifiedCondition cond = (QuantifiedCondition) completePattern.getCondition();
		Graph graph2 = cond.getGraph();
		
		Element e0g2 = graph2.getElements().get(0);
		Element e1g2 = graph2.getElements().get(1);
		
		Relation relation = graphFactory.createRelation();
		relation.setGraph(graph2);
		relation.setSource(e0g2);
		relation.setTarget(e1g2);		
		
		completePattern.createXMLAdaption();
		relation.adaptAsXMLNavigation();
		completePattern.finalizeXMLAdaption();	
		
		return completePattern;
	}

	public static CompletePattern getPatternExists() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		// Pattern Structure
		CompletePattern completePattern = Test00.getBasePattern();
		QuantifiedCondition cond = factory.createQuantifiedCondition();
		cond.setCondition(factory.createTrueElement());
		completePattern.setCondition(cond);
				
		// EXISTS additional graph structure
		Element se2 = graphFactory.createElement();
		se2.setGraph(cond.getGraph());	
				
		return completePattern;
	}

	public static CompletePattern getPatternExistsCondFinal() {
		
		CompletePattern completePattern = getPatternExistsCond();		
		
		completePattern.createXMLAdaption();
		completePattern.finalizeXMLAdaption();	
		
		return completePattern;
	}

	public static CompletePattern getPatternExistsCond() {
		
		CompletePattern completePattern = getPatternExists();
		Graph graph2 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
		Element last = graph2.getElements().get(1);
		last.addPrimitiveComparison("myvalue");
		
		return completePattern;
	}

	public static CompletePattern getPatternForall() {		
		CompletePattern completePattern = getPatternExists();
		QuantifiedCondition cond1 = (QuantifiedCondition) completePattern.getCondition();
		cond1.setQuantifier(Quantifier.FORALL);
		completePattern.createXMLAdaption();
		completePattern.finalizeXMLAdaption();	
		return completePattern;
	}

	public static CompletePattern getPatternForallCond() {		
		CompletePattern completePattern = getPatternExistsCond();
		QuantifiedCondition cond1 = (QuantifiedCondition) completePattern.getCondition();
		cond1.setQuantifier(Quantifier.FORALL);		
		completePattern.createXMLAdaption();
		completePattern.finalizeXMLAdaption();	
		return completePattern;
	}
	
	public static List<PatternTestPair> getTestPairs(){
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		testPairs.add(new PatternTestPair("EXISTS", 	getPatternExists(), 	""));
		testPairs.add(new PatternTestPair("EXISTSCOND", getPatternExistsCond(), ""));
		testPairs.add(new PatternTestPair("FORALL",		getPatternForall(), 	""));
		testPairs.add(new PatternTestPair("FORALLCOND", getPatternForallCond(), ""));
		// ...
		return testPairs;		
	}
}
