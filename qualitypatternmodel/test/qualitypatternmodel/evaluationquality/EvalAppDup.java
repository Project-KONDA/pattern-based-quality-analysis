package qualitypatternmodel.evaluationquality;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.impl.TextLiteralParamImpl;
import qualitypatternmodel.xmltranslationtests.Test00;

public class EvalAppDup {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		
		completePatterns.add(getAppDup2Generic());
		completePatterns.add(getAppDup3Generic());
		completePatterns.add(getAppDup3CondGeneric());
		completePatterns.add(getAppDupCountGeneric());
		
		for (CompletePattern cp: completePatterns)
			Test00.printGenericPatternExampleXQuery(cp);
//			System.out.println(cp.myToString());
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
		Node main1 = g1.getNodes().get(0);
		Node other1 = g1.getNodes().get(1);
		
		c.getOption().setValue(ComparisonOperator.NOTEQUAL);
		
		Node n1 = main1.addOutgoing().getTarget().makePrimitive();
		other1.addOutgoing(n1);

		QuantifiedCondition qc2 = factory.createQuantifiedCondition();
		qc1.setCondition(qc2);
		
		Graph g2 = qc2.getGraph();
		Node main2 = g2.getNodes().get(0);
		Node other2 = g2.getNodes().get(1);
		
		Node n2 = main2.addOutgoing().getTarget().makePrimitive();
		other2.addOutgoing(n2);
		
		return completePattern;
	}

	public static CompletePattern getAppDup3Generic() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = getAppDup2Generic();

		QuantifiedCondition qc1 = (QuantifiedCondition) completePattern.getCondition();
		QuantifiedCondition qc2 = (QuantifiedCondition) qc1.getCondition();
		
		QuantifiedCondition qc3 = factory.createQuantifiedCondition();
		qc2.setCondition(qc3);
		
		Graph g2 = qc3.getGraph();
		Node main2 = g2.getNodes().get(0);
		Node other2 = g2.getNodes().get(1);
		
		Node n2 = main2.addOutgoing().getTarget().makePrimitive();
		other2.addOutgoing(n2);
		
		return completePattern;
	}

	public static CompletePattern getAppDup3CondGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory paramFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();;
		
		CountCondition cc = factory.createCountCondition();
		completePattern.setCondition(cc);
		CountPattern cp = factory.createCountPattern();
		NumberElement ne = factory.createNumberElement();
		cc.setArgument2(ne);
		ne.getNumberParam().setValue(1.);
		cc.getOption().setValue(ComparisonOperator.GREATER);
		cc.setCountPattern(cp);
		
		QuantifiedCondition qc = factory.createQuantifiedCondition();
		cp.setCondition(qc);
		Graph g0 = completePattern.getGraph();
		{
			ComplexNode n01 = g0.getNodes().get(0).makeComplex();
			n01.setName("OriginalDataSet");
			Relation r01 = n01.addOutgoing();
			Node n02 = r01.getTarget();
			n02 = n02.makePrimitive();
			n02.addPrimitiveComparison(paramFactory.createTextLiteralParam());			
		}
		
		Graph g1 = ((CountCondition)completePattern.getCondition()).getCountPattern().getGraph();
		{
			g1.getReturnNodes().get(0).setReturnNode(false);
			ComplexNode n13 = g1.addComplexNode();
			n13.setName("ComparedDataset");
			n13.setReturnNode(true);
			Relation r12 = n13.addOutgoing();
			Node n14 = r12.getTarget();
			n14 = n14.makePrimitive();
			n14.addPrimitiveComparison(paramFactory.createTextLiteralParam());	
		}
		
		Graph g2 = ((QuantifiedCondition)((CountPattern) g1.getContainer()).getCondition()).getGraph();
		{	
			ComplexNode n21 = (ComplexNode) g2.getNodes().get(0);
			ComplexNode n22 = (ComplexNode) g2.getNodes().get(2);
			
			for (int i = 0; i<3; i++) {
				Relation r = n21.addOutgoing();
				Relation r2 = n22.addOutgoing();
				Node node1 = r.getTarget().makeComplex();
				Node node2 = r2.getTarget().makeComplex();

				Relation rel0 = node1.addOutgoing();
				Relation rel1 = node2.addOutgoing();
				PrimitiveNode value1 = rel0.getTarget().makePrimitive();
				PrimitiveNode value2 = rel1.getTarget().makePrimitive();
				
				TextLiteralParamImpl rlp = (TextLiteralParamImpl) value1.addPrimitiveComparison(new TextLiteralParamImpl());
				value2.addPrimitiveComparison(rlp);
				
				Relation rel2 = node1.addOutgoing();
				Relation rel3 = node2.addOutgoing();
				PrimitiveNode value3 = rel2.getTarget().makePrimitive();
				PrimitiveNode value4 = rel3.getTarget().makePrimitive();
				
				value3.addComparison(value4).getTypeOption().setValue(ReturnType.STRING);
			}			
		}
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
	
	public static CompletePattern getUniVio() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		completePattern.getGraph().getReturnNodes().get(0).setName("main");
		completePattern.setName("UNIQUENESS VIOLATION");
		
		ComplexNode main = (ComplexNode) completePattern.getGraph().getReturnNodes().get(0);
				
		QuantifiedCondition qc1 = factory.createQuantifiedCondition();
		completePattern.setCondition(qc1);
		
		ComplexNode other = qc1.getGraph().addComplexNode();
		other.setName("Entry");
		
		Graph g1 = qc1.getGraph();
		Node main1 = g1.getNodes().get(0);
		Node other1 = g1.getNodes().get(1);
		
		Comparison c = main1.addComparison(other);

		c.getOption().setValue(ComparisonOperator.NOTEQUAL);
		
		PrimitiveNode n1 = main1.addOutgoing().getTarget().makePrimitive();
		PrimitiveNode n2 = other1.addOutgoing().getTarget().makePrimitive();
		
		n1.addComparison(n2);
		
		return completePattern;
	}
}
