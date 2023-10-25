package javaqueryexperiments;

import static qualitypatternmodel.xmltestutility.DatabaseConstants.DEMO_DATABASE_NAME;
import static qualitypatternmodel.xmltestutility.DatabaseConstants.DEMO_DATA_PATH;

import javaqueryexperiments.testclasses.BaseXJavaQueryInterimContainer;
import javaqueryexperiments.testclasses.JavaQueryInterimContainer;

public class javaquery_playground {

	static String QUERY = "for $var in /*[name() = \"demo:data\"]/*\r\n"
			+ "let $source := $var/*[name() = \"demo:source\"]/data()\r\n" + "return (" + "\"<result>\""
			+ ", \"<record>\", $var, \"</record>\"" + ", \"<arg1>\", $source, \"</arg1>\"" + ", \"</result>\"" + ")";

	public static void main(String[] args) {

		System.out.println();
		JavaQueryInterimContainer myJavaResult = new BaseXJavaQueryInterimContainer(DEMO_DATABASE_NAME, DEMO_DATA_PATH,
				QUERY);
		System.out.println(myJavaResult.toString());
		System.out.println("amount: " + myJavaResult.size());
	}
}
