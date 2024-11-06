package utility;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONException;

import qualitypatternmodel.newservlets.ServletUtilities;


public class NewIdTest {

	public static void main(String[] args) throws IOException, JSONException {
		String path = "E:/somefile.json";
		System.out.println(ServletUtilities.getNextNumber(path, "hello"));
		System.out.println(ServletUtilities.getNextNumber(path, "hello"));
		System.out.println(ServletUtilities.getNextNumber(path, "hello"));
		System.out.println(ServletUtilities.getNextNumber(path, "hello"));
		System.out.println(ServletUtilities.getNextNumber(path, "hello"));
		System.out.println(ServletUtilities.getNextNumber(path, "bye"));
		System.out.println(ServletUtilities.getNextNumber(path, "bye"));
		System.out.println(ServletUtilities.getNextNumber(path, "hello"));
		Files.delete(Paths.get(path));

	}

}
