package mqaftranslationtest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
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
        if (file.exists()) {
            // Use FileReader and BufferedReader to read the file content
            try (FileReader fr = new FileReader(file);
                 BufferedReader br = new BufferedReader(fr)) {

                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("An error occurred while reading the file.");
                e.printStackTrace();
            }
        } else {
            System.out.println("The file does not exist.");
        }
        file.delete();
	}

}
