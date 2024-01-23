package qualitypatternmodel.newservelets;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

public abstract class ServeletUtilities {
	
	static public String EXTENSION = "pattern";

	// Pattern request
	
	public List<CompletePattern> getAllPattern(String format){
		EList<CompletePattern> patterns = new BasicEList<CompletePattern>();
		patterns.addAll(getAllAbstractPattern(format));
		patterns.addAll(getAllConcretePattern(format));
		return patterns;
	}
	
	public List<CompletePattern> getAllAbstractPattern(String format) {
		return loadAbstractPattern(format);
	}

	public List<CompletePattern> getAllSemiConcretePattern(String format) {
		return loadAllPatternInstances(format);
	}
	
	public List<CompletePattern> getAllConcretePattern(String format) {
		List<CompletePattern> concrete = new BasicEList<CompletePattern>();
		List<CompletePattern> semiconcrete = loadAllPatternInstances(format);
		for (CompletePattern semi: semiconcrete) {
			try {
				semi.isValid(AbstractionLevel.CONCRETE);
				concrete.add(semi);
			} catch (Exception e) {}
		}
		return concrete;
	}
	
	// Pattern instantiation
	
	public CompletePattern instantiateAbstractPattern(String format, String abstractPattern, String concretePattern) throws IOException {
		CompletePattern pattern = EMFModelLoad.loadAbstractPattern(format, abstractPattern);
		pattern.setName(concretePattern);
		EMFModelSave.exportToFile2(pattern, format, concretePattern, EXTENSION);
		return pattern;
	}
	
	public CompletePattern copyConcretePattern(String format, String concretePattern, String concretePatternName) throws IOException {
		CompletePattern pattern = EMFModelLoad.loadConcretePattern(format, concretePattern);
		pattern.setName(concretePatternName);
		EMFModelSave.exportToFile2(pattern, format, concretePatternName, EXTENSION);
		return pattern;
	}
	
	// database
	abstract public void saveDatabase(String URL, String user, String password, String name);
	abstract public void loadDatabase(String name);
	
	// pattern modification
	
	abstract public void setDatabase(String patternName, String databaseName);
	abstract public void setParameter(String patternName, int parameterIndex, String value);
	
	// pattern execution
	
	abstract public void executePattern(String pattern);
	
	
	
	// ---------------
	
	
	List<CompletePattern> abstractPatternXml = null;
	List<CompletePattern> abstractPatternRdf = null;
	List<CompletePattern> abstractPatternNeo = null;
	
	private List<CompletePattern> loadAbstractPattern(String format) {
		switch(format) {
		case "xml":
			if (abstractPatternXml != null)
				abstractPatternXml = EMFModelLoad.loadCompletePatternFromFolder("serverpatterns/xml/abstract-patterns", EXTENSION);
			return abstractPatternXml;
		case "rdf":
			if (abstractPatternRdf == null)
				abstractPatternRdf = EMFModelLoad.loadCompletePatternFromFolder("serverpatterns/rdf/abstract-patterns", EXTENSION);
			return abstractPatternRdf;
		case "neo4j":
			if (abstractPatternNeo != null)
				abstractPatternNeo = EMFModelLoad.loadCompletePatternFromFolder("serverpatterns/neo4j/abstract-patterns", EXTENSION);
			return abstractPatternNeo;
		default:
			return null;
		}
	}
	
	private List<CompletePattern> loadAllPatternInstances(String format) {
		switch(format) {
		case "xml":
			return EMFModelLoad.loadCompletePatternFromFolder("serverpatterns/xml/concrete-patterns", EXTENSION);
		case "rdf":
			return EMFModelLoad.loadCompletePatternFromFolder("serverpatterns/rdf/concrete-patterns", EXTENSION);
		case "neo4j":
			return EMFModelLoad.loadCompletePatternFromFolder("serverpatterns/neo4j/concrete-patterns", EXTENSION);
		default:
			return null;
		}
	}

	abstract public void initializeServerPattern();
	
	
}
