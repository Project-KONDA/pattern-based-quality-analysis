package qualitypatternmodel.newservlets.initialisation;

import java.util.List;
import org.eclipse.emf.common.util.BasicEList;

import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.newservlets.ServletUtilities;
import qualitypatternmodel.newservlets.patterns.CardPattern;
import qualitypatternmodel.newservlets.patterns.CompSetPattern;
import qualitypatternmodel.newservlets.patterns.ContainsPattern;
import qualitypatternmodel.newservlets.patterns.MandAttPattern;
import qualitypatternmodel.newservlets.patterns.MatchPattern;
import qualitypatternmodel.newservlets.patterns.StringLengthPattern;
import qualitypatternmodel.newservlets.patterns.UniquePattern;
import qualitypatternmodel.patternstructure.CompletePattern;

public class RdfPatterns {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		int i = 0;
		for (PatternBundle patternbundle: getAllRdfPatternBundles()) {
			CompletePattern pattern = patternbundle.getConcrete();
			System.out.println("Example " + i);
			System.out.println(pattern.myToString());
			System.out.println();
		}
	}

	public static List<CompletePattern> getAllRdfPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<CompletePattern> patterns = new BasicEList<CompletePattern>();
		for (PatternBundle bundle: getAllRdfPatternBundles()) {
			patterns.add(bundle.getConcrete());
		}
		return patterns;
	}

	public static List<PatternBundle> getAllRdfPatternBundles() {
		List<PatternBundle> patternbundles = new BasicEList<PatternBundle>();

		try {
			patternbundles.add(CardPattern.getRdfBundle());
			patternbundles.add(MandAttPattern.getRdfBundle());
			patternbundles.add(MatchPattern.getRdfBundle());
			patternbundles.add(ContainsPattern.getRdfBundle());
			patternbundles.add(StringLengthPattern.getRdfBundle());
			patternbundles.add(CompSetPattern.getRdfBundle());
			patternbundles.add(UniquePattern.getRdfBundle());
			
		} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e) {
			ServletUtilities.logError(e);
		}
		return patternbundles;
	}
}
