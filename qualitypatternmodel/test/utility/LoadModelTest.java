package utility;

import java.io.IOException;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.EMFModelLoad;

public class LoadModelTest {

	public static void main(String[] args) throws IOException, InvalidityException, OperatorCycleException, MissingPatternContainerException {
		String path = "D:/eclipse_workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp2/wtpwebapps/qualitypatternmodel/templates/neo4j/abstract-patterns";
		CompletePattern pattern = EMFModelLoad.loadCompletePattern(path + "/Card_neo4j.patternstructure");
		System.out.println(pattern.myToString());
	}
}
