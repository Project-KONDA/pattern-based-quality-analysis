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
import qualitypatternmodel.newservlets.patterns.CardPattern;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.ConstantsJSON;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

public class ValueMapLoadTest {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException, IOException, JSONException {
		CompletePattern pattern = GenericPatterns.getConcrete(CardPattern.getGeneric(), Language.XML, "Card_xml",
				Map.of(2, "//*", 3, "/*"),
				CardPattern.CARD_XML_VARIANTS,
				CardPattern.CARD_XML_VARIANTS_OLD);

		JSONObject before = ServletUtilities.getPatternJSON(pattern);
		JSONArray fragments = before.getJSONArray(ConstantsJSON.VARIANTS).getJSONObject(0).getJSONArray(ConstantsJSON.FRAGMENTS);
		int x = -1;
		for (int i = 0; i < fragments.length(); i++) {
			if (fragments.getJSONObject(i).has(ConstantsJSON.OPTIONS)) {
				x = i;
			}	
		}
		if (x == -1)
			throw new RuntimeException("Variant has no options");

		System.out.println("before:");
//		System.out.println(before.getJSONArray(Constants.JSON_VARIANTS).getJSONObject(0).getJSONArray(Constants.JSON_FRAGMENTS));
//		System.out.println(before.getJSONArray(Constants.JSON_VARIANTS).getJSONObject(0).getJSONArray(Constants.JSON_FRAGMENTS).getJSONObject(x));
		System.out.println(before.getJSONArray(ConstantsJSON.VARIANTS).getJSONObject(0).getJSONArray(ConstantsJSON.FRAGMENTS).getJSONObject(x).get(ConstantsJSON.OPTIONS).toString());

		System.out.println("Save & Load");
		EMFModelSave.exportToFile2(pattern, "D:", "card", Constants.EXTENSION);
		CompletePattern pattern2 = EMFModelLoad.loadCompletePattern("D:/card.patternstructure");

		System.out.println("after:");
		JSONObject after = ServletUtilities.getPatternJSON(pattern2);
		System.out.println(after.getJSONArray(ConstantsJSON.VARIANTS).getJSONObject(0).getJSONArray(ConstantsJSON.FRAGMENTS).getJSONObject(x).get(ConstantsJSON.OPTIONS).toString());
	}
}
