package playground;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionxml.XmlAxisKind;
import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.parameters.NumberParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;

public class ExamplePattern2 {
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
		pattern.setPatternId("/");
		pattern.setDescription("/");

		// Record Node
		ComplexNode record = pattern.getGraph().getReturnNodes().get(0).makeComplex();
		record.setName("Record");

		Node field = record.addOutgoing().getTarget().makePrimitive();
		field.setName("Field");
		field.setReturnNode(true);

		return pattern;
	}

	private static CompletePattern concretizePattern(CompletePattern pattern) throws InvalidityException {
		EList<Parameter> params = pattern.getParameterList().getParameters();
		int i=0;
		for (Parameter p: pattern.getParameterList().getParameters()){
			System.out.println(p.getClass().getSimpleName().replace("Impl", "") + " p" + i + " = ((" + p.getClass().getSimpleName().replace("Impl", "") + ") params.get(" + i + "));");
			i++;
		}

		XmlPathParam p0 = ((XmlPathParam) params.get(0));
		XmlPathParam p1 = ((XmlPathParam) params.get(1));

		NumberParam number = ParametersFactory.eINSTANCE.createNumberParam();
		number.setValue(2023.);

		p0.setXmlAxis(XmlAxisKind.DESCENDANT, "architect");
		p1.setXmlAxis(XmlAxisKind.CHILD, "birthyear");

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
