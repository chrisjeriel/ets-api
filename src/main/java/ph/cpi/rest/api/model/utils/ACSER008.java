package ph.cpi.rest.api.model.utils;

public class ACSER008 {
	private String periodFrom;
	private String periodTo;
	private String type;
	private String currCdParam;
	private String forceExtract;
	private String extractUser;
	private String reportId;
	private String reportName;
	@Override
	public String toString() {
		return "ACSER009 [periodFrom=" + periodFrom + ", periodTo=" + periodTo + ", type=" + type + ", currCdParam="
				+ currCdParam + ", forceExtract=" + forceExtract + ", extractUser=" + extractUser + ", reportId="
				+ reportId + ", reportName=" + reportName + "]";
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCurrCdParam() {
		return currCdParam;
	}
	public void setCurrCdParam(String currCdParam) {
		this.currCdParam = currCdParam;
	}
	public String getForceExtract() {
		return forceExtract;
	}
	public void setForceExtract(String forceExtract) {
		this.forceExtract = forceExtract;
	}
	public String getExtractUser() {
		return extractUser;
	}
	public void setExtractUser(String extractUser) {
		this.extractUser = extractUser;
	}
	public String getReportId() {
		return reportId;
	}
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}
	public String getReportName() {
		return reportName;
	}
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}
}
