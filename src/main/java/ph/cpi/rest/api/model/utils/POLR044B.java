package ph.cpi.rest.api.model.utils;

public class POLR044B {
	private String extractUser;
	private String policyNo;
	private String cedingName;
	private String expiryDate;
	private String insuredDesc;
	private String projDesc;
	private String currencyCd;
	private String siAmt;
	private String premAmt;
	private String remarks;
	private String fromDate;
	private String toDate;
	public String getExtractUser() {
		return extractUser;
	}
	public void setExtractUser(String extractUser) {
		this.extractUser = extractUser;
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
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getInsuredDesc() {
		return insuredDesc;
	}
	public void setInsuredDesc(String insuredDesc) {
		this.insuredDesc = insuredDesc;
	}
	public String getProjDesc() {
		return projDesc;
	}
	public void setProjDesc(String projDesc) {
		this.projDesc = projDesc;
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
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
	@Override
	public String toString() {
		return "POLR044B [extractUser=" + extractUser + ", policyNo=" + policyNo + ", cedingName=" + cedingName
				+ ", expiryDate=" + expiryDate + ", insuredDesc=" + insuredDesc + ", projDesc=" + projDesc
				+ ", currencyCd=" + currencyCd + ", siAmt=" + siAmt + ", premAmt=" + premAmt + ", remarks=" + remarks
				+ ", fromDate=" + fromDate + ", toDate=" + toDate + "]";
	}
}
