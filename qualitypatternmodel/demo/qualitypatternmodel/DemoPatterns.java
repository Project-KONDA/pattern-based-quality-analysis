package qualitypatternmodel;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Element;
import qualitypatternmodel.graphstructure.GraphstructureFactory;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Condition;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.patternstructure.QuantifiedCondition;
import qualitypatternmodel.patternstructure.TrueElement;

public class DemoPatterns {
	
//	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		getGenericCompPattern().isValid(AbstractionLevel.GENERIC);
//		System.out.println(getGenericCompPattern().myToString());
//	}
	
	public static CompletePattern getGenericCompPattern () {
		
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.setName("Comp [generic]");
		
		Element element1 = completePattern.getGraph().getElements().get(0);
		element1.addPrimitiveComparison();
				
		QuantifiedCondition quantifiedCondition = factory.createQuantifiedCondition();
		completePattern.setCondition(quantifiedCondition);
		
		Element element2 = graphFactory.createElement();
		element2.setGraph(quantifiedCondition.getGraph());
		element2.addPrimitiveComparison();
		element2.addPrimitiveComparison();
		
		TrueElement trueElement = factory.createTrueElement();
		quantifiedCondition.setCondition(trueElement);
		
		return completePattern;			
	}
	
//	public static CompletePattern getAbstractCompPattern () {
//		
//	}
//
//	public static CompletePattern getConcreteCompPattern () {
//		
//	}

}
