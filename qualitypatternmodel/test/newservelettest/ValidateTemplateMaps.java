package newservelettest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.operators.impl.MatchImpl;
import qualitypatternmodel.parameters.impl.TextListParamImpl;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.utility.Util;

public class ValidateTemplateMaps {
	static String path = "src/qualitypatternmodel/newservlets/template_maps.json";

    static List<Arguments> argumentProvider() throws IOException {
    	List<Arguments> args = new ArrayList<Arguments>();
    	JSONObject maplist = Util.loadJson(path);
    	for (String groupName: maplist.keySet()) {
    		JSONObject groupJson = maplist.getJSONObject(groupName);
    		for (String mapName: groupJson.keySet()) {
    			JSONObject map = groupJson.getJSONObject(mapName);
    			for (String key: map.keySet()) {
    				String value = map.getString(key);
    				args.add(Arguments.of(groupName, mapName, key, value));
    			}
    		}
    	}
        return args;
    }

	@ParameterizedTest
    @MethodSource("argumentProvider")
	public void testGroupEntry(String group, String mapName, String key, String value) throws Exception {
		switch(group) {
		case "comparison":
			testComparisonEntry(value);
			return;
		case "boolean":
			testBooleanEntry(value);
			return;
		case "regex":
			testRegexEntry(value);
			return;
		case "regexlist":
			testRegexListEntry(value);
			return;
		default:
			throw new Exception("no test for group '" + group + "'");	
		}
	}

	public void testComparisonEntry(String value) throws Exception {
		assert(ComparisonOperator.getByName(value) != null);
	}

	List<String> validBoolean = Arrays.asList("true", "false");
	public void testBooleanEntry(String value) throws Exception {
		assert(validBoolean.contains(value));
	}

	public void testRegexEntry(String value) throws Exception {
		assertDoesNotThrow(()-> {
			MatchImpl.matches("", value, Language.XML);
		});
	}

	public void testRegexListEntry(String value) throws Exception {
		assertDoesNotThrow(()-> {
			new JSONArray(value);
		}, ()-> {
			System.out.println(value);
			return value;
		});
		assertDoesNotThrow(()-> {
			JSONArray list = new JSONArray(value);
			assert(list.length()>0);
			for (int i = 0; i<list.length(); i++) {
				MatchImpl.matches("", list.getString(i), Language.XML);
			}
		});
	}
}
