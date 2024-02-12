package qualitypatternmodel.newservlets;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import jakarta.servlet.ServletContext;
//import qualitypatternmodel.execution.Database;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.textrepresentation.PatternText;
import qualitypatternmodel.utility.EMFModelLoad;
//import qualitypatternmodel.utility.EMFModelSave;

public abstract class ServletUtilities {

	static public String PATTERNFOLDER = "serverpatterns";
	static public String CONSTRAINTFOLDER = "concrete-patterns";
	static public String TEMPLATEFOLDER = "abstract-patterns";
	static public String EXTENSION = "pattern";
	static public String XML = "xml";
	static public String RDF = "rdf";
	static public String NEO4J = "neo4j";
	static public List<String> TECHS = List.of(XML, RDF, NEO4J);
	static public String LVLALL = "all";
	static public String LVLTEMPLATE = "template";
	static public String LVLCONSTRAINT = "concrete";
	static public String LVLREADY = "ready";
	static public List<String> LEVELS = List.of(LVLALL, LVLTEMPLATE, LVLCONSTRAINT, LVLREADY);
	
	// Pattern request
	
	public static List<CompletePattern> getAllPattern(ServletContext context, String technology) {
		EList<CompletePattern> patterns = new BasicEList<CompletePattern>();
		List<CompletePattern> astr = loadAbstractPattern(context, technology);
		List<CompletePattern> conc = getReadyConstraints(context, technology);
		if (astr!=null)
			patterns.addAll(astr);
		if (conc!=null)
			patterns.addAll(conc);
		return patterns;
	}
	
	public static List<CompletePattern> getTemplates(ServletContext context, String technology) {
		return loadAbstractPattern(context, technology);
	}

	public static List<CompletePattern> getConstraints(ServletContext context, String technology) {
		return loadAllPatternInstances(context, technology);
	}
	
	public static List<CompletePattern> getReadyConstraints(ServletContext context, String technology) {
		List<CompletePattern> concrete = new BasicEList<CompletePattern>();
		List<CompletePattern> semiconcrete = loadAllPatternInstances(context, technology);
		if (semiconcrete != null)
			for (CompletePattern semi: semiconcrete) {
				try {
					semi.isValid(AbstractionLevel.CONCRETE);
					concrete.add(semi);
				} catch (Exception e) {}
			}
		return concrete;
	}
	
	// Pattern instantiation
	
//	public static CompletePattern instantiateAbstractPattern(String technology, String abstractId, String concreteId) throws IOException {
//		CompletePattern pattern = EMFModelLoad.loadAbstractPattern(technology, abstractId);
//		pattern.setPatternId(concreteId);
//		EMFModelSave.exportToFile2(pattern, technology, concreteId, EXTENSION);
//		return pattern;
//	}
	
//	public static CompletePattern copyConcretePattern(String technology, String concretePattern, String concretePatternName) throws IOException {
//		CompletePattern pattern = EMFModelLoad.loadConcretePattern(technology, concretePattern);
//		pattern.setPatternId(concretePatternName);
//		EMFModelSave.exportToFile2(pattern, technology, concretePatternName, EXTENSION);
//		return pattern;
//	}
	
	public static void deleteConstraint(String technology, String concretePattern) {
		// TODO
	}
	
	// database (not needed anymore!)
//	public static void saveDatabase(String technology, String dbname, String URL, String user, String password) {
//		// TODO
//	};
//	public static Database loadDatabase(String technology, String name) {
//		// TODO
//		return null;
//	};
//	public static List<Database> loadDatabases(String technology) {
//		// TODO
//		return null;
//	};
//	public static void deleteDatabase(String technology, String name) {
//		// TODO
//	};
	
	// pattern modification
	
//	abstract public void setDatabase(String patternName, String databaseName);
//	abstract public void setParameter(String patternName, int parameterIndex, String value);
	
	// pattern execution
	
//	abstract public String executePattern(String pattern);
	protected static String[] executePattern(CompletePattern pattern) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	// ---------------
	
	
	private static List<CompletePattern> abstractPatternXml = null;
	private static List<CompletePattern> abstractPatternRdf = null;
	private static List<CompletePattern> abstractPatternNeo = null;
	
