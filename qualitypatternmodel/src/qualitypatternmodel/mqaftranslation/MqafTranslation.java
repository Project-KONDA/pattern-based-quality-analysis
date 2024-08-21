package qualitypatternmodel.mqaftranslation;

import de.gwdg.metadataqa.api.schema.BaseSchema;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.patternstructure.CompletePattern;

public class MqafTranslation {

	public static String translateToConstraintString(CompletePattern completePattern) throws InvalidityException {
		MqafTranslationValidation.checkPatternTranslatable(completePattern);
		MqafObject constraint = new MqafObject(completePattern);
		return constraint.getStringRepresentation();
	}

	public static BaseSchema translateToConstraintSchema(CompletePattern completePattern) throws InvalidityException {
		MqafTranslationValidation.checkPatternTranslatable(completePattern);
		MqafObject constraint = new MqafObject(completePattern);
		return constraint.getConstraintSchema();
	}
}
