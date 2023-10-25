package javaqueryexperiments.testclasses;

import java.util.ArrayList;
import java.util.List;

import qualitypatternmodel.exceptions.InvalidityException;

public class FilterFunctionContainer {
	Object function;
	int functionargnum;

	// One Constructor per functional Interface
	public FilterFunctionContainer(StringPredicate0 f) {
		function = f;
		functionargnum = 0;
	}

	public FilterFunctionContainer(StringPredicate1 f) {
		function = f;
		functionargnum = 1;
	}

	public FilterFunctionContainer(StringPredicate2 f) {
		function = f;
		functionargnum = 2;
	}

	public FilterFunctionContainer(StringPredicate3 f) {
		function = f;
		functionargnum = 3;
	}

	// Functional Interfaces

	@FunctionalInterface
	public interface StringPredicate0 {
		boolean apply();
	}

	@FunctionalInterface
	public interface StringPredicate1 {
		boolean apply(String s);
	}

	@FunctionalInterface
	public interface StringPredicate2 {
		boolean apply(String s, String s2);
	}

	@FunctionalInterface
	public interface StringPredicate3 {
		boolean apply(String s, String s2, String s3);
	}

	public int getFunctionArgNum() {
		return functionargnum;
	}

	public boolean evaluate(EverySomeNoneQuantifier quantifier, List<List<String>> params) throws InvalidityException {
		Boolean res;
		if (params.isEmpty()) {
			res = apply(new ArrayList<String>());
			if (quantifier == EverySomeNoneQuantifier.NONE)
				return !res;
			else
				return res;
		}
		CombinationCreator<String> combinations = new CombinationCreator<String>(params);
		
		while (!combinations.isFinished()) {
			List<String> next = combinations.getNext();
			Boolean combRes = apply(next);

			if ((!combRes) && quantifier == EverySomeNoneQuantifier.EVERY)
				return false;

			if ((combRes) && quantifier == EverySomeNoneQuantifier.NONE)
				return false;

			if ((combRes) && quantifier == EverySomeNoneQuantifier.SOME)
				return true;
		}
		return quantifier != EverySomeNoneQuantifier.SOME;
	}

	public boolean apply(List<String> params) throws InvalidityException {
		if (params.size() != functionargnum)
			throw new InvalidityException(
					"number of parameters does not match function: " + params.size() + " != " + functionargnum);

		switch (functionargnum) {
		case (0):
			return ((StringPredicate0) function).apply();
		case (1):
			return ((StringPredicate1) function).apply(params.get(0));
		case (2):
			return ((StringPredicate2) function).apply(params.get(0), params.get(1));
		case (3):
			return ((StringPredicate3) function).apply(params.get(0), params.get(1), params.get(2));
		}

		return true;
	}
}