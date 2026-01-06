package mqaftranslationtest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import de.gwdg.metadataqa.api.calculator.CalculatorFacade;
import de.gwdg.metadataqa.api.configuration.MeasurementConfiguration;
import de.gwdg.metadataqa.api.configuration.schema.Rule;
import de.gwdg.metadataqa.api.json.DataElement;
import de.gwdg.metadataqa.api.schema.BaseSchema;
import de.gwdg.metadataqa.api.schema.Format;

public class MqafSchemaTest {

	static Boolean printConstraintResultsAdditionally = false;

	static Integer SUCCESS = 1;
	static Integer NA = -1;
	static Integer FAILIURE = -2;

	/* my TestPaths
	 * I expected path 0 to be the preferred one
	 *
	 * path 0 and path 1 are using the configured namespace in the schema
	 * path 2 and path 3 are using a workaround to not require the namespace: /*[name() = "demo:schema"]
	 *
	 * path 0 and 1 throw errors, regarding the namespace (javax.xml.transform.TransformerException)
	 * path 2 results in a correct existence value
	 * path 3 results in a correct values for existence and cardinality
	 * the ruleCatalog values are not correct in every case
	 *
	 * i added the number of correct values / total calculated values.
	 * Note, that if everything is returned as wrong, it results in 19 correct results
	 */
//	static String fieldpath = "/*/demo:source/text()";  				// path 0 : 19 /60 - 19 - 27
	static String fieldpath = "/*/demo:source"; 						// path 1 : 19 /60 - 19 - 27
//	static String fieldpath = "/*/*[name()=\"demo:source\"]/text()"; 	// path 2 : 31 /60 - 42 - 50
//	static String fieldpath = "/*/*[name()=\"demo:source\"]"; 			// path 3 : 35 /60 - 52 - 60



	// i tried to configure the namespace in this ways
	static Map<String, String> namespaces = new HashMap<String, String>() {{
//		    put("demo", "https://raw.githubusercontent.com/Project-KONDA/pattern-based-quality-analysis/constraint_translation_experiment/qualitypatternmodel/demo.data/demo_database_schema.xsd");
		    put("demo", "demo");
//		    put("demo", "demo https://raw.githubusercontent.com/Project-KONDA/pattern-based-quality-analysis/constraint_translation_experiment/qualitypatternmodel/demo.data/demo_database_schema.xsd");
	}};

	public static void main(String[] args) throws Exception {
		String[] records = getRecords();

		// Create DataElement
		DataElement sourceElement = new DataElement("source", fieldpath);

		// Create Rules with Success, NA and FailureScore
		Rule min1OccursRule = new Rule().withMinCount(1).withSuccessScore(SUCCESS).withNaScore(NA).withFailureScore(FAILIURE);
		Rule max1OccursRule = new Rule().withMaxCount(1).withSuccessScore(SUCCESS).withNaScore(NA).withFailureScore(FAILIURE);
		Rule patternRule = new Rule().withPattern("https:.*").withSuccessScore(SUCCESS).withNaScore(NA).withFailureScore(FAILIURE);

		sourceElement.setExtractable();
		sourceElement.addRule(min1OccursRule);
		sourceElement.addRule(max1OccursRule);
		sourceElement.addRule(patternRule);

		// Create BaseSchema
		BaseSchema schema = new BaseSchema();
		schema.setFormat(Format.XML);
		schema.setNamespaces(namespaces);
		schema.addField(sourceElement);

		// Apply Schema on Records
		ArrayList<Map<String, Object>> csvresults = calculateConstraintResults(schema, records);
		ArrayList<Map<String, Object>> expectedResults = expectedResults();

		printResults(csvresults, expectedResults);
	}

	/**
	 * @param schema BaseSchema to calculate on records
	 * @param records Array of records to be measured
	 * @return List of resulting maps for each record (in order)
	 */
	private static ArrayList<Map<String, Object>> calculateConstraintResults(BaseSchema schema, String[] records) {
		// create configuration
		MeasurementConfiguration config = new MeasurementConfiguration().enableRuleCatalogMeasurement();
		CalculatorFacade calculator = new CalculatorFacade(config);
		calculator.setSchema(schema);
		calculator.configure();

		// measure all records
		ArrayList<Map<String, Object>> csvresults = new ArrayList<Map<String, Object>>();
		for (String record : records) {
			csvresults.add(calculator.measureAsMap(record));
		}

		return csvresults;
	}

