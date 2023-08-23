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
		
		Graph g0 = completePattern.getGraph();
		Graph g1 = quantified.getGraph();
		
		g0.getReturnNodes().get(0).addOutgoing(g1);
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

		Graph g0 = completePattern.getGraph();
		Graph g1 = qc.getGraph();
		Graph g2 = qc2.getGraph();
		
		Node ret = g0.getNodes().get(0).makeComplex();
		Node n1 = ret.addOutgoing(g1).getTarget().makeComplex();
		n1.addOutgoing(g2).getTarget().makeComplex();
		
		return completePattern;
	}
}
