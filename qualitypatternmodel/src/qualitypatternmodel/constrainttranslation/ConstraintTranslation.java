package qualitypatternmodel.constrainttranslation;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.patternstructure.CompletePattern;

public class ConstraintTranslation {
	
	
	public static Object translateToConstraint(CompletePattern completePattern, Boolean javaObject) throws InvalidityException {
		
		if(!ConstraintTranslationValidation.checkPatternTranslatable(completePattern))
			throw new InvalidityException("Pattern incompatible");

		ConstraintObject constraint = new ConstraintObject(completePattern);
	
		if (javaObject) {
			return constraint.getConstraintSchema();
		}
		else {
			return constraint.getStringRepresentation();
		}
	}
	
	
//	private static Boolean checkIsCardinality (Graph graph, Node record) {
//		throw new UnsupportedOperationException();
//	}
//
//	private static Boolean checkIsUnique (CompletePattern completePattern) {
//		throw new UnsupportedOperationException();
//	}
	
	

	/*
	 * Basic Schema  
	 */
//	private static BaseSchema getBaseSchema() {
//		BaseSchema schema = new BaseSchema();
//		schema.setFormat(Format.XML);
//		DataElement field1 = new DataElement("label", "path");
//		schema.addField(field1);
//		Rule rule = new Rule();
//		field1.addRule(rule);
//		
//		// ADD RULES HERE
////		rule.withMinCount(4);
//		
//		return schema;
//	}
	
}
