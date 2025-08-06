package qualitypatternmodel.newservlets.patterns;

public class PatternConstants {

	static String APPDUP2_ID_GENERIC = "Appdup2_generic";
	static String APPDUP2_ID_XML = "Appdup2_xml";
	static String APPDUP2_ID_RDF = "Appdup2_rdf";
	static String APPDUP2_ID_NEO = "Appdup2_neo4j";
	static String APPDUP2_NAME = "Approximate Duplicate based on two attributes";
	static String APPDUP2_DESCR = "Check whether there are records that have the same value in two important attributes, suggesting that they describe the same real-world object.";
	
	static String APPDUP3_ID_GENERIC = "Appdup3_generic";
	static String APPDUP3_ID_XML = "Appdup3_xml";
	static String APPDUP3_ID_RDF = "Appdup3_rdf";
	static String APPDUP3_ID_NEO = "Appdup3_neo4j";
	static String APPDUP3_NAME = "Approximate Duplicate based on three attributes";
	static String APPDUP3_DESCR = "Check whether there are records that have the same value in three important attributes, suggesting that they describe the same real-world object.";
	
	static String CARDIMPLIESMANDATT_ID_GENERIC = "CardImpliesMandAtt_generic";
	static String CARDIMPLIESMANDATT_ID_XML = "CardImpliesMandAtt_xml";
	static String CARDIMPLIESMANDATT_ID_RDF = "CardImpliesMandAtt_rdf";
	static String CARDIMPLIESMANDATT_ID_NEO = "CardImpliesMandAtt_neo4j";
	static String CARDIMPLIESMANDATT_NAME = "Mandatory Attribute based on Cardinality Constraint";
	static String CARDIMPLIESMANDATT_DESCR = "Check whether a attribute exists, that is mandatory on specific cardinalities of a field.";
	
	static String CARD_ID_GENERIC = "Card_generic";
	static String CARD_ID_XML = "Card_xml";
	static String CARD_ID_RDF = "Card_rdf";
	static String CARD_ID_NEO = "Card_neo4j";
	static String CARD_NAME = "Cardinality Constraint";
	static String CARD_DESCR = "Check, wether the occurence count of specific elements apply.";
	
	static String CHECKFORMAT_ID_GENERIC = "CheckFormat_generic";
	static String CHECKFORMAT_ID_XML = "CheckFormat_xml";
	static String CHECKFORMAT_ID_RDF = "CheckFormat_rdf";
	static String CHECKFORMAT_ID_NEO = "CheckFormat_neo4j";
	static String CHECKFORMAT_NAME = "Check the format of a resource";
	static String CHECKFORMAT_DESCR = "Check if the ressource under an URL is of a specific format.";
	
	static String COMPDATABASE_ID_GENERIC = "CompDatabase_generic";
	static String COMPDATABASE_ID_XML = "CompDatabase_xml";
	static String COMPDATABASE_ID_RDF = "CompDatabase_rdf";
	static String COMPDATABASE_ID_NEO = "CompDatabase_neo4j";
	static String COMPDATABASE_NAME = "Fieldvalue in Database";
	static String COMPDATABASE_DESCR = "Check whether all values in a field are in a database.";
	
	static String COMP_ID_GENERIC = "Comp_generic";
	static String COMP_ID_XML = "Comp_xml";
	static String COMP_ID_RDF = "Comp_rdf";
	static String COMP_ID_NEO = "Comp_neo4j";
	static String COMP_NAME = "Comparison Pattern";
	static String COMP_DESCR = "Check, wether the occurence count of specific elements apply.";
	
	static String COMPSET_ID_GENERIC = "CompSet_generic";
	static String COMPSET_ID_XML = "CompSet_xml";
	static String COMPSET_ID_RDF = "CompSet_rdf";
	static String COMPSET_ID_NEO = "CompSet_neo4j";
	static String COMPSET_NAME = "Comparison Pattern with Set";
	static String COMPSET_DESCR = "Check, wether the value of fields are within a list of allowed (/forbidden) terms.";
	
	static String COMPVALANY_ID_GENERIC = "CompValAny_generic";
	static String COMPVALANY_ID_XML = "CompValAny_xml";
	static String COMPVALANY_ID_RDF = "CompValAny_rdf";
	static String COMPVALANY_ID_NEO = "CompValAny_neo4j";
	static String COMPVALANY_NAME = "Compare values within a record";
	static String COMPVALANY_DESCR = "Check whether any value of a specific field within a record does comply to a value restriction.";
	
