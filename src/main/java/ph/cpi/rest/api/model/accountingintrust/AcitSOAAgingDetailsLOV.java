package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitSOAAgingDetailsLOV {
	private String policyId;
	private String policyNo;
	private String coRefNo;
	private String instNo;
	private BigDecimal cumPayment;
	private BigDecimal prevBalance;
	private BigDecimal totalPayments;
	private DateTime dueDate;
	private BigDecimal netDue;
	private String processing;
	private String memoNo;
	private String insuredDesc;
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getCoRefNo() {
		return coRefNo;
	}
	public void setCoRefNo(String coRefNo) {
		this.coRefNo = coRefNo;
	}
	public String getInstNo() {
		return instNo;
	}
	public void setInstNo(String instNo) {
		this.instNo = instNo;
	}
	public BigDecimal getCumPayment() {
		return cumPayment;
	}
	public void setCumPayment(BigDecimal cumPayment) {
		this.cumPayment = cumPayment;
	}
	public BigDecimal getPrevBalance() {
		return prevBalance;
	}
	public void setPrevBalance(BigDecimal prevBalance) {
		this.prevBalance = prevBalance;
	}
	public BigDecimal getTotalPayments() {
		return totalPayments;
	}
	public void setTotalPayments(BigDecimal totalPayments) {
		this.totalPayments = totalPayments;
	}
	public DateTime getDueDate() {
		return dueDate;
	}
	public void setDueDate(DateTime dueDate) {
		this.dueDate = dueDate;
	}
	public BigDecimal getNetDue() {
		return netDue;
	}
	public void setNetDue(BigDecimal netDue) {
		this.netDue = netDue;
	}
	public String getProcessing() {
		return processing;
	}
	public void setProcessing(String processing) {
		this.processing = processing;
	}
	public String getMemoNo() {
		return memoNo;
	}
	public void setMemoNo(String memoNo) {
		this.memoNo = memoNo;
	}
	public String getInsuredDesc() {
		return insuredDesc;
	}
	public void setInsuredDesc(String insuredDesc) {
		this.insuredDesc = insuredDesc;
	}
	@Override
	public String toString() {
		return "AcitSOAAgingDetailsLOV [policyId=" + policyId + ", policyNo=" + policyNo + ", coRefNo=" + coRefNo
				+ ", instNo=" + instNo + ", cumPayment=" + cumPayment + ", prevBalance=" + prevBalance
				+ ", totalPayments=" + totalPayments + ", dueDate=" + dueDate + ", netDue=" + netDue + ", processing="
				+ processing + ", memoNo=" + memoNo + ", insuredDesc=" + insuredDesc + "]";
	}
	
}
