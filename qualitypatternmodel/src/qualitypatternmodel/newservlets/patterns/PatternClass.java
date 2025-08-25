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
	abstract CompletePattern getPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException;

	// Add information
	public final String id;
	public final String name;
	public final String description;
	public final Boolean genericValid;
	public final Boolean xmlValid;
	public final Boolean rdfValid;
	public final Boolean neoValid;

	protected PatternClass(String id, String name, String description, Boolean genericValid, Boolean xmlValid, Boolean rdfValid, Boolean neoValid) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.genericValid = genericValid;
		this.xmlValid = xmlValid;
		this.rdfValid = rdfValid;
		this.neoValid = neoValid;
	}

	String genericId() {
		return id + "_generic";
	};

	String xmlId() {
		return id + "_xml";
	};

	String rdfId() {
		return id + "_rdf";
	};

	String neoId() {
		return id + "_neo4j";
	};


	public CompletePattern getGeneric() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern pattern = getPattern();
		if (pattern == null) {
			throw new RuntimeException("Pattern " + id + " is null");
		}

		setInfo(pattern);
		pattern.isValid(AbstractionLevel.GENERIC);
		return pattern;
	}
	
	protected void setInfo(CompletePattern pattern) {
		pattern.setPatternId(genericId());
		pattern.setAbstractId(genericId());
		pattern.setName(name);
		pattern.setDescription(description);
	}

	public PatternBundle getXmlBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return new PatternBundle(
				getGeneric(),
				Language.XML,
				xmlId(),
				xmlMap(),
				xmlVariants(),
				xmlVariantsOld());
	}

	public PatternBundle getRdfBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException  {
		return new PatternBundle(
				getGeneric(),
				Language.RDF,
				rdfId(),
				rdfMap(),
				rdfVariants(),
				rdfVariantsOld());
	}

	public PatternBundle getNeoBundle() throws InvalidityException, OperatorCycleException, MissingPatternContainerException  {
		return new PatternBundle(
				getGeneric(),
				Language.NEO4J,
				neoId(),
				neoMap(),
				neoVariants(),
				neoVariantsOld());
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
