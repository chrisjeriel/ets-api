package ph.cpi.rest.api.model.utils;

public class POLR044L {
	private String extractUser;
	private String fromDate;
	private String toDate;
	private String acctDate;
	private String policyNo;
	private String cedingName;
	private String inceptDate;
	private String expiryDate;
	private String currencyCd;
	private String premAmt;
	private String status;
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
	public String getAcctDate() {
		return acctDate;
	}
	public void setAcctDate(String acctDate) {
		this.acctDate = acctDate;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	public String getInceptDate() {
		return inceptDate;
	}
	public void setInceptDate(String inceptDate) {
		this.inceptDate = inceptDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "POLR044L [extractUser=" + extractUser + ", fromDate=" + fromDate + ", toDate=" + toDate + ", acctDate="
				+ acctDate + ", policyNo=" + policyNo + ", cedingName=" + cedingName + ", inceptDate=" + inceptDate
				+ ", expiryDate=" + expiryDate + ", currencyCd=" + currencyCd + ", premAmt=" + premAmt + ", status="
				+ status + "]";
	}
}
