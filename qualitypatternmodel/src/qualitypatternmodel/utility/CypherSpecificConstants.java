package qualitypatternmodel.utility;
/*
 * This class has been introduced for flexible changing the nameing of diffrent Neo4J specific constrains.
 * You could switch the nameing as like
 * Keep an eye on the constrains given by Cypher, since diffrent symboles like $ are not allowed and lead to an error 
 */

public class CypherSpecificConstants {
	public static final String VARIABLE_NODE = "varNode";
	public static final String VARIABLE_EGDE = "varEdge";
	
}
