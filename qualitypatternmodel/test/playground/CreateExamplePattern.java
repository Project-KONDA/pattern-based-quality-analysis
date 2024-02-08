package playground;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.UntypedParameterValue;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class CreateExamplePattern {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		System.out.println("__ Generic Pattern __");
		CompletePattern genericPattern  = genericPattern();
		System.out.println(genericPattern.myToString() + "\n");
		
		System.out.println("__ Abstract Pattern __");
		CompletePattern abstractPattern = (CompletePattern) genericPattern.createXmlAdaption();
		System.out.println(abstractPattern.myToString() + "\n");
		
		System.out.println("__ Concrete Pattern __");
		CompletePattern concretePattern = concretizePattern(abstractPattern);
		System.out.println(concretePattern.myToString() + "\n");

		System.out.println("__ Query __");
		String query = translatePattern(concretePattern);
		System.out.println(query);
		
	}

	private static CompletePattern genericPattern() throws InvalidityException {

		// Create Pattern
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId("COMPVAL2");
		pattern.setDescription("Compare a attribute value with a constant");
		
		// Record Node
		ComplexNode record = pattern.getGraph().getReturnNodes().get(0).makeComplex();
		record.setName("Record");
		
		// Add EXISTS Condition
		QuantifiedCondition exists = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(exists);
		
		// Field Node in Condition
		Node recordCopy = exists.getGraph().getReturnNodes().get(0);
		Node field = recordCopy.addOutgoing().getTarget().makePrimitive();
		field.setName("Field");

		// Add Comparison
		field.addPrimitiveComparison();
		
		return pattern;		
	}

	private static CompletePattern concretizePattern(CompletePattern pattern) throws InvalidityException {
		
		EList<Parameter> params = pattern.getParameterList().getParameters();
		
		UntypedParameterValue p0 = ((UntypedParameterValue) params.get(0));
		ComparisonOptionParam p1 = ((ComparisonOptionParam) params.get(1));
//		TypeOptionParam p2 = ((TypeOptionParam) params.get(2));
		XmlPathParam p3 = ((XmlPathParam) params.get(3));
		XmlPathParam p4 = ((XmlPathParam) params.get(4));

		NumberParam number = ParametersFactory.eINSTANCE.createNumberParam();
		number.setValue(2023.);
		
		p0.replace(number);
		p1.setValue(ComparisonOperator.GREATER);
		p3.setXmlAxis(XmlAxisKind.DESCENDANT, "architect");
		p4.setXmlAxis(XmlAxisKind.CHILD, "birthyear");
		
		return pattern;	
	}

	private static String translatePattern(CompletePattern pattern) {
		String query = "";
		try {
			query = pattern.generateXQuery();
		} catch (InvalidityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return query;
	}
}
