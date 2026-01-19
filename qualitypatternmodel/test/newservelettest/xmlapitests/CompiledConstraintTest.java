package newservelettest.xmlapitests;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.mock;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import qualitypatternmodel.exceptions.FailedServletCallException;
import qualitypatternmodel.exceptions.InvalidServletCallException;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.newservlets.ConstraintExecuteServlet;
import qualitypatternmodel.utility.ConstantsJSON;

public class CompiledConstraintTest {
	private static final boolean DELETE = true;
	private static String folder;
	
	private static String[] compiledJson = {
//			"{ \"filter\": { \"filter\": { \"argument\": 2, \"subfilters\": [{ \"argument\": 3, \"subfilter\": { \"argument\": 4, \"negate\": true, \"functionclass\": \"ValidateLinkOperatorImpl\", \"class\": \"OneArgFunctionFilterPartImpl\" }, \"quantifier\": \"EXISTS\", \"class\": \"ListFilterPartImpl\" }], \"quantifier\": \"EXISTS\", \"class\": \"QuantifierFilterPartImpl\" }, \"patternName\": \"Valid Link (Single)\", \"patternId\": \"_Gn_OMPCsEfCjW9rWbVlP4w\", \"query\": \"declare default element namespace 'http://www.lido-schema.org';\\ndeclare namespace owl='http://www.w3.org/2002/07/owl#';\\ndeclare namespace gml='http://www.opengis.net/gml';\\ndeclare namespace tei='http://www.tei-c.org/ns/1.0';\\ndeclare namespace skos='http://www.w3.org/2004/02/skos/core#';\\nfor $var1_0 in /descendant::lido/child::administrativeMetadata/child::resourceWrap/child::resourceSet/child::resourceRepresentation/child::linkResource/text()\\nreturn\\n \\n <interim>\\n <return>\\n {\\n string($var1_0)\\n }\\n <\\/return>\\n <condition>\\n <quantifier>\\n {\\n <value>{string($var1_0)}<\\/value>\\n }\\n <\\/quantifier>\\n <\\/condition>\\n <\\/interim>\", \"language\": \"XML\", \"structure\": { \"record\": { \"id\": 5, \"class\": \"ValueInterimImpl\" }, \"class\": \"InterimResultStructureImpl\", \"substructure\": { \"contained\": [{ \"contained\": { \"id\": 4, \"class\": \"ValueInterimImpl\" }, \"id\": 3, \"class\": \"VariableContainerInterimImpl\" }], \"id\": 2, \"class\": \"FixedContainerInterimImpl\" } } }, \"constraintID\": \"ValidLinkSin_xml_default_0\", \"queryLine\": \"declare default element namespace 'http://www.lido-schema.org'; declare namespace owl='http://www.w3.org/2002/07/owl#'; declare namespace gml='http://www.opengis.net/gml'; declare namespace tei='http://www.tei-c.org/ns/1.0'; declare namespace skos='http://www.w3.org/2004/02/skos/core#'; for $var1_0 in /descendant::lido/child::administrativeMetadata/child::resourceWrap/child::resourceSet/child::resourceRepresentation/child::linkResource/text() return <interim> <return> { string($var1_0) } <\\/return> <condition> <quantifier> { <value>{string($var1_0)}<\\/value> } <\\/quantifier> <\\/condition> <\\/interim>\", \"custom\": {\"description\": \"default variant for ValidLinkSin_xml\"}, \"query\": \"declare default element namespace 'http://www.lido-schema.org';\\ndeclare namespace owl='http://www.w3.org/2002/07/owl#';\\ndeclare namespace gml='http://www.opengis.net/gml';\\ndeclare namespace tei='http://www.tei-c.org/ns/1.0';\\ndeclare namespace skos='http://www.w3.org/2004/02/skos/core#';\\nfor $var1_0 in /descendant::lido/child::administrativeMetadata/child::resourceWrap/child::resourceSet/child::resourceRepresentation/child::linkResource/text()\\nreturn\\n \\n <interim>\\n <return>\\n {\\n string($var1_0)\\n }\\n <\\/return>\\n <condition>\\n <quantifier>\\n {\\n <value>{string($var1_0)}<\\/value>\\n }\\n <\\/quantifier>\\n <\\/condition>\\n <\\/interim>\", \"name\": \"Valid Link (Single)\", \"language\": \"XQuery\", \"technology\": \"xml\", \"queryPartialLine\": \"declare default element namespace 'http://www.lido-schema.org'; declare namespace owl='http://www.w3.org/2002/07/owl#'; declare namespace gml='http://www.opengis.net/gml'; declare namespace tei='http://www.tei-c.org/ns/1.0'; declare namespace skos='http://www.w3.org/2004/02/skos/core#'; for $var1_0 in /descendant::lido/child::administrativeMetadata/child::resourceWrap/child::resourceSet/child::resourceRepresentation/child::linkResource/text() return $var1_0\", \"queryPartial\": \"declare default element namespace 'http://www.lido-schema.org';\\ndeclare namespace owl='http://www.w3.org/2002/07/owl#';\\ndeclare namespace gml='http://www.opengis.net/gml';\\ndeclare namespace tei='http://www.tei-c.org/ns/1.0';\\ndeclare namespace skos='http://www.w3.org/2004/02/skos/core#';\\nfor $var1_0 in /descendant::lido/child::administrativeMetadata/child::resourceWrap/child::resourceSet/child::resourceRepresentation/child::linkResource/text()\\nreturn $var1_0\" }",
			"{ \"filter\": { \"filter\": { \"argument\": 2, \"subfilters\": [{ \"argument\": 3, \"subfilter\": { \"argument\": 4, \"negate\": false, \"number1\": 500, \"number2\": 500, \"functionclass\": \"LinkImageMinSizeOperatorImpl\", \"class\": \"OneArgTwoNumberFunctionFilterPartImpl\" }, \"quantifier\": \"EXISTS\", \"class\": \"ListFilterPartImpl\" }], \"quantifier\": \"EXISTS\", \"class\": \"QuantifierFilterPartImpl\" }, \"patternName\": \"Arno Test Image Sin 200x200 New\", \"patternId\": \"_lz-BIPUiEfCyt_5nFeFE6A\", \"query\": \"declare default element namespace 'http://www.lido-schema.org';\\ndeclare namespace owl='http://www.w3.org/2002/07/owl#';\\ndeclare namespace gml='http://www.opengis.net/gml';\\ndeclare namespace tei='http://www.tei-c.org/ns/1.0';\\ndeclare namespace skos='http://www.w3.org/2004/02/skos/core#';\\nfor $var1_0 in /descendant::lido/child::administrativeMetadata/child::resourceWrap/child::resourceSet/child::resourceRepresentation/child::linkResource/text()\\nreturn\\n \\n <interim>\\n <return>\\n {\\n string($var1_0)\\n }\\n <\\/return>\\n <condition>\\n <quantifier>\\n {\\n <value>{string($var1_0)}<\\/value>\\n }\\n <\\/quantifier>\\n <\\/condition>\\n <\\/interim>\", \"language\": \"XML\", \"structure\": { \"record\": { \"id\": 5, \"class\": \"ValueInterimImpl\" }, \"class\": \"InterimResultStructureImpl\", \"substructure\": { \"contained\": [{ \"contained\": { \"id\": 4, \"class\": \"ValueInterimImpl\" }, \"id\": 3, \"class\": \"VariableContainerInterimImpl\" }], \"id\": 2, \"class\": \"FixedContainerInterimImpl\" } } }, \"constraintID\": \"LinkImageSizeSin_xml_default_1\", \"queryLine\": \"declare default element namespace 'http://www.lido-schema.org'; declare namespace owl='http://www.w3.org/2002/07/owl#'; declare namespace gml='http://www.opengis.net/gml'; declare namespace tei='http://www.tei-c.org/ns/1.0'; declare namespace skos='http://www.w3.org/2004/02/skos/core#'; for $var1_0 in /descendant::lido/child::administrativeMetadata/child::resourceWrap/child::resourceSet/child::resourceRepresentation/child::linkResource/text() return <interim> <return> { string($var1_0) } <\\/return> <condition> <quantifier> { <value>{string($var1_0)}<\\/value> } <\\/quantifier> <\\/condition> <\\/interim>\", \"custom\": {\"description\": \"default variant for LinkImageSizeSin_xml\"}, \"query\": \"declare default element namespace 'http://www.lido-schema.org';\\ndeclare namespace owl='http://www.w3.org/2002/07/owl#';\\ndeclare namespace gml='http://www.opengis.net/gml';\\ndeclare namespace tei='http://www.tei-c.org/ns/1.0';\\ndeclare namespace skos='http://www.w3.org/2004/02/skos/core#';\\nfor $var1_0 in /descendant::lido/child::administrativeMetadata/child::resourceWrap/child::resourceSet/child::resourceRepresentation/child::linkResource/text()\\nreturn\\n \\n <interim>\\n <return>\\n {\\n string($var1_0)\\n }\\n <\\/return>\\n <condition>\\n <quantifier>\\n {\\n <value>{string($var1_0)}<\\/value>\\n }\\n <\\/quantifier>\\n <\\/condition>\\n <\\/interim>\", \"name\": \"Arno Test Image Sin 200x200 New\", \"language\": \"XQuery\", \"technology\": \"xml\", \"queryPartialLine\": \"declare default element namespace 'http://www.lido-schema.org'; declare namespace owl='http://www.w3.org/2002/07/owl#'; declare namespace gml='http://www.opengis.net/gml'; declare namespace tei='http://www.tei-c.org/ns/1.0'; declare namespace skos='http://www.w3.org/2004/02/skos/core#'; for $var1_0 in /descendant::lido/child::administrativeMetadata/child::resourceWrap/child::resourceSet/child::resourceRepresentation/child::linkResource/text() return $var1_0\", \"queryPartial\": \"declare default element namespace 'http://www.lido-schema.org';\\ndeclare namespace owl='http://www.w3.org/2002/07/owl#';\\ndeclare namespace gml='http://www.opengis.net/gml';\\ndeclare namespace tei='http://www.tei-c.org/ns/1.0';\\ndeclare namespace skos='http://www.w3.org/2004/02/skos/core#';\\nfor $var1_0 in /descendant::lido/child::administrativeMetadata/child::resourceWrap/child::resourceSet/child::resourceRepresentation/child::linkResource/text()\\nreturn $var1_0\" }",
			"{ \"filter\": { \"filter\": { \"argument\": 2, \"subfilters\": [{ \"argument\": 3, \"subfilter\": { \"argument\": 4, \"negate\": true, \"number1\": 500, \"number2\": 500, \"functionclass\": \"LinkImageMinSizeOperatorImpl\", \"class\": \"OneArgTwoNumberFunctionFilterPartImpl\" }, \"quantifier\": \"EXISTS\", \"class\": \"ListFilterPartImpl\" }], \"quantifier\": \"EXISTS\", \"class\": \"QuantifierFilterPartImpl\" }, \"patternName\": \"Arno Test Image Sin 200x200 New\", \"patternId\": \"_lz-BIPUiEfCyt_5nFeFE6A\", \"query\": \"declare default element namespace 'http://www.lido-schema.org';\\ndeclare namespace owl='http://www.w3.org/2002/07/owl#';\\ndeclare namespace gml='http://www.opengis.net/gml';\\ndeclare namespace tei='http://www.tei-c.org/ns/1.0';\\ndeclare namespace skos='http://www.w3.org/2004/02/skos/core#';\\nfor $var1_0 in /descendant::lido/child::administrativeMetadata/child::resourceWrap/child::resourceSet/child::resourceRepresentation/child::linkResource/text()\\nreturn\\n \\n <interim>\\n <return>\\n {\\n string($var1_0)\\n }\\n <\\/return>\\n <condition>\\n <quantifier>\\n {\\n <value>{string($var1_0)}<\\/value>\\n }\\n <\\/quantifier>\\n <\\/condition>\\n <\\/interim>\", \"language\": \"XML\", \"structure\": { \"record\": { \"id\": 5, \"class\": \"ValueInterimImpl\" }, \"class\": \"InterimResultStructureImpl\", \"substructure\": { \"contained\": [{ \"contained\": { \"id\": 4, \"class\": \"ValueInterimImpl\" }, \"id\": 3, \"class\": \"VariableContainerInterimImpl\" }], \"id\": 2, \"class\": \"FixedContainerInterimImpl\" } } }, \"constraintID\": \"LinkImageSizeSin_xml_default_1\", \"queryLine\": \"declare default element namespace 'http://www.lido-schema.org'; declare namespace owl='http://www.w3.org/2002/07/owl#'; declare namespace gml='http://www.opengis.net/gml'; declare namespace tei='http://www.tei-c.org/ns/1.0'; declare namespace skos='http://www.w3.org/2004/02/skos/core#'; for $var1_0 in /descendant::lido/child::administrativeMetadata/child::resourceWrap/child::resourceSet/child::resourceRepresentation/child::linkResource/text() return <interim> <return> { string($var1_0) } <\\/return> <condition> <quantifier> { <value>{string($var1_0)}<\\/value> } <\\/quantifier> <\\/condition> <\\/interim>\", \"custom\": {\"description\": \"default variant for LinkImageSizeSin_xml\"}, \"query\": \"declare default element namespace 'http://www.lido-schema.org';\\ndeclare namespace owl='http://www.w3.org/2002/07/owl#';\\ndeclare namespace gml='http://www.opengis.net/gml';\\ndeclare namespace tei='http://www.tei-c.org/ns/1.0';\\ndeclare namespace skos='http://www.w3.org/2004/02/skos/core#';\\nfor $var1_0 in /descendant::lido/child::administrativeMetadata/child::resourceWrap/child::resourceSet/child::resourceRepresentation/child::linkResource/text()\\nreturn\\n \\n <interim>\\n <return>\\n {\\n string($var1_0)\\n }\\n <\\/return>\\n <condition>\\n <quantifier>\\n {\\n <value>{string($var1_0)}<\\/value>\\n }\\n <\\/quantifier>\\n <\\/condition>\\n <\\/interim>\", \"name\": \"Arno Test Image Sin 200x200 New\", \"language\": \"XQuery\", \"technology\": \"xml\", \"queryPartialLine\": \"declare default element namespace 'http://www.lido-schema.org'; declare namespace owl='http://www.w3.org/2002/07/owl#'; declare namespace gml='http://www.opengis.net/gml'; declare namespace tei='http://www.tei-c.org/ns/1.0'; declare namespace skos='http://www.w3.org/2004/02/skos/core#'; for $var1_0 in /descendant::lido/child::administrativeMetadata/child::resourceWrap/child::resourceSet/child::resourceRepresentation/child::linkResource/text() return $var1_0\", \"queryPartial\": \"declare default element namespace 'http://www.lido-schema.org';\\ndeclare namespace owl='http://www.w3.org/2002/07/owl#';\\ndeclare namespace gml='http://www.opengis.net/gml';\\ndeclare namespace tei='http://www.tei-c.org/ns/1.0';\\ndeclare namespace skos='http://www.w3.org/2004/02/skos/core#';\\nfor $var1_0 in /descendant::lido/child::administrativeMetadata/child::resourceWrap/child::resourceSet/child::resourceRepresentation/child::linkResource/text()\\nreturn $var1_0\" }",
			"{ \"filter\": { \"filter\": { \"argument\": 2, \"subfilters\": [{ \"argument\": 3, \"subfilter\": { \"argument\": 4, \"negate\": true, \"functionclass\": \"ValidateLinkOperatorImpl\", \"class\": \"OneArgFunctionFilterPartImpl\" }, \"quantifier\": \"EXISTS\", \"class\": \"ListFilterPartImpl\" }], \"quantifier\": \"EXISTS\", \"class\": \"QuantifierFilterPartImpl\" }, \"patternName\": \"Valid Link (Single)\", \"patternId\": \"_Gn_OMPCsEfCjW9rWbVlP4w\", \"query\": \"declare default element namespace 'http://www.lido-schema.org';\\ndeclare namespace owl='http://www.w3.org/2002/07/owl#';\\ndeclare namespace gml='http://www.opengis.net/gml';\\ndeclare namespace tei='http://www.tei-c.org/ns/1.0';\\ndeclare namespace skos='http://www.w3.org/2004/02/skos/core#';\\nfor $var1_0 in /descendant::lido/child::administrativeMetadata/child::resourceWrap/child::resourceSet/child::resourceRepresentation/child::linkResource/text()\\nreturn\\n \\n <interim>\\n <return>\\n {\\n string($var1_0)\\n }\\n <\\/return>\\n <condition>\\n <quantifier>\\n {\\n <value>{string($var1_0)}<\\/value>\\n }\\n <\\/quantifier>\\n <\\/condition>\\n <\\/interim>\", \"language\": \"XML\", \"structure\": { \"record\": { \"id\": 5, \"class\": \"ValueInterimImpl\" }, \"class\": \"InterimResultStructureImpl\", \"substructure\": { \"contained\": [{ \"contained\": { \"id\": 4, \"class\": \"ValueInterimImpl\" }, \"id\": 3, \"class\": \"VariableContainerInterimImpl\" }], \"id\": 2, \"class\": \"FixedContainerInterimImpl\" } } }, \"constraintID\": \"ValidLinkSin_xml_default_0\", \"queryLine\": \"declare default element namespace 'http://www.lido-schema.org'; declare namespace owl='http://www.w3.org/2002/07/owl#'; declare namespace gml='http://www.opengis.net/gml'; declare namespace tei='http://www.tei-c.org/ns/1.0'; declare namespace skos='http://www.w3.org/2004/02/skos/core#'; for $var1_0 in /descendant::lido/child::administrativeMetadata/child::resourceWrap/child::resourceSet/child::resourceRepresentation/child::linkResource/text() return <interim> <return> { string($var1_0) } <\\/return> <condition> <quantifier> { <value>{string($var1_0)}<\\/value> } <\\/quantifier> <\\/condition> <\\/interim>\", \"custom\": {\"description\": \"default variant for ValidLinkSin_xml\"}, \"query\": \"declare default element namespace 'http://www.lido-schema.org';\\ndeclare namespace owl='http://www.w3.org/2002/07/owl#';\\ndeclare namespace gml='http://www.opengis.net/gml';\\ndeclare namespace tei='http://www.tei-c.org/ns/1.0';\\ndeclare namespace skos='http://www.w3.org/2004/02/skos/core#';\\nfor $var1_0 in /descendant::lido/child::administrativeMetadata/child::resourceWrap/child::resourceSet/child::resourceRepresentation/child::linkResource/text()\\nreturn\\n \\n <interim>\\n <return>\\n {\\n string($var1_0)\\n }\\n <\\/return>\\n <condition>\\n <quantifier>\\n {\\n <value>{string($var1_0)}<\\/value>\\n }\\n <\\/quantifier>\\n <\\/condition>\\n <\\/interim>\", \"name\": \"Valid Link (Single)\", \"language\": \"XQuery\", \"technology\": \"xml\", \"queryPartialLine\": \"declare default element namespace 'http://www.lido-schema.org'; declare namespace owl='http://www.w3.org/2002/07/owl#'; declare namespace gml='http://www.opengis.net/gml'; declare namespace tei='http://www.tei-c.org/ns/1.0'; declare namespace skos='http://www.w3.org/2004/02/skos/core#'; for $var1_0 in /descendant::lido/child::administrativeMetadata/child::resourceWrap/child::resourceSet/child::resourceRepresentation/child::linkResource/text() return $var1_0\", \"queryPartial\": \"declare default element namespace 'http://www.lido-schema.org';\\ndeclare namespace owl='http://www.w3.org/2002/07/owl#';\\ndeclare namespace gml='http://www.opengis.net/gml';\\ndeclare namespace tei='http://www.tei-c.org/ns/1.0';\\ndeclare namespace skos='http://www.w3.org/2004/02/skos/core#';\\nfor $var1_0 in /descendant::lido/child::administrativeMetadata/child::resourceWrap/child::resourceSet/child::resourceRepresentation/child::linkResource/text()\\nreturn $var1_0\" }"
		};
	

