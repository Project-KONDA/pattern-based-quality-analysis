package qualitypatternmodel.servlets;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

public class Util {
	public static String getFileNamesInFolder(String path, Class clas) throws URISyntaxException {
		URL url = clas.getClassLoader().getResource(path);		
		if(url != null) {			
			File[] files = Paths.get(url.toURI()).toFile().listFiles();
			String json = "{\"Patterns\" : [";
			for(File f : files) {
				json += f.getName().split("\\.")[0] + ", ";
			}
			json = json.substring(0, json.length()-2);
			json += "]}";
			return json;			     
			
		} else {
			return null;
		}
	}
}
