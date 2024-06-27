package qualitypatternmodel.newservlets.initialisation;

public class GenericPatternInformation {	

	static String CARD_NAME = "Card";
	static String CARD_ID_GENERIC = "Card_generic";
	static String CARD_SHORTDESCR = "Cardinality Constraint";
	static String CARD_DESCR = "Check, wether the occurence count of specific elements apply.";
	
	static String COMP_NAME = "Comp";
	static String COMP_ID_GENERIC = "Comp_generic";
	static String COMP_SHORTDESCR = "Comparison Pattern";
	static String COMP_DESCR = "Check, wether the occurence count of specific elements apply.";
	
	static String COMPSET_NAME = "CompSet";
	static String COMPSET_ID_GENERIC = "CompSet_generic";
	static String COMPSET_SHORTDESCR = "Comparison Pattern with Set";
	static String COMPSET_DESCR = "Check, wether the value of fields are within a list of allowed (/forbidden) terms.";

	static String FUNC_NAME = "Func";
	static String FUNC_ID_GENERIC = "Func_generic";
	static String FUNC_SHORTDESCR = "Functional Dependency Constraint";
	static String FUNC_DESCR = "Validate a dependency between two subordinate fields is valid in comparison to data records next to it.";

	static String UNIQUE_NAME = "Unique";
	static String UNIQUE_ID_GENERIC = "Unique_generic";
	static String UNIQUE_SHORTDESCR = "Uniqueness Constraint";
	static String UNIQUE_DESCR = "Check, whether a value is unique within the dataset.";

	static String MATCH_NAME = "Match";
	static String MATCH_ID_GENERIC = "Match_generic";
	static String MATCH_SHORTDESCR = "Regular Expression Check";
	static String MATCH_DESCR = "Check, whether a value matches a specific regular expression.";

	static String CONTAINS_NAME = "Contains";
	static String CONTAINS_ID_GENERIC = "Contains_generic";
	static String CONTAINS_SHORTDESCR = "Contains Check";
	static String CONTAINS_DESCR = "Check, whether a value contains a specific substring.";

	static String APPDUP2_NAME = "Appdup2";
	static String APPDUP2_ID_GENERIC = "Appdup2_generic";
	static String APPDUP2_SHORTDESCR = "Approximate Duplicate based on two attributes";
	static String APPDUP2_DESCR = "Check whether there are records that have the same value in two important attributes, suggesting that they describe the same real-world object.";

	static String APPDUP3_NAME = "Appdup3";
	static String APPDUP3_ID_GENERIC = "Appdup2_generic";
	static String APPDUP3_SHORTDESCR = "Approximate Duplicate based on three attributes";
	static String APPDUP3_DESCR = "Check whether there are records that have the same value in three important attributes, suggesting that they describe the same real-world object.";

	static String DUPVAL_NAME = "DupVal";
	static String DUPVAL_ID_GENERIC = "DupVal_generic";
	static String DUPVAL_SHORTDESCR = "Duplicate value";
	static String DUPVAL_DESCR = "Check whether a record has the same value in two distinct fields.";

	static String INVALIDLINK_NAME = "InvalidLink_generic";
	static String INVALIDLINK_ID_GENERIC = "InvalidLink_generic";
	static String INVALIDLINK_SHORTDESCR = "Invalid Link";
	static String INVALIDLINK_DESCR = "Check whether a record an invalid link in a field.";

	static String MANDATT_NAME = "MandAtt";
	static String MANDATT_ID_GENERIC = "MandAtt_generic";
	static String MANDATT_SHORTDESCR = "Mandatory Attribute";
	static String MANDATT_DESCR = "Check whether a record has a mandatory field.";

	static String STRINGLENGTH_NAME = "StringLength";
	static String STRINGLENGTH_ID_GENERIC = "StringLength_generic";
	static String STRINGLENGTH_SHORTDESCR = "String value length restriction";
	static String STRINGLENGTH_DESCR = "Check whether all field values comply to the length restriction.";

	static String COMPVAL_NAME = "CompVal";
	static String COMPVAL_ID_GENERIC = "CompVal_generic";
	static String COMPVAL_SHORTDESCR = "Compare Values";
	static String COMPVAL_DESCR = "Check whether all values of a specific field within a record does comply to a value restriction.";

	static String LOCALUNIQUE_NAME = "LocalUnique";
	static String LOCALUNIQUE_ID_GENERIC = "LocalUnique_generic";
	static String LOCALUNIQUE_SHORTDESCR = "Local Unique Attribute Constraint";
	static String LOCALUNIQUE_DESCR = "Check whether all field values are unique within a record.";

	static String COMPVALANY_NAME = "CompValAny";
	static String COMPVALANY_ID_GENERIC = "CompValAny_generic";
	static String COMPVALANY_SHORTDESCR = "Compare values within a record";
	static String COMPVALANY_DESCR = "Check whether any value of a specific field within a record does comply to a value restriction.";

	static String CARDIMPLIESMANDATT_NAME = "CardImpliesMandAtt";
	static String CARDIMPLIESMANDATT_ID_GENERIC = "CardImpliesMandAtt_generic";
	static String CARDIMPLIESMANDATT_SHORTDESCR = "Mandatory Attribute based on Cardinality Constraint";
	static String CARDIMPLIESMANDATT_DESCR = "Check whether a attribute exists, that is mandatory on specific cardinalities of a field.";

	static String CHECKFORMAT_NAME = "CheckFormat";
	static String CHECKFORMAT_ID_GENERIC = "CheckFormat_generic";
	static String CHECKFORMAT_SHORTDESCR = "Check the format of a resource";
	static String CHECKFORMAT_DESCR = "Check if the ressource under an URL is of a specific format.";

	static String COMPDATABASE_NAME = "CompDatabase";
	static String COMPDATABASE_ID_GENERIC = "CompDatabase_generic";
	static String COMPDATABASE_SHORTDESCR = "Fieldvalue in Database";
	static String COMPDATABASE_DESCR = "Check whether all values in a field are in a database.";

}