	private static String[] compiledJsons() throws InvalidityException {
		return compiledJson;
	}

	public static void main(String[] args)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		new CompiledConstraintTest().testfunction(args);
	}

	public void testfunction(String[] args)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {

		initialize();
		try {
			test(compiledJsons()[0]);

		} catch (Exception e) {
			e.printStackTrace();
		}
		close();
	}

	// __________ SETUP FUNCTIONS __________

	@BeforeAll
	public static void initialize()
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		folder = new File(".").getCanonicalPath().replace('\\', '/') + "/temp_" + UUID.randomUUID();
		System.out.println("Create: " + folder);
		

		File lido_original = new File("lido.xml");
		File lido_copy = new File(folder + "/files/lido.xml");

		try {
			FileUtils.copyFile(lido_original, lido_copy);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		ServletContext context = mock(ServletContext.class);
		doAnswer(invocation -> {
			String argument = invocation.getArgument(0);
			if (argument.startsWith("/")) {
				return folder + argument;
			} else {
				return folder + argument;
			}
		}).when(context).getRealPath(anyString());
		System.out.println("Mock initialized successfully");
		
//		InitialisationServlet.initialisation(context);
	}

	@AfterAll
	public static void close() throws IOException {
		System.out.println("Delete: " + folder);
		if (DELETE)
			FileUtils.deleteDirectory(new File(folder));
	}

	// __________ BASE FUNCTIONS __________

	public static Map<String, String[]> getEmptyParams() {
		return new HashMap<String, String[]>();
	}

	// __________ API CALL TESTS __________

	@ParameterizedTest
    @MethodSource("compiledJsons")
	public void test(String compiledJSON)
			throws InvalidServletCallException, FailedServletCallException, ServletException, IOException {
		

		Map<String, String[]> params = getEmptyParams();
		params.put(ConstantsJSON.CONSTRAINTS, new String[] {compiledJSON});
		params.put("files", new String[] { "lido.xml" });

		JSONObject result = ConstraintExecuteServlet.applyGet("/xml", params);
		System.out.println(result + "\n");
		JSONArray array = result.getJSONArray("result").getJSONObject(0).getJSONArray("incidents");
		for (int i = 0; i<array.length();i++)
			System.out.println(array.getJSONObject(i).getString("snippet"));
		System.out.println("\n");
	}

}
