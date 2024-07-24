package qualitypatternmodel.cyphertranslationtests_new;
import java.util.ArrayList;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.utility.PatternUtility;

public class Test00 {

	public static void test(ArrayList<CompletePattern> completePatterns) {
		for (CompletePattern completePattern : completePatterns) {
			PatternUtility.fillParameter(completePattern);
			try {
				completePattern.isValid(AbstractionLevel.CONCRETE);
				System.out.println("\n\n___PATTERN_(VALID)___");
				System.out.println(completePattern.myToString());
				System.out.print("\n___TRANSLATION___");
				System.out.println(completePattern.generateCypher());
			} catch (Exception e) {
				System.out.print("\n####### PATTERN INVALID #######");
				try {
				  System.out.println(completePattern.myToString());
					e.printStackTrace();
				} catch (Exception e2) {
					System.out.print("\n####### PATTERN PRINTING FAILED #######");
					e2.printStackTrace();
					e.printStackTrace();
				}
			}
		}
	}

	public static void getQueries(ArrayList<CompletePattern> completePatterns) {
		for (CompletePattern completePattern : completePatterns) {
			PatternUtility.fillParameter(completePattern);
			try {
				completePattern.isValid(AbstractionLevel.CONCRETE);
//				System.out.println("\n\n___PATTERN_(VALID)___");
				System.out.println(completePattern.generateCypher());
			} catch (Exception e) {
				System.out.println("\n\n___PATTERN_(InVALID)___");
				e.printStackTrace();
				System.out.println(completePattern.myToString());
			}
		}
	}

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		CompletePattern a = getBasePatternFinal();
		System.out.println(a.myToString());
		completePatterns.add(a);
//		completePatterns.add(getBasePatternCond("USA"));
//		completePatterns.add(getBasePatternMatch("^New"));
		Test00.test(completePatterns);
	}

	public static CompletePattern getBasePatternFinal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		completePattern.createNeo4jAdaption();
		return completePattern;
	}

	public static CompletePattern getBasePattern() {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;

		// PATTERN
		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.setPatternId("MyPattern");

//		// FIRST CONDITION
//		Condition truecondition = factory.createTrueElement();
//		completePattern.setCondition(truecondition);

		return completePattern;
	}

	public static CompletePattern getBasePatternCond(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		Node se = completePattern.getGraph().getReturnNodes().get(0);
		se.addOutgoing().getTarget().addPrimitiveComparison(comp);
		completePattern.createNeo4jAdaption();
		return completePattern;
	}

	public static CompletePattern getBasePatternMatch(String regex) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = PatternstructureFactory.eINSTANCE.createCompletePattern();
		Node se = completePattern.getGraph().getReturnNodes().get(0);
		se.addOutgoing().getTarget().addPrimitiveMatch(regex);
		completePattern.createNeo4jAdaption();
		return completePattern;
	}
}
