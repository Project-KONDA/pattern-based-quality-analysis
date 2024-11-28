package utility;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.eclipse.emf.ecore.EObject;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Graph;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

public class SaveModelTest2 {

	public static void main(String[] args) throws IOException, InvalidityException, OperatorCycleException, MissingPatternContainerException {
		String path = "serverpatterns/xml/abstract-patterns";

		CompletePattern pattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		Graph g = pattern.getGraph();
		g.getNodes().get(0).addOutgoing();
		pattern.createRdfAdaption();

		String should = pattern.myToString();
		try {
			System.out.println("should: " + should);
			EMFModelSave.exportToFile2(pattern, path, "testpattern", "patternstructure");
			EObject o = EMFModelLoad.loadFromFile(path + "/testpattern.patternstructure");
			System.out.println(o.toString());
			pattern = (CompletePattern) o;
			String is = pattern.myToString();
			System.out.println("is: " + is);
			Files.delete(Paths.get(path + "/testpattern.patternstructure"));
			System.out.println("+++++++++++++++ " + should.equals(is) + " +++++++++++++++");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
