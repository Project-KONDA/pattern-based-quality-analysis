package utility;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONException;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import qualitypatternmodel.newservlets.ServletUtilities;


public class NewIdTest {
	static String path = "D:/somefile.json";
	
	@AfterAll
	public static void clearFile() throws IOException {
		Files.delete(Paths.get(path));
	}

	@Test
	public void testIncrease() throws IOException, JSONException {
		assertEquals(1, ServletUtilities.increaseNumber(path, "a", null));
		assertEquals(2, ServletUtilities.increaseNumber(path, "a", null));
		assertEquals(3, ServletUtilities.increaseNumber(path, "a", null));
		assertEquals(1, ServletUtilities.increaseNumber(path, "b", null));
		assertEquals(2, ServletUtilities.increaseNumber(path, "b", null));
		assertEquals(1, ServletUtilities.increaseNumber(path, "c", "d"));
		assertEquals(2, ServletUtilities.increaseNumber(path, "c", "d")); 
		assertEquals(3, ServletUtilities.increaseNumber(path, "c", "d"));
	}

	@Test
	public void testDecrease() throws JSONException, IOException {
		assertEquals(0, ServletUtilities.decreaseNumber(path, "e", null));
		assertEquals(0, ServletUtilities.decreaseNumber(path, "e", null));
		ServletUtilities.setNumber(path, "e", 2, null);
		assertEquals(1, ServletUtilities.decreaseNumber(path, "e", null));
		assertEquals(0, ServletUtilities.decreaseNumber(path, "e", null));
		assertEquals(0, ServletUtilities.decreaseNumber(path, "e", null));
		assertEquals(0, ServletUtilities.decreaseNumber(path, "e", "f"));
		ServletUtilities.setNumber(path, "e", 100, "f");
		assertEquals(99, ServletUtilities.decreaseNumber(path, "e", "f"));
	}

	@Test
	public void testSet() throws IOException, JSONException {
		assertEquals(0, ServletUtilities.getNumber(path, "g", "h"));
		ServletUtilities.setNumber(path, "g", 50, "h");
		assertEquals(50, ServletUtilities.getNumber(path, "g", "h"));
		ServletUtilities.setNumber(path, "g", 100, "h");
		assertEquals(100, ServletUtilities.getNumber(path, "g", "h"));
	}
}