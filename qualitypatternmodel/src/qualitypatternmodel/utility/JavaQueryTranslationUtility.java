package qualitypatternmodel.utility;

import java.util.List;

public class JavaQueryTranslationUtility {
	
	public static String getXQueryReturnList(List<String> elements, String tagname) {
		String concat = "return\n  concat(\n  ";
		
		String returnstring = concat + "\"<" + tagname + ">\",\n  ";
		for (String element: elements) {
			if (element != null && !element.equals("")) {
				if (element.startsWith(concat)) {
					element = element.substring(concat.length(), element.length()-1);
				}
				returnstring += element + ",\n  ";
			}
		}
		
		returnstring += "\"</" + tagname + ">\")";
		return returnstring;
	}
	
}