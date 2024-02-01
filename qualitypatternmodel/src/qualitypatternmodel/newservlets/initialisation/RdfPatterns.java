package qualitypatternmodel.newservlets.initialisation;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
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
		pattern.setName("Card_rdf");
		pattern.setAbstractName("Card_rdf");
		// TODO
		return pattern;
	}
	
	public static CompletePattern getRdfComp() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericComp();
		pattern.createRdfAdaption();
		pattern.setName("Comp_rdf");
		pattern.setAbstractName("Comp_rdf");
		// TODO
		return pattern;
	}
	
	public static CompletePattern getRdfFunc() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericFunc();
		pattern.createRdfAdaption();
		pattern.setName("Func_rdf");
		pattern.setAbstractName("Func_rdf");
		// TODO
		return pattern;
	}
	
	public static CompletePattern getRdfUnique() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericUnique();
		pattern.createRdfAdaption();
		pattern.setName("Unique_rdf");
		pattern.setAbstractName("Unique_rdf");
		// TODO
		return pattern;
	}
	
	public static CompletePattern getRdfMatch() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericMatch();
		pattern.createRdfAdaption();
		pattern.setName("Match_rdf");
		pattern.setAbstractName("Match_rdf");
		// TODO
		return pattern;
	}
	
	public static CompletePattern getRdfContains() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericContains();
		pattern.createRdfAdaption();
		pattern.setName("Contains_rdf");
		pattern.setAbstractName("Contains_rdf");
		// TODO
		return pattern;
	}
	
	public static CompletePattern getRdfAppdup2() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericAppdup2();
		pattern.createRdfAdaption();
		pattern.setName("Appdup2_rdf");
		pattern.setAbstractName("Appdup2_rdf");
		// TODO
		return pattern;
	}
	
	public static CompletePattern getRdfAppdup3() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericAppdup3();
		pattern.createRdfAdaption();
		pattern.setName("Appdup3_rdf");
		pattern.setAbstractName("Appdup3_rdf");
		// TODO
		return pattern;
	}
	
	public static CompletePattern getRdfDupVal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericDupVal();
		pattern.createRdfAdaption();
		pattern.setName("DupVal_rdf");
		pattern.setAbstractName("DupVal_rdf");
		// TODO
		return pattern;
	}
}
