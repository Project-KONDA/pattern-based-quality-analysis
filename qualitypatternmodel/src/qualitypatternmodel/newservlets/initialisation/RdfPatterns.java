package qualitypatternmodel.newservlets.initialisation;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;

public class RdfPatterns {
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		int i = 0;
		for (CompletePattern pattern: getAllRdfPattern()) {
			System.out.println("Example " + i);
			System.out.println(pattern.myToString());
			System.out.println();
		}
	}
	
	public static List<CompletePattern> getAllRdfPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<CompletePattern> patterns = new BasicEList<CompletePattern>();
//		patterns.add(getRdfCard());
//		patterns.add(getRdfComp());
//		patterns.add(getRdfFunc());
//		patterns.add(getRdfUnique());
//		patterns.add(getRdfMatch());
//		patterns.add(getRdfContains());
//		patterns.add(getRdfAppdup3());
//		patterns.add(getRdfDupVal());
		return patterns;
	}

	public static CompletePattern getRdfCard() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericCard();
		pattern.createRdfAdaption();
		pattern.setPatternId("Card_rdf");
		pattern.setAbstractId("Card_rdf");
		// TODO
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getRdfComp() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericComp();
		pattern.createRdfAdaption();
		pattern.setPatternId("Comp_rdf");
		pattern.setAbstractId("Comp_rdf");
		// TODO
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getRdfFunc() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericFunc();
		pattern.createRdfAdaption();
		pattern.setPatternId("Func_rdf");
		pattern.setAbstractId("Func_rdf");
		// TODO
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getRdfUnique() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericUnique();
		pattern.createRdfAdaption();
		pattern.setPatternId("Unique_rdf");
		pattern.setAbstractId("Unique_rdf");
		// TODO
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getRdfMatch() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericMatch();
		pattern.createRdfAdaption();
		pattern.setPatternId("Match_rdf");
		pattern.setAbstractId("Match_rdf");
		// TODO
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getRdfContains() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericContains();
		pattern.createRdfAdaption();
		pattern.setPatternId("Contains_rdf");
		pattern.setAbstractId("Contains_rdf");
		// TODO
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getRdfAppdup2() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericAppdup2();
		pattern.createRdfAdaption();
		pattern.setPatternId("Appdup2_rdf");
		pattern.setAbstractId("Appdup2_rdf");
		// TODO
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getRdfAppdup3() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericAppdup3();
		pattern.createRdfAdaption();
		pattern.setPatternId("Appdup3_rdf");
		pattern.setAbstractId("Appdup3_rdf");
		// TODO
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getRdfDupVal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericDupVal();
		pattern.createRdfAdaption();
		pattern.setPatternId("DupVal_rdf");
		pattern.setAbstractId("DupVal_rdf");
		// TODO
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
}
