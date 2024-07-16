package qualitypatternmodel.cyphertranslationtests_new;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.xmltestutility.PatternTestPair;

public class Test13Cycle {
	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternCycle());
		return completePatterns;
	}

    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		Test00.test(getPatterns());
	}

	private static CompletePattern getPatternCycle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = Test03Quantor.getPatternExists();
		QuantifiedCondition cond = (QuantifiedCondition) completePattern.getCondition();
		Graph graph2 = cond.getGraph();

		Node e0g2 = graph2.getNodes().get(0);
		Node e1g2 = graph2.getNodes().get(1);

		Relation relation = GraphstructureFactory.eINSTANCE.createRelation();
		relation.setGraph(graph2);
		relation.setSource(e1g2);
		relation.setTarget(e0g2);

		completePattern.createNeo4jAdaption();

		// the value is now set automatically during adaptation.
//		assertThrows(InvalidityException.class, () -> { completePattern.isValid(AbstractionLevel.CONCRETE);});
//		((XmlElement) graph2.getNodes().get(0)).setXQueryDeepEqual(false);

//		System.out.println(completePattern.myToString());

		return completePattern;
	}

	public static List<PatternTestPair> getTestPairs() {
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();

//		for (XmlAxisKind ax : XmlAxisKind.VALUES) {
//			testPairs.add(new PatternTestPair(<name>, <completePattern>, <query>));
//		}
		return testPairs;
	}
}