	private static List<CompletePattern> loadAbstractPattern(ServletContext context, String technology) {
		String path = PATTERNFOLDER + "/" + technology + "/" + TEMPLATEFOLDER;
		try {
			abstractPatternXml = EMFModelLoad.loadCompletePatternFromFolder(context, path, EXTENSION);
			switch(technology) {
			case "xml": {
				if (abstractPatternXml == null)
					abstractPatternXml = EMFModelLoad.loadCompletePatternFromFolder(context, path, EXTENSION);
				return abstractPatternXml;
			}				
			case "rdf":{
				if (abstractPatternRdf == null)
					abstractPatternRdf = EMFModelLoad.loadCompletePatternFromFolder(context, path, EXTENSION);
				return abstractPatternRdf;
			}
				
			case "neo4j": {
				if (abstractPatternNeo == null)
					abstractPatternNeo = EMFModelLoad.loadCompletePatternFromFolder(context, path, EXTENSION);
				return abstractPatternNeo;
			}	
			default:
				return null;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private static List<CompletePattern> loadAllPatternInstances(ServletContext context, String technology) {
		try {
			if (TECHS.contains(technology))
				return EMFModelLoad.loadCompletePatternFromFolder(context, PATTERNFOLDER + "/" + technology + "/" + CONSTRAINTFOLDER, EXTENSION);
			else return null;
//			switch(technology) {
//			case "xml":
//			case "rdf":
//				return EMFModelLoad.loadCompletePatternFromFolder("serverpatterns/rdf/concrete-patterns", EXTENSION);
//			case "neo4j":
//				return EMFModelLoad.loadCompletePatternFromFolder("serverpatterns/neo4j/concrete-patterns", EXTENSION);
//			default:
//				return null;
//			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static JSONObject getPatternJSON(List<CompletePattern> patterns) {
		JSONObject json = new JSONObject();
		try {
			JSONArray templates = new JSONArray();
			for (CompletePattern pattern: patterns) {
				templates.put(getPatternJSON(pattern));
			}
			json.put("templates", templates);
		} catch (JSONException e) {}
		return json;
		
//		String result = "{\"Templates\": [ ";
//		for (CompletePattern pattern: patterns) {
//			result += getPatternJSON(pattern);
//		}
//		return result += "]}"; // templatelist end
	}
	
	public static JSONObject getPatternJSON(CompletePattern pattern) {
		JSONObject json = new JSONObject();
		try {
			json.put("patternID", pattern.getPatternId());
			json.put("name", pattern.getName());
			json.put("shortDescription", pattern.getShortDescription());
			json.put("description", pattern.getDescription());
			if (pattern.getDatabaseName() != null)
				json.put("database", pattern.getDatabaseName());
			if (pattern.getDataModelName() != null)
				json.put("datamodel", pattern.getDataModelName());
			if (pattern.getKeywords() != null && !pattern.getKeywords().isEmpty()) {
				JSONArray tags = new JSONArray(pattern.getKeywords());
				json.put("tag", tags);
			}
			
			Boolean executable;
			try {
				pattern.isValid(AbstractionLevel.CONCRETE);
				executable = true;				
			} catch (Exception e) {
				executable = false;
			}
			if (executable)
				json.put("keywords", pattern.getKeywords());
			json.put("executable", executable);
			
			JSONArray variants = new JSONArray();
			for (PatternText text: pattern.getText()) {
				variants.put(text.generateJSONObject());
			}
			json.put("variants", variants);
		} catch (JSONException e) {}
//		String json = "{";
//		json += "\"patternID\": \""+ pattern.getPatternId() + "\", ";
//		json += "\"name\": \""+ pattern.getName() + "\", ";
//		json += "\"patternDescShort\": \"" + pattern.getShortDescription() + "\", ";
//		json += "\"patternDesc\": \""+ pattern.getDescription() +"\",";
//		json += "\"database\": \""+ pattern.getDatabaseName() +"\",";
//		json += "\"datamodel\": \""+ pattern.getDataModelName() +"\",";
//		List<String> keywords = pattern.getKeywords();
//		String keywordsString = "\"keywords\": [";
//        for (int i = 0; i < keywords.size(); i++) {
//        	keywordsString += "\"" + keywords.get(i) + "\"";
//            if (i < keywords.size() - 1) {
//            	keywordsString += ",";
//            }
//        }
//        keywordsString += "], ";
//		json += keywordsString;
//		json += "\"variants\": [";
//		
//		List<PatternText> texts = pattern.getText();
//		for (int i = 0; i<texts.size(); i++) {
//			if (i>0)
//				json += ", ";
//			json += texts.get(i).generateJSON();
//		}
//		json += "]}"; // variant end and template end
		return json;
	}
	
	public static String getPatternJSONHeads(List<CompletePattern> patterns) {
		JSONArray jsonarray = new JSONArray();
		for (CompletePattern pattern: patterns) {
			jsonarray.put(getPatternJSONHead(pattern));
		}
		return jsonarray.toString();
//		String json = "{";
//		json += "\"patternID\": \""+ pattern.getPatternId() + "\", ";
//		json += "\"name\": \""+ pattern.getName() + "\", ";
//		json += "\"patternDescShort\": \"" + pattern.getShortDescription() + "\", ";
//		json += "\"patternDesc\": \""+ pattern.getDescription() +"\",";
//		json += "\"database\": \""+ pattern.getDatabaseName() +"\",";
//		json += "\"datamodel\": \""+ pattern.getDataModelName() +"\",";
//		List<String> keywords = pattern.getKeywords();
//		String keywordsString = "\"keywords\": [";
//        for (int i = 0; i < keywords.size(); i++) {
//        	keywordsString += "\"" + keywords.get(i) + "\"";
//            if (i < keywords.size() - 1) {
//            	keywordsString += ",";
//            }
//        }
//        keywordsString += "], ";
//		json += keywordsString;
//		json += "\"variants\": [";
//		
//		List<PatternText> texts = pattern.getText();
//		for (int i = 0; i<texts.size(); i++) {
//			if (i>0)
//				json += ", ";
//			json += texts.get(i).generateJSON();
//		}
//		json += "]}"; // variant end and template end
//		return json;
//		String result = "[";
//		for (CompletePattern pattern: patterns) {
//			result += "{\"patternID\":\"" + pattern.getPatternId() + "\", \"name\":\"" + pattern.getName() + "\", \"description\":\"" + pattern.getDescription() + "\"}, ";
//		}
//		return result += "]";
	}
	
	public static JSONObject getPatternJSONHead(CompletePattern pattern) {
		JSONObject json = new JSONObject();
		try {
			json.put("patternID", pattern.getPatternId());
			json.put("name", pattern.getName());
			json.put("shortDescription", pattern.getShortDescription());
			json.put("description", pattern.getDescription());
		} catch (JSONException e) {}
		return json;
		
	}

	protected static CompletePattern loadCompletePattern(String patternpath) {
		return EMFModelLoad.loadCompletePattern(patternpath, EXTENSION);
	};

	protected static CompletePattern loadConstraint(String technology, String name) {
		String patternpath = PATTERNFOLDER + "/" + technology + "/" + CONSTRAINTFOLDER + "/" + name + "." + EXTENSION;
		return EMFModelLoad.loadCompletePattern(patternpath, EXTENSION);
	};

	protected static CompletePattern loadTemplate(String technology, String name) {
		String patternpath = PATTERNFOLDER + "/" + technology + "/" + TEMPLATEFOLDER + "/" + name + "." + EXTENSION;
		return EMFModelLoad.loadCompletePattern(patternpath, EXTENSION);
	};

	public static void saveConstraint(String technology, String constraintId, CompletePattern pattern) {
		// TODO Auto-generated method stub
	}
	
	public static String generateNewId(String technology, String templateId, String variantname) throws IOException {
		// TODO
		// 1 check instance names
		String constraintPath = PATTERNFOLDER + "/" + technology + "/" + CONSTRAINTFOLDER;
		List<String> filenames = EMFModelLoad.getFilesInDirectory(constraintPath);
		filenames = filenames.stream().filter(x-> x.contains(templateId + "_" + variantname)).toList();
		
		
		//load(serverpatterns/logfile .toJSON / get
		//loadsavefile
		//getnextid
		
		return "newname";
	}
}
