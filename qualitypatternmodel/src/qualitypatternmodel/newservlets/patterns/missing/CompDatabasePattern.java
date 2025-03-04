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

public class CompDatabasePattern {

	static String COMPDATABASE_ID_GENERIC = "CompDatabase_generic";
	static String COMPDATABASE_ID_XML = "CompDatabase_xml";
	static String COMPDATABASE_ID_RDF = "CompDatabase_rdf";
	static String COMPDATABASE_ID_NEO = "CompDatabase_neo4j";
	static String COMPDATABASE_NAME = "Fieldvalue in Database";
	static String COMPDATABASE_DESCR = "Check whether all values in a field are in a database.";

	public static CompletePattern getGeneric()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId(COMPDATABASE_ID_GENERIC);
		pattern.setAbstractId(COMPDATABASE_ID_GENERIC);
		pattern.setName(COMPDATABASE_NAME);
		pattern.setDescription(COMPDATABASE_DESCR);
		// TODO
		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}
	
	public static PatternBundle getXmlBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException  {
		return new PatternBundle(
				getGeneric(),
				Language.XML,
				COMPDATABASE_ID_XML,
				Map.of(),
				null,
				null);
	}
	
	public static PatternBundle getRdfBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException  {
		return new PatternBundle(
				getGeneric(),
				Language.RDF,
				COMPDATABASE_ID_RDF,
				Map.of(),
				null,
				null);
	}
	
	public static PatternBundle getNeoBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException  {
		return new PatternBundle(
				getGeneric(),
				Language.NEO4J,
				COMPDATABASE_ID_NEO,
				Map.of(),
				null,
				null);
	}

}
