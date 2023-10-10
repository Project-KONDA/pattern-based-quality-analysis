package qualitypatternmodel.javaquery;

import java.util.ArrayList;
import java.util.List;

public class JavaQueryInterimContainer {
	
	List<InterimResultContainer> results;
	InterimResultContainer currentResult;
	
	public JavaQueryInterimContainer() {
		results = new ArrayList<InterimResultContainer>();
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
