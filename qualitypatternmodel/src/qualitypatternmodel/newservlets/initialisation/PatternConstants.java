package qualitypatternmodel.newservlets.initialisation;

public class PatternConstants {

	public static String APPDUP2_ID = "AppDup2";
	public static String APPDUP2_NAME = "Approximate Duplicate based on two attributes";
	public static String APPDUP2_DESCR = "Check whether there are records that have the same value in two important attributes, suggesting that they describe the same real-world object.";
	
	public static String APPDUP3_ID = "AppDup3";
	public static String APPDUP3_NAME = "Approximate Duplicate based on three attributes";
	public static String APPDUP3_DESCR = "Check whether there are records that have the same value in three important attributes, suggesting that they describe the same real-world object.";
	
	public static String CARDIMPLIESMANDATT_ID = "CardImpliesMandAtt";
	public static String CARDIMPLIESMANDATT_NAME = "Mandatory Attribute based on Cardinality Constraint";
	public static String CARDIMPLIESMANDATT_DESCR = "Check whether a attribute exists, that is mandatory on specific cardinalities of a field.";

	public static String CARD_ID = "Card";
	public static String CARD_NAME = "Cardinality Constraint";
	public static String CARD_DESCR = "Check, whether the occurence count of specific elements apply.";
	
	public static String CARDMATCH_ID = "CardMatch";
	public static String CARDMATCH_NAME = "Cardinality of RegEx-Constrained Values";
	public static String CARDMATCH_DESCR = "Check, whether the occurence count of specific elements, that match a regular expression apply.";

	public static String EXISTSIFEXISTS_ID = "ExistsIfExists";
	public static String EXISTSIFEXISTS_NAME = "ExistsIfExists";
	public static String EXISTSIFEXISTS_DESCR = "ExistsIfExists";

	public static String COMPSETIFMATCH_ID = "CompSetIfMatch";
	public static String COMPSETIFMATCH_NAME = "CompSetIfMatch";
	public static String COMPSETIFMATCH_DESCR = "CompSetIfMatch";

	public static String CARDIFCOMPSET_ID = "CardIfCompSet";
	public static String CARDIFCOMPSET_NAME = "If Property A in Set, Check Cardinality of Property B";
	public static String CARDIFCOMPSET_DESCR = "If one specific property is in a specific Set, check the occurence count of another specific element applies";

	public static String CARDCOMPSETIFCOMPSET_ID = "CardCompSetIfCompSet";
	public static String CARDCOMPSETIFCOMPSET_NAME = "If Property A in Set, Check Cardinality of Property B in Set";
	public static String CARDCOMPSETIFCOMPSET_DESCR = "If one specific property is in a specific Set, check the occurence count of values of another specific property, that are in another set";
	
	public static String CHECKFORMAT_ID = "CheckFormat";
	public static String CHECKFORMAT_NAME = "Check the format of a resource";
	public static String CHECKFORMAT_DESCR = "Check if the ressource under an URL is of a specific format.";
	
	public static String COMPDATABASE_ID = "CompDatabase";
	public static String COMPDATABASE_NAME = "Fieldvalue in Database";
	public static String COMPDATABASE_DESCR = "Check whether all values in a field are in a database.";
	
	public static String COMP_ID = "Comp";
	public static String COMP_NAME = "Comparison Pattern";
	public static String COMP_DESCR = "Check, whether the occurence count of specific elements apply.";
	
	public static String COMPSET_ID = "CompSet";
	public static String COMPSET_NAME = "Comparison Pattern with Set";
	public static String COMPSET_DESCR = "Check, whether the value of fields are within a list of allowed (/forbidden) terms.";
	
	public static String COMPSETISO_ID = "CompSetIso";
	public static String COMPSETISO_NAME = "Comparison Pattern with Set (Isolated)";
	public static String COMPSETISO_DESCR = "Check, whether the value of fields are within a list of allowed (/forbidden) terms.";
	
