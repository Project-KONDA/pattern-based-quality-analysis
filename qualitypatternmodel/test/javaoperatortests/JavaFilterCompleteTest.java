package javaoperatortests;

import static qualitypatternmodel.utility.XmlTestDatabaseConstants.DEMO_DATA_PATH;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.json.JSONArray;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.javaquery.JavaFilter;
import qualitypatternmodel.javaqueryoutput.InterimResultContainer;
import qualitypatternmodel.patternstructure.CompletePattern;

public class JavaFilterCompleteTest {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<JSONArray> results = new ArrayList<JSONArray>();
		List<Boolean> valid = new ArrayList<Boolean>();
		List<CompletePattern> patterns = OneArgTestPatterns.getXmlTestPatterns();
		List<JavaFilter> filters = new ArrayList<JavaFilter>();

		boolean filterResult = true;
		boolean queryResult = false;
		boolean interimResults = false;
		boolean partialResults = true;
 
//		int from = 1;
//		int to = 15;
//		for (int i = from-1; i<patterns.size() && i < to; i++) {
		Integer[] ids = {6,7,13,14};
		for (int i: ids) { // = from-1; i<patterns.size() && i < to; i++) {
			System.out.println("Example " + (i+1) + ":\n");
			
			System.out.println(patterns.get(i).myToString());
			// generate Filter and structure
			JavaFilter filter = patterns.get(i).generateQueryFilter();
			if (filterResult) {
				System.out.println(filter);
			}
			filters.add(filter);
			try {
				// Query Results
				JSONArray list = filter.executeXQueryJava(DEMO_DATA_PATH);
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
				EList<InterimResultContainer> interims = filter.getInterimResults();
				if (interims.size() > 0) {
					System.err.println("Interim Results are empty");
				}
				for (InterimResultContainer interim: interims) {
					allfits.add(interim.isValidToStructure());
				}

				if (partialResults) {
					System.out.println("allfits : " + allfits);
					System.out.println("everyfits : " + !allfits.contains(false));
					System.out.println("anyfits : " + allfits.contains(true));
				} else {
					System.out.println("  done: " + (!allfits.contains(false) && allfits.contains(true)));
				}

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
					try {
						JSONArray result = filter.filterQueryResults();
						results.add(result);
						System.out.println("results : " + !result.isEmpty());
					} catch (Exception e) {
						e.printStackTrace();
						results.add(null);
						System.out.println("results: ----");
					}
				} else {
					results.add(null);
					System.out.println("results: ----");
				}
			}
			catch (InvalidityException e) {
				e.printStackTrace();
				valid.add(false);
				results.add(null);
			}
		}

//		if (from != to)
		{
			System.out.println("\n__RESULTS:__");
			System.out.println(valid);
			System.out.println(results.toString().replace("\r\n", " "));
			System.out.print("total: " + (!valid.contains(false)));
		}
	}

	public JSONArray executeJavaPattern(CompletePattern pattern, String database_path) throws InvalidityException {
		JavaFilter filter = pattern.generateQueryFilter();
		JSONArray list = filter.executeXQueryJava(database_path);
		filter.createInterimResultContainerXQuery(list);
		JSONArray results = filter.filterQueryResults();
		return results;
	}

}
