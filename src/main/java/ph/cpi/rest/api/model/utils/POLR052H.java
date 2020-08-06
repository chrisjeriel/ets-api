package ph.cpi.rest.api.model.utils;

import java.math.BigDecimal;

public class POLR052H {
	private String extractUser;
	private String extractDate;
	private String currencyCd;
	private String sharingCedId;
	private String sharingCedName;
	private String shrTinNo;
	private String shrAddress;
	private Integer policyId;
	private String policyNo;
	private Integer instNo;
	private String issuingCedId;
	private String issuingCedName;
	private String issTinNo;
	private String issAddress;
	private BigDecimal cededPrem;
	private BigDecimal cededComm;
	private BigDecimal cededVat;
	private BigDecimal cededNet;
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
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public String getSharingCedId() {
		return sharingCedId;
	}
	public void setSharingCedId(String sharingCedId) {
		this.sharingCedId = sharingCedId;
	}
	public String getSharingCedName() {
		return sharingCedName;
	}
	public void setSharingCedName(String sharingCedName) {
		this.sharingCedName = sharingCedName;
	}
	public String getShrTinNo() {
		return shrTinNo;
	}
	public void setShrTinNo(String shrTinNo) {
		this.shrTinNo = shrTinNo;
	}
	public String getShrAddress() {
		return shrAddress;
	}
	public void setShrAddress(String shrAddress) {
		this.shrAddress = shrAddress;
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
	public Integer getInstNo() {
		return instNo;
	}
	public void setInstNo(Integer instNo) {
		this.instNo = instNo;
	}
	public String getIssuingCedId() {
		return issuingCedId;
	}
	public void setIssuingCedId(String issuingCedId) {
		this.issuingCedId = issuingCedId;
	}
	public String getIssuingCedName() {
		return issuingCedName;
	}
	public void setIssuingCedName(String issuingCedName) {
		this.issuingCedName = issuingCedName;
	}
	public String getIssTinNo() {
		return issTinNo;
	}
	public void setIssTinNo(String issTinNo) {
		this.issTinNo = issTinNo;
	}
	public String getIssAddress() {
		return issAddress;
	}
	public void setIssAddress(String issAddress) {
		this.issAddress = issAddress;
	}
	public BigDecimal getCededPrem() {
		return cededPrem;
	}
	public void setCededPrem(BigDecimal cededPrem) {
		this.cededPrem = cededPrem;
	}
	public BigDecimal getCededComm() {
		return cededComm;
	}
	public void setCededComm(BigDecimal cededComm) {
		this.cededComm = cededComm;
	}
	public BigDecimal getCededVat() {
		return cededVat;
	}
	public void setCededVat(BigDecimal cededVat) {
		this.cededVat = cededVat;
	}
	public BigDecimal getCededNet() {
		return cededNet;
	}
	public void setCededNet(BigDecimal cededNet) {
		this.cededNet = cededNet;
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
		return "POLR052H [extractUser=" + extractUser + ", extractDate=" + extractDate + ", currencyCd=" + currencyCd
				+ ", sharingCedId=" + sharingCedId + ", sharingCedName=" + sharingCedName + ", shrTinNo=" + shrTinNo
				+ ", shrAddress=" + shrAddress + ", policyId=" + policyId + ", policyNo=" + policyNo + ", instNo="
				+ instNo + ", issuingCedId=" + issuingCedId + ", issuingCedName=" + issuingCedName + ", issTinNo="
				+ issTinNo + ", issAddress=" + issAddress + ", cededPrem=" + cededPrem + ", cededComm=" + cededComm
				+ ", cededVat=" + cededVat + ", cededNet=" + cededNet + ", fromDate=" + fromDate + ", toDate=" + toDate
				+ "]";
	}
}
