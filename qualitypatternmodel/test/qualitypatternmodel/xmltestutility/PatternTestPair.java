package qualitypatternmodel.xmltestutility;

import qualitypatternmodel.patternstructure.CompletePattern;
import qualitypatternmodel.utility.PatternUtility;

public class PatternTestPair {
	private String fileid;
	private String name;
	private CompletePattern completePattern;
	private String manualQuery;

	public PatternTestPair(String fileid, String name, CompletePattern completePattern, String manualQuery) {
		super();
		this.fileid = fileid;
		this.name = name;
		this.completePattern = completePattern;
		PatternUtility.fillParameter(this.completePattern);
		this.manualQuery = manualQuery;
	}

	public String getFileId() {
		return fileid;
	}

	public void setFileId(String fileid) {
		this.fileid = fileid;
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

	@Override
	public String toString() {
		return "PTP " + fileid + " " + getName();
	}
}
