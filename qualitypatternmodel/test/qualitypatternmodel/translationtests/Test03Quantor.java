package qualitypatternmodel.translationtests;
import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.testutilityclasses.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.parameters.*;
import qualitypatternmodel.functions.*;

public class Test03Quantor {

	public static void main(String[] args) {
//		System.out.println(getPatternExists().myToString());
		
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getPatternExists());
		completePatterns.add(getPatternExistsCond());
		completePatterns.add(getPatternForall());
		completePatterns.add(getPatternForallCond());

		Test00.test(completePatterns);
	}

	public static CompletePattern getPatternExists() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		// Pattern Structure
		CompletePattern completePattern = Test00.getBasePattern();
		QuantifiedCondition cond = factory.createQuantifiedCondition();
		cond.setCondition(factory.createTrueElement());
		completePattern.setCondition(cond);
				
		// EXISTS additional graph structure
		Element se2 = graphFactory.createElement();
		cond.getGraph().getReturnElements().get(0).getNextElements().add(se2);		
		
		return completePattern;
	}


	public static CompletePattern getPatternExistsCond() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		FunctionsPackage.eINSTANCE.eClass();
		FunctionsFactory functionFactory = FunctionsFactory.eINSTANCE;
		ParametersPackage.eINSTANCE.eClass();
		ParametersFactory inputFactory = ParametersFactory.eINSTANCE;
		
		CompletePattern completePattern = getPatternExists();
//		VariableList varlist = pattern.getVariableList();
		Graph graph2 = ((QuantifiedCondition) completePattern.getCondition()).getGraph();
//		OperatorList oplist = graph2.getOperatorList();
		Element last = graph2.getRootElement().getNextElements().get(0).getNextElements().get(0);
		last.addPrimitiveComparison("myvalue");
//		Comparison comp = functionFactory.createComparison();
//		oplist.add(comp);
//			
//		Property prop = graphFactory.createProperty();
//		last.getProperties().add(prop);
//		comp.setArgument1(prop);
//		
//		TextLiteral textlit = inputFactory.createTextLiteral();
//		textlit.setValue("myvalue");
//		varlist.add(textlit);
//		
//		comp.setArgument2(textlit);
		return completePattern;
	}

	public static CompletePattern getPatternForall() {		
		CompletePattern completePattern = getPatternExists();
		QuantifiedCondition cond1 = (QuantifiedCondition) completePattern.getCondition();
		cond1.setQuantifier(Quantifier.FORALL);
		return completePattern;
	}

	public static CompletePattern getPatternForallCond() {		
		CompletePattern completePattern = getPatternExistsCond();
		QuantifiedCondition cond1 = (QuantifiedCondition) completePattern.getCondition();
		cond1.setQuantifier(Quantifier.FORALL);		
		return completePattern;
	}
	
	public static List<PatternTestPair> getTestPairs(){
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		testPairs.add(new PatternTestPair("EXISTS", 	getPatternExists(), 	""));
		testPairs.add(new PatternTestPair("EXISTSCOND", getPatternExistsCond(), ""));
		testPairs.add(new PatternTestPair("FORALL",		getPatternForall(), 	""));
		testPairs.add(new PatternTestPair("FORALLCOND", getPatternForallCond(), ""));
		// ...
		return testPairs;		
	}
}
