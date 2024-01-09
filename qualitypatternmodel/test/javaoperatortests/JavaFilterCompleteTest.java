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
		
		int from = 5;
		int to = 5;
		for (int i = from-1; i<patterns.size() && i < to; i++) {
			System.out.println("Example " + (i+1) + ":");
			// generate Filter and structure
			JavaFilter filter = patterns.get(i).generateQueryFilter();
			System.out.println(filter);
			filters.add(filter);
			try {
				// Query Results
				List<String> list = filter.executeXQueryJava(DEMO_DATABASE_NAME, DEMO_DATA_PATH);
//				System.out.println("QUERY RESULTS");
//				System.out.println(list);
				// import Query Results
				filter.createInterimResultContainerXQuery(list);
//				System.out.println("INTERIM RESULTS");
//				System.out.println(filter.getInterimResults());
				// check validity of InterimResults
				Boolean fits = filter.getInterimResults().stream().allMatch(x-> x.isValidToStructure());
				valid.add(fits);
				System.out.println("fits: " + fits);
				
				if (fits) {
					List<String> result = filter.filterQueryResults();
					results.add(result);
				}
				else
					results.add(null);
			}
			catch (InvalidityException e) {
				e.printStackTrace();
				valid.add(false);
				results.add(null);
			}
		}

		System.out.println("results: " + results);
		System.out.println("valid: " + valid);
		System.out.print("total: " + (!valid.contains(false)));
	}
	
	public List<String> executeJavaPattern(CompletePattern pattern, String database_name, String database_path) throws InvalidityException {
		JavaFilter filter = pattern.generateQueryFilter();
		List<String> list = filter.executeXQueryJava(database_name, database_path);
		filter.createInterimResultContainerXQuery(list);
		return filter.filterQueryResults();
	}

}
