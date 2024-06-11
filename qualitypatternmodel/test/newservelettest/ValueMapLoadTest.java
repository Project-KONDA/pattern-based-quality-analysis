package newservelettest;

import java.io.IOException;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.ServletUtilities;
import qualitypatternmodel.newservlets.initialisation.GenericPatterns;
import qualitypatternmodel.newservlets.initialisation.XmlPatternVariants;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

public class ValueMapLoadTest {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException, IOException, JSONException {
		CompletePattern pattern = GenericPatterns.getConcrete(GenericPatterns.getGenericCard(), Language.XML,
				Map.of(2, "//*", 3, "/*"), 
				XmlPatternVariants.CARD_XML_VARIANTS, 
				XmlPatternVariants.CARD_XML_VARIANTS_OLD);
		
		System.out.println("before:");
		JSONObject before = ServletUtilities.getPatternJSON(pattern);
		System.out.println(before.getJSONArray("variants").getJSONObject(0).getJSONArray("fragments").getJSONObject(5).get("options").toString());
		
		System.out.println("Save & Load");
		EMFModelSave.exportToFile2(pattern, "D:", "card", "patternstructure");
		CompletePattern pattern2 = EMFModelLoad.loadCompletePattern("D:/card.patternstructure");
		
		System.out.println("after:");
		JSONObject after = ServletUtilities.getPatternJSON(pattern2);
		System.out.println(after.getJSONArray("variants").getJSONObject(0).getJSONArray("fragments").getJSONObject(5).get("options").toString());
	}
}
