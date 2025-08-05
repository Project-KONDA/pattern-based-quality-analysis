package utility;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.initialisation.PatternCollection;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

public class SaveModelTest {

	public static void main(String[] args) throws IOException, InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<CompletePattern> patterns = PatternCollection.getGenericPatterns();

		String path = "serverpatterns/xml/abstract-patterns";

		boolean[] boools = new boolean[patterns.size()];


		for (int i = 0; i < patterns.size() ; i++) {
			CompletePattern pattern = patterns.get(i);
			pattern.createRdfAdaption();
			System.out.println(pattern.getName() + " " + path);
			String should = pattern.myToString();
			try {
				EMFModelSave.exportToFile2(pattern, path, "testpattern", "patternstructure");
				pattern = EMFModelLoad.loadCompletePattern(path + "/testpattern.patternstructure");
				String is = pattern.myToString();
				boools[i] = should.equals(is);
				Files.delete(Paths.get(path + "/testpattern.patternstructure"));
				if (!boools[i]) {
//					System.out.println(" --- should --- \n" + should);
//					System.out.println(" --- is --- \n" + is);
					int j = 0;
					while (j < should.length() && j < is.length() && should.subSequence(0, j).equals(is.subSequence(0, j))) {
						j++;
					}
					System.out.println(" XXX " + j + " XXX (" +  should.length()+ "," + is.length()+")");
				}

			} catch (Exception e) {
				boools[i] = false;
				e.printStackTrace();
				Files.delete(Paths.get(path + "/testpattern.patternstructure"));
			}
		}

		for (int i = 0; i < patterns.size() ; i++) {
			System.out.print(boools[i] + ", ");
		}
	}
}
