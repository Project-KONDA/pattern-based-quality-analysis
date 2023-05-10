package qualitypatternmodel.servlets;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Util {
	static final String ABSTRACT_PATTERNS_PATH = "../../abstract-patterns/";
	static final String CONCRETE_PATTERNS_PATH = "../../concrete-patterns/";
	static final String DATABASES_PATH = "../../databases/";
	
	static final String DATABASES_NAME = "databases";


	public static final String PROJECT_PREFIX_ENDPOINT = "/qualitypatternmodel";
	
	public static final String PARAMETER_EXPLANATIONS_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/parameter-explanations";
	public static final String ABSTRACT_PATTERN_LIST_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/abstract-patterns";
	public static final String CONCRETE_PATTERN_LIST_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/concrete-patterns";
	public static final String DATABASES_LIST_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/databases";

	public static final String ABSTRACT_PATTERN_TEXT_LIST_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/abstract-patterns/text-list/";
	public static final String INSTANTIATION_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/abstract-patterns/instantiation/";
	public static final String CONCRETE_PATTERN_DELETION_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/concrete-patterns/deletion/";
	public static final String CONCRETE_PATTERN_TEXT_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/concrete-patterns/text/";
	public static final String ABSTRACT_PATTERN_TEXT_DELETION_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/abstract-patterns/text/deletion/";
	public static final String CONCRETISATION_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/concrete-patterns/parameter/";
	public static final String APPLICATION_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/finalized-patterns/application";
	public static final String DESCRIPTION_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/concrete-patterns/description/";
	public static final String CONCRETISATION_FINALIZATION_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/concrete-patterns/finalization/";
	public static final String SCHEMA_VALIDATION_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/concrete-patterns/schema-validation/";
	public static final String QUERY_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/concrete-patterns/query/";
	public static final String FINALIZED_PATTERN_LIST_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/finalized-patterns";
	public static final String FINALIZED_PATTERN_DATABASE_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/finalized-patterns/database/";

	
	public static final String DATABASE_REGISTRATION_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/databases/registration/";
	public static final String DATABASE_SETTING_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/databases/set/";
	public static final String DATABASE_DELETION_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/databases/deletion/";
	public static final String DATABASE_GETTING_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/xml/databases/get/";





	
	public static String getFileNamesInFolder(String path, Class<?> clas) throws URISyntaxException {
		URL url = clas.getClassLoader().getResource(path);		
		if(url != null) {			
			File[] files = Paths.get(url.toURI()).toFile().listFiles();
			if(files.length == 0) {
				return "";
			}
//			String json = "{\"Patterns\": [";
			String json = "[";
			for(File f : files) {
				json += "\"" + f.getName().split("\\.")[0] + "\", ";
			}
			json = json.substring(0, json.length()-2);
//			json += "]}";
			json += "]";
			return json;			     
			
		} else {
			return null;
		}
	}
	
	public static ArrayList<String> getListOfFileNamesInFolder(String path, Class<?> clas) throws URISyntaxException {
		URL url = clas.getClassLoader().getResource(path);
		ArrayList<String> fileNames = new ArrayList<String>();
		if(url != null) {			
			File[] files = Paths.get(url.toURI()).toFile().listFiles();
			if(files.length == 0) {
				return null;
			}
			for(File f : files) {
				fileNames.add(f.getName().split("\\.")[0]);
			}
			return fileNames;			     
			
		} else {
			return null;
		}
	}
}
