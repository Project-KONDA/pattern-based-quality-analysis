package newservelettest;

import java.util.Map;

import qualitypatternmodel.newservlets.initialisation.GenericPatterns;
import qualitypatternmodel.newservlets.initialisation.Neo4jPatternVariants;
import qualitypatternmodel.newservlets.initialisation.RdfPatternVariants;
import qualitypatternmodel.newservlets.initialisation.XmlPatternVariants;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;

public class VariantJsonTest {

	public static void main(String[] args) {

		// XML
		try {
			CompletePattern pattern = GenericPatterns.getGenericCard();
			pattern.createXmlAdaption();
			System.out.println(pattern.myToString());
			for (Parameter p : pattern.getParameterList().getParameters()) {
				System.out.println(" - " + p.myToString());
			}

			pattern = GenericPatterns.getGenericCard();
			pattern = GenericPatterns.getConcrete(pattern, Language.XML, "Card_xml",
					Map.of(),
					XmlPatternVariants.CARD_XML_VARIANTS,
					XmlPatternVariants.CARD_XML_VARIANTS_OLD);
			System.out.println(pattern.myToString());
		} catch (Exception e) {
			e.printStackTrace();
		}

		// RDF
		try {
			CompletePattern pattern = GenericPatterns.getGenericCard();
			pattern.createRdfAdaption();
			System.out.println(pattern.myToString());
			for (Parameter p : pattern.getParameterList().getParameters()) {
				System.out.println(" - " + p.myToString());
			}

			pattern = GenericPatterns.getGenericCard();
			pattern = GenericPatterns.getConcrete(pattern, Language.RDF,
					"Card_rdf",
					Map.of(),
					RdfPatternVariants.CARD_RDF_VARIANTS,
					RdfPatternVariants.CARD_RDF_VARIANTS_OLD);
			System.out.println(pattern.myToString());
		} catch (Exception e) {
			e.printStackTrace();
		}

		// NEO4J
		try {
			CompletePattern pattern = GenericPatterns.getGenericCard();
			pattern.createNeo4jAdaption();
			System.out.println(pattern.myToString());
			for (Parameter p : pattern.getParameterList().getParameters()) {
				System.out.println(" - " + p.myToString());
			}

			pattern = GenericPatterns.getGenericCard();
			pattern = GenericPatterns.getConcrete(pattern, Language.NEO4J,
					"Card_neo4j",
					Map.of(),
					Neo4jPatternVariants.CARD_NEO_VARIANTS,
					Neo4jPatternVariants.CARD_NEO_VARIANTS_OLD);
			System.out.println(pattern.myToString());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
