package qualitypatternmodel.javaquery;

import java.util.ArrayList;
import java.util.List;

public class JavaQueryInterimContainer {
	List<InterimResultContainer> results;
	List<InterimResultContainer> rejected;
	InterimResultContainer currentResult;
	
	public JavaQueryInterimContainer() {
		results = new ArrayList<InterimResultContainer>();
		rejected = new ArrayList<InterimResultContainer>();
	}

	public List<String> getResults(){
		List<String> result = new ArrayList<String>();
		for (InterimResultContainer irc: results) {
			result.add(irc.getResult());
		}
		return result;
	}
	
	public void streamNext(String item) {
		if (item.equals("<result>")){
			currentResult = new InterimResultContainer(); 
			results.add(currentResult);
		}
		else if (item.equals("</result>")){
			currentResult = null;
		} else {
			currentResult.streamNext(item);
		}
	}


	/**
	 * @param argumentList identifier of parameters from InterimResultContainer.parameter
	 * @param every: when having multiple instances per parameter: does every instance have to fulfill the 
	 * @param function: analysis function (string -> boolean). shall return true if 
	 */
	public void filter (List<Object> argumentList, Boolean every, Object function) {
		List<InterimResultContainer> interimResults = results;
		results = new ArrayList<InterimResultContainer>();
		
		for (InterimResultContainer irc: interimResults) {
			
			Boolean functioncall = true;
//				((Callable) function).call(); TODO
			
			if (functioncall) {
				results.add(irc);
			} else {
				rejected.add(irc);
			}
		}
	}
	
	@Override
	public String toString() {
		String result = "";
		for (InterimResultContainer re: results) {
			result += "\n\n" + re;
		}
		return result;
	}
	
	
	class InterimResultContainer {
		private List<String> result;
		List<List<String>> parameter;
		List<String> currentList;

		public InterimResultContainer() {
			parameter = new ArrayList<List<String>>();
		}

		private boolean isOpeningTag(String item) {
			return item.equals("<record>") || item.startsWith("<arg") && item.endsWith(">");
		}
		private boolean isClosingTag(String item) {
			return item.equals("</record>") || item.startsWith("</arg") && item.endsWith(">");
		}
		
		public void streamNext(String item) {
			if (item.equals("<record>")){
				currentList = new ArrayList<String>();
				result = currentList;
			}
			else if (isClosingTag(item)) {
				currentList = null;
			}
			else if (isOpeningTag(item)) {
				currentList = new ArrayList<String>();
				parameter.add(currentList);
			} else 
				currentList.add(item);
		}
		
		public String getResult() {
			return result.get(0);
		}
		
		public List<String> getArgument(Integer i) {
			return parameter.get(i);
		}
		
		@Override
		public String toString() {
			String result = "<result>";
			for (String re: this.result) {
				result += "\n  " + re.replace("\n", "\n  ");
			}
			result += "\n</result>";
			for (int i = 0; i < parameter.size(); i++) {
				result += "\n<arg" + i + ">";
				for (String st: parameter.get(i)) {
					result += "\n  " + st;
				}
				result += "\n</arg" + i + ">";
			}
			return result;
		}
	}
}
