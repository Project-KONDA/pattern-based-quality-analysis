package javaqueryexperiments.testclasses;

import java.util.ArrayList;
import java.util.List;

public class InterimContainer {
	private List<String> result;
	List<List<String>> parameter;
	List<String> currentList;

	public InterimContainer() {
		parameter = new ArrayList<List<String>>();
	}

	private boolean isOpeningTag(String item) {
		return item.equals("<record>") || item.startsWith("<arg") && item.endsWith(">");
	}

	private boolean isClosingTag(String item) {
		return item.equals("</record>") || item.startsWith("</arg") && item.endsWith(">");
	}

	public void streamNext(String item) {
		if (isOpeningTag(item)) {
			currentList = new ArrayList<String>();
		} else if (item.equals("</record>")) {
			result = currentList;
			currentList = null;
		} else if (isClosingTag(item)) {
			parameter.add(currentList);
			currentList = null;
		} else {
			currentList.add(item);
		}
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