package qualitypatternmodel.utility;
/*
 * This class has been introduced for flexible changing the nameing of diffrent Neo4J specific constrains.
 * You could switch the nameing as like
 * Keep an eye on the constrains given by Cypher, since diffrent symboles like $ are not allowed and lead to an error 
 */

public class CypherSpecificConstants {
	public static final String VARIABLE_NODE = "varNode";
	public static final String VARIABLE_EGDE = "varEdge";
	public static final String INTERNAL_EDGE_NODE = "intEgNode";
	public static final String CLAUSE_MATCH = "\nMATCH";
	public static final String CLAUSE_WITH = "\nWITH";
	public static final String CLAUSE_WHERE = "\nWHERE";
	public static final String CLAUSE_RETURN_INLUCE = "\nRETURN";
	public static final String CLAUSE_MATCH_INLUCE_W = "\n%sMATCH"; //Include_W is for the includsion of whitspaces
	public static final String CLAUSE_WITH_INLUCE_W = "\n%sWITH";
	public static final String CLAUSE_WHERE_INLUCE_W = "\n%sWHERE";
	public static final String CLAUSE_RETURN_INLUCE_W = "\n%sRETURN";
	public static final String SIX_WHITESPACES = "      ";
	public static final String TWELVE_WHITESPACES = "            ";
	public static final String PREDICATE_FUNCTION_EXISTS = "EXISTS { %s }";
	public static final String BOOLEAN_OPERATOR_PREFIX = "\n      ";
	public static final String BOOLEAN_OPERATOR_XOR = "XOR";
	public static final String BOOLEAN_OPERATOR_NOT = "NOT";
	public static final String BOOLEAN_OPERATOR_OR = "OR";
	public static final String BOOLEAN_OPERATOR_AND = "AND";

}
