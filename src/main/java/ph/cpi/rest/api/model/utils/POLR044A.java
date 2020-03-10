package ph.cpi.rest.api.model.utils;

public class POLR044A {
	private String extractUser;
	private String fromDate;
	private String toDate;
	private String currencyCd;
	private String cedingName;
	private String lineCd;
	private String total;
	
	public String getExtractUser() {
		return extractUser;
	}
	public void setExtractUser(String extractUser) {
		this.extractUser = extractUser;
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
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "POLR044A [extractUser=" + extractUser + ", fromDate=" + fromDate + ", toDate=" + toDate
				+ ", currencyCd=" + currencyCd + ", cedingName=" + cedingName + ", lineCd=" + lineCd + ", total="
				+ total + "]";
	}
}
