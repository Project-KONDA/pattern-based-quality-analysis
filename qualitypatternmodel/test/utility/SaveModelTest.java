package utility;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.patterns.Appdup3Pattern;
import qualitypatternmodel.newservlets.patterns.CardPattern;
import qualitypatternmodel.newservlets.patterns.CompPattern;
import qualitypatternmodel.newservlets.patterns.CompValPattern;
import qualitypatternmodel.newservlets.patterns.ContainsPattern;
import qualitypatternmodel.newservlets.patterns.DupvalPattern;
import qualitypatternmodel.newservlets.patterns.FuncPattern;
import qualitypatternmodel.newservlets.patterns.ValidLinkPattern;
import qualitypatternmodel.newservlets.patterns.MandAttPattern;
import qualitypatternmodel.newservlets.patterns.MatchPattern;
import qualitypatternmodel.newservlets.patterns.StringLengthPattern;
import qualitypatternmodel.newservlets.patterns.UniquePattern;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

public class SaveModelTest {

	public static void main(String[] args) throws IOException, InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> patterns = new ArrayList<CompletePattern>();

		patterns.add(CardPattern.getGeneric());
		patterns.add(CompPattern.getGeneric());
		patterns.add(FuncPattern.getGeneric());
		patterns.add(UniquePattern.getGeneric());
		patterns.add(MatchPattern.getGeneric());
		patterns.add(ContainsPattern.getGeneric());
		patterns.add(Appdup3Pattern.getGeneric());
		patterns.add(DupvalPattern.getGeneric());
		patterns.add(ValidLinkPattern.getGeneric());
		patterns.add(MandAttPattern.getGeneric());
		patterns.add(StringLengthPattern.getGeneric());
		patterns.add(CompValPattern.getGeneric());

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
