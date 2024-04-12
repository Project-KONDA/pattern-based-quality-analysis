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
//		patterns.add(getRdfInvalidLink());
//		patterns.add(getRdfMandAtt());
//		patterns.add(getRdfLocalUnique());
//		patterns.add(getRdfStringLength());
//		patterns.add(getRdfCompVal());
//		patterns.add(getRdfCardImpliesMandAtt());
//		patterns.add(getRdfCheckFormat());
//		patterns.add(getRdfCompDatabase());
//		patterns.add(getRdfCompValAny());
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
	
//	public static CompletePattern getRdfMandAtt() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = GenericPatterns.getGenericMandAtt();
//		pattern.createXmlAdaption();
//		pattern.setPatternId("MandAtt_rdf");
//		pattern.setAbstractId("MandAtt_rdf");
//		// TODO
//		pattern.isValid(AbstractionLevel.ABSTRACT);
//		return pattern;
//	}
	
//	public static CompletePattern getRdfLocalUnique() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = GenericPatterns.getGenericLocalUnique();
//		pattern.createXmlAdaption();
//		pattern.setPatternId("LocalUnique_rdf");
//		pattern.setAbstractId("LocalUnique_rdf");
//		// TODO
//		pattern.isValid(AbstractionLevel.ABSTRACT);
//		return pattern;
//	}
	
//	public static CompletePattern getRdfStringLength() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = GenericPatterns.getGenericStringLength();
//		pattern.createXmlAdaption();
//		pattern.setPatternId("StringLength_rdf");
//		pattern.setAbstractId("StringLength_rdf");
//		// TODO
//		pattern.isValid(AbstractionLevel.ABSTRACT);
//		return pattern;
//	}
	
//	public static CompletePattern getRdfCompVal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = GenericPatterns.getGenericCompVal();
//		pattern.createXmlAdaption();
//		pattern.setPatternId("CompVal_rdf");
//		pattern.setAbstractId("CompVal_rdf");
//		// TODO
//		pattern.isValid(AbstractionLevel.ABSTRACT);
//		return pattern;
//	}
	
//	public static CompletePattern getRdfCardImpliesMandAtt() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = GenericPatterns.getGenericCardImpliesMandAtt();
//		pattern.createXmlAdaption();
//		pattern.setPatternId("CardImpliesMandAtt_rdf");
//		pattern.setAbstractId("CardImpliesMandAtt_rdf");
//		// TODO
//		pattern.isValid(AbstractionLevel.ABSTRACT);
//		return pattern;
//	}
	
//	public static CompletePattern getRdfCheckFormat() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = GenericPatterns.getGenericCheckFormat();
//		pattern.createXmlAdaption();
//		pattern.setPatternId("CheckFormat_rdf");
//		pattern.setAbstractId("CheckFormat_rdf");
//		// TODO
//		pattern.isValid(AbstractionLevel.ABSTRACT);
//		return pattern;
//	}
	
//	public static CompletePattern getRdfCompDatabase() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = GenericPatterns.getGenericCompDatabase();
//		pattern.createXmlAdaption();
//		pattern.setPatternId("CompDatabase_rdf");
//		pattern.setAbstractId("CompDatabase_rdf");
//		// TODO
//		pattern.isValid(AbstractionLevel.ABSTRACT);
//		return pattern;
//	}
	
//	public static CompletePattern getRdfCompValAny() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
//		CompletePattern pattern = GenericPatterns.getGenericCompValAny();
//		pattern.createXmlAdaption();
//		pattern.setPatternId("CompValAny_rdf");
//		pattern.setAbstractId("CompValAny_rdf");
//		// TODO
//		pattern.isValid(AbstractionLevel.ABSTRACT);
//		return pattern;
//	}
}