	/**
	 * generates List of Maps with the expected values
	 * @return List of Maps with the expected values
	 */
	private static ArrayList<Map<String, Object>> expectedResults() {
		// expected results for each key
		String existenceKey = "existence:source";
		Boolean[] existence = new Boolean[]{true, true, true, false, false, true, true, true, false, false, true, true};
		String cardinalityKey = "cardinality:source";
		Integer[] cardinality = new Integer[]{3, 1, 2, 0, 0, 2, 1, 1, 0, 0, 2, 1};

		// for the remaining i input the expected status instead of creating the correct RuleCheckerOutput (de.gwdg.metadataqa.api.rule.RuleCheckerOutput)
		String minCountKey = "ruleCatalog:source:minCount:1";
		Integer[] minCount = new Integer[]{SUCCESS, SUCCESS, SUCCESS, FAILIURE, FAILIURE, SUCCESS, SUCCESS, SUCCESS, FAILIURE, FAILIURE, SUCCESS, SUCCESS};
		String maxCountKey = "ruleCatalog:source:maxCount:2";
		Integer[] maxCount = new Integer[]{FAILIURE, SUCCESS, FAILIURE, NA, NA, FAILIURE, SUCCESS, SUCCESS, NA, NA, FAILIURE, SUCCESS};
		String patternKey = "ruleCatalog:source:pattern:3";
		Integer[] pattern = new Integer[]{SUCCESS, SUCCESS, FAILIURE, NA, NA, FAILIURE, SUCCESS, SUCCESS, NA, NA, FAILIURE, SUCCESS};

		ArrayList<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
		for (int i = 0; i < 12; i++) {
			int var = i; // somehow the enclosed space in HashMap does not like the iterator variable
			result.add(new LinkedHashMap<String, Object>() {{
			    put(existenceKey, existence[var]);
			    put(cardinalityKey, cardinality[var]);
			    put(minCountKey, minCount[var]);
			    put(maxCountKey, maxCount[var]);
			    put(patternKey, pattern[var]);
			}});
		}
		return result;
	}

	/**
	 * prints out short result comparison in the console
	 * @param constraintResults List of result Maps
	 * @param expectedResults List of expected Maps
	 */
	private static void printResults(ArrayList<Map<String, Object>> constraintResults, ArrayList<Map<String, Object>> expectedResults) {
		if (printConstraintResultsAdditionally) {
			System.out.println("Results of Constraint Application:");
			for (Map<String, Object> constraintResult: constraintResults) {
				System.out.println(constraintResult);
			}
		}

		System.out.println("\nValidation Step:");
		int mapSize = expectedResults.get(0).size();
		int totalcorrect = 0;
		int total = 0;
		for (int i = 0; i< expectedResults.size(); i++){
			Map<String, Object> constraintResult = constraintResults.get(i);
			Map<String, Object> expectedResult = expectedResults.get(i);
			int correct = 0;

			constraintResult = removeOtherMappings(constraintResult, expectedResult.keySet());

			// comparing values of expectedResult and constraintResult
			for (String key: expectedResult.keySet()){
				if (constraintResult.get(key).toString().equals(expectedResult.get(key).toString())) {
					correct++;
				}
			}
			totalcorrect += correct;
			total += mapSize;
			System.out.println(correct + "/" + mapSize
					+ " - recieved: " + constraintResult
					+ "\n    - expected: " + expectedResult);
		}
		System.out.println("Total Correct: " + totalcorrect + " /" + total);
	}

	/**
	 * remove all mappings that are not allowed
	 * @param map map where all keys are removed, that are not allowed
	 * @param allowedKeys keys that shall remain in map
	 * @return map with only allowed keys
	 */
	private static Map<String, Object> removeOtherMappings (Map<String, Object> map, Set<String> allowedKeys){
		Set<String> keyset = new HashSet<String>(map.keySet());
		for (String key: keyset) {
			if (!allowedKeys.contains(key)) {
				map.remove(key);
			}
		}
		return map;
	}

