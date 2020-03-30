package ph.cpi.rest.api.model.utils;

public class POLR052E {
	private String extractUser;
	private String fromDate;
	private String toDate;
	private String currencyCd;
	private String lineCd;
	private String debitMemoNo;
	private String policyNo;
	private String instNo;
	private String cedingName;
	private String dueFrom;
	private String commAmt;
	private String vatriComm;
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
	public String getDebitMemoNo() {
		return debitMemoNo;
	}
	public void setDebitMemoNo(String debitMemoNo) {
		this.debitMemoNo = debitMemoNo;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getInstNo() {
		return instNo;
	}
	public void setInstNo(String instNo) {
		this.instNo = instNo;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	public String getDueFrom() {
		return dueFrom;
	}
	public void setDueFrom(String dueFrom) {
		this.dueFrom = dueFrom;
	}
	public String getCommAmt() {
		return commAmt;
	}
	public void setCommAmt(String commAmt) {
		this.commAmt = commAmt;
	}
	public String getVatriComm() {
		return vatriComm;
	}
	public void setVatriComm(String vatriComm) {
		this.vatriComm = vatriComm;
	}
	public String getPremAmt() {
		return premAmt;
	}
	public void setPremAmt(String premAmt) {
		this.premAmt = premAmt;
	}
	@Override
	public String toString() {
		return "POLR052E [extractUser=" + extractUser + ", fromDate=" + fromDate + ", toDate=" + toDate
				+ ", currencyCd=" + currencyCd + ", lineCd=" + lineCd + ", debitMemoNo=" + debitMemoNo + ", policyNo="
				+ policyNo + ", instNo=" + instNo + ", cedingName=" + cedingName + ", dueFrom=" + dueFrom + ", commAmt="
				+ commAmt + ", vatriComm=" + vatriComm + ", premAmt=" + premAmt + "]";
	}

}
