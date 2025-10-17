package qualitypatternmodel.newservlets.initialisation;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.ServletConstants;
import qualitypatternmodel.newservlets.ServletUtilities;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.textrepresentation.impl.PatternTextImpl;
import qualitypatternmodel.utility.ConstantsJSON;

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
		return PatternBundle.getConcrete(genericpattern, language, id, values, variants, oldvariants);
	}

	public void exportTemplate() throws JSONException, InvalidityException, IOException, OperatorCycleException, MissingPatternContainerException {
		if (ServletConstants.OVERRIDE_VARIANTS) {
			try {
				CompletePattern existing = ServletUtilities.loadTemplate(language.getLiteral(), id);
				for (String variant: variants) {
					JSONObject var = new JSONObject(variant);
					Boolean typeConstraint = var.getBoolean(ConstantsJSON.TYPE_CONSTRAINT);
					if (typeConstraint && ServletConstants.VARIANTS_TYPE_CONSTRAINT || !typeConstraint && ServletConstants.VARIANTS_TYPE_ANTIPATTERN)
						new PatternTextImpl(existing, var);
				}
				if (ServletConstants.OLD_VARIANTS) {
					for (String variant: oldvariants) {
						new PatternTextImpl(existing, new JSONObject(variant));
					}
				}
				ServletUtilities.saveTemplate(language.getLiteral(), id, existing);
				return;
			} catch (IOException e) {}
		}
		ServletUtilities.saveTemplate(language.getLiteral(), id, getConcrete());
	}

//	public void export(String folder, boolean override) {
//		if (fileExists(folder, id) && !override) {
//			try {
//				CompletePattern existing = EMFModelLoad.loadCompletePattern(folder);
//				for (String variant: variants) {
//					JSONObject var = new JSONObject(variant);
//					Boolean typeConstraint = var.getBoolean(ConstantsJSON.TYPE_CONSTRAINT);
//					if (typeConstraint && ServletConstants.VARIANTS_TYPE_CONSTRAINT || !typeConstraint && ServletConstants.VARIANTS_TYPE_ANTIPATTERN)
//						new PatternTextImpl(existing, var);
//				}
//				if (ServletConstants.OLD_VARIANTS) {
//					for (String variant: oldvariants) {
//						new PatternTextImpl(existing, new JSONObject(variant));
//					}
//				}
//				EMFModelSave.exportToFile2(existing, folder, id, Constants.EXTENSION);
//				return;
//			} catch (Exception e) {
//				ServletUtilities.logError(e);
//			}
//		}
//		try {
//			CompletePattern pattern = getConcrete();
//			pattern.isValid(AbstractionLevel.ABSTRACT);
//			EMFModelSave.exportToFile2(pattern, folder, id, Constants.EXTENSION);
//		} catch (Exception e) {
//			ServletUtilities.logError(e);
//		}
//	}

	public static CompletePattern getConcrete(CompletePattern pattern, Language lan, String new_id, Map<Integer, String> values, String[] variants, String[] oldvariants)
			throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		if (pattern.getLanguage() != Language.GENERIC) {
			throw new InvalidityException("Pattern '" + pattern.getName() + "' is not generic.");
		}
	
		switch(lan) {
		case XML:
			pattern.createXmlAdaption();
			break;
		case RDF:
			pattern.createRdfAdaption();
			break;
		case NEO4J:
			pattern.createNeo4jAdaption();
			break;
		default:
			throw new InvalidityException("Invalid Language");
		}
	
		pattern.setAbstractId(pattern.getPatternId());
		pattern.setPatternId(new_id);
		List<Parameter> params = pattern.getParameterList().getParameters();
	
		if (ServletConstants.FILL_VALUES && values != null) {
			for (Integer index: values.keySet()) {
				params.get(index).setValueFromString(values.get(index));
			}
		}
	
		if (variants != null) {
			for (String json: variants) {
				try {
					JSONObject var = new JSONObject(json);
					Boolean typeConstraint = var.getBoolean(ConstantsJSON.TYPE_CONSTRAINT);
					if (typeConstraint && ServletConstants.VARIANTS_TYPE_CONSTRAINT || !typeConstraint && ServletConstants.VARIANTS_TYPE_ANTIPATTERN)
						new PatternTextImpl(pattern, var);
				} catch(JSONException e) {
					ServletUtilities.logError(e);
					ServletUtilities.log(" within JSON: " + json);
				}
			}
		}
	
		if (ServletConstants.OLD_VARIANTS && oldvariants != null) {
			for (String json: oldvariants) {
				try {
					new PatternTextImpl(pattern, new JSONObject(json));
				} catch(JSONException e) {
					ServletUtilities.logError(e);
					ServletUtilities.log(" within JSON: " + json);
				}
			}
		}
	
		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}

//	private static boolean fileExists(String folder, String id) {
//		String filepath = folder + "/" + id + "." + Constants.EXTENSION;
//		File file = new File(filepath);
//	    return file.exists();
//	}
}
