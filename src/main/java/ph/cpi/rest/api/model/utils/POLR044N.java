package ph.cpi.rest.api.model.utils;

public class POLR044N {
	private String extractUser;
	private String toDate;
	private String lineCd;
	private String currencyCd;
	private String siAmt;
	private String premAmt;
	public String getExtractUser() {
		return extractUser;
	}
	public void setExtractUser(String extractUser) {
		this.extractUser = extractUser;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
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
	@Override
	public String toString() {
		return "POLR044N [extractUser=" + extractUser + ", toDate=" + toDate + ", lineCd=" + lineCd + ", currencyCd="
				+ currencyCd + ", siAmt=" + siAmt + ", premAmt=" + premAmt + "]";
	}
}
