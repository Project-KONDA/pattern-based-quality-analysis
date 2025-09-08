package qualitypatternmodel.utility;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;

import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.graphstructure.PrimitiveNode;
import qualitypatternmodel.graphstructure.Relation;
import qualitypatternmodel.javaoperators.JavaOperator;
import qualitypatternmodel.operators.BooleanOperator;

public class JavaQueryTranslationUtility {

	public static String INTERIM = "interim";
	public static String RETURN = "return";
	public static String CONDITION = "condition";
	public static String QUANTIFIED = "quantified";
	public static String QUANTIFIER = "quantifier";
	public static String FORMULA = "formula";
	public static String VALUE = "value";
	public static String BOOLEAN = "boolean";
	public static String RETURNSTATEMENT = "return\n  ";
	public static String COUNT = "count";

	public static String start(String tag){
		return "\"<" + tag + ">\"";
	}
	public static String end(String tag){
		return "\"</" + tag + ">\"";
	}

	public static String getXQueryReturnList(List<String> elements, String tagname, boolean ret, boolean outerbrackets, boolean innerbrackets) {
		String returnstring = start(tagname) + ",\n  ";
		if (innerbrackets) {
			returnstring += "(";
		}
//		returnstring = "\n  " + returnstring;
		if (outerbrackets) {
			returnstring = "(\n  " + returnstring;
		}
		if (ret) {
			returnstring = RETURNSTATEMENT + returnstring;
		}
		for (int i = 0; i < elements.size(); i++) {
			String element = elements.get(i);
			if (element != null && !element.equals("")) {
				returnstring += element;
				if (i == elements.size()-1 && innerbrackets) {
					returnstring += "  )";
				}
				returnstring += ",\n  ";
			}
		}

		returnstring += end(tagname);
		if (outerbrackets) {
			returnstring += ")";
		}
		return returnstring;
	}

	public static List<Relation> orderRelationsJavaQuery(List<Relation> relations) {
		@SuppressWarnings("unchecked")
		List<Relation>[] relationgroups = new BasicEList[6];
		for (int i = 0; i<6; i++) {
			relationgroups[i] = new BasicEList<Relation>();
		}

		for (Relation r: relations) {
			Boolean java = hasJavaTargetSomewhere(r);
			Boolean condition = hasConditionNode(r);
			Boolean property = (r.getTarget() instanceof PrimitiveNode);

			if (!condition) {
				if (!java) {
					if (property) {
						relationgroups[0].add(r); // 1. propertyrelations without java operators (!java !condition property)
					}
					else {
						relationgroups[1].add(r); // 2. noderelations without java operators (!condition !java)
					}
				} else {
					if (property) {
						relationgroups[2].add(r); // 3. propertyrelations with java operators (!condition property
					}
					else {
						relationgroups[3].add(r); // 4. noderelations with java operators (!condition)
					}
				}}
				else if (java) {
					relationgroups[4].add(r); // 5. noderelations with java operators and conditionnodes (condition java)
				}
				else {
					relationgroups[5].add(r); // 6. noderelations with conditionnodes (condition !java)
				}
		}

		List<Relation> result = new BasicEList<Relation>();
		for (List<Relation> rellist: relationgroups) {
			result.addAll(rellist);
		}
		return result;
	}

	private static List<Relation> currentRelations = new ArrayList<Relation>();

	public static Boolean hasJavaTargetSomewhere(Relation rel) {
		if (currentRelations.contains(rel)) {
			return false;
		}
		currentRelations.add(rel);
		Node n = rel.getTarget();
		if (n instanceof PrimitiveNode) {
			for (BooleanOperator op: n.getPredicates()) {
				if (op instanceof JavaOperator) {
					return true;
				}
			}
		}
		if (n instanceof ComplexNode) {
			for (Relation rel2 : ((ComplexNode) n).getOutgoing()) {
				if (hasJavaTargetSomewhere(rel2)) {
					return true;
				}
			}
		}
		currentRelations.remove(rel);
		return false;
	}

	public static Boolean hasConditionNode(Relation rel) {
		if (currentRelations.contains(rel)) {
			return false;
		}
		currentRelations.add(rel);

		if (rel.isCrossGraph()) {
			return true;
		}
		Node n = rel.getTarget();
		if (n instanceof ComplexNode) {
			for (Relation rel2 : ((ComplexNode) n).getOutgoing()) {
				if (hasConditionNode(rel2)) {
					return true;
				}
			}
		}
		currentRelations.remove(rel);
		return false;
	}

	public static Boolean isStartTag(String value) {
		return value.startsWith("<") && !value.startsWith("</") && !value.contains(" ");
	}

	public static Boolean isValue(String value) {
		return !isStartTag(value) && !isEndTag(value);
	}

	public static Boolean isEndTag(String value) {
		return value.startsWith("</") && !value.contains(" ");
	}

}