package ph.cpi.rest.api.model.utils;

import java.math.BigDecimal;

public class POLR052E {
	private String dateFromTo;
	private String extractUser;
	private String extractDate;
	private String dateParam;
	private String dateRange;
	private String fromDate;
	private String toDate;
	private String tranType;
	private String tranTypeDesc;
	private String cedingId;
	private String cedingName;
	private String debitMemoNo;
	private Integer policyId;
	private String policyNo;
	private Integer instNo;
	private String policyRef;
	private BigDecimal dueFrom;
	private BigDecimal commAmt;
	private BigDecimal vatriComm;
	private BigDecimal premAmt;
	private String lineCd;
	private String currencyCd;
	private String memoStatus;
	public String getDateFromTo() {
		return dateFromTo;
	}
	public void setDateFromTo(String dateFromTo) {
		this.dateFromTo = dateFromTo;
	}
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
	public String getDateParam() {
		return dateParam;
	}
	public void setDateParam(String dateParam) {
		this.dateParam = dateParam;
	}
	public String getDateRange() {
		return dateRange;
	}
	public void setDateRange(String dateRange) {
		this.dateRange = dateRange;
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
	public String getDebitMemoNo() {
		return debitMemoNo;
	}
	public void setDebitMemoNo(String debitMemoNo) {
		this.debitMemoNo = debitMemoNo;
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
	public String getMemoStatus() {
		return memoStatus;
	}
	public void setMemoStatus(String memoStatus) {
		this.memoStatus = memoStatus;
	}
	@Override
	public String toString() {
		return "POLR052E [dateFromTo=" + dateFromTo + ", extractUser=" + extractUser + ", extractDate=" + extractDate
				+ ", dateParam=" + dateParam + ", dateRange=" + dateRange + ", fromDate=" + fromDate + ", toDate="
				+ toDate + ", tranType=" + tranType + ", tranTypeDesc=" + tranTypeDesc + ", cedingId=" + cedingId
				+ ", cedingName=" + cedingName + ", debitMemoNo=" + debitMemoNo + ", policyId=" + policyId
				+ ", policyNo=" + policyNo + ", instNo=" + instNo + ", policyRef=" + policyRef + ", dueFrom=" + dueFrom
				+ ", commAmt=" + commAmt + ", vatriComm=" + vatriComm + ", premAmt=" + premAmt + ", lineCd=" + lineCd
				+ ", currencyCd=" + currencyCd + ", memoStatus=" + memoStatus + "]";
	}
}