	public static String COMPSETSIN_ID = "CompSetSin";
	public static String COMPSETSIN_NAME = "Comparison Pattern with Set (Single)";
	public static String COMPSETSIN_DESCR = "Check, whether the value of fields are within a list of allowed (/forbidden) terms.";
	
	public static String COMPSETANY_ID = "CompSetAny";
	public static String COMPSETANY_NAME = "Comparison Pattern Any in Set";
	public static String COMPSETANY_DESCR = "Check, whether at least one value of fields are within a list of allowed (/forbidden) terms.";
	
	public static String COMPVALANY_ID = "CompValAny";
	public static String COMPVALANY_NAME = "Compare values within a record";
	public static String COMPVALANY_DESCR = "Check whether any value of a specific field within a record does comply to a value restriction.";
	
	public static String COMPVAL_ID = "CompVal";
	public static String COMPVAL_NAME = "Compare Values";
	public static String COMPVAL_DESCR = "Check whether all values of a specific field within a record does comply to a value restriction.";

	public static String CONTAINS_ID = "Contains";
	public static String CONTAINS_NAME = "Contains Check";
	public static String CONTAINS_DESCR = "Check, whether a value contains a specific substring.";
	
	public static String CONTAINSISO_ID = "ContainsIso";
	public static String CONTAINSISO_NAME = "Contains Check (Isolated)";
	public static String CONTAINSISO_DESCR = "Check, whether a value contains a specific substring.";
	
	public static String CONTAINSSIN_ID = "ContainsSin";
	public static String CONTAINSSIN_NAME = "Contains Check (Single)";
	public static String CONTAINSSIN_DESCR = "Check, whether a value contains a specific substring.";

	public static String CONTAINSLIST_ID = "ContainsList";
	public static String CONTAINSLIST_NAME = "Contains List Check";
	public static String CONTAINSLIST_DESCR = "Check, whether a value contains one of a list of substrings.";

	public static String CONTAINSLISTISO_ID = "ContainsListIso";
	public static String CONTAINSLISTISO_NAME = "Contains List Check (Isolated)";
	public static String CONTAINSLISTISO_DESCR = "Check, whether a value contains one of a list of substrings.";
 
	public static String CONTAINSLISTSIN_ID = "ContainsListSin";
	public static String CONTAINSLISTSIN_NAME = "Contains List Check (Single)";
	public static String CONTAINSLISTSIN_DESCR = "Check, whether a value contains one of a list of substrings.";
	
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
	
	public static String MANDELE_ID = "MandEle";
	public static String MANDELE_NAME = "Mandatory Element";
	public static String MANDELE_DESCR = "Check whether a record has a mandatory element.";
	
	public static String MANDCONT_ID = "MandCont";
	public static String MANDCONT_NAME = "Mandatory Content";
	public static String MANDCONT_DESCR = "Check whether an element has mandatory content.";
	
	public static String MANDCONTISO_ID = "MandContIso";
	public static String MANDCONTISO_NAME = "Mandatory Content (Isolated)";
	public static String MANDCONTISO_DESCR = "Check whether an element has mandatory content.";
	
	public static String MANDCONTSIN_ID = "MandContSin";
	public static String MANDCONTSIN_NAME = "Mandatory Content (Single)";
	public static String MANDCONTSIN_DESCR = "Check whether an element has mandatory content.";

	public static String MANDCONTAND_ID = "MandContAnd";
	public static String MANDCONTAND_NAME = "Two Mandatory Contents";
	public static String MANDCONTAND_DESCR = "Check whether an element has mandatory content.";

	public static String MANDCONTANDISO_ID = "MandContAndIso";
	public static String MANDCONTANDISO_NAME = "Two Mandatory Contents (Isolated)";
	public static String MANDCONTANDISO_DESCR = "Check whether an element has mandatory content.";

