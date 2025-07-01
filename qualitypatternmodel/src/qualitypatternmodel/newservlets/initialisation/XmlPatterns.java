package qualitypatternmodel.newservlets.initialisation;

import java.io.IOException;
import java.util.List;
import org.eclipse.emf.common.util.BasicEList;

import de.gwdg.metadataqa.api.configuration.ConfigurationReader;
import de.gwdg.metadataqa.api.schema.BaseSchema;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.mqaftranslation.MqafTranslation;
import qualitypatternmodel.newservlets.ServletUtilities;
import qualitypatternmodel.newservlets.patterns.CardPattern;
import qualitypatternmodel.newservlets.patterns.CompSetPattern;
import qualitypatternmodel.newservlets.patterns.ContainsPattern;
import qualitypatternmodel.newservlets.patterns.InvalidLinkPattern;
import qualitypatternmodel.newservlets.patterns.MandAttPattern;
import qualitypatternmodel.newservlets.patterns.MandContPattern;
import qualitypatternmodel.newservlets.patterns.MatchPattern;
import qualitypatternmodel.newservlets.patterns.StringLengthPattern;
import qualitypatternmodel.newservlets.patterns.UniquePattern;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.PatternUtility;

public class XmlPatterns {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException, IOException {

		for (PatternBundle patternbundle: getAllXmlPatternBundles()) {
			CompletePattern pattern = patternbundle.getConcrete();
//			System.out.println(pattern.myToString());
			try {
				System.out.println("___" + pattern.getName() + "___");
				pattern.isValid(AbstractionLevel.ABSTRACT);
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				PatternUtility.fillParameter(pattern);
				pattern.getText().get(0).instantiate();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				pattern.generateXQuery();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				BaseSchema schema = MqafTranslation.translateToConstraintSchema(pattern);
				ConfigurationReader.toJson(schema);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static List<CompletePattern> getAllXmlPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<CompletePattern> patterns = new BasicEList<CompletePattern>();
		for (PatternBundle bundle: getAllXmlPatternBundles()) {
			patterns.add(bundle.getConcrete());
		}
		return patterns;
	}

	public static List<PatternBundle> getAllXmlPatternBundles() {
		List<PatternBundle> patternbundles = new BasicEList<PatternBundle>();
		try {
			patternbundles.add(CardPattern.getXmlBundle());
			patternbundles.add(MandAttPattern.getXmlBundle());
			patternbundles.add(MatchPattern.getXmlBundle());
			patternbundles.add(ContainsPattern.getXmlBundle());
			patternbundles.add(StringLengthPattern.getXmlBundle());
			patternbundles.add(CompSetPattern.getXmlBundle());
			patternbundles.add(InvalidLinkPattern.getXmlBundle());
			patternbundles.add(UniquePattern.getXmlBundle());
			patternbundles.add(MandContPattern.getXmlBundle());
		} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e) {
			ServletUtilities.logError(e);
		}

		return patternbundles;
	}
}
