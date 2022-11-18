package qualitypatternmodel.rdftranslationtests;

import java.util.ArrayList;

import qualitypatternmodel.adaptionrdf.AdaptionrdfFactory;
import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.adaptionrdf.RdfPredicate;
import qualitypatternmodel.adaptionrdf.RdfQuantifier;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;

public class RdfTest02Return {
	
	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getMultipleReturnPattern());
		return completePatterns;
	}
	
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		RdfTest00.test(getPatterns());
	}

	private static CompletePattern getMultipleReturnPattern() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = RdfTest01Predicates.getBasePatternPredicates();
		completePattern.getGraph().getNodes().get(1).setReturnNode(true);
		RdfPredicate relation = (RdfPredicate) completePattern.getGraph().getRelations().get(0);
		IriParam iriParam = AdaptionrdfFactory.eINSTANCE.createIriParam();
		RdfSinglePredicate rdfSinglePredicate = (RdfSinglePredicate) relation.getRdfPathParam().getRdfPathParts().get(0).getRdfPath();
		rdfSinglePredicate.setIriParam(iriParam);
		rdfSinglePredicate.setQuantifier(RdfQuantifier.ZERO_OR_ONE);
		iriParam.setPrefix("wdt");
		iriParam.setSuffix("P569");
		
		return completePattern;	
	}
}
