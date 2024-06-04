package newservelettest;

import java.util.Map;

import qualitypatternmodel.newservlets.initialisation.GenericPatterns;
import qualitypatternmodel.newservlets.initialisation.RdfPatternVariants;
import qualitypatternmodel.newservlets.initialisation.XmlPatterns;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;

public class RdfVariantJsonTest {

	public static void main(String[] args) {
		
		try {
			CompletePattern pattern = GenericPatterns.getGenericCard();
			pattern.createRdfAdaption();
			System.out.println(pattern.myToString());
			for (Parameter p : pattern.getParameterList().getParameters()) {
				System.out.println(" - " + p.myToString());
			}
			
			pattern = GenericPatterns.getGenericCard();
			pattern = XmlPatterns.getConcrete(pattern, Language.RDF,
					Map.of(), 
					RdfPatternVariants.CARD_RDF_VARIANTS, 
					RdfPatternVariants.CARD_RDF_VARIANTS_OLD);
			System.out.println(pattern.myToString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