	static String COMPVAL_ID_GENERIC = "CompVal_generic";
	static String COMPVAL_ID_XML = "CompVal_xml";
	static String COMPVAL_ID_RDF = "CompVal_rdf";
	static String COMPVAL_ID_NEO = "CompVal_neo4j";
	static String COMPVAL_NAME = "Compare Values";
	static String COMPVAL_DESCR = "Check whether all values of a specific field within a record does comply to a value restriction.";
	
	static String CONTAINS_ID_GENERIC = "Contains_generic";
	static String CONTAINS_ID_XML = "Contains_xml";
	static String CONTAINS_ID_RDF = "Contains_rdf";
	static String CONTAINS_ID_NEO = "Contains_neo4j";
	static String CONTAINS_NAME = "Contains Check";
	static String CONTAINS_DESCR = "Check, whether a value contains a specific substring.";
	
	static String DUPVAL_ID_GENERIC = "DupVal_generic";
	static String DUPVAL_ID_XML = "DupVal_xml";
	static String DUPVAL_ID_RDF = "DupVal_rdf";
	static String DUPVAL_ID_NEO = "DupVal_neo4j";
	static String DUPVAL_NAME = "Duplicate value";
	static String DUPVAL_DESCR = "Check whether a record has the same value in two distinct fields.";
	
	static String FUNC_ID_GENERIC = "Func_generic";
	static String FUNC_ID_XML = "Func_xml";
	static String FUNC_ID_RDF = "Func_rdf";
	static String FUNC_ID_NEO = "Func_neo4j";
	static String FUNC_NAME = "Functional Dependency Constraint";
	static String FUNC_DESCR = "Validate a dependency between two subordinate fields is valid in comparison to data records next to it.";
	
	static String LOCALUNIQUE_ID_GENERIC = "LocalUnique_generic";
	static String LOCALUNIQUE_ID_XML = "LocalUnique_xml";
	static String LOCALUNIQUE_ID_RDF = "LocalUnique_rdf";
	static String LOCALUNIQUE_ID_NEO = "LocalUnique_neo4j";
	static String LOCALUNIQUE_NAME = "Local Unique Attribute Constraint";
	static String LOCALUNIQUE_DESCR = "Check whether all field values are unique within a record.";
	
	static String MANDATT_ID_GENERIC = "MandAtt_generic";
	static String MANDATT_ID_XML = "MandAtt_xml";
	static String MANDATT_ID_RDF = "MandAtt_rdf";
	static String MANDATT_ID_NEO = "MandAtt_neo4j";
	static String MANDATT_NAME = "Mandatory Attribute";
	static String MANDATT_DESCR = "Check whether a record has a mandatory field.";
	
	static String MANDCONT_ID_GENERIC = "MandCont_generic";
	static String MANDCONT_ID_XML = "MandCont_xml";
	static String MANDCONT_ID_RDF = "MandCont_rdf";
	static String MANDCONT_ID_NEO = "MandCont_neo4j";
	static String MANDCONT_NAME = "Mandatory Content";
	static String MANDCONT_DESCR = "Check whether an element has mandatory content.";
	
	static String MATCH_ID_GENERIC = "Match_generic";
	static String MATCH_ID_XML = "Match_xml";
	static String MATCH_ID_RDF = "Match_rdf";
	static String MATCH_ID_NEO = "Match_neo4j";
	static String MATCH_NAME = "Regular Expression Check";
	static String MATCH_DESCR = "Check, whether a value matches a specific regular expression.";
	
	static String STRINGLENGTH_ID_GENERIC = "StringLength_generic";
	static String STRINGLENGTH_ID_XML = "StringLength_xml";
	static String STRINGLENGTH_ID_RDF = "StringLength_rdf";
	static String STRINGLENGTH_ID_NEO = "StringLength_neo4j";
	static String STRINGLENGTH_NAME = "String value length restriction";
	static String STRINGLENGTH_DESCR = "Check whether all field values comply to the length restriction.";
	
	static String UNIQUE_ID_GENERIC = "Unique_generic";
	static String UNIQUE_ID_XML = "Unique_xml";
	static String UNIQUE_ID_RDF = "Unique_rdf";
	static String UNIQUE_ID_NEO = "Unique_neo4j";
	static String UNIQUE_NAME = "Uniqueness Constraint";
	static String UNIQUE_DESCR = "Check, whether a value is unique within the dataset.";
	
	static String VALIDLINK_ID_GENERIC = "ValidLink_generic";
	static String VALIDLINK_ID_XML = "ValidLink_xml";
	static String VALIDLINK_ID_RDF = "ValidLink_rdf";
	static String VALIDLINK_ID_NEO = "ValidLink_neo4j";
	static String VALIDLINK_NAME = "Valid Link";
	static String VALIDLINK_DESCR = "Check whether a record contains a field with an invalid link.";
}
