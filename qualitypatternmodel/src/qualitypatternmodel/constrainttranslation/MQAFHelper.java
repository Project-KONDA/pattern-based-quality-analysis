package qualitypatternmodel.constrainttranslation;

import de.gwdg.metadataqa.api.schema.BaseSchema;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//import de.gwdg.metadataqa.api.configuration.ConfigurationReader;
import de.gwdg.metadataqa.api.configuration.schema.Rule;


public class MQAFHelper {
	
	public static String baseSchemaToJson(BaseSchema schema) {
//		return ConfigurationReader.toJson(schema);
		
	    var objectMapper = new ObjectMapper();
	    try {
	      return objectMapper.writeValueAsString(schema);
	    } catch (JsonProcessingException e) {
	      throw new RuntimeException(e);
	    }
	}
	
	public static BaseSchema baseSchemaMerge(BaseSchema schema1, BaseSchema schema2, boolean allowOverwrite) {
//		schema1.merge(schema2, allowOverwrite);
		
		return schema1;
		
	}
	
	public static Rule ruleSetNaScore(Rule rule, Integer num) {
//		return rule.withNaScore(num);
		return rule;
	}
}
