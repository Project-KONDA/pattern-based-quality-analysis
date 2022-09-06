package qualitypatternmodel.cyphertranslationtests;

public class CypherTest04Formula {

}

//PATTERN 3
//MATCH (r:IndexPlace)
//WHERE (Exists{MATCH(r)-[:IS_SUB_OF]-(:IndexPlace)} OR EXISTS{MATCH (r)-[:placeOfIssue]-(:Regesta)})
//RETURN r