package qualitypatternmodel.rdfevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionrdf.RdfPathParam;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.adaptionrdf.impl.IriParamImpl;
import qualitypatternmodel.evaluationquality.EvalMatch;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.BooleanParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TextLiteralParam;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.rdftranslationtests.RdfTest00;

public class RdfEvalMatch {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getMatchRdfAbstract());
		completePatterns.add(getMatchWiki());

//		RdfTest00.test(completePatterns);
		RdfTest00.getQueries(completePatterns);
	}

	public static CompletePattern getMatchRdfAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalMatch.getMatchGeneric();
		completePattern.createRdfAdaption();
		return completePattern;
	}

	public static CompletePattern getMatchWiki() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getMatchRdfAbstract();

		List<Parameter> params = completePattern.getParameterList().getParameters();

		BooleanParam p0 = ((BooleanParam) params.get(0));
		TextLiteralParam p1 = ((TextLiteralParam) params.get(1));
//		IriListParamImpl p2 = ((IriListParamImpl) params.get(2));
		RdfPathParam p3 = ((RdfPathParam) params.get(3));

		p0.setValue(false);
		p1.setValue("^(<http:\\\\/\\\\/www\\\\.wikidata\\\\.org\\\\/entity\\\\/Q[0-9]+> )?Point\\\\((-)?[0-9]+(\\\\.[0-9]+)? (-)?[0-9]+(\\\\.[0-9]+)?\\\\)$");
//		p1.setValue("\\?");
		((RdfSinglePredicate) p3.getRdfPathParts().get(0).getRdfPath()).setIriParam(new IriParamImpl("wdt:P625"));

		return completePattern;
	}

}
