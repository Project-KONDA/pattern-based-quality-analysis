package qualitypatternmodel.cypherevaluation.newquality;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

import qualitypatternmodel.adaptionneo4j.NeoNodeLabelsParam;
import qualitypatternmodel.adaptionneo4j.NeoPropertyPathParam;
import qualitypatternmodel.cyphertranslationtests_new.Test00;
import qualitypatternmodel.evaluationquality.EvalAppDup;
import qualitypatternmodel.exceptions.InvalidityException;
import qualitypatternmodel.exceptions.MissingPatternContainerException;
import qualitypatternmodel.exceptions.OperatorCycleException;
import qualitypatternmodel.operators.ComparisonOperator;
import qualitypatternmodel.parameters.ComparisonOptionParam;
import qualitypatternmodel.parameters.Parameter;
import qualitypatternmodel.patternstructure.CompletePattern;

public class CypherEvalAppDup {

	public static void main(String[] args) throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		ArrayList<CompletePattern> completePatterns = new ArrayList<CompletePattern>();
		completePatterns.add(getAppdup3Concrete());
//		Test00.test(completePatterns);
//		Test00.getQueries(completePatterns);
	}

	public static CompletePattern getAppdup2Abstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalAppDup.getAppDup2Generic();
		completePattern.createNeo4jAdaption();
		return completePattern;
	}

	public static CompletePattern getAppdup3Abstract() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = EvalAppDup.getAppDup3Generic();
		completePattern.createNeo4jAdaption();
		return completePattern;
	}

	static CompletePattern getAppdup3Concrete() throws InvalidityException, OperatorCycleException, MissingPatternContainerException {
		CompletePattern completePattern = getAppdup3Abstract();

		List<Parameter> params = completePattern.getParameterList().getParameters();

		ComparisonOptionParam p0 = ((ComparisonOptionParam) params.get(0));
//		TypeOptionParam p1 = ((TypeOptionParam) params.get(1));
		NeoNodeLabelsParam p2 = ((NeoNodeLabelsParam) params.get(2));
		NeoNodeLabelsParam p3 = ((NeoNodeLabelsParam) params.get(3));
		NeoPropertyPathParam p4 = ((NeoPropertyPathParam) params.get(4));
		NeoPropertyPathParam p5 = ((NeoPropertyPathParam) params.get(5));
		NeoPropertyPathParam p6 = ((NeoPropertyPathParam) params.get(6));
		NeoPropertyPathParam p7 = ((NeoPropertyPathParam) params.get(7));
		NeoPropertyPathParam p8 = ((NeoPropertyPathParam) params.get(8));
		NeoPropertyPathParam p9 = ((NeoPropertyPathParam) params.get(9));

		p0.setValue(ComparisonOperator.NOTEQUAL);
		p2.setValueFromString("Regesta");
		p3.setValueFromString("Regesta");
		p4.setValueFromString("path");
		p5.setValueFromString("path1");
		p6.setValueFromString("path2");
		p7.setValueFromString("path2");
		p8.setValueFromString("path3");
		p9.setValueFromString("path3");
		return completePattern;
	}

}
