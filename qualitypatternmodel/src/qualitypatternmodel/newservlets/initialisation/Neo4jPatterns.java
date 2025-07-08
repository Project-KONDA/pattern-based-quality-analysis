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

public class Neo4jPatterns {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		int i = 0;
		for (PatternBundle patternbundle: getAllNeoPatternBundles()) {
			CompletePattern pattern = patternbundle.getConcrete();
			System.out.println("Example " + i);
			System.out.println(pattern.myToString());
			System.out.println();
		}
	}

	public static List<CompletePattern> getAllNeoPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		List<CompletePattern> patterns = new BasicEList<CompletePattern>();
		for (PatternBundle bundle: getAllNeoPatternBundles()) {
			patterns.add(bundle.getConcrete());
		}
		return patterns;
	}

	public static List<PatternBundle> getAllNeoPatternBundles() {
		List<PatternBundle> patternbundles = new BasicEList<PatternBundle>();
		try {
			patternbundles.add(CardPattern.getNeoBundle());
			patternbundles.add(MandAttPattern.getNeoBundle());
			patternbundles.add(MatchPattern.getNeoBundle());
			patternbundles.add(ContainsPattern.getNeoBundle());
			patternbundles.add(StringLengthPattern.getNeoBundle());
			patternbundles.add(CompSetPattern.getNeoBundle());
			patternbundles.add(UniquePattern.getNeoBundle());
		} catch (InvalidityException | OperatorCycleException | MissingPatternContainerException e) {
			ServletUtilities.logError(e);
		}
		return patternbundles;
	}
}
