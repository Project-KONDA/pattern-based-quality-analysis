package qualitypatternmodel.newservlets.initialisation;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.AbstractionLevel;
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
		List<CompletePattern> patterns = new BasicEList<CompletePattern>();//		patterns.add(getNeoCard());
//		patterns.add(getNeoComp());
//		patterns.add(getNeoFunc());
//		patterns.add(getNeoUnique());
//		patterns.add(getNeoMatch());
//		patterns.add(getNeoContains());
//		patterns.add(getNeoAppdup3());
//		patterns.add(getNeoDupVal());
//		patterns.add(getNeoInvalidLink());
//		patterns.add(getNeoMandAtt());
//		patterns.add(getNeoLocalUnique());
//		patterns.add(getNeoStringLength());
//		patterns.add(getNeoCompVal());
//		patterns.add(getNeoCardImpliesMandAtt());
//		patterns.add(getNeoCheckFormat());
//		patterns.add(getNeoCompDatabase());
//		patterns.add(getNeoCompValAny());
		return patterns;
	}

	public static CompletePattern getNeoCard() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericCard();
		pattern.createNeo4jAdaption();
		pattern.setPatternId("Card_neo4j");
		pattern.setAbstractId("Card_neo4j");
		// TODO
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getNeoComp() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericComp();
		pattern.createNeo4jAdaption();
		pattern.setPatternId("Comp_neo4j");
		pattern.setAbstractId("Comp_neo4j");
		// TODO
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getNeoFunc() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericFunc();
		pattern.createNeo4jAdaption();
		pattern.setPatternId("Func_neo4j");
		pattern.setAbstractId("Func_neo4j");
		// TODO
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getNeoUnique() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericUnique();
		pattern.createNeo4jAdaption();
		pattern.setPatternId("Unique_neo4j");
		pattern.setAbstractId("Unique_neo4j");
		// TODO
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getNeoMatch() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericMatch();
		pattern.createNeo4jAdaption();
		pattern.setPatternId("Match_neo4j");
		pattern.setAbstractId("Match_neo4j");
		// TODO
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getNeoContains() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericContains();
		pattern.createNeo4jAdaption();
		pattern.setPatternId("Contains_neo4j");
		pattern.setAbstractId("Contains_neo4j");
		// TODO
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getNeoAppdup2() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericAppdup2();
		pattern.createNeo4jAdaption();
		pattern.setPatternId("Appdup2_neo4j");
		pattern.setAbstractId("Appdup2_neo4j");
		// TODO
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getNeoAppdup3() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericAppdup3();
		pattern.createNeo4jAdaption();
		pattern.setPatternId("Appdup3_neo4j");
		pattern.setAbstractId("Appdup3_neo4j");
		// TODO
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
	public static CompletePattern getNeoDupVal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = GenericPatterns.getGenericDupVal();
		pattern.createNeo4jAdaption();
		pattern.setPatternId("DupVal_neo4j");
		pattern.setAbstractId("DupVal_neo4j");
		// TODO
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
	
//	public static CompletePattern getNeoMandAtt() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = GenericPatterns.getGenericMandAtt();
//		pattern.createXmlAdaption();
//		pattern.setPatternId("MandAtt_neo");
//		pattern.setAbstractId("MandAtt_neo");
//		// TODO
//		pattern.isValid(AbstractionLevel.ABSTRACT);
//		return pattern;
//	}
	
//	public static CompletePattern getNeoLocalUnique() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = GenericPatterns.getGenericLocalUnique();
//		pattern.createXmlAdaption();
//		pattern.setPatternId("LocalUnique_neo");
//		pattern.setAbstractId("LocalUnique_neo");
//		// TODO
//		pattern.isValid(AbstractionLevel.ABSTRACT);
//		return pattern;
//	}
	
//	public static CompletePattern getNeoStringLength() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = GenericPatterns.getGenericStringLength();
//		pattern.createXmlAdaption();
//		pattern.setPatternId("StringLength_neo");
//		pattern.setAbstractId("StringLength_neo");
//		// TODO
//		pattern.isValid(AbstractionLevel.ABSTRACT);
//		return pattern;
//	}
	
//	public static CompletePattern getNeoCompVal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = GenericPatterns.getGenericCompVal();
//		pattern.createXmlAdaption();
//		pattern.setPatternId("CompVal_neo");
//		pattern.setAbstractId("CompVal_neo");
//		// TODO
//		pattern.isValid(AbstractionLevel.ABSTRACT);
//		return pattern;
//	}
	
//	public static CompletePattern getNeoCardImpliesMandAtt() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = GenericPatterns.getGenericCardImpliesMandAtt();
//		pattern.createXmlAdaption();
//		pattern.setPatternId("CardImpliesMandAtt_neo");
//		pattern.setAbstractId("CardImpliesMandAtt_neo");
//		// TODO
//		pattern.isValid(AbstractionLevel.ABSTRACT);
//		return pattern;
//	}
	
//	public static CompletePattern getNeoCheckFormat() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = GenericPatterns.getGenericCheckFormat();
//		pattern.createXmlAdaption();
//		pattern.setPatternId("CheckFormat_neo");
//		pattern.setAbstractId("CheckFormat_neo");
//		// TODO
//		pattern.isValid(AbstractionLevel.ABSTRACT);
//		return pattern;
//	}
	
//	public static CompletePattern getNeoCompDatabase() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = GenericPatterns.getGenericCompDatabase();
//		pattern.createXmlAdaption();
//		pattern.setPatternId("CompDatabase_neo");
//		pattern.setAbstractId("CompDatabase_neo");
//		// TODO
//		pattern.isValid(AbstractionLevel.ABSTRACT);
//		return pattern;
//	}
	
//	public static CompletePattern getNeoCompValAny() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = GenericPatterns.getGenericCompValAny();
//		pattern.createXmlAdaption();
//		pattern.setPatternId("CompValAny_neo");
//		pattern.setAbstractId("CompValAny_neo");
//		// TODO
//		pattern.isValid(AbstractionLevel.ABSTRACT);
//		return pattern;
//	}
}
