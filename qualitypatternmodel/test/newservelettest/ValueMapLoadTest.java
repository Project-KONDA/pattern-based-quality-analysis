package newservelettest;

import java.io.IOException;
import java.util.Map;

import org.json.JSONArray;
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
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

public class ValueMapLoadTest {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException, IOException, JSONException {
		CompletePattern pattern = GenericPatterns.getConcrete(GenericPatterns.getGenericCard(), Language.XML, "Card_xml",
				Map.of(2, "//*", 3, "/*"),
				XmlPatternVariants.CARD_XML_VARIANTS,
				XmlPatternVariants.CARD_XML_VARIANTS_OLD);

		JSONObject before = ServletUtilities.getPatternJSON(pattern);
		JSONArray fragments = before.getJSONArray(Constants.JSON_VARIANTS).getJSONObject(0).getJSONArray(Constants.JSON_FRAGMENTS);
		int x = -1;
		for (int i = 0; i < fragments.length(); i++) {
			if (fragments.getJSONObject(i).has(Constants.JSON_OPTIONS)) {
				x = i;
			}	
		}
		if (x == -1)
			throw new RuntimeException("Variant has no options");

		System.out.println("before:");
//		System.out.println(before.getJSONArray(Constants.JSON_VARIANTS).getJSONObject(0).getJSONArray(Constants.JSON_FRAGMENTS));
//		System.out.println(before.getJSONArray(Constants.JSON_VARIANTS).getJSONObject(0).getJSONArray(Constants.JSON_FRAGMENTS).getJSONObject(x));
		System.out.println(before.getJSONArray(Constants.JSON_VARIANTS).getJSONObject(0).getJSONArray(Constants.JSON_FRAGMENTS).getJSONObject(x).get(Constants.JSON_OPTIONS).toString());

		System.out.println("Save & Load");
		EMFModelSave.exportToFile2(pattern, "D:", "card", "patternstructure");
		CompletePattern pattern2 = EMFModelLoad.loadCompletePattern("D:/card.patternstructure");

		System.out.println("after:");
		JSONObject after = ServletUtilities.getPatternJSON(pattern2);
		System.out.println(after.getJSONArray("variants").getJSONObject(0).getJSONArray("fragments").getJSONObject(x).get(Constants.JSON_OPTIONS).toString());
	}
}
