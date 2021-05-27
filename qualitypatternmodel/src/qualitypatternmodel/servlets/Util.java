package qualitypatternmodel.servlets;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

public class Util {
	static final String ABSTRACT_PATTERNS_PATH = "../../abstract-patterns/";
	static final String CONCRETE_PATTERNS_PATH = "../../concrete-patterns/";

	public static final String PROJECT_PREFIX_ENDPOINT = "/qualitypatternmodel";
	
	public static final String ABSTRACT_PATTERN_LIST_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/abstract-patterns";
	public static final String CONCRETE_PATTERN_LIST_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/concrete-patterns";
	public static final String ABSTRACT_PATTERN_TEXT_LIST_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/abstract-patterns/text-list/";
	public static final String INSTANTIATION_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/abstract-patterns/instantiation/";
	public static final String CONCRETE_PATTERN_DELETION_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/concrete-patterns/deletion/";
	public static final String CONCRETE_PATTERN_TEXT_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/concrete-patterns/text/";
	public static final String ABSTRACT_PATTERN_TEXT_DELETION_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/abstract-patterns/text/deletion/";
	public static final String CONCRETISATION_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/concrete-patterns/parameter/";
	public static final String CONCRETISATION_FINALIZATION_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/concrete-patterns/finalization/";
	public static final String QUERY_ENDPOINT = PROJECT_PREFIX_ENDPOINT + "/concrete-patterns/query/";

	
	public static String getFileNamesInFolder(String path, Class clas) throws URISyntaxException {
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
}
