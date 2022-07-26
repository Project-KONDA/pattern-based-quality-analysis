package qualitypatternmodel.evaluation;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;

public class EvalDup {

	public static CompletePattern getExactDuplicatesGeneric2() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		Node main = completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		main.setName("main");
		
		ComplexNode other = graphFactory.createComplexNode();
		other.setGraph(completePattern.getGraph());
		other.setName("other");
		other.setReturnNode(true);
		
		Comparison c = main.addComparison(other);
		c.getOption().setValue(ComparisonOperator.NOTEQUAL);
				
		CountCondition cc = factory.createCountCondition();
		completePattern.setCondition(cc);
		cc.createCountPattern();
		CountPattern cp = cc.getCountPattern();
		Graph g = cp.getGraph();
		
		Node n1 = g.getNodes().get(0);
		Node n2 = g.getNodes().get(1);
		Node n3 = n1.addOutgoing().getTarget().makePrimitive();
		n1.setReturnNode(false);
		n3.setReturnNode(true);
		n2.addOutgoing(n3);
		
		NumberElement numberElement = PatternstructureFactory.eINSTANCE.createNumberElement();
		cc.setArgument2(numberElement);
		numberElement.getNumberParam().setValue(10.);
		cc.getOption().setValue(ComparisonOperator.GREATER);
		
		return completePattern;
		
	}
		public static CompletePattern getExactDuplicatesGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		Node main = completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		main.setName("main");
		
		ComplexNode other = graphFactory.createComplexNode();
		other.setGraph(completePattern.getGraph());
		other.setName("other");
		
		Comparison c = main.addComparison(other);
		c.getOption().setValue(ComparisonOperator.NOTEQUAL);
		
		QuantifiedCondition qc = factory.createQuantifiedCondition();
		completePattern.setCondition(qc);
		qc.setQuantifier(Quantifier.FORALL);
		Node n1 = qc.getGraph().getNodes().get(0);
		n1.addOutgoing().getTarget().makePrimitive();
		
		QuantifiedCondition qc2 = factory.createQuantifiedCondition();
		qc.setCondition(qc2);
		qc2.setQuantifier(Quantifier.EXISTS);

		Node no2 = qc2.getGraph().getNodes().get(1);
		Node no3 = qc2.getGraph().getNodes().get(2);
		
		no2.addOutgoing(no3);
		
		return completePattern;
	}
}
