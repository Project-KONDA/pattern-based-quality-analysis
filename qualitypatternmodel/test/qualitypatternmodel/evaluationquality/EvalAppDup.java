package qualitypatternmodel.evaluationquality;

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
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.xmltranslationtests.Test00;

public class EvalAppDup {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();

		completePatterns.add(getAppDup2Generic());
		completePatterns.add(getAppDup3Generic());
		completePatterns.add(getAppDupCountGeneric());

		for (CompletePattern cp: completePatterns) {
			Test00.printGenericPatternExampleXQuery(cp);
//			System.out.println(cp.myToString());
		}
	}

	public static CompletePattern getAppDup2Generic() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;

		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		completePattern.getGraph().getReturnNodes().get(0).setName("main");

		ComplexNode main = (ComplexNode) completePattern.getGraph().getReturnNodes().get(0);
		ComplexNode other = graphFactory.createComplexNode();
		other.setName("other");
		other.setReturnNode(true);
		other.setGraph(completePattern.getGraph());
		Comparison c = main.addComparison(other);


		QuantifiedCondition qc1 = factory.createQuantifiedCondition();
		completePattern.setCondition(qc1);

		Graph g1 = qc1.getGraph();

		c.getOption().setValue(ComparisonOperator.NOTEQUAL);
		c.getOption().setPredefined(true);

		Node n1 = main.addOutgoing(g1).getTarget().makePrimitive();
		other.addOutgoing(n1);

		Node n2 = main.addOutgoing(g1).getTarget().makePrimitive();
		other.addOutgoing(n2);

		return completePattern;
	}

	public static CompletePattern getAppDup3Generic() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();

		CompletePattern completePattern = getAppDup2Generic();
		Graph g0 = completePattern.getGraph();
		QuantifiedCondition qc1 = (QuantifiedCondition) completePattern.getCondition();
		Graph g1 = qc1.getGraph();

		Node main = g0.getNodes().get(0);
		Node other = g0.getNodes().get(1);

		Node n2 = main.addOutgoing(g1).getTarget().makePrimitive();
		other.addOutgoing(n2);

		return completePattern;
	}

	public static CompletePattern getAppDupCountGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
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

		Node n3 = main.addOutgoing(g).getTarget();
		other.addOutgoing(n3);
		n3.setReturnNode(true);

		NumberElement numberElement = PatternstructureFactory.eINSTANCE.createNumberElement();
		cc.setArgument2(numberElement);
		numberElement.getNumberParam().setValue(10.);
		cc.getOption().setValue(ComparisonOperator.GREATER);

		return completePattern;
	}

	public static CompletePattern getUniVio() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;

		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		completePattern.getGraph().getReturnNodes().get(0).setName("main");
		completePattern.setPatternId("UNIQUENESS VIOLATION");

//		ComplexNode main = (ComplexNode)
		ComplexNode ret = completePattern.getGraph().getReturnNodes().get(0).makeComplex();

		QuantifiedCondition qc1 = factory.createQuantifiedCondition();
		completePattern.setCondition(qc1);

		ComplexNode other = qc1.getGraph().addComplexNode();
		other.setName("Entry");

		Graph g1 = qc1.getGraph();
//		Node main1 = g1.getNodes().get(0);
//		Node other1 = g1.getNodes().get(1);

		Comparison c = ret.addComparison(other);

		c.getOption().setValue(ComparisonOperator.NOTEQUAL);

		PrimitiveNode n1 = ret.addOutgoing(g1).getTarget().makePrimitive();
		PrimitiveNode n2 = other.addOutgoing().getTarget().makePrimitive();

		n1.addComparison(n2);

		return completePattern;
	}
}
