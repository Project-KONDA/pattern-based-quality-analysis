package qualitypatternmodel.validitychecks;

import org.eclipse.emf.ecore.util.Diagnostician;

import qualitypatternmodel.patternstructure.InvalidityException;
import qualitypatternmodel.patternstructure.Pattern;

public class ValidityTest {
	public static void main(String[] args) {
		 // Loading the existing model
        EMFModelLoad loader = new EMFModelLoad();
        Pattern pattern = loader.load();
        
        System.out.println(Diagnostician.INSTANCE.validate(pattern));
        
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