	public static String MANDCONTANDSIN_ID = "MandContAndSin";
	public static String MANDCONTANDSIN_NAME = "Two Mandatory Contents (Single)";
	public static String MANDCONTANDSIN_DESCR = "Check whether an element has mandatory content.";

	public static String MAND2ELEOR_ID = "Mand2EleOr";
	public static String MAND2ELEOR_NAME = "Mand2EleOr";
	public static String MAND2ELEOR_DESCR = "Mand2EleOr";

	public static String MAND2PROPOR_ID = "Mand2PropOr";
	public static String MAND2PROPOR_NAME = "Mand2PropOr";
	public static String MAND2PROPOR_DESCR = "Mand2PropOr";

	public static String MAND3ELEOR_ID = "Mand3EleOr";
	public static String MAND3ELEOR_NAME = "Mand3EleOr";
	public static String MAND3ELEOR_DESCR = "Mand3EleOr";
	
	public static String MATCH_ID = "Match";
	public static String MATCH_NAME = "Regular Expression Check";
	public static String MATCH_DESCR = "Check, whether a value matches a specific regular expression.";
	
	public static String MATCHISO_ID = "MatchIso";
	public static String MATCHISO_NAME = "Regular Expression Check (Isolated)";
	public static String MATCHISO_DESCR = "Check, whether a value matches a specific regular expression.";
	
	public static String MATCHSIN_ID = "MatchSin";
	public static String MATCHSIN_NAME = "Regular Expression Check (Single)";
	public static String MATCHSIN_DESCR = "Check, whether a value matches a specific regular expression.";
	
	public static String MATCHLIST_ID = "MatchList";
	public static String MATCHLIST_NAME = "Regular Expression List Check";
	public static String MATCHLIST_DESCR = "Check, whether a value matches at least one regular expression from a list.";
	
	public static String MATCHLISTISO_ID = "MatchListIso";
	public static String MATCHLISTISO_NAME = "Regular Expression List Check (Isolated)";
	public static String MATCHLISTISO_DESCR = "Check, whether a value matches at least one regular expression from a list.";

	public static String MATCHLISTSIN_ID = "MatchListSin";
	public static String MATCHLISTSIN_NAME = "Regular Expression List Check (Single)";
	public static String MATCHLISTSIN_DESCR = "Check, whether a value matches at least one regular expression from a list.";
	
	public static String STRINGLENGTH_ID = "StringLength";
	public static String STRINGLENGTH_NAME = "String value length restriction";
	public static String STRINGLENGTH_DESCR = "Check whether all field values comply to the length restriction.";
	
	public static String STRINGLENGTHISO_ID = "StringLengthIso";
	public static String STRINGLENGTHISO_NAME = "String value length restriction (Isolated)";
	public static String STRINGLENGTHISO_DESCR = "Check all field values whether they comply to the length restriction.";
	
	public static String STRINGLENGTHSIN_ID = "StringLengthSin";
	public static String STRINGLENGTHSIN_NAME = "String value length restriction (Single)";
	public static String STRINGLENGTHSIN_DESCR = "Check all field values whether they comply to the length restriction.";

	public static String STRINGLENGTHRANGE_ID = "StringLengthRange";
	public static String STRINGLENGTHRANGE_NAME = "String value length range restriction";
	public static String STRINGLENGTHRANGE_DESCR = "Check all field values whether they comply to the length restriction.";
	
	public static String STRINGLENGTHRANGEISO_ID = "StringLengthRangeIso";
	public static String STRINGLENGTHRANGEISO_NAME = "String value length range restriction (Isolated)";
	public static String STRINGLENGTHRANGEISO_DESCR = "Check all field values whether they comply to the length restriction.";
	
	public static String STRINGLENGTHRANGESIN_ID = "StringLengthRangeSin";
	public static String STRINGLENGTHRANGESIN_NAME = "String value length range restriction (Single)";
	public static String STRINGLENGTHRANGESIN_DESCR = "Check all field values whether they comply to the length restriction.";

