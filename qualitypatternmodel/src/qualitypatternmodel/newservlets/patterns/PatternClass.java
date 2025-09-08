package qualitypatternmodel.newservlets.patterns;

import java.util.Map;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.initialisation.PatternBundle;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;

abstract public class PatternClass {

	// Implement generic Pattern here
	public abstract CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException;

	// Add information
	public final String id;
	public final String genericId;
	public final String xmlId;
	public final String rdfId;
	public final String neoId;
	public final String name;
	public final String description;
	public final Boolean genericValid;
	public final Boolean xmlValid;
	public final Boolean rdfValid;
	public final Boolean neoValid;

	protected PatternClass(String id, String name, String description, Boolean genericValid, Boolean xmlValid, Boolean rdfValid, Boolean neoValid) {
		this.id = id;
		genericId = id + "_generic";
		xmlId = id + "_xml";
		rdfId = id + "_rdf";
		neoId = id + "_neo4j";
		this.name = name;
		this.description = description;
		this.genericValid = genericValid;
		this.xmlValid = xmlValid;
		this.rdfValid = rdfValid;
		this.neoValid = neoValid;
	}

	// Patterns

	public CompletePattern getGenericPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = getPattern();
		if (pattern == null) {
			throw new RuntimeException("Pattern " + id + " is null");
		}

		setInfo(pattern);
		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}
	
	public CompletePattern getXmlPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getXmlBundle().getConcrete();
	}
	
	public CompletePattern getRdfPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getRdfBundle().getConcrete();
	}
	
	public CompletePattern getNeoPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return getNeoBundle().getConcrete();
	}
	
	public CompletePattern getPattern(Language lan) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		switch(lan) {
		case GENERIC:
			return getGenericPattern();
		case XML:
			return getXmlPattern();
		case RDF:
			return getRdfPattern();
		case NEO4J:
			return getNeoPattern();
		default:
			return null;
		}
	}

	// PatternBundes

	public PatternBundle getXmlBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGenericPattern(),
				Language.XML,
				xmlId,
				xmlMap(),
				xmlVariants(),
				xmlVariantsOld());
	}

	public PatternBundle getRdfBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException  {
		return new PatternBundle(
				getGenericPattern(),
				Language.RDF,
				rdfId,
				rdfMap(),
				rdfVariants(),
				rdfVariantsOld());
	}

	public PatternBundle getNeoBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException  {
		return new PatternBundle(
				getGenericPattern(),
				Language.NEO4J,
				neoId,
				neoMap(),
				neoVariants(),
				neoVariantsOld());
	}

	public PatternBundle getBundle(Language lan) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		switch(lan) {
		case XML:
			return getXmlBundle();
		case RDF:
			return getRdfBundle();
		case NEO4J:
			return getNeoBundle();
		default:
			return null;
		}
	}

	// Helper 

	protected void setInfo(CompletePattern pattern) {
		pattern.setPatternId(genericId);
		pattern.setAbstractId(genericId);
		pattern.setName(name);
		pattern.setDescription(description);
	}

	public Boolean validity(Language lan) {
		switch (lan) {
		case GENERIC:
			return genericValid;
		case XML:
			return xmlValid;
		case RDF:
			return rdfValid;
		case NEO4J:
			return neoValid;
		default:
			return false;
		}
	}

	// Override for specific Patternbundle options
	
	protected Map<Integer, String> xmlMap() {
		return Map.of();
	}

	protected String[] xmlVariants() {
		return new String[] {};
	}

	protected String[] xmlVariantsOld() {
		return new String[] {};
	}
	
	protected Map<Integer, String> rdfMap() {
		return Map.of();
	}

	protected String[] rdfVariants() {
		return new String[] {};
	}

	protected String[] rdfVariantsOld() {
		return new String[] {};
	}
	
	protected Map<Integer, String> neoMap() {
		return Map.of();
	}

	protected String[] neoVariants() {
		return new String[] {};
	}

	protected String[] neoVariantsOld() {
		return new String[] {};
	}
}
