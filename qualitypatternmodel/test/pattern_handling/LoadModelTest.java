package pattern_handling;

import java.io.IOException;
import java.util.List;



//import org.eclipse.emf.common.util.URI;

import qualitypatternmodel.newservlets.ServletUtilities;
import qualitypatternmodel.patternstructure.CompletePattern;

public class LoadModelTest {

	public static void main(String[] args) throws IOException {
		
//		String myURL = "./serverpatterns/xml/abstract-patterns/Card_xml.pattern";
//		System.out.println(URI.createURI(myURL));
//		CompletePattern pattern = EMFModelLoad.loadCompletePattern(myURL, "pattern");
//		System.out.println(pattern);
		
		List<CompletePattern> patternsA = ServletUtilities.getAllAbstractPattern("xml");
		System.out.println("abstract:" + patternsA);
		List<CompletePattern> patternsC = ServletUtilities.getAllConcretePattern("xml");
		System.out.println("concrete:" + patternsC);
	}

}
