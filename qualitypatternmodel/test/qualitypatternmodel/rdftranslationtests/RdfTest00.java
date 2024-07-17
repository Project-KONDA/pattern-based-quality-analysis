package qualitypatternmodel.rdftranslationtests;

import java.util.ArrayList;

import qualitypatternmodel.adaptionrdf.AdaptionrdfFactory;
import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.adaptionrdf.RdfPathPart;
import qualitypatternmodel.adaptionrdf.RdfPredicate;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.graphstructure.ComplexNode;
import qualitypatternmodel.graphstructure.Node;
import qualitypatternmodel.operators.Match;
import qualitypatternmodel.patternstructure.AbstractionLevel;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.patternstructure.PatternstructureFactory;
import qualitypatternmodel.patternstructure.PatternstructurePackage;
import qualitypatternmodel.utility.PatternUtility;

public class RdfTest00 {
	public static void test(ArrayList<CompletePattern> completePatterns) throws InvalidityException {
		int valid = 0;
		int total = 0;
		for (CompletePattern completePattern : completePatterns) {
			total++;
			PatternUtility.fillParameter(completePattern);
			try {
//				completePattern.isValid(AbstractionLevel.CONCRETE); // TODO: allow technology-dependent validation
				System.out.println("\n\n___PATTERN_(VALID)___");
				System.out.println(completePattern.myToString());
				System.out.print("\n___TRANSLATION___");
				System.out.println(completePattern.generateWikidataSparql());
				valid++;
			} catch (Exception e) {
				e.printStackTrace();
				try {
				  System.out.println(completePattern.myToString());
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
		System.out.println(valid + " / " + total + " valid");
	}

	public static void getQueries(ArrayList<CompletePattern> completePatterns) {
		for (CompletePattern completePattern : completePatterns) {
			PatternUtility.fillParameter(completePattern);
			try {
				completePattern.isValid(AbstractionLevel.CONCRETE);
				System.out.println(completePattern.generateSparql());
			} catch (Exception e) {
				System.out.println("\n\n___PATTERN_(InVALID)___");
				e.printStackTrace();
				System.out.println(completePattern.myToString());
			}
		}
	}

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getBasePatternFinal());
		completePatterns.add(getBasePatternCondConcrete("2022-12-31"));
		completePatterns.add(getBasePatternMatchConcrete("^2022"));
		completePatterns.add(getBasePatternMatchNotConcrete("^2022"));
		RdfTest00.test(completePatterns);
	}

	public static CompletePattern getBasePatternFinal() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		completePattern.createRdfAdaption();
		PatternUtility.fillParameter(completePattern);
		return completePattern;
	}

	public static CompletePattern getBasePattern() throws InvalidityException {
		PatternstructurePackage.eINSTANCE.eClass();
		PatternstructureFactory factory = PatternstructureFactory.eINSTANCE;

		CompletePattern completePattern = factory.createCompletePattern();
		completePattern.setPatternId("MyPattern");

		ComplexNode complexNode1 = completePattern.getGraph().getNodes().get(0).makeComplex();
		Node node2 = completePattern.getGraph().addNode();
		completePattern.getGraph().addRelation(complexNode1, node2);

		return completePattern;
	}

	public static CompletePattern getBasePatternCond(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		Node se = completePattern.getGraph().getNodes().get(1);
		se.addPrimitiveComparison(comp);
		completePattern.createRdfAdaption();
		return completePattern;
	}

	public static CompletePattern getBasePatternCondConcrete(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternCond(comp);
		PatternUtility.fillParameter(completePattern);
//		RdfPredicate relation = (RdfPredicate) completePattern.getGraph().getRelations().get(0);
//		IriParam iriParam = AdaptionrdfFactory.eINSTANCE.createIriParam();
//		RdfSinglePredicate rdfSingle = AdaptionrdfFactory.eINSTANCE.createRdfSinglePredicate();
//		rdfSingle.setIriParam(iriParam);
//		RdfPathPart rdfPathPart = AdaptionrdfFactory.eINSTANCE.createRdfPathPart();
//		rdfPathPart.setRdfPath(rdfSingle);
//		relation.getRdfPathParam().getRdfPathParts().add(rdfPathPart);
////		IriParam iriParam = ((RdfSinglePredicate) relation.getRdfPathParam().getRdfPathParts().get(0).getRdfPath()).getIriParam();
//		iriParam.setPrefix("wdt");
//		iriParam.setSuffix("P569");
		return completePattern;
	}

	public static CompletePattern getBasePatternMatch(String regex) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePattern();
		Node se = completePattern.getGraph().getNodes().get(1);
		se.addPrimitiveMatch(regex);
		completePattern.createRdfAdaption();
		return completePattern;
	}

	public static CompletePattern getBasePatternMatchConcrete(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternMatch(comp);
		PatternUtility.fillParameter(completePattern);
//		RdfPredicate relation = (RdfPredicate) completePattern.getGraph().getRelations().get(0);
//		IriParam iriParam = AdaptionrdfFactory.eINSTANCE.createIriParam();
//		RdfSinglePredicate rdfSingle = AdaptionrdfFactory.eINSTANCE.createRdfSinglePredicate();
//		rdfSingle.setIriParam(iriParam);
//		RdfPathPart rdfPathPart = AdaptionrdfFactory.eINSTANCE.createRdfPathPart();
//		rdfPathPart.setRdfPath(rdfSingle);
//		relation.getRdfPathParam().getRdfPathParts().add(rdfPathPart);
//		iriParam.setPrefix("wdt");
//		iriParam.setSuffix("P569");
		return completePattern;
	}

	public static CompletePattern getBasePatternMatchNotConcrete(String comp) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternMatch(comp);
		PatternUtility.fillParameter(completePattern);
//		((Match) completePattern.getGraph().getOperatorList().getOperators().get(0)).getOption().setValue(false);
//		RdfPredicate relation = (RdfPredicate) completePattern.getGraph().getRelations().get(0);
//		IriParam iriParam = AdaptionrdfFactory.eINSTANCE.createIriParam();
//		RdfSinglePredicate rdfSingle = AdaptionrdfFactory.eINSTANCE.createRdfSinglePredicate();
//		rdfSingle.setIriParam(iriParam);
//		RdfPathPart rdfPathPart = AdaptionrdfFactory.eINSTANCE.createRdfPathPart();
//		rdfPathPart.setRdfPath(rdfSingle);
//		relation.getRdfPathParam().getRdfPathParts().add(rdfPathPart);
//		iriParam.setPrefix("wdt");
//		iriParam.setSuffix("P569");
		return completePattern;
	}

}