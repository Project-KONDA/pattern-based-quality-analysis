package qualitypatternmodel.newservlets.initialisation;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;

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

		try {
			patterns.add(GenericPatterns.getConcrete(GenericPatterns.getGenericCard(), Language.RDF,
					Map.of(), 
					RdfPatternVariants.CARD_RDF_VARIANTS, 
					RdfPatternVariants.CARD_RDF_VARIANTS_OLD));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			patterns.add(GenericPatterns.getConcrete(GenericPatterns.getGenericMandAtt(), Language.RDF,
					Map.of(), 
					RdfPatternVariants.MANDATT_RDF_VARIANTS, 
					RdfPatternVariants.MANDATT_RDF_VARIANTS_OLD));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			patterns.add(GenericPatterns.getConcrete(GenericPatterns.getGenericMatch(), Language.RDF,
					Map.of(), 
					RdfPatternVariants.MATCH_RDF_VARIANTS, 
					RdfPatternVariants.MATCH_RDF_VARIANTS_OLD));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			patterns.add(GenericPatterns.getConcrete(GenericPatterns.getGenericContains(), Language.RDF,
					Map.of(), 
					RdfPatternVariants.CONTAINS_RDF_VARIANTS, 
					RdfPatternVariants.CONTAINS_RDF_VARIANTS_OLD));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			patterns.add(GenericPatterns.getConcrete(GenericPatterns.getGenericStringLength(), Language.RDF,
					Map.of(), 
					RdfPatternVariants.STRINGLENGTH_RDF_VARIANTS, 
					RdfPatternVariants.STRINGLENGTH_RDF_VARIANTS_OLD));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			patterns.add(GenericPatterns.getConcrete(GenericPatterns.getGenericCompSet(), Language.RDF,
					Map.of(), 
					RdfPatternVariants.COMPSET_RDF_VARIANTS, 
					RdfPatternVariants.COMPSET_RDF_VARIANTS_OLD));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			patterns.add(GenericPatterns.getConcrete(GenericPatterns.getGenericInvalidLink(), Language.RDF,
					Map.of(),
					RdfPatternVariants.INVALIDLINK_RDF_VARIANTS, 
					RdfPatternVariants.INVALIDLINK_RDF_VARIANTS_OLD));
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			patterns.add(GenericPatterns.getConcrete(GenericPatterns.getGenericUnique(), Language.RDF,
					Map.of(), 
					RdfPatternVariants.UNIQUE_RDF_VARIANTS, 
					RdfPatternVariants.UNIQUE_RDF_VARIANTS_OLD));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return patterns;
	}
}
