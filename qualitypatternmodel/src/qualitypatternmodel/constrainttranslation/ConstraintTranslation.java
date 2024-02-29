package qualitypatternmodel.constrainttranslation;

import de.gwdg.metadataqa.api.schema.BaseSchema;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.patternstructure.CompletePattern;

public class ConstraintTranslation {
	
	
	public static String translateToConstraintString(CompletePattern completePattern) throws InvalidityException {
		
		if (!ConstraintTranslationValidation.checkPatternTranslatable(completePattern))
			throw new InvalidityException("Pattern incompatible");

		ConstraintObject constraint = new ConstraintObject(completePattern);
	
		return constraint.getStringRepresentation();
	}
	
	public static BaseSchema translateToConstraintSchema(CompletePattern completePattern) throws InvalidityException {
		
		if (!ConstraintTranslationValidation.checkPatternTranslatable(completePattern))
			throw new InvalidityException("Pattern incompatible");

		ConstraintObject constraint = new ConstraintObject(completePattern);
		
		return constraint.getConstraintSchema();
	}
}
