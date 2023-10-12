package qualitypatternmodel.javaquery;

import java.util.ArrayList;
import java.util.List;

public class JavaQueryInterimContainer {
	protected List<InterimResultContainer> results;
	private List<InterimResultContainer> rejected;
	private InterimResultContainer currentCreationResult;

	public JavaQueryInterimContainer() {
		results = new ArrayList<InterimResultContainer>();
		rejected = new ArrayList<InterimResultContainer>();
	}

	public List<String> getResults() {
		List<String> result = new ArrayList<String>();
		for (InterimResultContainer irc : results) {
			result.add(irc.getResult());
		}
		return result;
	}

	public Integer size() {
		return results.size();
	}

	public List<String> getRejected() {
		List<String> result = new ArrayList<String>();
		for (InterimResultContainer irc : rejected) {
			result.add(irc.getResult());
		}
		return result;
	}

	public void streamNext(String item) {
		if (item.equals("<result>")) {
			currentCreationResult = new InterimResultContainer();
		} else if (item.equals("</result>")) {
			results.add(currentCreationResult);
			currentCreationResult = null;
		} else {
			currentCreationResult.streamNext(item);
		}
	}

	/**
	 * @param argumentList identifier of parameters from
	 *                     InterimResultContainer.parameter
	 * @param every:       when having multiple instances per parameter: does every/some/no
	 *                     instance have to fulfill the filter-function
	 * @param function:    analysis function (string.. -> boolean)
	 */
	public void filter(List<Integer> argumentIndices, EverySomeNoneQuantifier quantifier,
			FilterFunctionContainer function) {
		List<InterimResultContainer> interimResults = results;
		results = new ArrayList<InterimResultContainer>();

		for (InterimResultContainer irc : interimResults) {

			List<List<String>> params = new ArrayList<List<String>>();
			for (Integer i : argumentIndices) {
				params.add(irc.getArgument(i));
			}
			Boolean functioncall;
			try {
				functioncall = function.evaluate(quantifier, params);
			} catch (Exception e) {
				functioncall = (quantifier != EverySomeNoneQuantifier.SOME);
			}

			if (functioncall) {
				results.add(irc);
			} else {
				rejected.add(irc);
			}
		}
	}
	
	public void resetFilters() {
		for (InterimResultContainer irc : rejected) {
			results.add(irc);
		}
		rejected.clear();
	}

	@Override
	public String toString() {
		String result = "[\n";
		for (InterimResultContainer re : results) {
			result += "\n\n" + re.toString();
		}
		return result + "\n]";
	}
}
