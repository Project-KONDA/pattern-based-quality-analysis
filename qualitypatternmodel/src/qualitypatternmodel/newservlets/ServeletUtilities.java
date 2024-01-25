package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

public abstract class ServeletUtilities {
	
	static public String EXTENSION = "pattern";

	// Pattern request
	
	public static List<CompletePattern> getAllPattern(String format) throws NoSuchFileException {
		EList<CompletePattern> patterns = new BasicEList<CompletePattern>();
		patterns.addAll(getAllAbstractPattern(format));
		patterns.addAll(getAllConcretePattern(format));
		return patterns;
	}
	
	public static List<CompletePattern> getAllAbstractPattern(String format) throws NoSuchFileException {
		return loadAbstractPattern(format);
	}

	public static List<CompletePattern> getAllSemiConcretePattern(String format) throws NoSuchFileException {
		return loadAllPatternInstances(format);
	}
	
	public static List<CompletePattern> getAllConcretePattern(String format) throws NoSuchFileException {
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
	
	public static CompletePattern instantiateAbstractPattern(String format, String abstractPattern, String concretePattern) throws IOException {
		CompletePattern pattern = EMFModelLoad.loadAbstractPattern(format, abstractPattern);
		pattern.setName(concretePattern);
		EMFModelSave.exportToFile2(pattern, format, concretePattern, EXTENSION);
		return pattern;
	}
	
	public static CompletePattern copyConcretePattern(String format, String concretePattern, String concretePatternName) throws IOException {
		CompletePattern pattern = EMFModelLoad.loadConcretePattern(format, concretePattern);
		pattern.setName(concretePatternName);
		EMFModelSave.exportToFile2(pattern, format, concretePatternName, EXTENSION);
		return pattern;
	}
	
	// database
	public static void saveDatabase(String URL, String user, String password, String name) {
	};
	
	public static void loadDatabase(String name) {
	};
	
	// pattern modification
	
	abstract public void setDatabase(String patternName, String databaseName);
	abstract public void setParameter(String patternName, int parameterIndex, String value);
	
	// pattern execution
	
	abstract public void executePattern(String pattern);
	
	
	// ---------------
	
	
	private static List<CompletePattern> abstractPatternXml = null;
	private static List<CompletePattern> abstractPatternRdf = null;
	private static List<CompletePattern> abstractPatternNeo = null;
	
	private static List<CompletePattern> loadAbstractPattern(String format) throws NoSuchFileException {
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
	
	private static List<CompletePattern> loadAllPatternInstances(String format) throws NoSuchFileException {
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
