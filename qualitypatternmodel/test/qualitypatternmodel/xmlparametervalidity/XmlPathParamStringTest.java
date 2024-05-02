package qualitypatternmodel.xmlparametervalidity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import qualitypatternmodel.adaptionxml.impl.XmlPathParamImpl;
import qualitypatternmodel.exceptions.InvalidityException;

public class XmlPathParamStringTest {

	public static void main(String[] args) throws InvalidityException {
		
		List<String> all = new ArrayList<String>();
		List<String> axis = Arrays.asList("/", "//", "/child::", "/following::", "/descendant::");
		List<String> node = Arrays.asList("*", "lido", "lido:lido", "abc", "abc:def");
		List<String> cond = Arrays.asList("", "[]", "[data()]", "[@abc]", "[text()=\"\"]", "[text()=\"anything\"]", "[name()=\"lido:lido\"]");
		
		for (String a : axis)
			for (String b : node)
				for (String c : cond)
//					all.add((a+b+c));
					for (String d : cond)
						all.add((a+b+c+d));
		
		
		
		
		ArrayList<String> success = new ArrayList<String>();
		ArrayList<String> failed = new ArrayList<String>();
		ArrayList<String> error = new ArrayList<String>();
//		
		for (String path: all) {
			try {
//				int i = XmlPathParamImpl.indexWhereSplit(path);
//				if (i == -1 || i != path.length())
//					failed.add(path + " [" + i + "]");
				new XmlPathParamImpl().setValueFromString(path);
				success.add(path);
			}
			catch (Exception e) {
				error.add(path);
				System.out.println("ERROR: " + path + "\n - " + e.getMessage());
				e.printStackTrace();
			}
			
		}
		System.out.println("SUCCESS (" + success.size() + "): " + success);
		System.out.println("FAILED (" + failed.size() + "): " + failed);
		System.out.println("ERROR (" + error.size() + "): " + error);
		
	}

}
