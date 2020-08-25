package ph.cpi.rest.api.model.utils;

import java.math.BigDecimal;

public class POLR052G {
	private String extractUser;
	private String extractDate;
	private String currencyCd;
	private String issuingCedId;
	private String issuingCedName;
	private String issTinNo;
	private String issAddress;
	private Integer policyId;
	private String policyNo;
	private Integer instNo;
	private String sharingCedId;
	private String sharingCedName;
	private String shrTinNo;
	private String shrAddress;
	private BigDecimal shareOnPrem;
	private BigDecimal shareOnComm;
	private BigDecimal shareOnVat;
	private BigDecimal shareOnNet;
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
	public BigDecimal getShareOnPrem() {
		return shareOnPrem;
	}
	public void setShareOnPrem(BigDecimal shareOnPrem) {
		this.shareOnPrem = shareOnPrem;
	}
	public BigDecimal getShareOnComm() {
		return shareOnComm;
	}
	public void setShareOnComm(BigDecimal shareOnComm) {
		this.shareOnComm = shareOnComm;
	}
	public BigDecimal getShareOnVat() {
		return shareOnVat;
	}
	public void setShareOnVat(BigDecimal shareOnVat) {
		this.shareOnVat = shareOnVat;
	}
	public BigDecimal getShareOnNet() {
		return shareOnNet;
	}
	public void setShareOnNet(BigDecimal shareOnNet) {
		this.shareOnNet = shareOnNet;
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
		return "POLR052G [extractUser=" + extractUser + ", extractDate=" + extractDate + ", currencyCd=" + currencyCd
				+ ", issuingCedId=" + issuingCedId + ", issuingCedName=" + issuingCedName + ", issTinNo=" + issTinNo
				+ ", issAddress=" + issAddress + ", policyId=" + policyId + ", policyNo=" + policyNo + ", instNo="
				+ instNo + ", sharingCedId=" + sharingCedId + ", sharingCedName=" + sharingCedName + ", shrTinNo="
				+ shrTinNo + ", shrAddress=" + shrAddress + ", shareOnPrem=" + shareOnPrem + ", shareOnComm="
				+ shareOnComm + ", shareOnVat=" + shareOnVat + ", shareOnNet=" + shareOnNet + ", fromDate=" + fromDate
				+ ", toDate=" + toDate + "]";
	}
}
