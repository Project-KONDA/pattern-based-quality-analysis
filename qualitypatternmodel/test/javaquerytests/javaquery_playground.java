package javaquerytests;

import static qualitypatternmodel.xmltestutility.DatabaseConstants.DEMO_DATABASE_NAME;
import static qualitypatternmodel.xmltestutility.DatabaseConstants.DEMO_DATA_PATH;

import qualitypatternmodel.javaquery.BaseXJavaQueryInterimContainer;
import qualitypatternmodel.javaquery.JavaQueryInterimContainer;

public class javaquery_playground {

	public static void main(String[] args) {
		System.out.println( java.util.regex.Pattern.compile("part\"string") );
		String query = "for $var in /*[name() = \"demo:data\"]/*\r\n"
				+ "let $source := $var/*[name() = \"demo:source\"]/data()\r\n"
				+ "return ("
				+ "\"<result>\"" 
				+ ", \"<record>\", $var, \"</record>\""
				+ ", \"<arg1>\", $source, \"</arg1>\""
				+ ", \"</result>\""
				+ ")"
				;
		System.out.println("Query:");
		System.out.println(query);
		
		System.out.println("Result:");
		JavaQueryInterimContainer myJavaResult = new BaseXJavaQueryInterimContainer(DEMO_DATABASE_NAME, DEMO_DATA_PATH, query);
		System.out.println(myJavaResult.toString());
		
	}

}
