package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;
import qualitypatternmodel.xmltranslationtests.Test00;

public class EvalContrel {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();

		completePatterns.add(getContrelGeneric());
		
		for (CompletePattern cp: completePatterns)
			Test00.printGenericPatternExampleXQuery(cp);
//			System.out.println(cp.myToString());
	}

	public static CompletePattern getContrelGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern pattern = factory.createCompletePattern();
		
//		Graph g1 = pattern.getGraph();
//		ComplexNode g1return = g1.getReturnNodes().get(0).makeComplex();
		
		QuantifiedCondition qc = factory.createQuantifiedCondition();
		pattern.setCondition(qc);
		TrueElement trueElement = factory.createTrueElement();
		qc.setCondition(trueElement);
		
		Graph g2 = qc.getGraph();		
		ComplexNode g2n1 = g2.getReturnNodes().get(0).makeComplex();
		
		ComplexNode g2c1 = graphFactory.createComplexNode();
		g2c1.setGraph(g2);

		ComplexNode g2n = g2n1.addOutgoing().getTarget().makeComplex();
		ComplexNode g2c = g2c1.addOutgoing().getTarget().makeComplex();

		PrimitiveNode g2n2 = g2n1.addOutgoing().getTarget().makePrimitive();
		PrimitiveNode g2c2 = g2c1.addOutgoing().getTarget().makePrimitive();
		
		PrimitiveNode g2n3 = g2n.addOutgoing().getTarget().makePrimitive();
		PrimitiveNode g2c3 = g2c.addOutgoing().getTarget().makePrimitive();
		
		PrimitiveNode g2n4 = g2n.addOutgoing().getTarget().makePrimitive();
		PrimitiveNode g2c4 = g2c.addOutgoing().getTarget().makePrimitive();

		Comparison comp2 = g2n2.addComparison(g2c4);
		comp2.getTypeOption().setValue(ReturnType.STRING);
		Comparison comp3 = g2n3.addComparison(g2c3);
		comp3.getTypeOption().setValue(ReturnType.STRING);
		Comparison comp4 = g2n4.addComparison(g2c2);
		comp4.getTypeOption().setValue(ReturnType.STRING);
		
		return pattern;
	}
}
