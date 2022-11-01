package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.CountPattern;
import qualitypatternmodel.patternstructure.NumberElement;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.Quantifier;
import qualitypatternmodel.xmltranslationtests.Test00;

public class EvalExDup {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();

		completePatterns.add(getExDupGeneric());
		completePatterns.add(getExDupCondGeneric());

		for (CompletePattern cp: completePatterns)
			Test00.printGenericPatternExampleXQuery(cp);
//			System.out.println(cp.myToString());
	}
	
	public static CompletePattern getExDupGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
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
		other.setReturnNode(true);;
		
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

	public static CompletePattern getExDupCondGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {	
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();;
		completePattern.getGraph().getReturnNodes().get(0).addOutgoing().getTarget().addPrimitiveComparison();
		
		CountCondition countCondition = factory.createCountCondition();
		completePattern.setCondition(countCondition);		
		countCondition.getOption().getOptions().add(ComparisonOperator.GREATER);
		countCondition.getOption().setValue(ComparisonOperator.GREATER);
		
		CountPattern countPattern = factory.createCountPattern();

		NumberElement numberElement = factory.createNumberElement();
		countCondition.setArgument2(numberElement);
		NumberParam numberParam = numberElement.getNumberParam();
		countCondition.setCountPattern(countPattern);
		
		Node returnInCPattern = countPattern.getGraph().getNodes().get(0);
		
		ComplexNode otherRecord = graphFactory.createComplexNode();
		otherRecord.setGraph(countPattern.getGraph());
		otherRecord.addOutgoing().getTarget().addPrimitiveComparison();			
		countPattern.getGraph().getReturnNodes().get(0).setReturnNode(false);
		otherRecord.setReturnNode(true);
				
		Condition truecondition = factory.createTrueElement();
		countPattern.setCondition(truecondition);
		
		Comparison c = returnInCPattern.addComparison(otherRecord);
		c.getTypeOption().setValue(ReturnType.ELEMENT);
		numberParam.setValue(1.0);
		completePattern.myToString();
		return completePattern;
	}
}
