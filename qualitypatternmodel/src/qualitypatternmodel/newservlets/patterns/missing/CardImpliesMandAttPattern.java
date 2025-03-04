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

public class CardImpliesMandAttPattern {

	static String CARDIMPLIESMANDATT_ID_GENERIC = "CardImpliesMandAtt_generic";
	static String CARDIMPLIESMANDATT_ID_XML = "CardImpliesMandAtt_xml";
	static String CARDIMPLIESMANDATT_ID_RDF = "CardImpliesMandAtt_rdf";
	static String CARDIMPLIESMANDATT_ID_NEO = "CardImpliesMandAtt_neo4j";
	static String CARDIMPLIESMANDATT_NAME = "Mandatory Attribute based on Cardinality Constraint";
	static String CARDIMPLIESMANDATT_DESCR = "Check whether a attribute exists, that is mandatory on specific cardinalities of a field.";

	public static CompletePattern getGeneric()
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		pattern.setPatternId(CARDIMPLIESMANDATT_ID_GENERIC);
		pattern.setAbstractId(CARDIMPLIESMANDATT_ID_GENERIC);
		pattern.setName(CARDIMPLIESMANDATT_NAME);
		pattern.setDescription(CARDIMPLIESMANDATT_DESCR);
		// TODO
		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}
	
	public static PatternBundle getXmlBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException  {
		return new PatternBundle(
				getGeneric(),
				Language.XML,
				CARDIMPLIESMANDATT_ID_XML,
				Map.of(),
				null,
				null);
	}
	
	public static PatternBundle getRdfBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException  {
		return new PatternBundle(
				getGeneric(),
				Language.RDF,
				CARDIMPLIESMANDATT_ID_RDF,
				Map.of(),
				null,
				null);
	}
	
	public static PatternBundle getNeoBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException  {
		return new PatternBundle(
				getGeneric(),
				Language.NEO4J,
				CARDIMPLIESMANDATT_ID_NEO,
				Map.of(),
				null,
				null);
	}

}
