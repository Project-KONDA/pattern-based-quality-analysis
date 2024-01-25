package qualitypatternmodel.newservlets;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ServeletUtility {

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
