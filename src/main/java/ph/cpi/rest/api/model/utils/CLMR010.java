package ph.cpi.rest.api.model.utils;

public class CLMR010 {
	
	private String reportId;
	private String extractUser;
	private String lineCdParam;
	private String cedingIdParam;
	private String dateParam;
	private String dateRange;
	private String fromDate;
	private String toDate;
	private String forceExtract;
	private String currCdParam;
	private String extTypeTag;
	private String clmAdj;
	private String clmStat;
	
	
	
	public String getClmStat() {
		return clmStat;
	}
	public void setClmStat(String clmStat) {
		this.clmStat = clmStat;
	}
	public String getClmAdj() {
		return clmAdj;
	}
	public void setClmAdj(String clmAdj) {
		this.clmAdj = clmAdj;
	}
	public String getExtractUser() {
		return extractUser;
	}
	public void setExtractUser(String extractUser) {
		this.extractUser = extractUser;
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
	public String getForceExtract() {
		return forceExtract;
	}
	public void setForceExtract(String forceExtract) {
		this.forceExtract = forceExtract;
	}
	public String getReportId() {
		return reportId;
	}
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}
	public String getCurrCdParam() {
		return currCdParam;
	}
	public void setCurrCdParam(String currCdParam) {
		this.currCdParam = currCdParam;
	}
	public String getExtTypeTag() {
		return extTypeTag;
	}
	public void setExtTypeTag(String extTypeTag) {
		this.extTypeTag = extTypeTag;
	}
	@Override
	public String toString() {
		return "CLMR010 [reportId=" + reportId + ", extractUser=" + extractUser + ", lineCdParam=" + lineCdParam
				+ ", cedingIdParam=" + cedingIdParam + ", dateParam=" + dateParam + ", dateRange=" + dateRange
				+ ", fromDate=" + fromDate + ", toDate=" + toDate + ", forceExtract=" + forceExtract + ", currCdParam="
				+ currCdParam + ", extTypeTag=" + extTypeTag + ", clmAdj=" + clmAdj + ", clmStat=" + clmStat + "]";
	}
	
}
