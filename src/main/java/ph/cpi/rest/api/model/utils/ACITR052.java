package ph.cpi.rest.api.model.utils;

public class ACITR052 {

	private String reportId;
	private String extractUser;
	private String osPaidTag;
	private String extTypeTag;
	private String dateParam;
	private String dateRange;
	private String dateFrom;
	private String dateTo;
	private String lineCd;
	private String cessionId;
	private String forceExtract;
	
	public String getExtractUser() {
		return extractUser;
	}
	public void setExtractUser(String extractUser) {
		this.extractUser = extractUser;
	}
	public String getOsPaidTag() {
		return osPaidTag;
	}
	public void setOsPaidTag(String osPaidTag) {
		this.osPaidTag = osPaidTag;
	}
	public String getExtTypeTag() {
		return extTypeTag;
	}
	public void setExtTypeTag(String extTypeTag) {
		this.extTypeTag = extTypeTag;
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
	public String getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}
	public String getDateTo() {
		return dateTo;
	}
	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public String getCessionId() {
		return cessionId;
	}
	public void setCessionId(String cessionId) {
		this.cessionId = cessionId;
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
	@Override
	public String toString() {
		return "ACITR052 [reportId=" + reportId + ", extractUser=" + extractUser + ", osPaidTag=" + osPaidTag
				+ ", extTypeTag=" + extTypeTag + ", dateParam=" + dateParam + ", dateRange=" + dateRange + ", dateFrom="
				+ dateFrom + ", dateTo=" + dateTo + ", lineCd=" + lineCd + ", cessionId=" + cessionId
				+ ", forceExtract=" + forceExtract + "]";
	}
	
}
