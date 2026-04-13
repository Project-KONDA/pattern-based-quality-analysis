package qualitypatternmodel.utility;

import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

public class NewPatternInitialization {
	
	static String info = "Description\r\n"
			+ "Proposed identifier: CardContainsIfCompSet\r\n"
			+ "Name: default\r\n"
			+ "Scope: hierarchical\r\n"
			+ "Type: cond\r\n"
			+ "Template Text\r\n"
			+ "If a <Element> has a <Property A> that <Is / Is Not> in the list of <Terms> , it has <a Comparison with> <a Specific Number of> <Property B> that contain <a specific term> as a substring.\r\n"
			+ "Specific Example\r\n"
			+ "If a <Resource Set> has a <Term> that <Is> in the list of <3D-Objekt, 3D, 3D Objekt> , it has <at least> <1> <Link Resource> that contain <sketchfab> as a substring.\r\n"
			+ "Example Values\r\n"
			+ "If a <Digital Object> has a <Media Type> that <Is> in the list of <3D, 3D object> , it has <at least> <1> <Image Reference> that contain <sketchfab> as a substring.";

	static String variantid = "default";
	static String language = "xml";
	
	static String id;
	static String name;
	static String description;
	static String scope;
	static String type;
	static String sentence;
	static String sentence_example;

	public static void normalizeValues() {
		sentence = sentence.trim().replace(" +", " ");
		sentence_example = sentence_example.trim().replace(" +", " ");
	}

	public static String[] splitSentence(String sentence) {
		String[] split = sentence.split("(?=<)|(?<=>)");
		for (int i = split.length-1; i>=0; i--) {
			split[i] = split[i].trim();
		}
		return split;
	}

	public static boolean isParameter(String val) {
		return val.trim().startsWith("<") && val.trim().endsWith(">"); 
	}

	public static JSONObject makeFragment(String base, String example) {
		JSONObject object = new JSONObject();
		if (isParameter(base) && isParameter(example)) {
			base = base.replaceAll("^<|>$", "");
			example = example.replaceAll("^<|>$", "");
			object.put(ConstantsJSON.NAME, base);
			object.put(ConstantsJSON.EXAMPLEVALUE, example);
			object.put(ConstantsJSON.PARAMETER, new JSONArray());
			object.put(ConstantsJSON.DESCRIPTION, "");
		}
		else if (base.equals(example)) {
			String text = base.trim();
			if (!text.isBlank())
				object.put(ConstantsJSON.TEXT, text);
		}
		else {
			System.err.println("Fragments not fitting: '" + base + "' and '" + example + "'");
		}
		return object;
	}

	public static JSONArray makeFragments() {
		normalizeValues();
		
		String[] base = splitSentence(sentence);
		String[] example = splitSentence(sentence_example);
		if (base.length != example.length) {
			System.err.println(base.length);
			System.err.println(example.length);
			return null;
		}
		JSONArray array = new JSONArray();
		for (int i = 0; i<base.length; i++) {
			array.put(makeFragment(base[i], example[i]));
		}
		return array;
	}

	public static JSONObject makeVariant() {
		JSONObject object = new JSONObject();
		JSONObject custom = new JSONObject();
		object.put(ConstantsJSON.CUSTOM, custom);
		
		object.put(ConstantsJSON.TEMPLATE, id + "_" + language);
		object.put(ConstantsJSON.NAME, variantid);
		object.put(ConstantsJSON.LANGUAGE, language);
		object.put(ConstantsJSON.TYPE_CONSTRAINT, true);

		custom.put(ConstantsJSON.DESCRIPTION, variantid + " variant for " + id + "_" + language);
		custom.put("scope", scope);
		custom.put("type", new JSONArray(type.split(", ")));
		
		object.put(ConstantsJSON.FRAGMENTS, makeFragments());
		return object;
	}

	public static void saveVariant() throws IOException {
		String path = "src/qualitypatternmodel/newservlets/jsons/";
		String filename = id.toUpperCase() + "_" + language.toUpperCase() + "_" + variantid.toUpperCase() + ".json";
		JSONObject variant = makeVariant();
		Util.exportJson(variant, path + filename);
		System.out.println(variant.toString(4));	
	}
	
	public static void templateInfo() throws IOException {

		JSONObject info = new JSONObject();
		info.put(ConstantsJSON.ID, id);
		info.put(ConstantsJSON.NAME, name);
		info.put(ConstantsJSON.DESCRIPTION, description);
		
		
		String path = "src/qualitypatternmodel/newservlets/template_info.json";
		JSONObject template_info = Util.loadJson(path);
		template_info.put(id + "Pattern", info);
		Util.exportJson(template_info, path);

		System.out.println("Added in template_info.json");
		System.out.println("\"" + id + "Pattern\":" + info.toString(4));
	}
	
	public static void patternConstants() throws IOException {
		String path = "src/qualitypatternmodel/newservlets/initialisation/PatternConstants.java";
		String res =  "\r\n" + 
				"    public static String " + id.toUpperCase() + "_ID = \"" + id +  "\";\r\n" +
				"    public static String " + id.toUpperCase() + "_NAME = \"" + name +  "\";\r\n" +
				"    public static String " + id.toUpperCase() + "_DESCR = \"" + description +  "\";" +
				"\r\n}";
		
		String file = Util.loadFile(path);
		file = file.replaceAll("}\\s*$", "");
		file = file + res;
		Util.overrideFile(file, path);
		
		System.out.println("For PatternConstants.java");
		System.out.println(res);
		System.out.println();
	}

	public static void splitInfo() throws Exception {
		String[] infos = info.split("\r\n\\s*");
		for (int i = 0; i<infos.length; i++) {
			String part = infos[i];
			if (part.startsWith("Proposed identifier: ")) {
				id = part.replace("Proposed identifier: ", "").trim();
			}
			else if (part.startsWith("Name: ")) {
				name = part.replace("Name: ", "").trim();
			}	
			else if (part.startsWith("Description: ")) {
				description = part.replace("Description: ", "").trim();
			}
			else if (part.startsWith("Scope: ")) {
				scope = part.replace("Scope: ", "").trim();
			}				
			else if (part.startsWith("Type: ")) {
				type = part.replace("Type: ", "").trim();
			}
			else if (part.equals("Template Text") && infos.length > i+1) {
				sentence = infos[i+1].trim();
			}				
			else if (part.equals("Example Values") && infos.length > i+1) {
				sentence_example = infos[i+1].trim();
			}
		}
		if (id == null || id.isBlank()) 
			throw new Exception("id blank");
		if (name == null || name.isBlank())
			throw new Exception("name blank");
		if (description == null || description.isBlank())
			description = "";
		if (scope == null || scope.isBlank())
			throw new Exception("scope blank");
		if (type == null || type.isBlank())
			throw new Exception("type blank");
		if (sentence == null || sentence.isBlank())
			throw new Exception("sentence blank");
		if (sentence_example == null || sentence_example.isBlank())
			throw new Exception("sentence_example blank");
		
		for (String s: infos)
			System.out.println("- " + s);
		System.out.println();
	}

	public static void main(String[] args) throws Exception {
		splitInfo();
		saveVariant();
		patternConstants();
		templateInfo();
	}
}
