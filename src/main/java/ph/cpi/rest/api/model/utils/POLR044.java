package ph.cpi.rest.api.model.utils;

public class POLR044 {

	private String reportId;
	private String extractUser;
	private String lineCdParam;
	private String cedingIdParam;
	private String currCdParam;
	private String dateParam;
	private String dateRange;
	private String fromDate;
	private String toDate;
	private String incRecTag;
	private String forceExtract;
	private String faculTag;
	
	private String amtMth;
	private String amtCum;
	private String siRange;
	
	
	public String getAmtMth() {
		return amtMth;
	}
	public void setAmtMth(String amtMth) {
		this.amtMth = amtMth;
	}
	public String getAmtCum() {
		return amtCum;
	}
	public void setAmtCum(String amtCum) {
		this.amtCum = amtCum;
	}
	public String getSiRange() {
		return siRange;
	}
	public void setSiRange(String siRange) {
		this.siRange = siRange;
	}
	public String getFaculTag() {
		return faculTag;
	}
	public void setFaculTag(String faculTag) {
		this.faculTag = faculTag;
	}
	public String getReportId() {
		return reportId;
	}
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}
	public String getExtractUser() {
		return extractUser;
	}
	public void setExtractUser(String extractUser) {
		this.extractUser = extractUser;
	}
	
	public String getCurrCdParam() {
		return currCdParam;
	}
	public void setCurrCdParam(String currCdParam) {
		this.currCdParam = currCdParam;
	}
	public String getLineCdParam() {
		return lineCdParam;
	}
	public void setLineCdParam(String lineCdParam) {
		this.lineCdParam = lineCdParam;
	}
	public String getCedingIdParam() {
		return cedingIdParam;
	}
	public void setCedingIdParam(String cedingIdParam) {
		this.cedingIdParam = cedingIdParam;
	}
	public String getDateParam() {
		return dateParam;
	}
	public void setDateParam(String dateParam) {
		this.dateParam = dateParam;
	}
	public String getDateRange() {
		return dateRange;
	}
	public void setDateRange(String dateRange) {
		this.dateRange = dateRange;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public String getIncRecTag() {
		return incRecTag;
	}
	public void setIncRecTag(String incRecTag) {
		this.incRecTag = incRecTag;
	}
	public String getForceExtract() {
		return forceExtract;
	}
	public void setForceExtract(String forceExtract) {
		this.forceExtract = forceExtract;
	}
	@Override
	public String toString() {
		return "POLR044 [reportId=" + reportId + ", extractUser=" + extractUser + ", lineCdParam=" + lineCdParam
				+ ", cedingIdParam=" + cedingIdParam + ", currCdParam=" + currCdParam + ", dateParam=" + dateParam
				+ ", dateRange=" + dateRange + ", fromDate=" + fromDate + ", toDate=" + toDate + ", incRecTag="
				+ incRecTag + ", forceExtract=" + forceExtract + ", amtMth=" + amtMth + ", amtCum=" + amtCum
				+ ", siRange=" + siRange + ", faculTag=" + faculTag +  "]";
	}
}
