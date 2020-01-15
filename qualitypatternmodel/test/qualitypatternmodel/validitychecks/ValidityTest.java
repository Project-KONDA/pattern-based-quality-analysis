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
        			((Option) input).setSelection(false);
        		} else if ( input.getId() == 12) {
        			((Option) input).getOptions().addAll(Arrays.asList(PropertyLocation.ATTRIBUTE,PropertyLocation.DATA));
           			((Option) input).setSelection(PropertyLocation.ATTRIBUTE);
        		}
        		
        	}
        }       
        
        try {
			pattern.isValid(false);
		} catch (InvalidityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			try {
				System.out.println(pattern.toXQuery());
			} catch (InvalidityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}
}
