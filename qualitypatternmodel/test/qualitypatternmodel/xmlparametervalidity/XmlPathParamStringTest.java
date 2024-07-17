package qualitypatternmodel.xmlparametervalidity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import qualitypatternmodel.adaptionxml.XmlAxisPartCondition;
import qualitypatternmodel.adaptionxml.impl.XmlAxisPartConditionImpl;
import qualitypatternmodel.adaptionxml.impl.XmlElementNavigationImpl;
import qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl;
import qualitypatternmodel.adaptionxml.impl.XmlPropertyOptionParamImpl;
import qualitypatternmodel.exceptions.InvalidityException;

public class XmlPathParamStringTest {

	static List<String> all = new ArrayList<String>();
	static List<String> axis = Arrays.asList("/", "//", "/child::", "/following::", "/descendant::");
	static List<String> node = Arrays.asList("*", "lido:lido", "lido", "abc:def", "abc");
	static List<String> node2 = Arrays.asList("*", "*[name()=\"lido:lido\"]", "*[name()=\"lido\"]", "*[name()=\"abc:def\"]", "*[name()=\"abc\"]");
//	static List<String> node = Arrays.asList("*");
	static List<String> cond = Arrays.asList("", "[]", "[text()]", "[@abc]", "[text()=\"\"]", "[text()=\"anything\"]", "[name()=\"lido:lido\"]");
	static List<String> propops = Arrays.asList("@abc", "text()", "name()");

	public static void main(String[] args) throws InvalidityException {
		
		System.out.println("Test 1: XmlPathParam");
		xmlPathParamImplTest();
		
		System.out.println("\nTest 2: XmlPathParamCondition");
		xmlPathParamConditionImplTest();
		
		System.out.println("\nTest 3: XmlPropertyOption");
		xmlPropertyOptionImplTest();
	}


	public static void xmlPathParamImplTest() {
		for (String a : axis) {
			for (String b : node) {
				for (String c : cond) {
					//					all.add((a+b+c));
					for (String d : cond) {
						all.add((a+b+c+d));
					}
				}
			}
		}

		ArrayList<String> success = new ArrayList<>();
		ArrayList<String> failed = new ArrayList<>();
		ArrayList<String> error = new ArrayList<>();
		ArrayList<String> check = new ArrayList<>();
		ArrayList<String> check2 = new ArrayList<>();

		for (String path: all) {
			try {
//				int i = XmlPathParamImpl.indexWhereSplit(path);
//				if (i == -1 || i != path.length())
//					failed.add(path + " [" + i + "]");
				XmlPathParamImpl xpath = new XmlPathParamImpl();
				XmlElementNavigationImpl nav = new XmlElementNavigationImpl();
				nav.setXmlPathParam(xpath);
				xpath.setValueFromString(path);
				String path2 = path.replace("data()", "text()").replace("[]", "");
				for (String n: node) {
					path2 = path2.replace("//" + n, "/descendant::" + n).replace("/" + n, "/child::" + n);
				}
				String path3 = path2;
				for (int i = 0; i<node.size(); i++) {
					path3 = path3.replace("::" + node.get(i), "::" + node2.get(i));
				}

				String res = xpath.generateXQuery();
				if (!res.equals(path2) && !res.equals(path3)) {
					check.add("[" + res + "](" + path2 + ")(" + path3 + ")");
//					check.add("'" + res + "'&'" + path+"'");
				} else {
					check2.add(res);
				}
				success.add(path);
			}
			catch (Exception e) {
				error.add(path);
				System.out.println("ERROR: " + path + "\n - " + e.getMessage());
				e.printStackTrace();
			}
		}

		System.out.println("CHECK (" + check.size() + "): " + check);
		System.out.println("CHECK2 (" + check2.size() + "): " + check2);
		System.out.println("SUCCESS (" + success.size() + ")"); //: " + success);
		System.out.println("FAILED (" + failed.size() + "): " + failed);
		System.out.println("ERROR (" + error.size() + "): " + error);
//		System.out.println("CHECK (" + check.size() + "): " + check);
	}


	public static void xmlPathParamConditionImplTest() {
		ArrayList<String> success = new ArrayList<>();
		ArrayList<String> failed = new ArrayList<>();
		ArrayList<String> error = new ArrayList<>();

		for (String c: cond) {
			if (!c.equals("") && !c.equals("[]")) {
				XmlAxisPartCondition condition = new XmlAxisPartConditionImpl();
				try {
					condition.setValueFromString(c);
					String res = condition.generateXQuery();
					if (res.equals(c)) {
						success.add(c);
					} else {
						failed.add(res + "$" + c);
					}
				} catch (InvalidityException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("SUCCESS (" + success.size() + "): " + success);
		System.out.println("FAILED (" + failed.size() + "): " + failed);
		System.out.println("ERROR (" + error.size() + "): " + error);
	}


	public static void xmlPropertyOptionImplTest() {
		ArrayList<String> success = new ArrayList<>();
		ArrayList<String> failed = new ArrayList<>();
		ArrayList<String> error = new ArrayList<>();
		for (String pop: propops) {
			XmlPropertyOptionParamImpl xpop = new XmlPropertyOptionParamImpl();
			try {
				xpop.setValueFromString("/" + pop);
				String res = xpop.generateXQuery();
				if (res.equals("/" + pop)) {
					success.add(res);
				} else {
					failed.add("'" + res + "'$'" + pop + "'");
				}
			} catch (InvalidityException e) {
				e.printStackTrace();
			}
		}
		System.out.println("SUCCESS (" + success.size() + "): " + success);
		System.out.println("FAILED (" + failed.size() + "): " + failed);
		System.out.println("ERROR (" + error.size() + "): " + error);
	}
}
