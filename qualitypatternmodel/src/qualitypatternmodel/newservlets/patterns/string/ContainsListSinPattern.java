package qualitypatternmodel.newservlets.patterns.string;

import qualitypatternmodel.adaptionxml.XmlPathParam;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.operators.Contains;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.utility.PatternUtility;

public class ContainsListSinPattern extends PatternClass {
	
	

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = new ContainsListSinPattern().getXmlPattern();
		
		PatternUtility.fillParameter(pattern);
		System.out.println(pattern.getParameterList().getParameters().get(2).myToString());
		XmlPathParam p = ((XmlPathParam) pattern.getParameterList().getParameters().get(2));
		p.setValueFromString("['//*/@test','//*/@test2']");
		System.out.println(pattern.myToString());
		System.out.println(pattern.generateXQuery());
	}

	public ContainsListSinPattern() {
		super(PatternConstants.CONTAINSLISTSIN_ID,
				PatternConstants.CONTAINSLISTSIN_NAME, 
				PatternConstants.CONTAINSLISTSIN_DESCR, 
				true, true, false, false);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();

		PrimitiveNode element1 = pattern.getGraph().getReturnNodes().get(0).makePrimitive();

		Contains contains = element1.addPrimitiveContainsList();

		QuantifiedCondition quantifiedCondition = PatternstructureFactory.eINSTANCE.createQuantifiedCondition();
		pattern.setCondition(quantifiedCondition);

		contains.setOperatorList(quantifiedCondition.getGraph().getOperatorList());
		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}
