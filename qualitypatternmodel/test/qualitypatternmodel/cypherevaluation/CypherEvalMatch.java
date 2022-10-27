package qualitypatternmodel.cypherevaluation;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.evaluation.EvalMatch;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.parameters.Parameter;

public class CypherEvalMatch {
	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getMatchNeo4JAbstract());
		completePatterns.add(getMatchDate());
		
		try {
			CypherQueryPrinter.queryPrinterSys(completePatterns);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public static CompletePattern getMatchNeo4JAbstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalMatch.getMatchGeneric();	
		completePattern.createNeo4jAdaption();
		//Set the beginning in the QuantifiedCond
		return completePattern;		
	}

	public static CompletePattern getMatchDate() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getMatchNeo4JAbstract();
				
		List<Parameter> params = completePattern.getParameterList().getParameters();
		
//		BooleanParam p0 = ((BooleanParam) params.get(0));
//		TextLiteralParam p1 = ((TextLiteralParam) params.get(1));
//		RdfPathParam p2 = ((RdfPathParam) params.get(2));
//		
//		p0.setValue(false);
//		p1.setValue("^(<http:\\\\/\\\\/www\\\\.wikidata\\\\.org\\\\/entity\\\\/Q[0-9]+> )?Point\\\\((-)?[0-9]+(\\\\.[0-9]+)? (-)?[0-9]+(\\\\.[0-9]+)?\\\\)$");
////		p1.setValue("\\?");
//		((RdfSinglePredicate) p2.getRdfPathPart()).setIriParam(new IriParamImpl("wdt:P625"));
		
		return completePattern;
	}
	
}
