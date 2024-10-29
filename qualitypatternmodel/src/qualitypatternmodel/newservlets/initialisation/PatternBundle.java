package qualitypatternmodel.newservlets.initialisation;

import java.io.File;
import java.util.Map;

import org.json.JSONObject;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.ServletConstants;
import qualitypatternmodel.newservlets.ServletUtilities;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.textrepresentation.impl.PatternTextImpl;
import qualitypatternmodel.utility.Constants;
import qualitypatternmodel.utility.ConstantsJSON;
import qualitypatternmodel.utility.EMFModelLoad;
import qualitypatternmodel.utility.EMFModelSave;

public class PatternBundle {
	CompletePattern genericpattern;
	Language language;
	String id;
	Map<Integer, String> values;
	String[] variants;
	String[] oldvariants;

	public PatternBundle(CompletePattern genericpattern, Language language, String id, Map<Integer, String> values, String[] variants, String[] oldvariants) {
		this.genericpattern = genericpattern;
		this.language = language;
		this.id = id;
		this.values = values;
		this.variants = variants;
		this.oldvariants = oldvariants;
	}

	public CompletePattern getConcrete() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		return GenericPatterns.getConcrete(genericpattern, language, id, values, variants, oldvariants);
	}

	public void export(String folder, boolean override) {
		if (fileExists(folder, id) && !override) {
			try {
				CompletePattern existing = EMFModelLoad.loadCompletePattern(folder);
				for (String variant: variants) {
					JSONObject var = new JSONObject(variant);
					Boolean bool = var.getBoolean(ConstantsJSON.TYPE_CONSTRAINT);
					if (bool && ServletConstants.VARIANTS_TYPE_CONSTRAINT || !bool && ServletConstants.VARIANTS_TYPE_ANTIPATTERN)
						new PatternTextImpl(existing, var);
				}
				if (ServletConstants.OLD_VARIANTS) {
					for (String variant: oldvariants) {
						new PatternTextImpl(existing, new JSONObject(variant));
					}
				}
				EMFModelSave.exportToFile2(existing, folder, id, Constants.EXTENSION);
				return;
			} catch (Exception e) {}
		}
		try {
			CompletePattern pattern = getConcrete();
			pattern.isValid(AbstractionLevel.ABSTRACT);
			EMFModelSave.exportToFile2(pattern, folder, id, Constants.EXTENSION);
		} catch (Exception e) {
			ServletUtilities.logError(e);
		}
	}

	private static boolean fileExists(String folder, String id) {
		String filepath = folder + "/" + id + "." + Constants.EXTENSION;
		File file = new File(filepath);
	    return file.exists();
	}
}
