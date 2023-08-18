package qualitypatternmodel.xmltranslationtests;
import java.util.ArrayList;
import java.util.List;

//import qualitypatternmodel.adaptionxml.XmlNavigation;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
//import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;
import qualitypatternmodel.xmltestutility.PatternTestPair;

public class Test03Quantor {
	
	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternExistsWithRelationFinal());
		completePatterns.add(getPatternExistsFinal());
		completePatterns.add(getPatternExistsNavigation());
		completePatterns.add(getPatternExistsCondFinal());
		completePatterns.add(getPatternForall());
		completePatterns.add(getPatternForallCond());
		return completePatterns;
	}
	
    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		Test00.test(getPatterns());
	}
	
	public static CompletePattern getPatternExistsFinal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
//		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		// Pattern Structure
		CompletePattern completePattern = getPatternExists();	
		
		completePattern.createXmlAdaption();
				
		return completePattern;
	}
	
	public static CompletePattern getPatternExistsNavigation() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
//		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		// Pattern Structure
		CompletePattern completePattern = getPatternExists();	
		QuantifiedCondition cond = (QuantifiedCondition) completePattern.getCondition();
		Graph graph2 = cond.getGraph();
		
		Node e0g2 = graph2.getNodes().get(0);
		Node e1g2 = graph2.getNodes().get(1);
		e0g2.addOutgoing(e1g2);		
		
		completePattern.createXmlAdaption();
		
		return completePattern;
	}

	public static CompletePattern getPatternExists() throws InvalidityException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		// Pattern Structure
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();;
		QuantifiedCondition cond = factory.createQuantifiedCondition();
		completePattern.setCondition(cond);
		Graph g = cond.getGraph();
		
		Node ret = completePattern.getGraph().getNodes().get(0);
		
		// EXISTS additional graph structure
		ret.addOutgoing(g).getTarget().makeComplex();
				
		return completePattern;
	}
	
	public static CompletePattern getPatternExistsWithRelation() throws InvalidityException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		// Pattern Structure
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();;
		QuantifiedCondition cond = factory.createQuantifiedCondition();
		completePattern.setCondition(cond);
		Graph condGraph = cond.getGraph();
				
		// EXISTS additional graph structure
//		Node se1 = cond.getGraph().getReturnNodes().get(0);	
//		Node se2 = se1.addOutgoing().getTarget();
		Node se1 = completePattern.getGraph().getReturnNodes().get(0);	
		Relation r = se1.addOutgoing(condGraph);
		
		return completePattern;
	}

	public static CompletePattern getPatternExistsWithRelationFinal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		CompletePattern completePattern = getPatternExistsWithRelation();
		QuantifiedCondition cond = (QuantifiedCondition) completePattern.getCondition();
		
		completePattern.createXmlAdaption();
		cond.getGraph().getRelations().get(0).adaptAsXmlElementNavigation();
				
		return completePattern;
	}
	
	public static CompletePattern getPatternExistsCondFinal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		CompletePattern completePattern = getPatternExistsCond();		
		
		completePattern.createXmlAdaption();
		
//		QuantifiedCondition quantifiedCondition = (QuantifiedCondition) completePattern.getCondition();
//		XmlNavigation nav = (XmlNavigation) quantifiedCondition.getGraph().getRelations().get(1);
		
		return completePattern;
	}

	public static CompletePattern getPatternExistsCond() throws InvalidityException {
		
		CompletePattern completePattern = getPatternExists();
		Graph graph2 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
		Node last = graph2.getNodes().get(1);
		
		last.addOutgoing().getTarget().addPrimitiveComparison("New York City");
		
		return completePattern;
	}

	public static CompletePattern getPatternForall() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {		
		CompletePattern completePattern = getPatternExists();
		QuantifiedCondition cond1 = (QuantifiedCondition) completePattern.getCondition();
		cond1.setQuantifier(Quantifier.FORALL);
		completePattern.createXmlAdaption();
		return completePattern;
	}

	public static CompletePattern getPatternForallCond() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {		
		CompletePattern completePattern = getPatternExistsCond();
		QuantifiedCondition cond1 = (QuantifiedCondition) completePattern.getCondition();
		cond1.setQuantifier(Quantifier.FORALL);		
		completePattern.createXmlAdaption();
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
