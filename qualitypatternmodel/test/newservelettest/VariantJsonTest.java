package newservelettest;

import java.util.Map;

import qualitypatternmodel.newservlets.initialisation.GenericPatterns;
import qualitypatternmodel.newservlets.patterns.CardPattern;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;

public class VariantJsonTest {

	public static void main(String[] args) {

		// XML
		try {
			CompletePattern pattern = CardPattern.getGeneric();
			pattern.createXmlAdaption();
			System.out.println(pattern.myToString());
			for (Parameter p : pattern.getParameterList().getParameters()) {
				System.out.println(" - " + p.myToString());
			}

			pattern = CardPattern.getGeneric();
			pattern = GenericPatterns.getConcrete(pattern, Language.XML, "Card_xml",
					Map.of(),
					CardPattern.CARD_XML_VARIANTS,
					CardPattern.CARD_XML_VARIANTS_OLD);
			System.out.println(pattern.myToString());
		} catch (Exception e) {
			e.printStackTrace();
		}

		// RDF
		try {
			CompletePattern pattern = CardPattern.getGeneric();
			pattern.createRdfAdaption();
			System.out.println(pattern.myToString());
			for (Parameter p : pattern.getParameterList().getParameters()) {
				System.out.println(" - " + p.myToString());
			}

			pattern = CardPattern.getGeneric();
			pattern = GenericPatterns.getConcrete(pattern, Language.RDF,
					"Card_rdf",
					Map.of(),
					CardPattern.CARD_RDF_VARIANTS,
					CardPattern.CARD_RDF_VARIANTS_OLD);
			System.out.println(pattern.myToString());
		} catch (Exception e) {
			e.printStackTrace();
		}

		// NEO4J
		try {
			CompletePattern pattern = CardPattern.getGeneric();
			pattern.createNeo4jAdaption();
			System.out.println(pattern.myToString());
			for (Parameter p : pattern.getParameterList().getParameters()) {
				System.out.println(" - " + p.myToString());
			}

			pattern = CardPattern.getGeneric();
			pattern = GenericPatterns.getConcrete(pattern, Language.NEO4J,
					"Card_neo4j",
					Map.of(),
					CardPattern.CARD_NEO_VARIANTS,
					CardPattern.CARD_NEO_VARIANTS_OLD);
			System.out.println(pattern.myToString());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
