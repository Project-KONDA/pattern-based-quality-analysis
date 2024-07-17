package qualitypatternmodel.rdftranslationtests;

import java.util.ArrayList;

import qualitypatternmodel.adaptionrdf.AdaptionrdfFactory;
import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.adaptionrdf.RdfPathParam;
import qualitypatternmodel.adaptionrdf.RdfPathPart;
import qualitypatternmodel.adaptionrdf.RdfPredicate;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.patternstructure.CompletePattern;

public class RdfTest01_3PredicateTypes {

	public static ArrayList<CompletePattern> getPatterns() throws InvalidityException, OperatorCycleException, MissingPatternContainerException{
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getXUriPattern(1));
		completePatterns.add(getXUriPattern(2));
		completePatterns.add(getXUriPattern(3));
		completePatterns.add(getXUriPatternWithTypes(3));
		completePatterns.add(getXUriPatternWithTypes(5));
		return completePatterns;
	}

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		RdfTest00.test(getPatterns());
	}

	public static CompletePattern getBasePatternPredicates() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = RdfTest00.getBasePattern();
		completePattern.createRdfAdaption();
		return completePattern;
	}


	public static CompletePattern getXUriPattern(int i) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternPredicates();
		RdfPredicate relation = (RdfPredicate) completePattern.getGraph().getRelations().get(0);
		RdfPathParam param = relation.getRdfPathParam();
		param.getRdfPathParts().clear();

		for (int j = 0; j < i; j++) {
			RdfPathPart part = AdaptionrdfFactory.eINSTANCE.createRdfPathPart();
			RdfSinglePredicate pred = AdaptionrdfFactory.eINSTANCE.createRdfSinglePredicate();
			IriParam iriParam = AdaptionrdfFactory.eINSTANCE.createIriParam();
			iriParam.setUri("thisisatesturi" + j);
			pred.setIriParam(iriParam);
			part.setRdfPath(pred);
			param.getRdfPathParts().add(part);
		}

		return completePattern;
	}


	public static CompletePattern getXUriPatternWithTypes(int i) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getBasePatternPredicates();
		RdfPredicate relation = (RdfPredicate) completePattern.getGraph().getRelations().get(0);
		RdfPathParam param = relation.getRdfPathParam();
		param.getRdfPathParts().clear();

		for (int j = 0; j < i; j++) {
			RdfPathPart part = AdaptionrdfFactory.eINSTANCE.createRdfPathPart();
			RdfSinglePredicate pred = AdaptionrdfFactory.eINSTANCE.createRdfSinglePredicate();
			IriParam iriParam = AdaptionrdfFactory.eINSTANCE.createIriParam();
			iriParam.setUri("thisisatesturi" + j);
			pred.setIriParam(iriParam);
			part.setRdfPath(pred);
			param.getRdfPathParts().add(part);

			for (int k = 0; k < 2-j%3; k++) {
				IriParam iriParamType = AdaptionrdfFactory.eINSTANCE.createIriParam();
				iriParamType.setUri("typeUri" + j + "_" + k);
				part.getTargetNodeTypes().getIriParams().add(iriParamType);
			}
		}

		return completePattern;
	}

}
