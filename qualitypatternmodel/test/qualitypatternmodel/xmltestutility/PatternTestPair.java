package qualitypatternmodel.xmltestutility;

import qualitypatternmodel.patternstructure.CompletePattern;

public class PatternTestPair {
	private String name;
	private CompletePattern completePattern;
	private String manualQuery;

	public PatternTestPair(String name, CompletePattern completePattern, String manualQuery) {
		super();
		this.name = name;
		this.completePattern = completePattern;
		this.manualQuery = manualQuery;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CompletePattern getPattern() {
		return completePattern;
	}
	public void setPattern(CompletePattern completePattern) {
		this.completePattern = completePattern;
	}
	public String getManualQuery() {
		return manualQuery;
	}
	public void setManualQuery(String manualQuery) {
		this.manualQuery = manualQuery;
	}



}
