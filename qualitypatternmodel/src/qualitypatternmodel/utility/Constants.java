package qualitypatternmodel.utility;

import java.util.Map.Entry;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

public class Constants {
	public static final String VARIABLE = "$var";
	public static final String LISTVARIABLE = "$list";
	public static final String SOME = "\nsome ";
	public static final String EVERY = "\nevery ";
	public static final String SATISFIES = "\nsatisfies ";
	public static final String OR = "\nor\n";
	public static final String AND = "\nand\n";
	public static final String NOT = "not ";
	public static final String FOR = "\nfor ";
	public static final String LET = "\nlet ";
	public static final String WHERE = "\nwhere ";
	public static final String RETURN = "\nreturn ";
	public static final String IN = " in ";
	public static final String INSTANCES_FOLDER = "instances";
	public static final String TRANSLATION_TESTS_FOLDER = INSTANCES_FOLDER + "/translationtests";
	public static final String VALIDITY_CHECKS_FOLDER = INSTANCES_FOLDER + "/validitychecks";
	public static final String PLAYGROUND_FOLDER = INSTANCES_FOLDER + "/playground";
	public static final String INSTANCE_FILE_ENDING = ".patternstructure";
	public static final String REGEX_TIME_HOURS_MINUTES = "(0[1-9]|1[0-9]|2[0-4]):([0-5][0-9])";
	public static final String REGEX_TIME_HOURS_MINUTES_SECONDS = REGEX_TIME_HOURS_MINUTES + ":([0-5][0-9])(.[0-9]*)?";
	public static final String REGEX_DATE = "[0-9][0-9][0-9][0-9]-(0[1-9]|1[0-2])-([0-2][0-9]|3[0-1])";
	public static final String REGEX_DATE_TIME = REGEX_DATE + "T" + REGEX_TIME_HOURS_MINUTES_SECONDS;
	public static final String REGEX_POSITIVE_NEGATIVE = "(\\+|-)";
	public static final String SCHEMA = "_schema";
	
	public static final String PARAMETER_TYPE_TEXT = "Text";
	public static final String PARAMETER_TYPE_TEXT_LIST = "TextList";
	public static final String PARAMETER_TYPE_NUMBER = "Number";
	public static final String PARAMETER_TYPE_BOOLEAN = "Boolean";
	public static final String PARAMETER_TYPE_DATE = "Date";
	public static final String PARAMETER_TYPE_TIME = "Time";
	public static final String PARAMETER_TYPE_DATE_TIME = "DateTime";
	public static final String PARAMETER_TYPE_ENUMERATION = "Enumeration";
	public static final String PARAMETER_TYPE_UNTYPED = "Untyped";
	public static final String PARAMETER_TYPE_RELATION = "RelationOption";
	public static final String PARAMETER_TYPE_PROPERTY = "PropertyOption";
	public static final String PARAMETER_TYPE_COMPARISON = "ComparisonOption";
	public static final String PARAMETER_TYPE_TYPE = "TypeOption";

	//Global Exception Messages
	public static final String INVALID_OPTION = "invalid option";
	
	/**
	 * Appends as many closing brackets to <code>str</code> as it contains opening brackets that are not yet closed.
	 * 
	 * @param str
	 * @return <code>str</code> with appended closing brackets
	 */
	public static String addMissingBrackets(String str) {
		int res = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				res++;
			} else if (str.charAt(i) == ')') {
				res--;
			}
		}
		for (int i = 0; i < res; i++) {
			str += ")";
		}
		return str;
	}
	
	/**
	 * Sorts <code>map</code> by value.
	 * 
	 * @param <K> key type
	 * @param <V> value type
	 * @param map the map to be sorted by value
	 * @return <code>map</code> sorted by value
	 */
	public static <K, V extends Comparable<? super V>> EMap<K, V> sortByValue(EMap<K, V> map) {
        EList<Entry<K, V>> list = new BasicEList<>();
        list.addAll(map.entrySet());
        list.sort(Entry.comparingByValue());

        EMap<K, V> result = new BasicEMap<>();
        for (Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }

        return result;
    }

}
