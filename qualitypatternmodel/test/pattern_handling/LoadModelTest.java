package pattern_handling;

import org.eclipse.emf.common.util.URI;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelLoad;

public class LoadModelTest {

	public static void main(String[] args) {
		System.out.println(URI.createURI("serverpatterns/xml/test-patterns/testpattern.pattern"));
		CompletePattern pattern = EMFModelLoad.loadCompletePattern("serverpatterns/xml/test-patterns/testpattern.pattern", "pattern");
		System.out.println(pattern);
	}

}
