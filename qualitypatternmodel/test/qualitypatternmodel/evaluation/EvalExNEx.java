package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.xmltranslationtests.Test00;
import qualitypatternmodel.xmltranslationtests.Test06NotElement;

public class EvalExNEx {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		
		completePatterns.add(getExNExGeneric());
		completePatterns.add(getExNExCondGeneric());
		completePatterns.add(getExNExCond2Generic());
		
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
		g0.getReturnNodes().get(0).addOutgoing().getTarget().addPrimitiveComparison();
		Graph g1 = quantified.getGraph();
		g1.getReturnNodes().get(0).addOutgoing().getTarget();
		return completePattern;
	}
	
	public static CompletePattern getExNExCondGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		CompletePattern completePattern = Test06NotElement.getPatternExistsNotExistsAbstract();
		
		QuantifiedCondition qc1 = ((QuantifiedCondition) completePattern.getCondition());
//		QuantifiedCondition qc2 = ((QuantifiedCondition)((NotCondition) qc1.getCondition()).getCondition());

		Graph g0 = completePattern.getGraph();
		g0.getNodes().get(0).addOutgoing().getTarget().addPrimitiveComparison();
		
		Graph g1 = qc1.getGraph();
		g1.getNodes().get(1).addOutgoing().getTarget().addPrimitiveComparison();
		
//		Graph g2 = qc2.getGraph();
		return completePattern;		
	}
	

	
	public static CompletePattern getExNExCond2Generic() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = Test06NotElement.getPatternExistsNotExistsAbstract();
		
		QuantifiedCondition qc1 = ((QuantifiedCondition) completePattern.getCondition());
		QuantifiedCondition qc2 = ((QuantifiedCondition)((NotCondition) qc1.getCondition()).getCondition());

		Graph g0 = completePattern.getGraph();
		g0.getNodes().get(0).addOutgoing().getTarget().addPrimitiveComparison();
		
		Graph g1 = qc1.getGraph();
		g1.getNodes().get(1).addOutgoing().getTarget().addPrimitiveComparison();
		
		Graph g2 = qc2.getGraph();
		g2.getNodes().get(2).addOutgoing().getTarget().addPrimitiveComparison();
		return completePattern;
	}
	
}
