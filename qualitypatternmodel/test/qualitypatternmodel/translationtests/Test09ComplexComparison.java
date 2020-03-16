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
import qualitypatternmodel.inputfields.*;
import qualitypatternmodel.inputfields.Boolean;
import qualitypatternmodel.inputfields.Number;
import qualitypatternmodel.inputfields.impl.*;

public class Test09ComplexComparison {

	public static void main(String[] args)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {

		ArrayList<Pattern> patterns = new ArrayList<Pattern>();
//		patterns.add(getPatternSelfTwoProps());
//		patterns.add(getPatternTwoProps());
		patterns.add(getPatternTwoSEs());
		
		Test00.test(patterns);
	}

	public static Pattern getPatternSelfTwoProps() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		FunctionsPackage.eINSTANCE.eClass();
		FunctionsFactory functionFactory = FunctionsFactory.eINSTANCE;

		Pattern pattern = Test00.getBasePattern();
		SingleElement ret = pattern.getGraph().getReturnElements().get(0);
		
		Property p1 = graphFactory.createProperty();
		Property p2 = graphFactory.createProperty();
		
		Comparison comp = functionFactory.createComparison();
		
		pattern.getGraph().getOperatorList().add(comp);
		ret.getProperties().add(p1);
		ret.getProperties().add(p2);
		
		p1.getOption().setValue(PropertyLocation.TAG);
		
		comp.setArgument1(p1);
		comp.setArgument2(p2);
		comp.setType(ReturnType.STRING);

		return pattern;
	}

	public static Pattern getPatternTwoProps() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		FunctionsPackage.eINSTANCE.eClass();
		FunctionsFactory functionFactory = FunctionsFactory.eINSTANCE;

		Pattern pattern = Test00.getBasePattern();
		SingleElement ret = pattern.getGraph().getReturnElements().get(0);

		SingleElement se1 = graphFactory.createSingleElement();
		SingleElement se2 = graphFactory.createSingleElement();

		ret.getNextSingle().add(se1);
		ret.getNextSingle().add(se2);
		
		Property p1 = graphFactory.createProperty();
		Property p2 = graphFactory.createProperty();
		
		Comparison comp = functionFactory.createComparison();
		
		pattern.getGraph().getOperatorList().add(comp);
		se1.getProperties().add(p1);
		se2.getProperties().add(p2);
		
		p1.getOption().setValue(PropertyLocation.TAG);
		
		comp.setArgument1(p1);
		comp.setArgument2(p2);
		comp.setType(ReturnType.STRING);

		return pattern;
	}

	public static Pattern getPatternTwoSEs() {
		GraphstructurePackage.eINSTANCE.eClass();
		GraphstructureFactory graphFactory = GraphstructureFactory.eINSTANCE;
		FunctionsPackage.eINSTANCE.eClass();
		FunctionsFactory functionFactory = FunctionsFactory.eINSTANCE;

		Pattern pattern = Test00.getBasePattern();
		SingleElement ret = pattern.getGraph().getReturnElements().get(0);

		SingleElement se1 = graphFactory.createSingleElement();
		SingleElement se2 = graphFactory.createSingleElement();

		ret.getNextSingle().add(se1);
		ret.getNextSingle().add(se2);
		
		Comparison comp = functionFactory.createComparison();
		
		pattern.getGraph().getOperatorList().add(comp);
		comp.setArgument1(se1);
		comp.setArgument2(se2);
		comp.setType(ReturnType.ELEMENT);

		return pattern;
	}	
	
	
	

	public static List<PatternTestPair> getTestPairs() {
		List<PatternTestPair> testPairs = new ArrayList<PatternTestPair>();

		return testPairs;
	}

}
