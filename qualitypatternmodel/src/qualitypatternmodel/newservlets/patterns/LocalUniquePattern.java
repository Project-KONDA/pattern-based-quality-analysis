package qualitypatternmodel.newservlets.patterns;

import java.util.Map;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.initialisation.PatternBundle;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.patternstructure.PatternstructureFactory;

public class LocalUniquePattern {

	public static CompletePattern getGeneric()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId(PatternConstants.LOCALUNIQUE_ID_GENERIC);
		pattern.setAbstractId(PatternConstants.LOCALUNIQUE_ID_GENERIC);
		pattern.setName(PatternConstants.LOCALUNIQUE_NAME);
		pattern.setDescription(PatternConstants.LOCALUNIQUE_DESCR);
		// TODO
		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}

	public static PatternBundle getXmlBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(),
				Language.XML,
				PatternConstants.LOCALUNIQUE_ID_XML,
				Map.of(2, "//*", 3, "/*/text()"),
				null,
				null);
	}

	public static PatternBundle getRdfBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(),
				Language.RDF,
				PatternConstants.LOCALUNIQUE_ID_RDF,
				Map.of(),
				null,
				null);
	}

	public static PatternBundle getNeoBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(),
				Language.NEO4J,
				PatternConstants.LOCALUNIQUE_ID_NEO,
				Map.of(),
				null,
				null);
	}

}
