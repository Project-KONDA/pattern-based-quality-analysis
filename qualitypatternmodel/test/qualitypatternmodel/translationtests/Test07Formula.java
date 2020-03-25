package qualitypatternmodel.translationtests;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.*;
import qualitypatternmodel.patternstructure.impl.*;
import qualitypatternmodel.testutilityclasses.PatternTestPair;
import qualitypatternmodel.graphstructure.*;
import qualitypatternmodel.graphstructure.impl.*;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.functions.*;
import qualitypatternmodel.functions.impl.*;
import qualitypatternmodel.parameters.*;
import qualitypatternmodel.parameters.impl.*;

public class Test07Formula {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<Pattern> patterns = new ArrayList<Pattern>();
		
		for (LogicalOperator lo: LogicalOperator.VALUES) {
			patterns.add(getFormulaPattern(lo));
		}

		Test00.test(patterns);
	}
	
	public static Pattern getFormulaPattern(LogicalOperator op) {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		
		Pattern pattern = factory.createPattern();
		Formula form = factory.createFormula();
		pattern.setCondition(form);
		form.setOperator(op);

		QuantifiedCondition qc1 = factory.createQuantifiedCondition();
		TrueElement te1 = factory.createTrueElement();
		QuantifiedCondition qc2 = factory.createQuantifiedCondition();
		TrueElement te2 = factory.createTrueElement();
		
		form.setCondition1(qc1);
		qc1.setCondition(te1);
		form.setCondition2(qc2);
		qc2.setCondition(te2);

		qc1.getGraph().getReturnElements().get(0).getNextElements().add(graphFactory.createElement());
		qc2.getGraph().getReturnElements().get(0).getNextElements().add(graphFactory.createElement());
		
		return pattern;
	}
	
	
	public static List<PatternTestPair> getTestPairs(){
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();
		
		return testPairs;		
	}

}
