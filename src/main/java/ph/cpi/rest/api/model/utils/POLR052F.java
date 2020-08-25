package ph.cpi.rest.api.model.utils;

import java.math.BigDecimal;

public class POLR052F {
	private String extractUser;
	private String extractDate;
	private String tranType;
	private String tranTypeDesc;
	private String currencyCd;
	private String lineCd;
	private String debitMemoNo;
	private String cedingId;
	private String cedingName;
	private Integer policyId;
	private String policyNo;
	private Integer instNo;
	private String policyRef;
	private String insuredDesc;
	private String inceptDate;
	private String expDate;
	private String effDate;
	private BigDecimal dueFrom;
	private BigDecimal commAmt;
	private BigDecimal vatriComm;
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
	public String getTranType() {
		return tranType;
	}
	public void setTranType(String tranType) {
		this.tranType = tranType;
	}
	public String getTranTypeDesc() {
		return tranTypeDesc;
	}
	public void setTranTypeDesc(String tranTypeDesc) {
		this.tranTypeDesc = tranTypeDesc;
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
	public String getPolicyRef() {
		return policyRef;
	}
	public void setPolicyRef(String policyRef) {
		this.policyRef = policyRef;
	}
	public String getInsuredDesc() {
		return insuredDesc;
	}
	public void setInsuredDesc(String insuredDesc) {
		this.insuredDesc = insuredDesc;
	}
	public String getInceptDate() {
		return inceptDate;
	}
	public void setInceptDate(String inceptDate) {
		this.inceptDate = inceptDate;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public String getEffDate() {
		return effDate;
	}
	public void setEffDate(String effDate) {
		this.effDate = effDate;
	}
	public BigDecimal getDueFrom() {
		return dueFrom;
	}
	public void setDueFrom(BigDecimal dueFrom) {
		this.dueFrom = dueFrom;
	}
	public BigDecimal getCommAmt() {
		return commAmt;
	}
	public void setCommAmt(BigDecimal commAmt) {
		this.commAmt = commAmt;
	}
	public BigDecimal getVatriComm() {
		return vatriComm;
	}
	public void setVatriComm(BigDecimal vatriComm) {
		this.vatriComm = vatriComm;
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
		return "POLR052F [extractUser=" + extractUser + ", extractDate=" + extractDate + ", tranType=" + tranType
				+ ", tranTypeDesc=" + tranTypeDesc + ", currencyCd=" + currencyCd + ", lineCd=" + lineCd
				+ ", debitMemoNo=" + debitMemoNo + ", cedingId=" + cedingId + ", cedingName=" + cedingName
				+ ", policyId=" + policyId + ", policyNo=" + policyNo + ", instNo=" + instNo + ", policyRef="
				+ policyRef + ", insuredDesc=" + insuredDesc + ", inceptDate=" + inceptDate + ", expDate=" + expDate
				+ ", effDate=" + effDate + ", dueFrom=" + dueFrom + ", commAmt=" + commAmt + ", vatriComm=" + vatriComm
				+ ", premAmt=" + premAmt + ", fromDate=" + fromDate + ", toDate=" + toDate + "]";
	}
}
