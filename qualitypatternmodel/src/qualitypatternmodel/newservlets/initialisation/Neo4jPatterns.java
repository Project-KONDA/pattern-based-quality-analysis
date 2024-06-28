package qualitypatternmodel.newservlets.initialisation;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;

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

		try {
			patterns.add(GenericPatterns.getConcrete(GenericPatterns.getGenericCard(), Language.NEO4J,
					GenericPatternInformation.CARD_ID_NEO,
					Map.of(), 
					Neo4jPatternVariants.CARD_NEO_VARIANTS, 
					Neo4jPatternVariants.CARD_NEO_VARIANTS_OLD));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			patterns.add(GenericPatterns.getConcrete(GenericPatterns.getGenericMandAtt(), Language.NEO4J,
					GenericPatternInformation.MANDATT_ID_NEO,
					Map.of(), 
					Neo4jPatternVariants.MANDATT_NEO_VARIANTS, 
					Neo4jPatternVariants.MANDATT_NEO_VARIANTS_OLD));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			patterns.add(GenericPatterns.getConcrete(GenericPatterns.getGenericMatch(), Language.NEO4J,
					GenericPatternInformation.MATCH_ID_NEO,
					Map.of(), 
					Neo4jPatternVariants.MATCH_NEO_VARIANTS, 
					Neo4jPatternVariants.MATCH_NEO_VARIANTS_OLD));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			patterns.add(GenericPatterns.getConcrete(GenericPatterns.getGenericContains(), Language.NEO4J,
					GenericPatternInformation.CONTAINS_ID_NEO,
					Map.of(), 
					Neo4jPatternVariants.CONTAINS_NEO_VARIANTS, 
					Neo4jPatternVariants.CONTAINS_NEO_VARIANTS_OLD));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			patterns.add(GenericPatterns.getConcrete(GenericPatterns.getGenericStringLength(), Language.NEO4J,
					GenericPatternInformation.STRINGLENGTH_ID_NEO,
					Map.of(), 
					Neo4jPatternVariants.STRINGLENGTH_NEO_VARIANTS, 
					Neo4jPatternVariants.STRINGLENGTH_NEO_VARIANTS_OLD));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			patterns.add(GenericPatterns.getConcrete(GenericPatterns.getGenericCompSet(), Language.NEO4J,
					GenericPatternInformation.COMPSET_ID_NEO,
					Map.of(), 
					Neo4jPatternVariants.COMPSET_NEO_VARIANTS, 
					Neo4jPatternVariants.COMPSET_NEO_VARIANTS_OLD));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			patterns.add(GenericPatterns.getConcrete(GenericPatterns.getGenericUnique(), Language.NEO4J,
					GenericPatternInformation.UNIQUE_ID_NEO,
					Map.of(), 
					Neo4jPatternVariants.UNIQUE_NEO_VARIANTS, 
					Neo4jPatternVariants.UNIQUE_NEO_VARIANTS_OLD));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return patterns;
	}
}
