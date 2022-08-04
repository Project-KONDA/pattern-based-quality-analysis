package qualitypatternmodel.xmltranslationtests;

import java.util.ArrayList;

import qualitypatternmodel.adaptionxml.XmlElement;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class Test13Cycle {
    public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternCycle());
		Test00.test(completePatterns);
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
		
		completePattern.createXmlAdaption();
		
		try {
			completePattern.isValid(AbstractionLevel.CONCRETE); // InvalidityException expected due to deep equal cycle
		} catch (InvalidityException e) {
			System.out.println("InvalidityException '" + e.getMessage() + "' thrown as expected");
		}

		((XmlElement) graph2.getNodes().get(0)).setXQueryDeepEqual(false);
		
		return completePattern;
	}
}
