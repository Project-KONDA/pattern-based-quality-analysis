package patterntoconstrainttranslation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.gwdg.metadataqa.api.calculator.CalculatorFacade;
import de.gwdg.metadataqa.api.configuration.MeasurementConfiguration;
import de.gwdg.metadataqa.api.configuration.schema.Rule;
import de.gwdg.metadataqa.api.json.DataElement;
import de.gwdg.metadataqa.api.schema.BaseSchema;
import de.gwdg.metadataqa.api.schema.Format;

public class ConstraintSchemaTest {

	public static void main(String[] args) throws Exception {
		
		String[] records = {
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
				+ "  <demo:source>https://anotherinvalidlink/</demo:source>\r\n"
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
				+ "</demo:artist>",
				
				"<demo:artist xmlns:demo=\"demo\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" demo:id=\"402\">\r\n"
				+ "  <demo:name>Leonardo Da Vinci</demo:name>\r\n"
				+ "  <demo:birthyear>1452</demo:birthyear>\r\n"
				+ "  <demo:birthyear>1453</demo:birthyear>\r\n"
				+ "  <demo:deathyear>1519</demo:deathyear>\r\n"
				+ "  <demo:source>https://en.wikipedia.org/wiki/Leonardo_da_Vinci</demo:source>\r\n"
				+ "</demo:artist>"
		};
		
		MeasurementConfiguration config = new MeasurementConfiguration().enableRuleCatalogMeasurement();
		BaseSchema schema = new BaseSchema();

		schema.setFormat(Format.XML);
		Map<String, String> namespaces = new HashMap<String, String>();
		namespaces.put("demo", "https://raw.githubusercontent.com/Project-KONDA/pattern-based-quality-analysis/constraint_translation_experiment/qualitypatternmodel/demo.data/demo_database_schema.xsd");
		schema.setNamespaces(namespaces);
		Rule minOccursRule = new Rule().withMinCount(1);
		Rule containsRule = new Rule().withPattern(".*\\Qwikipedia\\E.*");

		String[] testpaths = {"/*/*[name() = \"demo:source\"]", "/*[name() = \"demo:source\"]", "/demo:source", "/*", "/*/*"};
		int testpathid = 0;
		DataElement sourceElement = new DataElement("source", testpaths[testpathid]);
			sourceElement.setExtractable();
		sourceElement.addRule(minOccursRule);
		sourceElement.addRule(containsRule);
		schema.addField(sourceElement);

		CalculatorFacade calculator = new CalculatorFacade(config); // use configuration
		calculator.setSchema(schema);
		calculator.configure();

		List<Map<String, Object>> csvresults = new ArrayList<Map<String, Object>>();
		for (String record : records)
			csvresults.add(calculator.measureAsMap(record));
		
		System.out.println("\nCsv Result Maps:" );
		for (Map<String, Object> csvResultMap : csvresults)
			System.out.println(csvResultMap);
	}
}
