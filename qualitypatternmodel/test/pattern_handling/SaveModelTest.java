package pattern_handling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.initialisation.GenericPatterns;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

public class SaveModelTest {
	
	public static void main(String[] args) throws IOException, InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> patterns = new ArrayList<CompletePattern>();

		patterns.add(GenericPatterns.getGenericCard());
		patterns.add(GenericPatterns.getGenericComp());
		patterns.add(GenericPatterns.getGenericFunc());
		patterns.add(GenericPatterns.getGenericUnique());
		patterns.add(GenericPatterns.getGenericMatch());
		patterns.add(GenericPatterns.getGenericContains());
		patterns.add(GenericPatterns.getGenericAppdup3());
		patterns.add(GenericPatterns.getGenericDupVal());
		patterns.add(GenericPatterns.getGenericInvalidLink());
		patterns.add(GenericPatterns.getGenericMandAtt());
		patterns.add(GenericPatterns.getGenericStringLength());
		patterns.add(GenericPatterns.getGenericCompVal());
		
		String path = "serverpatterns/xml/abstract-patterns";
		
		boolean[] boools = new boolean[patterns.size()];
		
		
		for (int i = 0; i < patterns.size() ; i++) {
			CompletePattern pattern = patterns.get(i);
			pattern.createRdfAdaption();
			System.out.println(pattern.getName() + " " + path);
			String should = pattern.myToString();
			System.out.println(" --- should --- \n" + should);
			try {
				EMFModelSave.exportToFile2(pattern, path, "testpattern", "patternstructure");
				pattern = EMFModelLoad.loadCompletePattern(path + "/testpattern.patternstructure");
				String is = pattern.myToString();
				System.out.println(" --- is --- \n" + is);
				Files.delete(Paths.get(path + "/testpattern.patternstructure"));
				boools[i] = should.equals(is);

//				int j = 0;
//				while (j < should.length() && j < is.length() && should.subSequence(0, j).equals(is.subSequence(0, j)))
//					j++;
//				System.out.println("XXXXXXX " + j + "(" +  should.length()+ "," + is.length()+")");
				
			} catch (Exception e) {
				boools[i] = false;
				e.printStackTrace();
				Files.delete(Paths.get(path + "/testpattern.patternstructure"));
			}
		}
		
		for (int i = 0; i < patterns.size() ; i++)
			System.out.print(boools[i] + ", ");
	}
}
