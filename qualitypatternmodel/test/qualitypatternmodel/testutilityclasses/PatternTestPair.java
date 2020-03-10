package qualitypatternmodel.testutilityclasses;

import qualitypatternmodel.patternstructure.Pattern;

public class PatternTestPair {
	private String name;
	private Pattern pattern;
	private String manualQuery;	
	
	public PatternTestPair(String name, Pattern pattern, String manualQuery) {
		super();
		this.name = name;
		this.pattern = pattern;
		this.manualQuery = manualQuery;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Pattern getPattern() {
		return pattern;
	}
	public void setPattern(Pattern pattern) {
		this.pattern = pattern;
	}
	public String getManualQuery() {
		return manualQuery;
	}
	public void setManualQuery(String manualQuery) {
		this.manualQuery = manualQuery;
	}
	
	

}
