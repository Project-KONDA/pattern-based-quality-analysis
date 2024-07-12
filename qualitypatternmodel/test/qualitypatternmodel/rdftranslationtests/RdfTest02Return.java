package qualitypatternmodel.rdftranslationtests;

import java.util.ArrayList;

import org.eclipse.emf.common.util.EList;

import qualitypatternmodel.adaptionrdf.AdaptionrdfFactory;
import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.adaptionrdf.RdfPathPart;
import qualitypatternmodel.adaptionrdf.RdfPredicate;
import qualitypatternmodel.adaptionrdf.RdfQuantifier;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.adaptionrdf.impl.RdfPathPartImpl;
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
		CompletePattern completePattern = RdfTest01_1Predicates.getBasePatternPredicates();
		completePattern.getGraph().getNodes().get(1).setReturnNode(true);
		RdfPredicate relation = (RdfPredicate) completePattern.getGraph().getRelations().get(0);
		IriParam iriParam = AdaptionrdfFactory.eINSTANCE.createIriParam();
		EList<RdfPathPart> partlist = relation.getRdfPathParam().getRdfPathParts();
		partlist.clear();
		RdfPathPart part = new RdfPathPartImpl();
		partlist.add(part);
		RdfSinglePredicate rdfSinglePredicate = (RdfSinglePredicate) part.getRdfPath();
		rdfSinglePredicate.setIriParam(iriParam);
		rdfSinglePredicate.setQuantifier(RdfQuantifier.ZERO_OR_ONE);
		iriParam.setPrefix("wdt");
		iriParam.setSuffix("P569");
		
		return completePattern;	
	}
}
