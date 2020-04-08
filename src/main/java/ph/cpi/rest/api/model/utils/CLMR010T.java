package ph.cpi.rest.api.model.utils;

public class CLMR010T {
	private String extractUser;
	private String extractDate;
	private String currencyCd;
	private String lineCd;
	private String cedingId;
	private String cedingName;
	private String lossResAmt;
	private String dateParam;
	private String dateRange;
	private String dateFrom;
	private String dateTo;
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
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	public String getLossResAmt() {
		return lossResAmt;
	}
	public void setLossResAmt(String lossResAmt) {
		this.lossResAmt = lossResAmt;
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
	@Override
	public String toString() {
		return "CLMR010T [extractUser=" + extractUser + ", extractDate=" + extractDate + ", currencyCd=" + currencyCd
				+ ", lineCd=" + lineCd + ", cedingId=" + cedingId + ", cedingName=" + cedingName + ", lossResAmt="
				+ lossResAmt + ", dateParam=" + dateParam + ", dateRange=" + dateRange + ", dateFrom=" + dateFrom
				+ ", dateTo=" + dateTo + "]";
	}
}
	