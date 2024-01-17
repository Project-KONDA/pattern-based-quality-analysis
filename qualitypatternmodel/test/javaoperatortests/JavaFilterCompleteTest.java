package javaoperatortests;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import static qualitypatternmodel.xmltestutility.DatabaseConstants.DEMO_DATABASE_NAME;
import static qualitypatternmodel.xmltestutility.DatabaseConstants.DEMO_DATA_PATH;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.javaquery.JavaFilter;
import qualitypatternmodel.javaqueryoutput.InterimResultContainer;
import qualitypatternmodel.patternstructure.CompletePattern;

public class JavaFilterCompleteTest {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<List<String>> results = new ArrayList<List<String>>();
		List<Boolean> valid = new ArrayList<Boolean>();
		List<CompletePattern> patterns = OneArgTestPatterns.getXmlTestPatterns();
		List<JavaFilter> filters = new ArrayList<JavaFilter>();

		boolean filterResult = true;
		boolean queryResult = false;
		boolean interimResults = false;
		
		int from = 9;
		int to = 9;
		for (int i = from-1; i<patterns.size() && i < to; i++) {
			System.out.println("Example " + (i+1) + ":");
			// generate Filter and structure
			JavaFilter filter = patterns.get(i).generateQueryFilter();
			if (filterResult)
				System.out.println(filter);
			filters.add(filter);
			try {
				// Query Results
				List<String> list = filter.executeXQueryJava(DEMO_DATABASE_NAME, DEMO_DATA_PATH);
				if (queryResult) {
					System.out.println("QUERY RESULTS");
					System.out.println(list);
				}
				// import Query Results
				filter.createInterimResultContainerXQuery(list);
				if (interimResults) {
					System.out.println("INTERIM RESULTS");
					System.out.println(filter.getInterimResults());
				}
				// check validity of InterimResults
				EList<Boolean> allfits = new BasicEList<Boolean>();
				for (InterimResultContainer interim: filter.getInterimResults())
					allfits.add(interim.isValidToStructure());
				System.out.println("allfits : " + allfits);
				System.out.println("everyfits : " + !allfits.contains(false));
				System.out.println("anyfits : " + allfits.contains(true));
				
				Boolean fits = !allfits.isEmpty() && !allfits.contains(false);
//				.getInterimResults().stream().allMatch(x-> x.isValidToStructure());
				valid.add(fits);
				
				
//				System.out.println("\nONE EXAMPLE");
//				InterimResultContainer first = filter.getInterimResults().get(30);
//				System.out.println(first);
//				System.out.println(first.getCorrespondsTo());
//				System.out.println(first.isValidToStructure());
//				System.out.println("\n");
				
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

		System.out.println("__RESULTS:__");
		System.out.println(valid);
		System.out.println(results);
		System.out.print("total: " + (!valid.contains(false)));
	}
	
	public List<String> executeJavaPattern(CompletePattern pattern, String database_name, String database_path) throws InvalidityException {
		JavaFilter filter = pattern.generateQueryFilter();
		List<String> list = filter.executeXQueryJava(database_name, database_path);
		filter.createInterimResultContainerXQuery(list);
		return filter.filterQueryResults();
	}

}
