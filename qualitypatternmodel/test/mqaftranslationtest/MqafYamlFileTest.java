package mqaftranslationtest;

import java.io.File;
import java.io.IOException;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;

public class MqafYamlFileTest {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException, IOException {
		String filepath = "SimpleMatchSchema.yaml";
		CompletePattern pattern = MqafStringTranslationTest.getTestPatternCollection().get(5);
		pattern.generateXmlConstraintYAMLFile(filepath);
        File file = new File(filepath);
        assert(file.exists());
        file.delete();
	}

}
