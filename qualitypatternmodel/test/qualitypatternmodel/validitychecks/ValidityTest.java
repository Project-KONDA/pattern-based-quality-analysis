package qualitypatternmodel.validitychecks;

import java.util.Arrays;

import qualitypatternmodel.graphstructure.PropertyLocation;
import qualitypatternmodel.inputfields.Input;
import qualitypatternmodel.inputfields.Option;
import qualitypatternmodel.patternstructure.InvalidityException;
import qualitypatternmodel.patternstructure.Pattern;

public class ValidityTest {
	public static void main(String[] args) {
		 // Loading the existing model
        EMFModelLoad loader = new EMFModelLoad();
        Pattern pattern = loader.load();
        
        for (Input input : pattern.getVariableList().getVariables()) {
        	if (input instanceof Option<?>) {
            	if (input.getId() == 10) {
        			((Option) input).getOptions().addAll(Arrays.asList(true,false));
        		} else if ( input.getId() == 12) {
        			((Option) input).getOptions().addAll(Arrays.asList(PropertyLocation.ATTRIBUTE,PropertyLocation.DATA));
        		}
        		
        	}
        }       
        
        try {
			pattern.isValid(false);
		} catch (InvalidityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
