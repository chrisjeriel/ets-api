package ph.cpi.rest.api.model.utils;

import java.math.BigDecimal;

public class POLR044N {
	private String extractUser;
	private String extractDate;
	private String lineCd;
	private Integer policyId;
	private String policyNo;
	private String cedingId;
	private String cedingName;
	private String inceptDate;
	private String expiryDate;
	private String insuredDesc;
	private String projectDesc;
	private String currencyCd;
	private BigDecimal siAmt;
	private BigDecimal premAmt;
	private String fromDate;
	private String toDate;
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
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
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
	public String getInsuredDesc() {
		return insuredDesc;
	}
	public void setInsuredDesc(String insuredDesc) {
		this.insuredDesc = insuredDesc;
	}
	public String getProjectDesc() {
		return projectDesc;
	}
	public void setProjectDesc(String projectDesc) {
		this.projectDesc = projectDesc;
	}
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public BigDecimal getSiAmt() {
		return siAmt;
	}
	public void setSiAmt(BigDecimal siAmt) {
		this.siAmt = siAmt;
	}
	public BigDecimal getPremAmt() {
		return premAmt;
	}
	public void setPremAmt(BigDecimal premAmt) {
		this.premAmt = premAmt;
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
		return "POLR044N [extractUser=" + extractUser + ", extractDate=" + extractDate + ", lineCd=" + lineCd
				+ ", policyId=" + policyId + ", policyNo=" + policyNo + ", cedingId=" + cedingId + ", cedingName="
				+ cedingName + ", inceptDate=" + inceptDate + ", expiryDate=" + expiryDate + ", insuredDesc="
				+ insuredDesc + ", projectDesc=" + projectDesc + ", currencyCd=" + currencyCd + ", siAmt=" + siAmt
				+ ", premAmt=" + premAmt + ", fromDate=" + fromDate + ", toDate=" + toDate + "]";
	}
}
