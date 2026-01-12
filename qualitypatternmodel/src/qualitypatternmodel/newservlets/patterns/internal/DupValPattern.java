package qualitypatternmodel.newservlets.patterns.internal;

import java.util.List;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.newservlets.ServletConstants;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.impl.NumberElementImpl;

public class DupValPattern extends PatternClass {
	
	public static void main (String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		
		CompletePattern pattern = new DupValPattern().getXmlPattern();
		
		List<Parameter> params = pattern.getParameterList().getParameters();
		params.get(0).setValueFromString("GREATER"); // ComparisonOptionParam
		params.get(1).setValueFromString("1.0"); // NumberParam
		params.get(2).setValueFromString("EQUAL"); // ComparisonOptionParam
		params.get(3).setValueFromString("STRING"); // TypeOptionParam
		params.get(4).setValueFromString("/*//*"); // XmlPathParam
		params.get(5).setValueFromString("//*/text()"); // XmlPathParam Property
		params.get(6).setValueFromString("//*/text()"); // XmlPathParam Property
		
		System.out.println(pattern.generateXQuery());
		
	}

	public DupValPattern() {
		super(PatternConstants.DUPVAL_ID,
				PatternConstants.DUPVAL_NAME, 
				PatternConstants.DUPVAL_DESCR, 
				true, true, true, false);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		ComplexNode main = pattern.getGraph().getReturnNodes().get(0).makeComplex();
		main.setName("main");

		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(qc);

		PrimitiveNode field = main.addOutgoing(qc.getGraph()).getTarget().makePrimitive();
		field.setName("field");

		CountCondition countCondition = PatternstructureFactory.eINSTANCE.createCountCondition();
		qc.setCondition(countCondition);
		countCondition.createCountPattern();
		NumberElementImpl ne = new NumberElementImpl();
		countCondition.setArgument2(ne);
		ne.createParameters();

		if (ServletConstants.FILL_VALUES) {
			ne.getNumberParam().setValue(1.);
			countCondition.getOption().setValue(ComparisonOperator.GREATER);
		}

		Relation rel = main.addOutgoing(countCondition.getCountPattern().getGraph());
		PrimitiveNode field2 = rel.getTarget().makePrimitive();
		field2.setName("field2");
		field2.setReturnNode(true);
		Comparison c = field2.addComparison(field);
		ComparisonOptionParam comparisonOption = c.getOption();
		comparisonOption.setValue(ComparisonOperator.EQUAL);
		comparisonOption.setPredefined(true);

		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
