package qualitypatternmodel.rdfevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.graphstructure.ReturnType;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.adaptionrdf.IriParam;
import qualitypatternmodel.adaptionrdf.RdfPathParam;
import qualitypatternmodel.adaptionrdf.RdfSinglePredicate;
import qualitypatternmodel.adaptionrdf.impl.IriParamImpl;
import qualitypatternmodel.cyphertranslationtests.EvalComp;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.parameters.TypeOptionParam;
import qualitypatternmodel.rdftranslationtests.RdfTest00;

public class RdfEvalComp {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getCompRdfAbstract());
		completePatterns.add(getCompWiki());
		RdfTest00.test(completePatterns);
		
	}
	
	public static CompletePattern getCompRdfAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalComp.getCompGeneric();	
		completePattern.createRdfAdaption();
		return completePattern;		
	}
	
	public static CompletePattern getCompWiki() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getCompRdfAbstract();
				
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
		int i=0;
		for (Parameter p: completePattern.getParameterList().getParameters()){
			System.out.println(p.getClass().getSimpleName() + " p" + i + " = ((" + p.getClass().getSimpleName() + ") params.get(" + i + "));");
			i++;
		}
		
		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
		TypeOptionParam p1 = ((TypeOptionParam) params.get(1));
		RdfPathParam p2 = ((RdfPathParam) params.get(2));
		RdfPathParam p3 = ((RdfPathParam) params.get(3));

		p0.setValue(ComparisonOperator.GREATER);
		p1.setValue(ReturnType.DATE);

		IriParam p2iri = new IriParamImpl();
		p2iri.setPrefix("wdt");
		p2iri.setSuffix("P569");
		((RdfSinglePredicate) p2.getRdfPathPart()).setIriParam(p2iri);
		
		IriParam p3iri = new IriParamImpl();
		p3iri.setPrefix("wdt");
		p3iri.setSuffix("P570");
		((RdfSinglePredicate) p3.getRdfPathPart()).setIriParam(p3iri);
		
		return completePattern;
	}
}
