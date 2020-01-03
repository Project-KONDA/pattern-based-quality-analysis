package qualitypatternmodel.validitychecks;

import java.util.Arrays;

import qualitypatternmodel.functions.BooleanOperator;
import qualitypatternmodel.functions.Match;
import qualitypatternmodel.inputfields.Option;
import qualitypatternmodel.patternstructure.InvalidTranslationException;
import qualitypatternmodel.patternstructure.Pattern;

public class ValidityTest {
	public static void main(String[] args) {
		 // Loading the existing model
        EMFModelLoad loader = new EMFModelLoad();
        Pattern pattern = loader.load();
        BooleanOperator boolOp = pattern.getReturnGraph().getRootElement().getNextElements().get(0).getPredicates().get(0);
        if(boolOp instanceof Match) {
        	Match match = (Match) boolOp;
        	Option<Boolean> options = (Option<Boolean>) match.getOptions();
        	options.getOptions().clear();
        	options.getOptions().addAll(Arrays.asList(true,false));
        }
        try {
			pattern.isValid(false);
		} catch (InvalidTranslationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
