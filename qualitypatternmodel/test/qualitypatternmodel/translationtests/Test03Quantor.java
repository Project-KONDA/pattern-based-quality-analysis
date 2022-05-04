package qualitypatternmodel.translationtests;
import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.testutility.PatternTestPair;
import qualitypatternmodel.adaptionxml.AxisKind;
import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.operators.*;
import qualitypatternmodel.parameters.*;

public class Test03Quantor {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternExistsWithRelationFinal());
		completePatterns.add(getPatternExistsFinal());
//		completePatterns.add(getPatternExistsNavigation());
		completePatterns.add(getPatternExistsCondFinal());
		completePatterns.add(getPatternForall());
		completePatterns.add(getPatternForallCond());

		Test00.test(completePatterns);
	}
	
	public static CompletePattern getPatternExistsFinal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
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
	
	public static CompletePattern getPatternExistsNavigation() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		// Pattern Structure
		CompletePattern completePattern = getPatternExists();	
		QuantifiedCondition cond = (QuantifiedCondition) completePattern.getCondition();
		Graph graph2 = cond.getGraph();
		
		Node e0g2 = graph2.getNodes().get(0);
		Node e1g2 = graph2.getNodes().get(1);
		
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
		Node se2 = graphFactory.createNode();
		se2.setGraph(cond.getGraph());	
				
		return completePattern;
	}
	
	public static CompletePattern getPatternExistsWithRelation() {
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
		Node se1 = cond.getGraph().getNodes().get(0);	
		
		Node se2 = graphFactory.createNode();
		se2.setGraph(cond.getGraph());
		
		Relation relation = graphFactory.createRelation();
		relation.setGraph(cond.getGraph());
		relation.setSource(se1);
		relation.setTarget(se2);		
				
		return completePattern;
	}

	public static CompletePattern getPatternExistsWithRelationFinal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		CompletePattern completePattern = getPatternExistsWithRelation();
		QuantifiedCondition cond = (QuantifiedCondition) completePattern.getCondition();
		
		completePattern.createXMLAdaption();
		cond.getGraph().getRelations().get(0).adaptAsXMLNavigation();
		completePattern.finalizeXMLAdaption();	
				
		return completePattern;
	}
	
	public static CompletePattern getPatternExistsCondFinal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		CompletePattern completePattern = getPatternExistsCond();		
		
		completePattern.createXMLAdaption();
		completePattern.finalizeXMLAdaption();	
		
		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
		XmlNavigation nav = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(1);
		nav.getPathParam().setValue(AxisKind.THREECHILD);
		
		return completePattern;
	}

	public static CompletePattern getPatternExistsCond() {
		
		CompletePattern completePattern = getPatternExists();
		Graph graph2 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
		Node last = graph2.getNodes().get(1);
		try {
			last.addPrimitiveComparison("New York City");
		} catch (InvalidityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return completePattern;
	}

	public static CompletePattern getPatternForall() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {		
		CompletePattern completePattern = getPatternExists();
		QuantifiedCondition cond1 = (QuantifiedCondition) completePattern.getCondition();
		cond1.setQuantifier(Quantifier.FORALL);
		completePattern.createXMLAdaption();
		completePattern.finalizeXMLAdaption();	
		return completePattern;
	}

	public static CompletePattern getPatternForallCond() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {		
		CompletePattern completePattern = getPatternExistsCond();
		QuantifiedCondition cond1 = (QuantifiedCondition) completePattern.getCondition();
		cond1.setQuantifier(Quantifier.FORALL);		
		completePattern.createXMLAdaption();
		completePattern.finalizeXMLAdaption();	
		return completePattern;
	}
	
	public static List<PatternTestPair> getTestPairs() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		testPairs.add(new PatternTestPair("EXISTSREL", getPatternExistsWithRelationFinal(), "/*[./*]"));
		testPairs.add(new PatternTestPair("EXISTS", getPatternExistsFinal(), "/*[/*]"));
//		testPairs.add(new PatternTestPair("EXISTSNAV", getPatternExistsNavigation(), ""));		
		testPairs.add(new PatternTestPair("EXISTSCOND", getPatternExistsCondFinal(), "/*[/*/*/*[data()=\"New York City\"]]"));
		testPairs.add(new PatternTestPair("FORALL", getPatternForall(), "for $x1 in /* where every $x2 in /* satisfies true() return $x1"));
		testPairs.add(new PatternTestPair("FORALLCOND", getPatternForallCond(), "for $x1 in /* where every $x2 in /*[data()=\"myvalue\"] satisfies true() return $x1"));
		// TODO: complete test cases
		return testPairs;		
	}
}
