package qualitypatternmodel.evaluationquality;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.xmltranslationtests.Test00;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;

public class EvalFunc {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();

//		completePatterns.add(getFuncGeneric());
//		completePatterns.add(getFunc2Generic());
//		completePatterns.add(getFuncCondGeneric());
		completePatterns.add(getFuncLidoGeneric());
		
		for (CompletePattern cp: completePatterns)
			Test00.printGenericPatternExampleXQuery(cp);
//			System.out.println(cp.myToString());
	}
	
	public static CompletePattern getFuncGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		
		completePattern.setCondition(qc);
		
		Graph g1 = completePattern.getGraph();
		Graph g2 = qc.getGraph();
		
		ComplexNode ret = g1.getNodes().get(0).makeComplex();
		ComplexNode other = g2.addComplexNode();
		
		PrimitiveNode fieldA1 = ret.addOutgoing(g2).getTarget().makePrimitive();
		PrimitiveNode fieldA2 = ret.addOutgoing(g2).getTarget().makePrimitive();
		PrimitiveNode fieldB1 = other.addOutgoing().getTarget().makePrimitive();
		PrimitiveNode fieldB2 = other.addOutgoing().getTarget().makePrimitive();
		
		Comparison c1 = fieldA1.addComparison(fieldB1);
		c1.getTypeOption().setValue(ReturnType.STRING);
		c1.getTypeOption().setPredefined(true);
		c1.getOption().setValue(ComparisonOperator.EQUAL);
		c1.getOption().setPredefined(true);

		Comparison c2 = fieldA2.addComparison(fieldB2);
		c2.getTypeOption().setValue(ReturnType.STRING);
		c2.getTypeOption().setPredefined(true);
		c2.getOption().setValue(ComparisonOperator.NOTEQUAL);
		c2.getOption().setPredefined(true);
		return completePattern;
	}
	
	public static CompletePattern getFunc2Generic() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		
		completePattern.setCondition(qc);
		
		Graph g1 = completePattern.getGraph();
		ComplexNode ret = g1.getNodes().get(0).makeComplex();
		
		Graph g2 = qc.getGraph();
		
		ComplexNode below = ret.addOutgoing(g2).getTarget().makeComplex();
		ComplexNode other = g2.addComplexNode();
		
		PrimitiveNode fieldA1 = below.addOutgoing().getTarget().makePrimitive();
		PrimitiveNode fieldA2 = below.addOutgoing().getTarget().makePrimitive();
		PrimitiveNode fieldB1 = other.addOutgoing().getTarget().makePrimitive();
		PrimitiveNode fieldB2 = other.addOutgoing().getTarget().makePrimitive();
		
		Comparison c1 = fieldA1.addComparison(fieldB1);
		c1.getTypeOption().setValue(ReturnType.STRING);
		c1.getTypeOption().setPredefined(true);
		c1.getOption().setValue(ComparisonOperator.EQUAL);
		c1.getOption().setPredefined(true);

		Comparison c2 = fieldA2.addComparison(fieldB2);
		c2.getTypeOption().setValue(ReturnType.STRING);
		c2.getTypeOption().setPredefined(true);
		c2.getOption().setValue(ComparisonOperator.NOTEQUAL);
		c2.getOption().setPredefined(true);
		return completePattern;
	}

