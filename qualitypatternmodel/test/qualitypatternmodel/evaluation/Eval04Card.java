package qualitypatternmodel.evaluation;

import java.util.ArrayList;

import qualitypatternmodel.functions.Comparison;
import qualitypatternmodel.functions.Count;
import qualitypatternmodel.functions.FunctionsFactory;
import qualitypatternmodel.functions.FunctionsPackage;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.graphstructure.GraphstructurePackage;
import qualitypatternmodel.graphstructure.SetElement;
import qualitypatternmodel.graphstructure.SingleElement;
import qualitypatternmodel.parameters.ParametersFactory;
import qualitypatternmodel.parameters.ParametersPackage;
import qualitypatternmodel.parameters.UnknownParameterValue;
import qualitypatternmodel.patternstructure.Pattern;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.translationtests.Test00;
import qualitypatternmodel.translationtests.Test03Quantor;

public class Eval04Card {
	public static void main(String[] args) {
		ArrayList<Pattern> patterns = new ArrayList<Pattern>();
		patterns.add(getCardAbstract());
		Test00.test(patterns);
		
	}
	public static Pattern getCardAbstract() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		FunctionsPackage.eINSTANCE.eClass();
		FunctionsFactory functionsFactory = FunctionsFactory.eINSTANCE;	
		
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory parametersFactory = ParametersFactory.eINSTANCE;
		
		Pattern pattern = Test03Quantor.getPatternExists();
		SingleElement returnElementInReturnGraph = pattern.getGraph().getReturnElements().get(0);		
		
		returnElementInReturnGraph.addPrimitiveComparison(); 
		
		SingleElement returnElementInGraph1 = ((QuantifiedCondition) pattern.getCondition()).getGraph().getReturnElements().get(0);				
		SingleElement nextToReturnElementInGraph1 = returnElementInGraph1.getNextSingle().get(0);		
		nextToReturnElementInGraph1.addPrimitiveComparison(); 	
		
		SetElement setElement1InGraph1 = graphFactory.createSetElement();
		nextToReturnElementInGraph1.getNextSet().add(setElement1InGraph1);
		setElement1InGraph1.addPrimitiveComparison();
		setElement1InGraph1.addPrimitiveComparison();
		
		SetElement setElement2InGraph1 = graphFactory.createSetElement();
		setElement1InGraph1.getNext().add(setElement2InGraph1);
		setElement2InGraph1.addPrimitiveComparison();
		
		Comparison comparison = functionsFactory.createComparison();
		
		UnknownParameterValue unknownParameterValue = parametersFactory.createUnknownParameterValue();
		comparison.setArgument1(unknownParameterValue);
		
		Count count = functionsFactory.createCount();
		comparison.setArgument2(count);
		
		count.setArgument(setElement1InGraph1);
		
		comparison.getElements().add(nextToReturnElementInGraph1);
		
		return pattern;
	}
}
