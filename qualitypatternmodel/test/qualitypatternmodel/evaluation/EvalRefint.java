package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.NotCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class EvalRefint {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getRefintCondGeneric());
		for (CompletePattern cp: completePatterns)
			System.out.println(cp.myToString());
	}
	
	public static CompletePattern getRefintCondGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
				
		CompletePattern completePattern = factory.createCompletePattern();
		QuantifiedCondition qc1 = factory.createQuantifiedCondition(); 
		NotCondition notc = factory.createNotCondition();
		QuantifiedCondition qc2 = factory.createQuantifiedCondition();
		
		completePattern.setCondition(qc1);
		qc1.setCondition(notc);
		notc.setCondition(qc2);
		
		Graph g0 = completePattern.getGraph();
		Graph g1 = qc1.getGraph();
		Graph g2 = qc2.getGraph();
		
		Node e0g0 = g0.getReturnNodes().get(0);
		Node e1g0 = e0g0.addOutgoing().getTarget().makePrimitive();
		e1g0.addPrimitiveComparison();
		
		Node e0g1 = g1.getReturnNodes().get(0);
		Node e2g1 = e0g1.addOutgoing().getTarget().makeComplex();
		Node e3g1 = e2g1.addOutgoing().getTarget().makePrimitive();
		e3g1.addPrimitiveComparison();
		
		Node e2g2 = g2.getNodes().get(2);
		PrimitiveNode e4g2 = e2g2.addOutgoing().getTarget().makePrimitive();
		
		ComplexNode e5g2 = graphFactory.createComplexNode();
		e5g2.setGraph(g2);
		
		PrimitiveNode e6g2 = e5g2.addOutgoing().getTarget().makePrimitive();
		e6g2.addPrimitiveComparison();
		
		ComplexNode e7g2 = e5g2.addOutgoing().getTarget().makeComplex();
		PrimitiveNode e8g2 = e7g2.addOutgoing().getTarget().makePrimitive();
		e8g2.addPrimitiveComparison();

		PrimitiveNode e9g2 = e7g2.addOutgoing().getTarget().makePrimitive();
		
		Comparison c = e4g2.addComparison(e9g2);
		
		c.getOption().setValue(ComparisonOperator.EQUAL);
		c.getTypeOption().setValue(ReturnType.STRING);
		return completePattern; 
	}
}