//	public static CompletePattern getFuncCondGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		PatternstructurePackage.eINSTANCE.eClass();
//		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
//		GraphstructurePackage.eINSTANCE.eClass();
//		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
//		
//		CompletePattern completePattern = factory.createCompletePattern();
//		
//		Node returnElementInReturnGraph = completePattern.getGraph().getReturnNodes().get(0);	
//		returnElementInReturnGraph.setName("return");
//		returnElementInReturnGraph.addOutgoing().getTarget().addPrimitiveComparison(); 
//		
//		QuantifiedCondition quantifiedCondition = factory.createQuantifiedCondition();
//		completePattern.setCondition(quantifiedCondition);
//		Graph graph1 = quantifiedCondition.getGraph();
//		Node returnElementInGraph1 = graph1.getReturnNodes().get(0);
//		
//		Node fieldAReturn = returnElementInGraph1.addOutgoing().getTarget().makeComplex();
//		fieldAReturn.setName("fieldAReturn");
//		Node fieldBReturn = returnElementInGraph1.addOutgoing().getTarget().makeComplex();
//		fieldAReturn.setName("fieldBReturn");
//		
//		Node otherRecord = graphFactory.createComplexNode();
//		otherRecord.setName("otherRecord");
//		otherRecord.setGraph(graph1);
//		
//		Node fieldAOtherRecord = otherRecord.addOutgoing().getTarget().makeComplex();
//		fieldAOtherRecord.setName("fieldAOtherRecord");
//		Node fieldBOtherRecord = otherRecord.addOutgoing().getTarget().makeComplex();
//		fieldBOtherRecord.setName("fieldBOtherRecord");
//		
//		fieldAReturn.addOutgoing().getTarget().addPrimitiveComparison();
//		fieldBReturn.addOutgoing().getTarget().addPrimitiveComparison(); 
//		otherRecord.addOutgoing().getTarget().addPrimitiveComparison(); 
//		fieldAOtherRecord.addOutgoing().getTarget().addPrimitiveComparison(); 
//		fieldBOtherRecord.addOutgoing().getTarget().addPrimitiveComparison(); 
//				
//		PrimitiveNode propertyAReturn = fieldAReturn.addOutgoing().getTarget().makePrimitive();
//		propertyAReturn.setName("propertyAReturn");
//		PrimitiveNode propertyAOtherRecord = fieldAOtherRecord.addOutgoing().getTarget().makePrimitive();
//		propertyAOtherRecord.setName("propertyAOtherRecord");
//		Comparison c1 = propertyAReturn.addComparison(propertyAOtherRecord);
//		c1.getTypeOption().setValue(ReturnType.STRING);
//		
//		PrimitiveNode propertyBReturn = fieldBReturn.addOutgoing().getTarget().makePrimitive();
//		propertyBReturn.setName("propertyBReturn");
//		PrimitiveNode propertyBOtherRecord = fieldBOtherRecord.addOutgoing().getTarget().makePrimitive();
//		propertyBOtherRecord.setName("propertyBOtherRecord");
//		Comparison c2 = propertyBReturn.addComparison(propertyBOtherRecord);
//		c2.getTypeOption().setValue(ReturnType.STRING);
//		c2.getOption().setValue(ComparisonOperator.NOTEQUAL);
//		return completePattern;
//	}
	
	public static CompletePattern getFuncLidoGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		
		completePattern.setCondition(qc);
		
//		Graph g1 = completePattern.getGraph();
		Graph g2 = qc.getGraph();
		
		ComplexNode return0 = completePattern.getGraph().getReturnNodes().get(0).makeComplex();
		return0.addOutgoing().getTarget().addPrimitiveComparison();
		
		ComplexNode below = return0.addOutgoing(g2).getTarget().makeComplex();
		below.addOutgoing().getTarget().addPrimitiveComparison();
		
		ComplexNode other = g2.addComplexNode();
		other.addOutgoing().getTarget().addPrimitiveComparison();
		
		ComplexNode fieldA1 = below.addOutgoing().getTarget().makeComplex();
		ComplexNode fieldA2 = below.addOutgoing().getTarget().makeComplex();
		ComplexNode fieldB1 = other.addOutgoing().getTarget().makeComplex();
		ComplexNode fieldB2 = other.addOutgoing().getTarget().makeComplex();
		
		fieldA1.addOutgoing().getTarget().addPrimitiveComparison();
		fieldA2.addOutgoing().getTarget().addPrimitiveComparison();
		fieldB1.addOutgoing().getTarget().addPrimitiveComparison();
		fieldB2.addOutgoing().getTarget().addPrimitiveComparison();
		
		PrimitiveNode propertyA1 = fieldA1.addOutgoing().getTarget().makePrimitive();
		PrimitiveNode propertyB1 = fieldB1.addOutgoing().getTarget().makePrimitive();
		Comparison c1 = propertyA1.addComparison(propertyB1);
		c1.getTypeOption().setValue(ReturnType.STRING);

		PrimitiveNode propertyA2 = fieldA2.addOutgoing().getTarget().makePrimitive();
		PrimitiveNode propertyB2 = fieldB2.addOutgoing().getTarget().makePrimitive();
		Comparison c2 = propertyA2.addComparison(propertyB2);
		c2.getTypeOption().setValue(ReturnType.STRING);
		c2.getOption().setValue(ComparisonOperator.NOTEQUAL);
		return completePattern;
	}
}
