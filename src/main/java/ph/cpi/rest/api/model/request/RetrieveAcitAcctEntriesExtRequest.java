package ph.cpi.rest.api.model.request;

public class RetrieveAcitAcctEntriesExtRequest {
	private String entryType;
	private String periodType;
	private String periodFrom;
	private String periodTo;
	private String acctParam;
	private String slTypeParam;
	private String arTag;
	private String cvTag;
	private String jvTag;
	private String closeTranTag;
	private String appendTag;
	private String extractUser;
	private String extractDate;
	private String currCdParam;
	public String getEntryType() {
		return entryType;
	}
	public void setEntryType(String entryType) {
		this.entryType = entryType;
	}
	public String getPeriodType() {
		return periodType;
	}
	public void setPeriodType(String periodType) {
		this.periodType = periodType;
	}
	public String getPeriodFrom() {
		return periodFrom;
	}
	public void setPeriodFrom(String periodFrom) {
		this.periodFrom = periodFrom;
	}
	public String getPeriodTo() {
		return periodTo;
	}
	public void setPeriodTo(String periodTo) {
		this.periodTo = periodTo;
	}
	public String getAcctParam() {
		return acctParam;
	}
	public void setAcctParam(String acctParam) {
		this.acctParam = acctParam;
	}
	public String getSlTypeParam() {
		return slTypeParam;
	}
	public void setSlTypeParam(String slTypeParam) {
		this.slTypeParam = slTypeParam;
	}
	public String getArTag() {
		return arTag;
	}
	public void setArTag(String arTag) {
		this.arTag = arTag;
	}
	public String getCvTag() {
		return cvTag;
	}
	public void setCvTag(String cvTag) {
		this.cvTag = cvTag;
	}
	public String getJvTag() {
		return jvTag;
	}
	public void setJvTag(String jvTag) {
		this.jvTag = jvTag;
	}
	public String getCloseTranTag() {
		return closeTranTag;
	}
	public void setCloseTranTag(String closeTranTag) {
		this.closeTranTag = closeTranTag;
	}
	public String getAppendTag() {
		return appendTag;
	}
	public void setAppendTag(String appendTag) {
		this.appendTag = appendTag;
	}
	public String getExtractUser() {
		return extractUser;
	}
	public void setExtractUser(String extractUser) {
		this.extractUser = extractUser;
	}
	public String getExtractDate() {
		return extractDate;
	}
	public void setExtractDate(String extractDate) {
		this.extractDate = extractDate;
	}
	public String getCurrCdParam() {
		return currCdParam;
	}
	public void setCurrCdParam(String currCdParam) {
		this.currCdParam = currCdParam;
	}
	@Override
	public String toString() {
		return "RetrieveAcitAcctEntriesExtRequest [entryType=" + entryType + ", periodType=" + periodType
				+ ", periodFrom=" + periodFrom + ", periodTo=" + periodTo + ", acctParam=" + acctParam
				+ ", slTypeParam=" + slTypeParam + ", arTag=" + arTag + ", cvTag=" + cvTag + ", jvTag=" + jvTag
				+ ", closeTranTag=" + closeTranTag + ", appendTag=" + appendTag + ", extractUser=" + extractUser
				+ ", extractDate=" + extractDate + ", currCdParam=" + currCdParam + "]";
	}
	
	
}