	/**
	 * create list of records
	 * @return list of records
	 */
	private static String[] getRecords() {
		return new String[] {
			"<demo:building xmlns:demo=\"demo\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" demo:id=\"101\" demo:recorded=\"2020-11-01T09:00:00\" demo:last-modified-date=\"2020-11-01\" demo:last-modified-time=\"09:00:00\">\r\n"
				+ "  <demo:name>Empire State Building</demo:name>\r\n"
				+ "  <demo:city>New York City</demo:city>\r\n"
				+ "  <demo:country>USA</demo:country>\r\n"
				+ "  <demo:creator>301</demo:creator>\r\n"
				+ "  <demo:creator demo:last-modified-date=\"2022-11-01\" demo:ref=\"301\"/>\r\n"
				+ "  <demo:address>\r\n"
				+ "    <demo:city>New York City</demo:city>\r\n"
				+ "    <demo:country>USA</demo:country>\r\n"
				+ "  </demo:address>\r\n"
				+ "  <demo:source>https://en.wikipedia.org/wiki/Empire_State_Building</demo:source>\r\n"
				+ "  <demo:source>https://en.wikinotpedia.org/wiki/Empire_State_Building-invalidlink</demo:source>\r\n"
				+ "  <demo:source>https://en.wikipedia.org/wiki/Empire_State_Building</demo:source>\r\n"
				+ "</demo:building>",

			"<demo:building xmlns:demo=\"demo\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" demo:id=\"102\" demo:recorded=\"2020-11-01T09:00:00\" demo:last-modified-date=\"2020-11-01\" demo:last-modified-time=\"09:00:01\">\r\n"
				+ "  <demo:name>Chrysler Building</demo:name>\r\n"
				+ "  <demo:city>New York City</demo:city>\r\n"
				+ "  <demo:country>unknown</demo:country>\r\n"
				+ "  <demo:creator>302</demo:creator>\r\n"
				+ "  <demo:creator demo:ref=\"302\"/>\r\n"
				+ "  <demo:address>\r\n"
				+ "    <demo:city>New York City</demo:city>\r\n"
				+ "    <demo:country>unknown</demo:country>\r\n"
				+ "  </demo:address>\r\n"
				+ "  <demo:source>https://en.wikipedia.org/wiki/Chrysler_Building</demo:source>\r\n"
				+ "</demo:building>",

			"<demo:building xmlns:demo=\"demo\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" demo:id=\"103\" demo:recorded=\"2020-11-01T09:00:00\" demo:last-modified-date=\"2020-11-01\" demo:last-modified-time=\"09:00:00\">\r\n"
				+ "  <demo:name>Royal Palace</demo:name>\r\n"
				+ "  <demo:city>unknown</demo:city>\r\n"
				+ "  <demo:country>unknown</demo:country>\r\n"
				+ "  <demo:creator>103</demo:creator>\r\n"
				+ "  <demo:creator demo:ref=\"103\"/>\r\n"
				+ "  <demo:address>\r\n"
				+ "    <demo:city>unknown</demo:city>\r\n"
				+ "    <demo:country>unknown</demo:country>\r\n"
				+ "  </demo:address>\r\n"
				+ "  <demo:source>https://thisisnotavalidlink/</demo:source>\r\n"
				+ "  <demo:source>thisisnotevenalink</demo:source>\r\n"
				+ "</demo:building>",

			"<demo:painting xmlns:demo=\"demo\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" demo:id=\"201\" demo:recorded=\"2020-10-01T07:00:00\">\r\n"
				+ "  <demo:title>The Starry Night</demo:title>\r\n"
				+ "  <demo:creator>401</demo:creator>\r\n"
				+ "  <demo:endwork>1889</demo:endwork>\r\n"
				+ "</demo:painting>",

			"<demo:painting xmlns:demo=\"demo\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" demo:id=\"202\" demo:recorded=\"2020-10-02T08:00:00\">\r\n"
				+ "  <demo:title>Wheatfield with Crows</demo:title>\r\n"
				+ "  <demo:creator>9</demo:creator>\r\n"
				+ "  <demo:endwork>1890</demo:endwork>\r\n"
				+ "</demo:painting>",

			"<demo:painting xmlns:demo=\"demo\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" demo:id=\"203\" demo:recorded=\"2020-10-03T09:00:00\" demo:modified=\"false\" demo:last-modified-date=\"2020-10-03\" demo:last-modified-time=\"09:00:00\">\r\n"
				+ "  <demo:title>The Last Supper</demo:title>\r\n"
				+ "  <demo:creator>402</demo:creator>\r\n"
				+ "  <demo:startwork>1492</demo:startwork>\r\n"
				+ "  <demo:endwork>1498</demo:endwork>\r\n"
				+ "  <demo:source>thisisnotevenalink</demo:source>\r\n"
				+ "  <demo:source>thisisnotevenalink</demo:source>\r\n"
				+ "</demo:painting>",

			"<demo:painting xmlns:demo=\"demo\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" demo:id=\"204\" demo:recorded=\"2020-10-04T10:00:00\" demo:modified=\"true\" demo:last-modified-date=\"2020-10-04\" demo:last-modified-time=\"10:00:00\">\r\n"
				+ "  <demo:title>Mona Lisa</demo:title>\r\n"
				+ "  <demo:title demo:lang=\"fr\">La Gioconda</demo:title>\r\n"
				+ "  <demo:creator>402</demo:creator>\r\n"
				+ "  <demo:startwork>1503</demo:startwork>\r\n"
				+ "  <demo:endwork>1516</demo:endwork>\r\n"
				+ "  <demo:source>https://de.wikipedia.org/wiki/Mona_Lisa</demo:source>\r\n"
				+ "</demo:painting>",

			"<demo:painting xmlns:demo=\"demo\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" demo:id=\"205\" demo:recorded=\"2020-11-01T09:00:00\" demo:last-modified-date=\"2020-11-01\" demo:last-modified-time=\"09:00:00\">\r\n"
				+ "  <demo:title>Salvator Mundi</demo:title>\r\n"
				+ "  <demo:creator>402</demo:creator>\r\n"
				+ "  <demo:startwork>1490</demo:startwork>\r\n"
				+ "  <demo:endwork>1500</demo:endwork>\r\n"
				+ "  <demo:source>https://en.wikipedia.org/wiki/Salvator_Mundi_(Leonardo)</demo:source>\r\n"
				+ "</demo:painting>",

			"<demo:architect xmlns:demo=\"demo\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" demo:id=\"301\">\r\n"
				+ "  <demo:name>William Frederick Lamb</demo:name>\r\n"
				+ "  <demo:name>William F. Lamb</demo:name>\r\n"
				+ "  <demo:name>Wiliam F. Lamb</demo:name>\r\n"
				+ "  <demo:birthyear>1883</demo:birthyear>\r\n"
				+ "  <demo:birthyear>1884</demo:birthyear>\r\n"
				+ "  <demo:birthyear>2883</demo:birthyear>\r\n"
				+ "  <demo:deathyear>1952</demo:deathyear>\r\n"
				+ "</demo:architect>",

			"<demo:architect xmlns:demo=\"demo\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" demo:id=\"302\">\r\n"
				+ "  <demo:name>William Van Alen</demo:name>\r\n"
				+ "  <demo:birthyear>1882</demo:birthyear>\r\n"
				+ "  <demo:deathyear>1954</demo:deathyear>\r\n"
				+ "</demo:architect>",

			"<demo:artist xmlns:demo=\"demo\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" demo:id=\"401\">\r\n"
				+ "  <demo:name>Vincent van Gogh</demo:name>\r\n"
				+ "  <demo:birthyear>1853</demo:birthyear>\r\n"
				+ "  <demo:deathyear>1890</demo:deathyear>\r\n"
				+ "  <demo:source>https://invalid.link/</demo:source>\r\n"
				+ "  <demo:source>thisisnotevenalink</demo:source>\r\n"
				+ "</demo:artist>",

			"<demo:artist xmlns:demo=\"demo\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" demo:id=\"402\">\r\n"
				+ "  <demo:name>Leonardo Da Vinci</demo:name>\r\n"
				+ "  <demo:birthyear>1452</demo:birthyear>\r\n"
				+ "  <demo:birthyear>1453</demo:birthyear>\r\n"
				+ "  <demo:deathyear>1519</demo:deathyear>\r\n"
				+ "  <demo:source>https://en.wikipedia.org/wiki/Leonardo_da_Vinci</demo:source>\r\n"
				+ "</demo:artist>" };
	}
}
