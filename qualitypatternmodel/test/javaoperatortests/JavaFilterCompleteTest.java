package javaoperatortests;

import java.util.ArrayList;
import java.util.List;
import static qualitypatternmodel.xmltestutility.DatabaseConstants.DEMO_DATABASE_NAME;
import static qualitypatternmodel.xmltestutility.DatabaseConstants.DEMO_DATA_PATH;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.javaquery.JavaFilter;
import qualitypatternmodel.patternstructure.CompletePattern;

public class JavaFilterCompleteTest {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<List<String>> results = new ArrayList<List<String>>();
		List<Boolean> valid = new ArrayList<Boolean>();
		List<CompletePattern> patterns = OneArgTestPatterns.getXmlTestPatterns();
		List<JavaFilter> filters = new ArrayList<JavaFilter>();
		
		int from = 1;
		int to = 10;
		for (int i = from-1; i<patterns.size() && i < to; i++) {
			System.out.println("Example " + (i+1) + ":");
			JavaFilter filter = patterns.get(i).generateQueryFilter(); 
			filters.add(filter);
			try {
				List<Object> list = filter.executeXQueryJava(DEMO_DATABASE_NAME, DEMO_DATA_PATH);
				filter.createInterimResultContainer(list);
				Boolean fits = filter.getInterimResults().stream().allMatch(x-> x.isValidToStructure());
				List<String> result = filter.filterQueryResults();
				valid.add(fits);
				results.add(result);
			}
			catch (InvalidityException e) {
				e.printStackTrace();
				valid.add(false);
				results.add(null);
			}
		}
			
		System.out.println(results);
		System.out.print("total: " + (!valid.contains(false)));
	}
	
	public List<String> exectuteJavaPattern(CompletePattern pattern, String database){
		return null;
		
		
	}

}
