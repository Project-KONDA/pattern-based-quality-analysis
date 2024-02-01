package qualitypatternmodel.newservlets.initialisation;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;

public class Neo4jPatterns {
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		int i = 0;
		for (CompletePattern pattern: getAllNeoPattern()) {
			System.out.println("Example " + i);
			System.out.println(pattern.myToString());
			System.out.println();
		}
	}
	
	public static List<CompletePattern> getAllNeoPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<CompletePattern> patterns = new BasicEList<CompletePattern>();
//		patterns.add(getNeoCard());
//		patterns.add(getNeoComp());
//		patterns.add(getNeoFunc());
//		patterns.add(getNeoUnique());
//		patterns.add(getNeoMatch());
//		patterns.add(getNeoContains());
//		patterns.add(getNeoAppdup3());
//		patterns.add(getNeoDupVal());
		return patterns;
	}

	public static CompletePattern getNeoCard() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericCard();
		pattern.createNeo4jAdaption();
		pattern.setName("Card_neo4j");
		pattern.setAbstractName("Card_neo4j");
		// TODO
		return pattern;
	}
	
	public static CompletePattern getNeoComp() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericComp();
		pattern.createNeo4jAdaption();
		pattern.setName("Comp_neo4j");
		pattern.setAbstractName("Comp_neo4j");
		// TODO
		return pattern;
	}
	
	public static CompletePattern getNeoFunc() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericFunc();
		pattern.createNeo4jAdaption();
		pattern.setName("Func_neo4j");
		pattern.setAbstractName("Func_neo4j");
		// TODO
		return pattern;
	}
	
	public static CompletePattern getNeoUnique() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericUnique();
		pattern.createNeo4jAdaption();
		pattern.setName("Unique_neo4j");
		pattern.setAbstractName("Unique_neo4j");
		// TODO
		return pattern;
	}
	
	public static CompletePattern getNeoMatch() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericMatch();
		pattern.createNeo4jAdaption();
		pattern.setName("Match_neo4j");
		pattern.setAbstractName("Match_neo4j");
		// TODO
		return pattern;
	}
	
	public static CompletePattern getNeoContains() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericContains();
		pattern.createNeo4jAdaption();
		pattern.setName("Contains_neo4j");
		pattern.setAbstractName("Contains_neo4j");
		// TODO
		return pattern;
	}
	
	public static CompletePattern getNeoAppdup2() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericAppdup2();
		pattern.createNeo4jAdaption();
		pattern.setName("Appdup2_neo4j");
		pattern.setAbstractName("Appdup2_neo4j");
		// TODO
		return pattern;
	}
	
	public static CompletePattern getNeoAppdup3() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericAppdup3();
		pattern.createNeo4jAdaption();
		pattern.setName("Appdup3_neo4j");
		pattern.setAbstractName("Appdup3_neo4j");
		// TODO
		return pattern;
	}
	
	public static CompletePattern getNeoDupVal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericDupVal();
		pattern.createNeo4jAdaption();
		pattern.setName("DupVal_neo4j");
		pattern.setAbstractName("DupVal_neo4j");
		// TODO
		return pattern;
	}
}
