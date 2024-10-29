package qualitypatternmodel.newservlets.initialisation;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.json.JSONException;
import org.json.JSONObject;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.ServletConstants;
import qualitypatternmodel.newservlets.patterns.Appdup3Pattern;
import qualitypatternmodel.newservlets.patterns.CardPattern;
import qualitypatternmodel.newservlets.patterns.CompPattern;
import qualitypatternmodel.newservlets.patterns.CompValPattern;
import qualitypatternmodel.newservlets.patterns.ContainsPattern;
import qualitypatternmodel.newservlets.patterns.DupvalPattern;
import qualitypatternmodel.newservlets.patterns.FuncPattern;
import qualitypatternmodel.newservlets.patterns.InvalidLinkPattern;
import qualitypatternmodel.newservlets.patterns.MandAttPattern;
import qualitypatternmodel.newservlets.patterns.MandContentPattern;
import qualitypatternmodel.newservlets.patterns.MatchPattern;
import qualitypatternmodel.newservlets.patterns.StringLengthPattern;
import qualitypatternmodel.newservlets.patterns.UniquePattern;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.Language;
import qualitypatternmodel.textrepresentation.impl.PatternTextImpl;

public class GenericPatterns {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		int i = 0;
		for (CompletePattern pattern: getAllGenericPattern()) {
			i+=1;
			System.out.println("Example " + i);
			System.out.println(pattern.myToString());
			System.out.println();
		}
	}

	public static List<CompletePattern> getAllGenericPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<CompletePattern> patterns = new BasicEList<CompletePattern>();
		patterns.add(CardPattern.getGeneric());
		patterns.add(CompPattern.getGeneric());
		patterns.add(FuncPattern.getGeneric());
		patterns.add(UniquePattern.getGeneric());
		patterns.add(MatchPattern.getGeneric());
		patterns.add(ContainsPattern.getGeneric());
		patterns.add(Appdup3Pattern.getGeneric());
		patterns.add(DupvalPattern.getGeneric());
		patterns.add(InvalidLinkPattern.getGeneric());

		patterns.add(MandAttPattern.getGeneric());
		patterns.add(StringLengthPattern.getGeneric());
		patterns.add(CompValPattern.getGeneric());
		patterns.add(MandContentPattern.getGeneric());
		
		// not implemented
//		patterns.add(LocalUniquePattern.getGeneric());
//		patterns.add(CompValAnyPattern.getGeneric());
//		patterns.add(CardImpliesMandAttPattern.getGeneric());
//		patterns.add(CheckFormatPattern.getGeneric());
//		patterns.add(CompDatabasePattern.getGeneric());

		return patterns;
	}

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
					JSONObject variant = new JSONObject(json);
					Boolean bool = false;
					if (bool && ServletConstants.VARIANTS_TYPE_CONSTRAINT
							|| !bool && ServletConstants.VARIANTS_TYPE_ANTIPATTERN)
						new PatternTextImpl(pattern, variant);
				} catch(JSONException e) {
					e.printStackTrace();
				}
			}
		}

		if (ServletConstants.OLD_VARIANTS && oldvariants != null) {
			for (String json: oldvariants) {
				try {
					new PatternTextImpl(pattern, new JSONObject(json));
				} catch(JSONException e) {
					e.printStackTrace();
				}
			}
		}

		pattern.isValid(AbstractionLevel.ABSTRACT);
		return pattern;
	}
}
