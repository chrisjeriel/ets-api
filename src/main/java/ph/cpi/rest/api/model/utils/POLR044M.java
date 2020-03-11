package ph.cpi.rest.api.model.utils;

public class POLR044M {
	private String extractUser;
	private String extractDate;
	private String dateParam;
	private String dateRange;
	private String currencyCd;
	private String zoneCd;
	private String polCount;
	private String siAmt;
	private String premAmt;
	private String avRiskAmt;
	private String fromDate;
	private String toDate;
	private String zoneCdDesc;
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
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public String getZoneCd() {
		return zoneCd;
	}
	public void setZoneCd(String zoneCd) {
		this.zoneCd = zoneCd;
	}
	public String getPolCount() {
		return polCount;
	}
	public void setPolCount(String polCount) {
		this.polCount = polCount;
	}
	public String getSiAmt() {
		return siAmt;
	}
	public void setSiAmt(String siAmt) {
		this.siAmt = siAmt;
	}
	public String getPremAmt() {
		return premAmt;
	}
	public void setPremAmt(String premAmt) {
		this.premAmt = premAmt;
	}
	public String getAvRiskAmt() {
		return avRiskAmt;
	}
	public void setAvRiskAmt(String avRiskAmt) {
		this.avRiskAmt = avRiskAmt;
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
	public String getZoneCdDesc() {
		return zoneCdDesc;
	}
	public void setZoneCdDesc(String zoneCdDesc) {
		this.zoneCdDesc = zoneCdDesc;
	}
	@Override
	public String toString() {
		return "POLR044M [extractUser=" + extractUser + ", extractDate=" + extractDate + ", dateParam=" + dateParam
				+ ", dateRange=" + dateRange + ", currencyCd=" + currencyCd + ", zoneCd=" + zoneCd + ", polCount="
				+ polCount + ", siAmt=" + siAmt + ", premAmt=" + premAmt + ", avRiskAmt=" + avRiskAmt + ", fromDate="
				+ fromDate + ", toDate=" + toDate + ", zoneCdDesc=" + zoneCdDesc + "]";
	}
}
