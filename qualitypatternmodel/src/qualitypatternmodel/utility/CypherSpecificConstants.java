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
	public static final String CONNECTION = "-";
	public static final String CYPHER_SEPERATOR = ",";
	public static final String CLAUSE_MATCH = "\nMATCH";
	public static final String CLAUSE_WITH = "\nWITH";
	public static final String CLAUSE_WHERE = "\nWHERE";
	public static final String CLAUSE_RETURN = "\nRETURN";
	public static final String CLAUSE_MATCH_INLUCE_W = "\n%sMATCH"; //Include_W is for the includsion of whitspaces
	public static final String CLAUSE_WITH_INLUCE_W = "\n%sWITH";
	public static final String CLAUSE_WHERE_INLUCE_W = "\n%sWHERE";
	public static final String CLAUSE_RETURN_INLUCE_W = "\n%sRETURN";
	public static final String ONE_WHITESPACES = " ";
	public static final String THREE_WHITESPACES = "   ";
	public static final String SIX_WHITESPACES = "      ";
	public static final String TWELVE_WHITESPACES = "            ";
	public static final String PREDICATE_FUNCTION_EXISTS = "EXISTS { %s }";
	public static final String BOOLEAN_OPERATOR_PREFIX = "\n      ";
	public static final String BOOLEAN_OPERATOR_XOR = "XOR";
	public static final String BOOLEAN_OPERATOR_NOT = "NOT";
	public static final String BOOLEAN_OPERATOR_OR = "OR";
	public static final String BOOLEAN_OPERATOR_AND = "AND";
	public static final String WHERE_OPERATOR_CONTAINS = "CONTAINS";
	public static final String SPECIAL_CYPHER_MULTIPLE_EDGES_NODES = "--";
	public static final String SPECIAL_CYPHER_REGEX_EXPRESSION = "=~";
	public static final String REPLACING_SEQUENCES_DOPPLE_CONNECTION = "ReplaceWithDoppleConnection";
	
	public static final String CYPHER_COMPARISON_OPERATOR_EQUAL = "=";
	public static final String CYPHER_COMPARISON_OPERATOR_EQUAL_IN_GRAPH_MATCHING = ":";
	public static final String CYPHER_COMPARISON_OPERATOR_NOTEQUAL = "<>";
	public static final String CYPHER_COMPARISON_OPERATOR_GREATER = ">"; 
	public static final String CYPHER_COMPARISON_OPERATOR_GREATER_EQUAL = ">=";
	public static final String CYPHER_COMPARISON_OPERATOR_LESS = "<";
	public static final String CYPHER_COMPARISON_OPERATOR_LESS_EQUAL = "<=";
	public static final String CYPHER_COMPARISON_OPERATOR_IS_NULL = "IS NULL";
	public static final String CYPHER_COMPARISON_OPERATOR_IS_NOT_NULL = "IS NOT NULL";
	
}
