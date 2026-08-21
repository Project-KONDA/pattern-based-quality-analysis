package junittests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import qualitypatternmodel.javaoperators.impl.LinkImageMinSizeOperatorImpl;
import qualitypatternmodel.javaoperators.impl.LinkMimeTypeOperatorImpl;
import qualitypatternmodel.javaoperators.impl.LinkSourceOperatorImpl;
import qualitypatternmodel.javaoperators.impl.ValidateLinkOperatorImpl;
import qualitypatternmodel.newservlets.InitialisationServlet;

public class JavaFunctionTests {

	// __________ SETUP __________
	static ObjectNode jsoninitialize = null;

	@BeforeAll
	public static void initialize() throws IOException {
		File file = new File("test/junittests/JavaFunctionTestsInput.json");
		if (!file.exists()) {
			throw new RuntimeException("File " + file.getAbsolutePath() + "is missing!" );
		}
		jsoninitialize = InitialisationServlet.readJsonFromFile(file);
	}

	// __________ SOURCE __________

    static List<Arguments> validateLinkSource() {
    	List<Arguments> args = new BasicEList<Arguments>();
    	try {
        	ArrayNode source = (ArrayNode) jsoninitialize.get("validateLink");
        	for(int i = 0; i<source.size(); i++) {
        		ObjectNode testcase = (ObjectNode) source.get(i);
        		args.add(Arguments.of(testcase.get("link").asText(), testcase.get("expected").asBoolean()));
        	}
    	} catch(Exception e) {}
    	return args;
    }

    static List<Arguments> linkImageMinSizeSource() {
    	List<Arguments> args = new BasicEList<Arguments>();
    	try {
	    	ArrayNode source = (ArrayNode) jsoninitialize.get("linkImageMinSize");
	    	for(int i = 0; i<source.size(); i++) {
	    		ObjectNode testcase = (ObjectNode) source.get(i);
	    		args.add(Arguments.of(testcase.get("link").asText(), testcase.get("size").asInt(), testcase.get("expected").asBoolean()));
	    	}
		} catch(Exception e) {}
    	return args;
    }

    static List<Arguments> linkMimeTypeSource() {
    	List<Arguments> args = new BasicEList<Arguments>();
    	try {
	    	ArrayNode source = (ArrayNode) jsoninitialize.get("linkMimeType");
	    	for(int i = 0; i<source.size(); i++) {
	    		ObjectNode testcase = (ObjectNode) source.get(i);
	    		args.add(Arguments.of(testcase.get("link").asText(), testcase.get("type").asText(), testcase.get("expected").asBoolean()));
	    	}
    	} catch(Exception e) {}
    	return args;
    }

    static List<Arguments> linkSourceSource() {
    	List<Arguments> args = new BasicEList<Arguments>();
    	try {
	    	ArrayNode source = (ArrayNode) jsoninitialize.get("linkSource");
	    	for(int i = 0; i<source.size(); i++) {
	    		ObjectNode testcase = (ObjectNode) source.get(i);
	    		args.add(Arguments.of(testcase.get("link").asText(), testcase.get("source").asText(), testcase.get("expected").asBoolean()));
	    	}
    	} catch(Exception e) {}
    	return args;
    }

	// __________ TESTS __________

	@ParameterizedTest
    @MethodSource("validateLinkSource")
	public void testValidateLinkOperatorApply(String url, Boolean expected) {
		if (expected && isOffline(url))
			return;
		Boolean result = ValidateLinkOperatorImpl.apply2(url, false);
		assert (result == expected);
	}

	@ParameterizedTest
    @MethodSource("linkImageMinSizeSource")
	public void testLinkImageMinSizeOperatorApply(String url, int size, Boolean expected) {
		if (expected && isOffline(url))
			return;
		Boolean result = LinkImageMinSizeOperatorImpl.apply2(url, false, size, size);
		assertEquals(expected, result);
	}

	@ParameterizedTest
    @MethodSource("linkMimeTypeSource")
	public void testLinkMimeTypeOperatorApply(String url, String type, Boolean expected) {
		if (expected && isOffline(url))
			return;
		Boolean result = LinkMimeTypeOperatorImpl.apply2(url, false, Arrays.asList(new String[] {type}));
		assertEquals(expected, result);
	}

	@ParameterizedTest
    @MethodSource("linkSourceSource")
	public void testLinkSourceOperatorImplApply(String url, String source, Boolean expected) {
		if (expected && isOffline(url))
			return;
		Boolean result = LinkSourceOperatorImpl.apply2(url, false, Arrays.asList(new String[] {source}));
		assertEquals(expected, result);
	}

	private static boolean isOffline(String link) {
	    try {
	    	link = link.trim();
	    	URI uri = URI.create(link);
	    	URL url = uri.toURL();
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	        connection.setRequestMethod("GET");
	        connection.setConnectTimeout(50);
	        connection.setReadTimeout(5000);
	        connection.getResponseCode();
	        return false;
	    } catch (Exception e) {
	    	System.err.println("URL '" + link + "' is offline: " + e.getMessage());
	    	return true;
	    }
	}
}
