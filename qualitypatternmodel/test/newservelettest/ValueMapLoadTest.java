package newservelettest;

import java.io.IOException;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.ServletUtilities;
import qualitypatternmodel.newservlets.patterns.internal.CardPattern;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.ConstantsJSON;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

public class ValueMapLoadTest {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException, IOException {
		CompletePattern pattern = new CardPattern().getXmlBundle().getConcrete();

		ObjectNode before = ServletUtilities.getPatternJSON(pattern);
		ArrayNode fragments = (ArrayNode) before.get(ConstantsJSON.VARIANTS).get(0).get(ConstantsJSON.FRAGMENTS);
		int x = -1;
		for (int i = 0; i < fragments.size(); i++) {
			if (fragments.get(i).has(ConstantsJSON.OPTIONS)) {
				x = i;
			}	
		}
		if (x == -1)
			throw new RuntimeException("Variant has no options");

		System.out.println("before:");
//		System.out.println(before.getJSONArray(Constants.JSON_VARIANTS).getJSONObject(0).getJSONArray(Constants.JSON_FRAGMENTS));
//		System.out.println(before.getJSONArray(Constants.JSON_VARIANTS).getJSONObject(0).getJSONArray(Constants.JSON_FRAGMENTS).getJSONObject(x));
		System.out.println(before.get(ConstantsJSON.VARIANTS).get(0).get(ConstantsJSON.FRAGMENTS).get(x).get(ConstantsJSON.OPTIONS).toString());

		System.out.println("Save & Load");
		EMFModelSave.exportToFile2(pattern, "D:", "card", Constants.EXTENSION);
		CompletePattern pattern2 = EMFModelLoad.loadCompletePattern("D:/card.patternstructure");

		System.out.println("after:");
		ObjectNode after = ServletUtilities.getPatternJSON(pattern2);
		System.out.println(after.get(ConstantsJSON.VARIANTS).get(0).get(ConstantsJSON.FRAGMENTS).get(x).get(ConstantsJSON.OPTIONS).toString());
	}
}
