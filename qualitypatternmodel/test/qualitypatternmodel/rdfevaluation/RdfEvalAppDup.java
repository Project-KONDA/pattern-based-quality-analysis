package qualitypatternmodel.rdfevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.adaptionrdf.RdfPathParam;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.adaptionrdf.impl.IriParamImpl;
import qualitypatternmodel.evaluationquality.EvalAppDup;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.rdftranslationtests.RdfTest00;

public class RdfEvalAppDup {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getAppDup2Abstract());
		completePatterns.add(getAppDup2Concrete());
		completePatterns.add(getAppDup3Abstract());
		completePatterns.add(getAppDup3Concrete());

//		RdfTest00.test(completePatterns);
		RdfTest00.getQueries(completePatterns);
	}

	public static CompletePattern getAppDup2Abstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalAppDup.getAppDup2Generic();
		completePattern.createRdfAdaption();
		return completePattern;
	}

	public static CompletePattern getAppDup2Concrete() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getAppDup2Abstract();

		List<Parameter> params = completePattern.getParameterList().getParameters();

//		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
//		TypeOptionParam p1 = ((TypeOptionParam) params.get(1));
//		IriListParam p2 = ((IriListParam) params.get(2));
//		IriListParam p3 = ((IriListParam) params.get(3));
		RdfPathParam p4 = ((RdfPathParam) params.get(4));
		RdfPathParam p5 = ((RdfPathParam) params.get(5));
		RdfPathParam p6 = ((RdfPathParam) params.get(6));
		RdfPathParam p7 = ((RdfPathParam) params.get(7));

		((RdfSinglePredicate) p4.getRdfPathParts().get(0).getRdfPath()).setIriParam(new IriParamImpl("wdt:P569")); // BIRTHDATE
		((RdfSinglePredicate) p5.getRdfPathParts().get(0).getRdfPath()).setIriParam(new IriParamImpl("wdt:P569")); // BIRTHDATE
		((RdfSinglePredicate) p6.getRdfPathParts().get(0).getRdfPath()).setIriParam(new IriParamImpl("wdt:P570")); // DEATHDATE
		((RdfSinglePredicate) p7.getRdfPathParts().get(0).getRdfPath()).setIriParam(new IriParamImpl("wdt:P570")); // DEATHDATE

		return completePattern;
	}

	public static CompletePattern getAppDup3Abstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalAppDup.getAppDup3Generic();
		completePattern.createRdfAdaption();
		return completePattern;
	}

	public static CompletePattern getAppDup3Concrete() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getAppDup3Abstract();
		List<Parameter> params = completePattern.getParameterList().getParameters();

//		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
//		TypeOptionParam p1 = ((TypeOptionParam) params.get(1));
//		IriListParam p2 = ((IriListParam) params.get(2));
//		IriListParam p3 = ((IriListParam) params.get(3));
		RdfPathParam p4 = ((RdfPathParam) params.get(4));
		RdfPathParam p5 = ((RdfPathParam) params.get(5));
		RdfPathParam p6 = ((RdfPathParam) params.get(6));
		RdfPathParam p7 = ((RdfPathParam) params.get(7));
		RdfPathParam p8 = ((RdfPathParam) params.get(8));
		RdfPathParam p9 = ((RdfPathParam) params.get(9));


		((RdfSinglePredicate) p4.getRdfPathParts().get(0).getRdfPath()).setIriParam(new IriParamImpl("wdt:P2561"));
		((RdfSinglePredicate) p5.getRdfPathParts().get(0).getRdfPath()).setIriParam(new IriParamImpl("wdt:P2561"));
		// = offizieller Name
		((RdfSinglePredicate) p6.getRdfPathParts().get(0).getRdfPath()).setIriParam(new IriParamImpl("wdt:P31"));
		((RdfSinglePredicate) p7.getRdfPathParts().get(0).getRdfPath()).setIriParam(new IriParamImpl("wdt:P31"));
		// = Name
		((RdfSinglePredicate) p8.getRdfPathParts().get(0).getRdfPath()).setIriParam(new IriParamImpl("wdt:P1448"));
		((RdfSinglePredicate) p9.getRdfPathParts().get(0).getRdfPath()).setIriParam(new IriParamImpl("wdt:P1448"));
		// = Typ von


		return completePattern;
	}
}
