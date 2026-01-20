package junittests;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.json.JSONArray;
import org.json.JSONObject;
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
	static JSONObject jsoninitialize = null;

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
        	JSONArray source = jsoninitialize.getJSONArray("validateLink");
        	for(int i = 0; i<source.length(); i++) {
        		JSONObject testcase = source.getJSONObject(i);
        		args.add(Arguments.of(testcase.getString("link"), testcase.getBoolean("expected")));
        	}
    	} catch(Exception e) {}
    	return args;
    }

    static List<Arguments> linkImageMinSizeSource() {
    	List<Arguments> args = new BasicEList<Arguments>();
    	try {
	    	JSONArray source = jsoninitialize.getJSONArray("linkImageMinSize");
	    	for(int i = 0; i<source.length(); i++) {
	    		JSONObject testcase = source.getJSONObject(i);
	    		args.add(Arguments.of(testcase.getString("link"), testcase.getInt("size"), testcase.getBoolean("expected")));
	    	}
		} catch(Exception e) {}
    	return args;
    }

    static List<Arguments> linkMimeTypeSource() {
    	List<Arguments> args = new BasicEList<Arguments>();
    	try {
	    	JSONArray source = jsoninitialize.getJSONArray("linkMimeType");
	    	for(int i = 0; i<source.length(); i++) {
	    		JSONObject testcase = source.getJSONObject(i);
	    		args.add(Arguments.of(testcase.getString("link"), testcase.getString("type"), testcase.getBoolean("expected")));
	    	}
    	} catch(Exception e) {}
    	return args;
    }

    static List<Arguments> linkSourceSource() {
    	List<Arguments> args = new BasicEList<Arguments>();
    	try {
	    	JSONArray source = jsoninitialize.getJSONArray("linkSource");
	    	for(int i = 0; i<source.length(); i++) {
	    		JSONObject testcase = source.getJSONObject(i);
	    		args.add(Arguments.of(testcase.getString("link"), testcase.getString("source"), testcase.getBoolean("expected")));
	    	}
    	} catch(Exception e) {}
    	return args;
    }

	// __________ TESTS __________

	@ParameterizedTest
    @MethodSource("validateLinkSource")
	public void testValidateLinkOperatorApply(String url, Boolean expected) {
		Boolean result = ValidateLinkOperatorImpl.apply2(url, false);
		assert (result == expected);
	}

	@ParameterizedTest
    @MethodSource("linkImageMinSizeSource")
	public void testLinkImageMinSizeOperatorApply(String url, int size, Boolean expected) {
		Boolean result = LinkImageMinSizeOperatorImpl.apply2(url, false, size, size);
		assert (result == expected);
	}

	@ParameterizedTest
    @MethodSource("linkMimeTypeSource")
	public void testLinkMimeTypeOperatorApply(String url, String type, Boolean expected) {
		Boolean result = LinkMimeTypeOperatorImpl.apply2(url, false, Arrays.asList(new String[] {type}));
		assert (result == expected);
	}

	@ParameterizedTest
    @MethodSource("linkSourceSource")
	public void testLinkSourceOperatorImplApply(String url, String source, Boolean expected) {
		Boolean result = LinkSourceOperatorImpl.apply2(url, false, Arrays.asList(new String[] {source}));
		assert (result == expected);
	}

}
