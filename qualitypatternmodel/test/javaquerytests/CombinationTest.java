package javaquerytests;

import static qualitypatternmodel.xmltestutility.DatabaseConstants.DEMO_DATABASE_NAME;
import static qualitypatternmodel.xmltestutility.DatabaseConstants.DEMO_DATA_PATH;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import qualitypatternmodel.javaquery.BaseXJavaQueryInterimContainer;
import qualitypatternmodel.javaquery.EverySomeNoneQuantifier;
import qualitypatternmodel.javaquery.FilterFunctionContainer;
import qualitypatternmodel.javaquery.JavaQueryInterimContainer;

public class CombinationTest {

	static String QUERY = "for $var in /*[name() = \"demo:data\"]/*\r\n"
			+ "let $source := $var/*[name() = \"demo:source\"]/data()\r\n"
			+ "return ("
			+ "\"<result>\"" 
			+ ", \"<record>\", $var, \"</record>\""
			+ ", \"<arg1>\", $source, \"</arg1>\""
			+ ", \"</result>\""
			+ ")"
			;

	private static Boolean exampleFilter(String str) {
		Boolean result = str.contains("wikipedia");
		return result;
	}
	

    private static boolean isWebsiteReachable (String url) {
        try {
            URL websiteUrl = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) websiteUrl.openConnection();
            connection.setRequestMethod("HEAD");
            int responseCode = connection.getResponseCode();
            return (responseCode == HttpURLConnection.HTTP_OK);
        } catch (Exception e) {
            return false;
        }
    }
	
	public static void main(String[] args) {
		
		JavaQueryInterimContainer myJavaResult = new BaseXJavaQueryInterimContainer(DEMO_DATABASE_NAME, DEMO_DATA_PATH, QUERY);
//		System.out.println("\n" + myJavaResult.toString());

		System.out.println("total: " + myJavaResult.size() + " /12");

		
		System.out.println("\nFilter: contains \"wikipedia\"");
		myJavaResult.filter(List.of(0), EverySomeNoneQuantifier.EVERY,
				new FilterFunctionContainer(CombinationTest::exampleFilter));
		System.out.println("filtered every: " + myJavaResult.size() + " /8");
//		System.out.println(myJavaResult.toString());

		myJavaResult.resetFilters();
		
		myJavaResult.filter(List.of(0), EverySomeNoneQuantifier.SOME,
				new FilterFunctionContainer(CombinationTest::exampleFilter));
		System.out.println("filtered some : " + myJavaResult.size() + " /5");
		
		myJavaResult.resetFilters();
		
		myJavaResult.filter(List.of(0), EverySomeNoneQuantifier.NONE,
				new FilterFunctionContainer(CombinationTest::exampleFilter));
		System.out.println("filtered none : " + myJavaResult.size() + " /7");

		myJavaResult.resetFilters();

		System.out.println("\nFilter: website reachable");
		
		myJavaResult.filter(List.of(0), EverySomeNoneQuantifier.EVERY,
				new FilterFunctionContainer(CombinationTest::isWebsiteReachable));
		System.out.println("filtered every: " + myJavaResult.size() + " /8");
//		System.out.println(myJavaResult.toString());

		myJavaResult.resetFilters();
		
		myJavaResult.filter(List.of(0), EverySomeNoneQuantifier.SOME,
				new FilterFunctionContainer(CombinationTest::isWebsiteReachable));
		System.out.println("filtered some : " + myJavaResult.size() + " /5");
		
		myJavaResult.resetFilters();
		
		myJavaResult.filter(List.of(0), EverySomeNoneQuantifier.NONE,
				new FilterFunctionContainer(CombinationTest::isWebsiteReachable));
		System.out.println("filtered none : " + myJavaResult.size() + " /7");
	}
		
//		myJavaResult.filter(indices,
//				EverySomeNoneQuantifier.EVERY,
//				new FilterFunctionContainer(CombinationTest::testfunction1));
//		System.out.println("\nFiltered:");
//		System.out.println(myJavaResult.toString());
		
}

