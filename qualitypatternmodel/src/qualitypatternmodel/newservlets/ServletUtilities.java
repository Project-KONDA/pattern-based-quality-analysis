package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.execution.Database;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

public abstract class ServletUtilities {
	
	static public String EXTENSION = "pattern";
	static public List<String> TECHS = List.of("xml", "rdf", "neo");
	static public List<String> LEVELS = List.of("all", "template", "concrete", "ready");
	
	// Pattern request
	
	public static List<CompletePattern> getAllPattern(String technology) throws IOException {
		EList<CompletePattern> patterns = new BasicEList<CompletePattern>();
		patterns.addAll(getAllAbstractPattern(technology));
		patterns.addAll(getAllConcretePattern(technology));
		return patterns;
	}
	
	public static List<CompletePattern> getAllAbstractPattern(String technology) throws IOException {
		return loadAbstractPattern(technology);
	}

	public static List<CompletePattern> getAllSemiConcretePattern(String technology) throws IOException {
		return loadAllPatternInstances(technology);
	}
	
	public static List<CompletePattern> getAllConcretePattern(String technology) throws IOException {
		List<CompletePattern> concrete = new BasicEList<CompletePattern>();
		List<CompletePattern> semiconcrete = loadAllPatternInstances(technology);
		for (CompletePattern semi: semiconcrete) {
			try {
				semi.isValid(AbstractionLevel.CONCRETE);
				concrete.add(semi);
			} catch (Exception e) {}
		}
		return concrete;
	}
	
	// Pattern instantiation
	
	public static CompletePattern instantiateAbstractPattern(String technology, String abstractPattern, String concretePattern) throws IOException {
		CompletePattern pattern = EMFModelLoad.loadAbstractPattern(technology, abstractPattern);
		pattern.setName(concretePattern);
		EMFModelSave.exportToFile2(pattern, technology, concretePattern, EXTENSION);
		return pattern;
	}
	
	public static CompletePattern copyConcretePattern(String technology, String concretePattern, String concretePatternName) throws IOException {
		CompletePattern pattern = EMFModelLoad.loadConcretePattern(technology, concretePattern);
		pattern.setName(concretePatternName);
		EMFModelSave.exportToFile2(pattern, technology, concretePatternName, EXTENSION);
		return pattern;
	}
	
	public static void deleteConcretePattern(String technology, String concretePattern) {
	}
	
	// database
	public static void saveDatabase(String technology, String dbname, String URL, String user, String password) {
		// TODO
	};
	public static Database loadDatabase(String technology, String name) {
		// TODO
		return null;
	};
	public static List<Database> loadDatabases(String technology) {
		// TODO
		return null;
	};
	public static void deleteDatabase(String technology, String name) {
		// TODO
	};
	
	// pattern modification
	
	abstract public void setDatabase(String patternName, String databaseName);
	abstract public void setParameter(String patternName, int parameterIndex, String value);
	
	// pattern execution
	
	abstract public String executePattern(String pattern);
	
	
	// ---------------
	
	
	private static List<CompletePattern> abstractPatternXml = null;
	private static List<CompletePattern> abstractPatternRdf = null;
	private static List<CompletePattern> abstractPatternNeo = null;
	
	private static List<CompletePattern> loadAbstractPattern(String technology) throws IOException {
		switch(technology) {
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
	
	private static List<CompletePattern> loadAllPatternInstances(String technology) throws IOException {
		switch(technology) {
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
	public static String getPatternJSON(List<CompletePattern> patterns) {
		String result = "{\"Templates\": [ ";
		for (CompletePattern pattern: patterns) {
			String json = "{";
			json += "\"patternID\": \""+ pattern.getName() + "\", ";
//			json += "\"patternDescShort\": \"" + pattern.getShortDescription() + "\", ";
			json += "\"patternDescShort\": \"" + "not implemnted" + "\", ";
			json += "\"patternDesc\": \""+ pattern.getDescription() +"\",";
			json += "\"variants\": [";
			
			for (PatternText text: pattern.getText()) {
				json += text.generateJSON();
			}
			json += "},";
			result += json;
		}
		return result += "]";
	}
	
	public static String getPatternJSONHeads(List<CompletePattern> patterns) {
		String result = "[";
		for (CompletePattern pattern: patterns) {
			result += "{\"name\":\""+pattern.getName() + "\", \"description\":\"" + pattern.getDescription() + "\"}, ";
		}
		return result += "]";
	}
}