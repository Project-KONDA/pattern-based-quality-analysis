package qualitypatternmodel.newservlets.initialisation;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.ServletUtilities;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;

public class RdfPatterns {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		int i = 0;
		for (PatternBundle patternbundle: getAllRdfPatternBundles()) {
			CompletePattern pattern = patternbundle.getConcrete();
			System.out.println("Example " + i);
			System.out.println(pattern.myToString());
			System.out.println();
		}
	}

	public static List<CompletePattern> getAllRdfPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<CompletePattern> patterns = new BasicEList<CompletePattern>();
		for (PatternBundle bundle: getAllRdfPatternBundles()) {
			patterns.add(bundle.getConcrete());
		}
		return patterns;
	}

	public static List<PatternBundle> getAllRdfPatternBundles() {
		List<PatternBundle> patternbundles = new BasicEList<PatternBundle>();

		try {
			patternbundles.add(new PatternBundle(GenericPatterns.getGenericCard(), Language.RDF,
					GenericPatternInformation.CARD_ID_RDF,
					Map.of(),
					RdfPatternVariants.CARD_RDF_VARIANTS,
					RdfPatternVariants.CARD_RDF_VARIANTS_OLD));
		} catch (Exception e) {
			ServletUtilities.logError(e);
		}

		try {
			patternbundles.add(new PatternBundle(GenericPatterns.getGenericMandAtt(), Language.RDF,
					GenericPatternInformation.MANDATT_ID_RDF,
					Map.of(),
					RdfPatternVariants.MANDATT_RDF_VARIANTS,
					RdfPatternVariants.MANDATT_RDF_VARIANTS_OLD));
		} catch (Exception e) {
			ServletUtilities.logError(e);
		}

		try {
			patternbundles.add(new PatternBundle(GenericPatterns.getGenericMatch(), Language.RDF,
					GenericPatternInformation.MATCH_ID_RDF,
					Map.of(),
					RdfPatternVariants.MATCH_RDF_VARIANTS,
					RdfPatternVariants.MATCH_RDF_VARIANTS_OLD));
		} catch (Exception e) {
			ServletUtilities.logError(e);
		}

		try {
			patternbundles.add(new PatternBundle(GenericPatterns.getGenericContains(), Language.RDF,
					GenericPatternInformation.CONTAINS_ID_RDF,
					Map.of(),
					RdfPatternVariants.CONTAINS_RDF_VARIANTS,
					RdfPatternVariants.CONTAINS_RDF_VARIANTS_OLD));
		} catch (Exception e) {
			ServletUtilities.logError(e);
		}

		try {
			patternbundles.add(new PatternBundle(GenericPatterns.getGenericStringLength(), Language.RDF,
					GenericPatternInformation.STRINGLENGTH_ID_RDF,
					Map.of(),
					RdfPatternVariants.STRINGLENGTH_RDF_VARIANTS,
					RdfPatternVariants.STRINGLENGTH_RDF_VARIANTS_OLD));
		} catch (Exception e) {
			ServletUtilities.logError(e);
		}

		try {
			patternbundles.add(new PatternBundle(GenericPatterns.getGenericCompSet(), Language.RDF,
					GenericPatternInformation.COMPSET_ID_RDF,
					Map.of(),
					RdfPatternVariants.COMPSET_RDF_VARIANTS,
					RdfPatternVariants.COMPSET_RDF_VARIANTS_OLD));
		} catch (Exception e) {
			ServletUtilities.logError(e);
		}

		try {
			patternbundles.add(new PatternBundle(GenericPatterns.getGenericUnique(), Language.RDF,
					GenericPatternInformation.UNIQUE_ID_RDF,
					Map.of(),
					RdfPatternVariants.UNIQUE_RDF_VARIANTS,
					RdfPatternVariants.UNIQUE_RDF_VARIANTS_OLD));
		} catch (Exception e) {
			ServletUtilities.logError(e);
		}
		return patternbundles;
	}
}
