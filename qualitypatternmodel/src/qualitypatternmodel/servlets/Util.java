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
	        String fileNames = "[";
			for(File f : files) {
				fileNames += f.getName().split("\\.")[0] + ", ";
			}
			fileNames = fileNames.substring(0, fileNames.length()-2);
			fileNames += "]";
			return fileNames;			     
			
		} else {
			return null;
		}
	}
}
