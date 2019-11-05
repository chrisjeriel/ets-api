package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class QSOAAcctReceivable {

	private Integer qsoaId;
	private Integer tranId;
	private Integer policyId;
	private String policyNo;
	private DateTime incDate;
	private DateTime expDate;
	private DateTime effDate;
	private BigDecimal premAmt;
	private BigDecimal commAmt;
	private BigDecimal commVatAmt;
	private BigDecimal amountDue;
	
	public Integer getQsoaId() {
		return qsoaId;
	}
	public void setQsoaId(Integer qsoaId) {
		this.qsoaId = qsoaId;
	}
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
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
	public DateTime getIncDate() {
		return incDate;
	}
	public void setIncDate(DateTime incDate) {
		this.incDate = incDate;
	}
	public DateTime getExpDate() {
		return expDate;
	}
	public void setExpDate(DateTime expDate) {
		this.expDate = expDate;
	}
	public DateTime getEffDate() {
		return effDate;
	}
	public void setEffDate(DateTime effDate) {
		this.effDate = effDate;
	}
	public BigDecimal getPremAmt() {
		return premAmt;
	}
	public void setPremAmt(BigDecimal premAmt) {
		this.premAmt = premAmt;
	}
	public BigDecimal getCommAmt() {
		return commAmt;
	}
	public void setCommAmt(BigDecimal commAmt) {
		this.commAmt = commAmt;
	}
	public BigDecimal getCommVatAmt() {
		return commVatAmt;
	}
	public void setCommVatAmt(BigDecimal commVatAmt) {
		this.commVatAmt = commVatAmt;
	}
	public BigDecimal getAmountDue() {
		return amountDue;
	}
	public void setAmountDue(BigDecimal amountDue) {
		this.amountDue = amountDue;
	}
	@Override
	public String toString() {
		return "QSOAAcctReceivable [qsoaId=" + qsoaId + ", tranId=" + tranId + ", policyId=" + policyId + ", policyNo="
				+ policyNo + ", incDate=" + incDate + ", expDate=" + expDate + ", effDate=" + effDate + ", premAmt="
				+ premAmt + ", commAmt=" + commAmt + ", commVatAmt=" + commVatAmt + ", amountDue=" + amountDue + "]";
	}
}
