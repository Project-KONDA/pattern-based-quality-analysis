package qualitypatternmodel.evaluationquality;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.xmltranslationtests.Test00;

public class EvalExNEx {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		
		completePatterns.add(getExNExGeneric());
		completePatterns.add(getExNEx2Generic());
		
		for (CompletePattern cp: completePatterns)
			Test00.printGenericPatternExampleXQuery(cp);
//			System.out.println(cp.myToString());
	}

	public static CompletePattern getExNExGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		NotCondition not = PatternstructureFactory.eINSTANCE.createNotCondition();
		QuantifiedCondition quantified = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		
		completePattern.setCondition(not);
		not.setCondition(quantified);
		
//		Graph g0 = completePattern.getGraph();
//		g0.getReturnNodes().get(0).addOutgoing().getTarget().addPrimitiveComparison();
		Graph g1 = quantified.getGraph();
		g1.getReturnNodes().get(0).addOutgoing().getTarget();
		return completePattern;
	}

	public static CompletePattern getExNEx2Generic() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		
		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		NotCondition not = PatternstructureFactory.eINSTANCE.createNotCondition();
		QuantifiedCondition qc2 = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		
		completePattern.setCondition(qc);
		qc.setCondition(not);
		not.setCondition(qc2);

		Graph g1 = qc.getGraph();
		Node n = g1.getReturnNodes().get(0).addOutgoing().getTarget();
		
		n.getOutgoingMappings().get(0).getTarget().addOutgoing();
		
		return completePattern;
	}	
}
