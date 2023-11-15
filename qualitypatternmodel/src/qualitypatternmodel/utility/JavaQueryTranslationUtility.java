package qualitypatternmodel.utility;

import java.util.List;

public class JavaQueryTranslationUtility {
	
	public static String getXQueryReturnList(List<String> elements, String tagname) {
		String concat = "concat(\n";
		
		String returnstring = concat + "\"<" + tagname + ">\",\n";
		for (String element: elements) {
			if (element.startsWith(concat)) {
				element = element.substring(concat.length()+1, element.length()-2);
			}
			returnstring += element + ",\n";
		}
			
		returnstring += "\"</" + tagname + ">\")";;
		return returnstring;
	}
	
}