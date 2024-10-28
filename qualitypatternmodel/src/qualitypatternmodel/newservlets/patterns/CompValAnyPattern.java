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

public class CompValAnyPattern {

	static String COMPVALANY_ID_GENERIC = "CompValAny_generic";
	static String COMPVALANY_ID_XML = "CompValAny_xml";
	static String COMPVALANY_ID_RDF = "CompValAny_rdf";
	static String COMPVALANY_ID_NEO = "CompValAny_neo4j";
	static String COMPVALANY_NAME = "Compare values within a record";
	static String COMPVALANY_DESCR = "Check whether any value of a specific field within a record does comply to a value restriction.";

	public static CompletePattern getGeneric()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId(COMPVALANY_ID_GENERIC);
		pattern.setAbstractId(COMPVALANY_ID_GENERIC);
		pattern.setName(COMPVALANY_NAME);
		pattern.setDescription(COMPVALANY_DESCR);
		// TODO
		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}
	
	public static PatternBundle getXmlBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException  {
		return new PatternBundle(
				getGeneric(),
				Language.XML,
				COMPVALANY_ID_XML,
				Map.of(),
				null,
				null);
	}
	
	public static PatternBundle getRdfBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException  {
		return new PatternBundle(
				getGeneric(),
				Language.RDF,
				COMPVALANY_ID_RDF,
				Map.of(),
				null,
				null);
	}
	
	public static PatternBundle getNeoBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException  {
		return new PatternBundle(
				getGeneric(),
				Language.NEO4J,
				COMPVALANY_ID_NEO,
				Map.of(),
				null,
				null);
	}

}
