package newservelettest;

import qualitypatternmodel.newservlets.patterns.CardPattern;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;

public class VariantJsonTest {

	public static void main(String[] args) {

		// XML
		try {
			CompletePattern pattern = new CardPattern().getGeneric();
			pattern.createXmlAdaption();
			System.out.println(pattern.myToString());
			for (Parameter p : pattern.getParameterList().getParameters()) {
				System.out.println(" - " + p.myToString());
			}

			pattern = new CardPattern().getXmlBundle().getConcrete();
			System.out.println(pattern.myToString());
		} catch (Exception e) {
			e.printStackTrace();
		}

		// RDF
		try {
			CompletePattern pattern = new CardPattern().getGeneric();
			pattern.createRdfAdaption();
			System.out.println(pattern.myToString());
			for (Parameter p : pattern.getParameterList().getParameters()) {
				System.out.println(" - " + p.myToString());
			}

			pattern = new CardPattern().getRdfBundle().getConcrete();
			System.out.println(pattern.myToString());
		} catch (Exception e) {
			e.printStackTrace();
		}

		// NEO4J
		try {
			CompletePattern pattern = new CardPattern().getGeneric();
			pattern.createNeo4jAdaption();
			System.out.println(pattern.myToString());
			for (Parameter p : pattern.getParameterList().getParameters()) {
				System.out.println(" - " + p.myToString());
			}

			pattern = new CardPattern().getNeoBundle().getConcrete();
			System.out.println(pattern.myToString());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
