package qualitypatternmodel.newservlets.patterns.external;

import java.util.Map;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;

public class FuncPattern extends PatternClass {

	public FuncPattern() {
		super(PatternConstants.FUNC_ID,
				PatternConstants.FUNC_NAME, 
				PatternConstants.FUNC_DESCR, 
				true, false, false, false);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		QuantifiedCondition qc = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();

		pattern.setCondition(qc);

		Graph g1 = pattern.getGraph();
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

		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____
	
	@Override
	protected Map<Integer, String> xmlMap(){
		return Map.of(2, "//*", 3, "/*/text()");
	}

}
