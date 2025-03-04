package qualitypatternmodel.newservlets.patterns.missing;

import java.util.Map;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.initialisation.PatternBundle;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.patternstructure.PatternstructureFactory;

public class CheckFormatPattern {

	static String CHECKFORMAT_ID_GENERIC = "CheckFormat_generic";
	static String CHECKFORMAT_ID_XML = "CheckFormat_xml";
	static String CHECKFORMAT_ID_RDF = "CheckFormat_rdf";
	static String CHECKFORMAT_ID_NEO = "CheckFormat_neo4j";
	static String CHECKFORMAT_NAME = "Check the format of a resource";
	static String CHECKFORMAT_DESCR = "Check if the ressource under an URL is of a specific format.";

	public static CompletePattern getGeneric()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId(CHECKFORMAT_ID_GENERIC);
		pattern.setAbstractId(CHECKFORMAT_ID_GENERIC);
		pattern.setName(CHECKFORMAT_NAME);
		pattern.setDescription(CHECKFORMAT_DESCR);
		// TODO
		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}
	
	public static PatternBundle getCheckFormatXmlBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException  {
		return new PatternBundle(
				getGeneric(),
				Language.XML,
				CHECKFORMAT_ID_XML,
				Map.of(),
				null,
				null);
	}
	
	public static PatternBundle getRdfBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException  {
		return new PatternBundle(
				getGeneric(),
				Language.RDF,
				CHECKFORMAT_ID_RDF,
				Map.of(),
				null,
				null);
	}
	
	public static PatternBundle getNeoBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException  {
		return new PatternBundle(
				getGeneric(),
				Language.NEO4J,
				CHECKFORMAT_ID_NEO,
				Map.of(),
				null,
				null);
	}

}
