package qualitypatternmodel.mqaftranslation;

import de.gwdg.metadataqa.api.schema.BaseSchema;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.patternstructure.CompletePattern;

public class MqafTranslation {
	
	
	public static String translateToConstraintString(CompletePattern completePattern) throws InvalidityException {
		
		if (!MqafTranslationValidation.checkPatternTranslatable(completePattern))
			throw new InvalidityException("Pattern incompatible");

		MqafObject constraint = new MqafObject(completePattern);
	
		return constraint.getStringRepresentation();
	}
	
	public static BaseSchema translateToConstraintSchema(CompletePattern completePattern) throws InvalidityException {
		
		if (!MqafTranslationValidation.checkPatternTranslatable(completePattern))
			throw new InvalidityException("Pattern incompatible");

		MqafObject constraint = new MqafObject(completePattern);
		
		return constraint.getConstraintSchema();
	}
}
