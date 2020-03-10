package ph.cpi.rest.api.model.utils;

public class POLR044H {
	private String extractUser;
	private String fromDate;
	private String toDate;
	private String cedingName;
	private String lineCd;
	private String currencyCd;
	private String premAmt;
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
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public String getPremAmt() {
		return premAmt;
	}
	public void setPremAmt(String premAmt) {
		this.premAmt = premAmt;
	}
	@Override
	public String toString() {
		return "POLR044H [extractUser=" + extractUser + ", fromDate=" + fromDate + ", toDate=" + toDate
				+ ", cedingName=" + cedingName + ", lineCd=" + lineCd + ", currencyCd=" + currencyCd + ", premAmt="
				+ premAmt + "]";
	}
}
