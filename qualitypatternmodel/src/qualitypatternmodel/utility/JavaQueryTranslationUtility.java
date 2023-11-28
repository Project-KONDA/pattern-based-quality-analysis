package qualitypatternmodel.utility;

import java.util.List;

import org.eclipse.emf.common.util.BasicEList;

import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;

public class JavaQueryTranslationUtility {

	public static String INTERIM = "interim";
	public static String INTERIMSTART = "\"<interim>\"";
	public static String INTERIMEND = "\"</interim>\"";
	public static String RETURNSTART = "\"<return>\"";
	public static String RETURNEND = "\"</return>\"";
	public static String CONDITIONSTART = "\"<condition>\"";
	public static String CONDITIONEND = "\"</condition>\"";
	public static String QUANTIFIED = "quantified";
	public static String QUANTIFIEDSTART = "\"<quantified>\"";
	public static String QUANTIFIEDEND = "\"</quantified>\"";
	public static String FORMULA = "formula";
	public static String FORMULASTART = "\"<formula>\"";
	public static String FORMULAEND = "\"</formula>\"";
	public static String VALUESTART = "\"<value>\"";
	public static String VALUEEND = "\"</value>\"";
	
	public static String getXQueryReturnList(List<String> elements, String tagname) {
		String concat = "return\n  (\n  ";
		
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
	
	public static List<Relation> orderRelationsJavaQuery(List<Relation> relations) {
		@SuppressWarnings("unchecked")
		List<Relation>[] relationgroups = new BasicEList[6];
		for (int i = 0; i<6; i++)
			relationgroups[i] = new BasicEList<Relation>();
		
		for (Relation r: relations) {
			Boolean java = true;
			Boolean condition = true;
			Boolean property = (r.getTarget() instanceof PrimitiveNode);
			
			if (!condition) {
				if (!java) {
					if (property)
						relationgroups[0].add(r); // 1. propertyrelations without java operators (!java !condition property)
					else 
						relationgroups[1].add(r); // 2. noderelations without java operators (!condition !java)	
				} else {
					if (property)
						relationgroups[2].add(r); // 3. propertyrelations with java operators (!condition property
					else 
						relationgroups[3].add(r); // 4. noderelations with java operators (!condition)
				}}
				else if (java)
					relationgroups[4].add(r); // 5. noderelations with java operators and conditionnodes (condition java)
				else
					relationgroups[5].add(r); // 6. noderelations with conditionnodes (condition !java)
		}
				
		List<Relation> result = new BasicEList<Relation>();
		for (List<Relation> rellist: relationgroups)
			result.addAll(rellist);
		return result;
	}
	
}