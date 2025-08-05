package qualitypatternmodel.newservlets.initialisation;

public class PatternConstants {

	public static String APPDUP2_ID = "Appdup2";
	public static String APPDUP2_NAME = "Approximate Duplicate based on two attributes";
	public static String APPDUP2_DESCR = "Check whether there are records that have the same value in two important attributes, suggesting that they describe the same real-world object.";
	
	public static String APPDUP3_ID = "Appdup3";
	public static String APPDUP3_NAME = "Approximate Duplicate based on three attributes";
	public static String APPDUP3_DESCR = "Check whether there are records that have the same value in three important attributes, suggesting that they describe the same real-world object.";
	
	public static String CARDIMPLIESMANDATT_ID = "CardImpliesMandAtt";
	public static String CARDIMPLIESMANDATT_NAME = "Mandatory Attribute based on Cardinality Constraint";
	public static String CARDIMPLIESMANDATT_DESCR = "Check whether a attribute exists, that is mandatory on specific cardinalities of a field.";
	
	public static String CARD_ID = "Card";
	public static String CARD_NAME = "Cardinality Constraint";
	public static String CARD_DESCR = "Check, wether the occurence count of specific elements apply.";
	
	public static String CHECKFORMAT_ID = "CheckFormat";
	public static String CHECKFORMAT_NAME = "Check the format of a resource";
	public static String CHECKFORMAT_DESCR = "Check if the ressource under an URL is of a specific format.";
	
	public static String COMPDATABASE_ID = "CompDatabase";
	public static String COMPDATABASE_NAME = "Fieldvalue in Database";
	public static String COMPDATABASE_DESCR = "Check whether all values in a field are in a database.";
	
	public static String COMP_ID = "Comp";
	public static String COMP_NAME = "Comparison Pattern";
	public static String COMP_DESCR = "Check, wether the occurence count of specific elements apply.";
	
	public static String COMPSET_ID = "CompSet";
	public static String COMPSET_NAME = "Comparison Pattern with Set";
	public static String COMPSET_DESCR = "Check, wether the value of fields are within a list of allowed (/forbidden) terms.";
	
	public static String COMPVALANY_ID = "CompValAny";
	public static String COMPVALANY_NAME = "Compare values within a record";
	public static String COMPVALANY_DESCR = "Check whether any value of a specific field within a record does comply to a value restriction.";
	
	public static String COMPVAL_ID = "CompVal";
	public static String COMPVAL_NAME = "Compare Values";
	public static String COMPVAL_DESCR = "Check whether all values of a specific field within a record does comply to a value restriction.";
	
	public static String CONTAINS_ID = "Contains";
	public static String CONTAINS_NAME = "Contains Check";
	public static String CONTAINS_DESCR = "Check, whether a value contains a specific substring.";
	
	public static String DUPVAL_ID = "DupVal";
	public static String DUPVAL_NAME = "Duplicate value";
	public static String DUPVAL_DESCR = "Check whether a record has the same value in two distinct fields.";
	
	public static String FUNC_ID = "Func";
	public static String FUNC_NAME = "Functional Dependency Constraint";
	public static String FUNC_DESCR = "Validate a dependency between two subordinate fields is valid in comparison to data records next to it.";
	
	public static String LOCALUNIQUE_ID = "LocalUnique";
	public static String LOCALUNIQUE_NAME = "Local Unique Attribute Constraint";
	public static String LOCALUNIQUE_DESCR = "Check whether all field values are unique within a record.";
	
	public static String MANDATT_ID = "MandAtt";
	public static String MANDATT_NAME = "Mandatory Attribute";
	public static String MANDATT_DESCR = "Check whether a record has a mandatory field.";
	
	public static String MANDCONT_ID = "MandCont";
	public static String MANDCONT_NAME = "Mandatory Content";
	public static String MANDCONT_DESCR = "Check whether an element has mandatory content.";
	
	public static String MATCH_ID = "Match";
	public static String MATCH_NAME = "Regular Expression Check";
	public static String MATCH_DESCR = "Check, whether a value matches a specific regular expression.";
	
	public static String STRINGLENGTH_ID = "StringLength";
	public static String STRINGLENGTH_NAME = "String value length restriction";
	public static String STRINGLENGTH_DESCR = "Check whether all field values comply to the length restriction.";
	
	public static String UNIQUE_ID = "Unique";
	public static String UNIQUE_NAME = "Uniqueness Constraint";
	public static String UNIQUE_DESCR = "Check, whether a value is unique within the dataset.";
	
	public static String VALIDLINK_ID = "ValidLink";
	public static String VALIDLINK_NAME = "Valid Link";
	public static String VALIDLINK_DESCR = "Check whether a record contains a field with an invalid link.";
}
