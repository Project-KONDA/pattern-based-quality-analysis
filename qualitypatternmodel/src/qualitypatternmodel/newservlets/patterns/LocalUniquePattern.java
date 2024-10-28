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

	static String LOCALUNIQUE_ID_GENERIC = "LocalUnique_generic";
	static String LOCALUNIQUE_ID_XML = "LocalUnique_xml";
	static String LOCALUNIQUE_ID_RDF = "LocalUnique_rdf";
	static String LOCALUNIQUE_ID_NEO = "LocalUnique_neo4j";
	static String LOCALUNIQUE_NAME = "Local Unique Attribute Constraint";
	static String LOCALUNIQUE_DESCR = "Check whether all field values are unique within a record.";

	public static CompletePattern getGeneric()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId(LOCALUNIQUE_ID_GENERIC);
		pattern.setAbstractId(LOCALUNIQUE_ID_GENERIC);
		pattern.setName(LOCALUNIQUE_NAME);
		pattern.setDescription(LOCALUNIQUE_DESCR);
		// TODO
		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}

	public static PatternBundle getXmlBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(),
				Language.XML,
				LOCALUNIQUE_ID_XML,
				Map.of(2, "//*", 3, "/*/text()"),
				null,
				null);
	}

	public static PatternBundle getRdfBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(),
				Language.RDF,
				LOCALUNIQUE_ID_RDF,
				Map.of(),
				null,
				null);
	}

	public static PatternBundle getNeoBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(),
				Language.NEO4J,
				LOCALUNIQUE_ID_NEO,
				Map.of(),
				null,
				null);
	}

}
