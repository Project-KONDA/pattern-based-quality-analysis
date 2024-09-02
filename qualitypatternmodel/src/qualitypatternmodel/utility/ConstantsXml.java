package qualitypatternmodel.utility;

public class ConstantsXml {

	public static final String VARIABLE = "$var";
	public static final String LISTVARIABLE = "$list";
	public static final String SOME = "\nsome ";
	public static final String EVERY = "\nevery ";
	public static final String SATISFIES = "\nsatisfies ";
	public static final String OR = "\nor\n";
	public static final String AND = "\nand\n";
	public static final String NOT = "not ";
	public static final String FOR = "\nfor ";
	public static final String FOR_LITE = "for ";
	public static final String LET = "\nlet ";
	public static final String WHERE = "\nwhere ";
	public static final String RETURN = "\nreturn ";
	public static final String IN = " in ";
	public static final String XPATH_UNION = " | ";

	public static final String REGEX_PREFIX = "[a-zA-Z]+";
	public static final String REGEX_NAMESPACE = "(" + REGEX_PREFIX + ":)?";
	public static final String REGEX_AXIS_NAMES = "(child|descendant|parent|ancestor|following|following-sibling|preceding|preceding-sibling|ancestor-or-self|descendant-or-self|self)";
	public static final String REGEX_AXIS = "(\\s*((/)|(//)|(/" + REGEX_AXIS_NAMES + "::)))";
	public static final String REGEX_ATTRIBUTE_NAME = REGEX_NAMESPACE + "[A-Za-z0-9]+";
	public static final String REGEX_ATTRIBUTE = "(@" + REGEX_ATTRIBUTE_NAME + "|@\\*\\[name\\(\\)[ ]*=[ ]*\"" + REGEX_ATTRIBUTE_NAME + "\"\\])";
	public static final String REGEX_PROPERTY_SPEC = "(((data|text|name)\\(\\))|" + REGEX_ATTRIBUTE + ")";
	public static final String REGEX_PROPERTY = "(" + REGEX_AXIS + REGEX_PROPERTY_SPEC + ")";
	public static final String REGEX_PROPERTY_AXIS_OPTIONAL = "(" + REGEX_AXIS + "?" + REGEX_PROPERTY_SPEC + ")";
	public static final String REGEX_PROPERTY_PART = "((/)?" + REGEX_PROPERTY_SPEC + ")";
//	public static final String REGEX_NODENAME = "([a-zA-Z]+(:[a-zA-Z]+)?\\s*)";
	public static final String REGEX_NODENAME = "(" + REGEX_NAMESPACE + "[a-zA-Z0-9]+\\s*)";
	public static final String REGEX_CONDITION = "(\\s*\\[\\s*(" + REGEX_PROPERTY_SPEC + "(\\s*=\\s*\".*\")?)?\\s*\\]\\s*)";
	public static final String REGEX_NODE = "((\\*|" + REGEX_NODENAME + ")" + "(" + REGEX_CONDITION + ")*)";
	public static final String REGEX_NAVIGATION = "(" + REGEX_AXIS + REGEX_NODE + ")";

	public static final String REGEX_XMLPATH_ELEMENT = "(" + REGEX_NAVIGATION + "+)";
	public static final String REGEX_XMLPATH_VALUE = "(" + REGEX_NAVIGATION + "*" + REGEX_PROPERTY + ")";
}