	public static String UNIQUE_ID = "Unique";
	public static String UNIQUE_NAME = "Uniqueness Constraint";
	public static String UNIQUE_DESCR = "Check, whether a value is unique within the dataset.";

	public static String UNIQUEISO_ID = "UniqueIso";
	public static String UNIQUEISO_NAME = "Uniqueness Constraint in File (Isolated)";
	public static String UNIQUEISO_DESCR = "Check, whether a value is unique within the dataset.";

	public static String UNIQUESIN_ID = "UniqueSin";
	public static String UNIQUESIN_NAME = "Uniqueness Constraint in File (Single)";
	public static String UNIQUESIN_DESCR = "Check, whether a value is unique within the dataset.";

	public static String VALIDLINK_ID = "ValidLink";
	public static String VALIDLINK_NAME = "Valid Link";
	public static String VALIDLINK_DESCR = "Check that a record contains no field with an invalid link.";
	
	public static String VALIDLINKISO_ID = "ValidLinkIso";
	public static String VALIDLINKISO_NAME = "Valid Link (Isolated)";
	public static String VALIDLINKISO_DESCR = "Check whether a field is an valid link.";
	
	public static String VALIDLINKSIN_ID = "ValidLinkSin";
	public static String VALIDLINKSIN_NAME = "Valid Link (Single)";
	public static String VALIDLINKSIN_DESCR = "Check whether a field is an valid link.";
	
	public static String LINKSOURCE_ID = "LinkSource";
	public static String LINKSOURCE_NAME = "LinkSource";
	public static String LINKSOURCE_DESCR = "LinkSource";

	public static String LINKSOURCEEXISTS_ID = "LinkSourceExists";
	public static String LINKSOURCEEXISTS_NAME = "LinkSourceExists";
	public static String LINKSOURCEEXISTS_DESCR = "LinkSourceExists";

	public static String LINKSOURCEISO_ID = "LinkSourceIso";
	public static String LINKSOURCEISO_NAME = "LinkSourceIso";
	public static String LINKSOURCEISO_DESCR = "LinkSourceIso";
	
	public static String LINKSOURCESIN_ID = "LinkSourceSin";
	public static String LINKSOURCESIN_NAME = "LinkSourceSin";
	public static String LINKSOURCESIN_DESCR = "LinkSourceSin";

	public static String LINKMIMETYPE_ID = "LinkMimeType";
	public static String LINKMIMETYPE_NAME = "LinkMimeType";
	public static String LINKMIMETYPE_DESCR = "LinkMimeType";
	
	public static String LINKMIMETYPEISO_ID = "LinkMimeTypeIso";
	public static String LINKMIMETYPEISO_NAME = "LinkMimeTypeIso";
	public static String LINKMIMETYPEISO_DESCR = "LinkMimeTypeIso";

	public static String LINKMIMETYPESIN_ID = "LinkMimeTypeSin";
	public static String LINKMIMETYPESIN_NAME = "LinkMimeTypeSin";
	public static String LINKMIMETYPESIN_DESCR = "LinkMimeTypeSin";

	public static String LINKIMAGESIZE_ID = "LinkImageSize";
	public static String LINKIMAGESIZE_NAME = "LinkImageSize";
	public static String LINKIMAGESIZE_DESCR = "LinkImageSize";

	public static String LINKIMAGESIZEISO_ID = "LinkImageSizeIso";
	public static String LINKIMAGESIZEISO_NAME = "LinkImageSizeIso";
	public static String LINKIMAGESIZEISO_DESCR = "LinkImageSizeIso";

	public static String LINKIMAGESIZESIN_ID = "LinkImageSizeSin";
	public static String LINKIMAGESIZESIN_NAME = "LinkImageSizeSin";
	public static String LINKIMAGESIZESIN_DESCR = "LinkImageSizeSin";
}
