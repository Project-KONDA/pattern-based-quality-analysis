package qualitypatternmodel.evaluation;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;

public class EvalContrel {

	public static CompletePattern getContrelGenericConds() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern pattern = factory.createCompletePattern();
		
		Graph g1 = pattern.getGraph();
		ComplexNode g1return = g1.getReturnNodes().get(0).makeComplex();
		g1return.addOutgoing().getTarget().addPrimitiveComparison();
		
		QuantifiedCondition qc = factory.createQuantifiedCondition();
		pattern.setCondition(qc);
		TrueElement trueElement = factory.createTrueElement();
		qc.setCondition(trueElement);
		
		Graph g2 = qc.getGraph();		
		ComplexNode g2n1 = g2.getReturnNodes().get(0).makeComplex();
		
		ComplexNode g2c1 = graphFactory.createComplexNode();
		g2c1.setGraph(g2);
		g2c1.addOutgoing().getTarget().addPrimitiveComparison();
		
		ComplexNode g2n2 = g2n1.addOutgoing().getTarget().makeComplex();
		g2n2.addOutgoing().getTarget().addPrimitiveComparison();
		
		ComplexNode g2c2 = g2c1.addOutgoing().getTarget().makeComplex();
		g2c2.addOutgoing().getTarget().addPrimitiveComparison();
		ComplexNode g2n3 = g2n1.addOutgoing().getTarget().makeComplex();
		g2n3.addOutgoing().getTarget().addPrimitiveComparison();
		ComplexNode g2c3 = g2c1.addOutgoing().getTarget().makeComplex();
		g2c3.addOutgoing().getTarget().addPrimitiveComparison();
		ComplexNode g2n4 = g2n3.addOutgoing().getTarget().makeComplex();
		g2n4.addOutgoing().getTarget().addPrimitiveComparison();
		ComplexNode g2c4 = g2c3.addOutgoing().getTarget().makeComplex();
		g2c4.addOutgoing().getTarget().addPrimitiveComparison();

		Comparison comp2 = g2n2.addOutgoing().getTarget().makePrimitive().addComparison(g2c3.addOutgoing().getTarget().makePrimitive());
		comp2.getTypeOption().setValue(ReturnType.STRING);
		Comparison comp3 = g2n3.addOutgoing().getTarget().makePrimitive().addComparison(g2c4.addOutgoing().getTarget().makePrimitive());
		comp3.getTypeOption().setValue(ReturnType.STRING);
		Comparison comp4 = g2n4.addOutgoing().getTarget().makePrimitive().addComparison(g2c2.addOutgoing().getTarget().makePrimitive());
		comp4.getTypeOption().setValue(ReturnType.STRING);
		
		return pattern;
	}
}
