package javaoperatortests;

//import static qualitypatternmodel.xmltestutility.DatabaseConstants.DEMO_DATABASE_NAME;
//import static qualitypatternmodel.xmltestutility.DatabaseConstants.DEMO_DATA_PATH;

import java.io.IOException;
import java.util.List;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.javaquery.JavaFilter;
//import qualitypatternmodel.javaquery.impl.JavaFilterImpl;
import qualitypatternmodel.patternstructure.CompletePattern;
//import qualitypatternmodel.utility.EMFModelLoad;
//import qualitypatternmodel.utility.EMFModelSave;

public class NewInterimResultTest {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException, IOException {
		List<CompletePattern> patterns = OneArgTestPatterns.getXmlTestPatterns();
		
		int from = 1;
		int to = 1;
		for (int i = from-1; i<patterns.size() && i < to; i++) {
			System.out.println(i);
			JavaFilter filter = patterns.get(i).generateQueryFilter();
//			System.out.println(filter);
//			String xmi = EMFModelSave.exportToString(filter);
//			System.out.println(xmi);
//			JavaFilter filter2 = (JavaFilterImpl) EMFModelLoad.loadFromString(xmi);
//			String xmi2 = EMFModelSave.exportToString(filter2);
//			System.out.println(xmi.equals(xmi2));
			
			
			
			String json = filter.toJson().toString();
			System.out.println(json);
//			JavaFilter filter2 = JavaFilterImpl.fromJson(json);
//			String json2 = filter2.toJson();
//			System.out.println(json.equals(json2));
			
			
//			filter.execute(DEMO_DATABASE_NAME, DEMO_DATA_PATH);
		}
	}
}
