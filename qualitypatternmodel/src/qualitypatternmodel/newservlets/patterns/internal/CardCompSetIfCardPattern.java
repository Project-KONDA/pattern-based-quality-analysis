package qualitypatternmodel.newservlets.patterns.internal;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.newservlets.initialisation.PatternConstants;
import qualitypatternmodel.newservlets.patterns.PatternClass;
import qualitypatternmodel.parameters.TextListParam;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.CountCondition;
import qualitypatternmodel.patternstructure.Formula;
import qualitypatternmodel.patternstructure.NotCondition;

public class CardCompSetIfCardPattern extends PatternClass {

	public CardCompSetIfCardPattern() {
		super(PatternConstants.CARDCOMPSETIFCARD_ID,
				PatternConstants.CARDCOMPSETIFCARD_NAME, 
				PatternConstants.CARDCOMPSETIFCARD_DESCR, 
				true, true, true, false);
	}

	@Override
	public CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = new CardIfCardPattern().getPattern();
		Formula form = (Formula) pattern.getCondition();
		NotCondition not = (NotCondition) form.getCondition2();
		CountCondition count = (CountCondition) not.getCondition();
		Graph countgraph = count.getCountPattern().getGraph();
		PrimitiveNode node = countgraph.getReturnNodes().get(0).makePrimitive();

		TextListParam list = new TextListParamImpl();
		node.addComparison(list);
		
		return pattern;
	}

	// _____ LANGUAGE SPECIFIC OPTIONS _____

}



		

//    	If a <LIDO-Record> has it has <at least> <two> <Title Set>, it has <at least> <one> <@Pref> that <Is> in the list of <preferred, bevorzugt, LIDO-URI> .
//    	
//    	LIDO RECORDS
//    			COUNT CONDITION
//    		AND 
//    			COUNT CONDITION ( LIST CONDITION )
		
		
