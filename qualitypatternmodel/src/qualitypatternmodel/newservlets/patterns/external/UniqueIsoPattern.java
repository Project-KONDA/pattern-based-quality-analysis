package qualitypatternmodel.newservlets.patterns.external;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.operators.Comparison;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.impl.NumberElementImpl;
import qualitypatternmodel.utility.PatternUtility;

public class UniqueIsoPattern extends PatternClass {

	public UniqueIsoPattern() {
		super(PatternConstants.UNIQUEISO_ID,
				PatternConstants.UNIQUEISO_NAME, 
				PatternConstants.UNIQUEISO_DESCR, 
				true, true, true, false);
	}
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = new UniqueIsoPattern().getPattern();
		System.out.println(pattern.myToString());
		pattern.createRdfAdaption();
		PatternUtility.fillParameter(pattern);
		System.out.println(pattern.generateSparql());
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		// Context graph of pattern:
		Node baseNode = pattern.getGraph().getNodes().get(0).makeComplex();
		Node returnNode = baseNode.addOutgoing().getTarget().makePrimitive();

		// First-order logic condition of pattern:
		CountCondition countCondition = PatternstructureFactory.eINSTANCE.createCountCondition();
		pattern.setCondition(countCondition);
		countCondition.createCountPattern();
		NumberElementImpl ne = new NumberElementImpl();
		countCondition.setArgument2(ne);
		ne.createParameters();
		
		
		Node countBase = countCondition.getCountPattern().getGraph().addNode().makeComplex();
		Node countReturn = countBase.addOutgoing().getTarget().makePrimitive();
		Comparison c = countReturn.addComparison(returnNode);
		countReturn.setReturnNode(true);
		
		c.getOption().setValue(ComparisonOperator.EQUAL);
		c.getOption().setPredefined(true);
		c.getTypeOption().setPredefined(true);
		c.getTypeOption().setValue(ReturnType.STRING);
		countCondition.getOption().setValue(ComparisonOperator.NOTEQUAL);
		countCondition.getOption().setPredefined(true);
		ne.getNumberParam().setValue(1.);
		ne.getNumberParam().setPredefined(true);
		

		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
