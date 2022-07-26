package qualitypatternmodel.evaluation;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.xmltranslationtests.Test03Quantor;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;

public class EvalFunc {

	public static CompletePattern getFuncGenericComp() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		
		Node returnElementInReturnGraph = completePattern.getGraph().getReturnNodes().get(0);	
		returnElementInReturnGraph.setName("return");
		returnElementInReturnGraph.addOutgoing().getTarget().addPrimitiveComparison(); 
		
		QuantifiedCondition quantifiedCondition = factory.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);
		Graph graph1 = quantifiedCondition.getGraph();
		Node returnElementInGraph1 = graph1.getReturnNodes().get(0);
		
		Node fieldAReturn = returnElementInGraph1.addOutgoing().getTarget().makeComplex();
		fieldAReturn.setName("fieldAReturn");
		Node fieldBReturn = returnElementInGraph1.addOutgoing().getTarget().makeComplex();
		fieldAReturn.setName("fieldBReturn");
		
		Node otherRecord = graphFactory.createComplexNode();
		otherRecord.setName("otherRecord");
		otherRecord.setGraph(graph1);
		
		Node fieldAOtherRecord = otherRecord.addOutgoing().getTarget().makeComplex();
		fieldAOtherRecord.setName("fieldAOtherRecord");
		Node fieldBOtherRecord = otherRecord.addOutgoing().getTarget().makeComplex();
		fieldBOtherRecord.setName("fieldBOtherRecord");
		
		fieldAReturn.addOutgoing().getTarget().addPrimitiveComparison();
		fieldBReturn.addOutgoing().getTarget().addPrimitiveComparison(); 
		otherRecord.addOutgoing().getTarget().addPrimitiveComparison(); 
		fieldAOtherRecord.addOutgoing().getTarget().addPrimitiveComparison(); 
		fieldBOtherRecord.addOutgoing().getTarget().addPrimitiveComparison(); 
				
		PrimitiveNode propertyAReturn = fieldAReturn.addOutgoing().getTarget().makePrimitive();
		propertyAReturn.setName("propertyAReturn");
		PrimitiveNode propertyAOtherRecord = fieldAOtherRecord.addOutgoing().getTarget().makePrimitive();
		propertyAOtherRecord.setName("propertyAOtherRecord");
		Comparison c1 = propertyAReturn.addComparison(propertyAOtherRecord);
		c1.getTypeOption().setValue(ReturnType.STRING);
		
		PrimitiveNode propertyBReturn = fieldBReturn.addOutgoing().getTarget().makePrimitive();
		propertyBReturn.setName("propertyBReturn");
		PrimitiveNode propertyBOtherRecord = fieldBOtherRecord.addOutgoing().getTarget().makePrimitive();
		propertyBOtherRecord.setName("propertyBOtherRecord");
		Comparison c2 = propertyBReturn.addComparison(propertyBOtherRecord);
		c2.getTypeOption().setValue(ReturnType.STRING);
		c2.getOption().setValue(ComparisonOperator.NOTEQUAL);
		return completePattern;
	}
	
	public static CompletePattern getFuncLidoGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
				
		CompletePattern completePattern = Test03Quantor.getPatternExistsWithRelation();
		
		Node returnElementInReturnGraph = completePattern.getGraph().getReturnNodes().get(0);				
		returnElementInReturnGraph.addOutgoing().getTarget().addPrimitiveComparison(); 
		
		Graph graph1 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
		Node below = graph1.getNodes().get(1).makeComplex();	
		below.addOutgoing().getTarget().addPrimitiveComparison();
		
		Node fieldAReturn = below.addOutgoing().getTarget().makeComplex();
		Node fieldBReturn = below.addOutgoing().getTarget().makeComplex();
		
		Node otherRecord = graphFactory.createComplexNode();
		otherRecord.setGraph(graph1);
		otherRecord.addOutgoing().getTarget().addPrimitiveComparison();
		
		Node fieldAOtherRecord = otherRecord.addOutgoing().getTarget().makeComplex();
		Node fieldBOtherRecord = otherRecord.addOutgoing().getTarget().makeComplex();
		
		fieldAReturn.addOutgoing().getTarget().addPrimitiveComparison(); 	
		fieldBReturn.addOutgoing().getTarget().addPrimitiveComparison(); 
		fieldAOtherRecord.addOutgoing().getTarget().addPrimitiveComparison(); 
		fieldBOtherRecord.addOutgoing().getTarget().addPrimitiveComparison(); 

		PrimitiveNode propertyAReturn = fieldAReturn.addOutgoing().getTarget().makePrimitive();
		PrimitiveNode propertyAOtherRecord = fieldAOtherRecord.addOutgoing().getTarget().makePrimitive();
		Comparison c3 = propertyAReturn.addComparison(propertyAOtherRecord);
		c3.getTypeOption().setValue(ReturnType.STRING);
		

		PrimitiveNode propertyBReturn = fieldBReturn.addOutgoing().getTarget().makePrimitive();
		PrimitiveNode propertyBOtherRecord = fieldBOtherRecord.addOutgoing().getTarget().makePrimitive();
		Comparison cx = propertyBReturn.addComparison(propertyBOtherRecord);
		cx.getTypeOption().setValue(ReturnType.STRING);
		cx.getOption().setValue(ComparisonOperator.NOTEQUAL);
		
		return completePattern;
	}
}
