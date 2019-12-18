package ph.cpi.rest.api.model.accountingservice;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcseEditedAcctEntries {
	private Integer tranId;
	private String tranClass;
	private String tranTypeName;
	private Integer histNo;
	private String refNo;
	private DateTime tranDate;
	private String payee;
	private String particulars;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal amount;
	private BigDecimal localAmt;
	private String status;
	private String reason;
	private String editedBy;
	private DateTime editDate;
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public String getTranClass() {
		return tranClass;
	}
	public void setTranClass(String tranClass) {
		this.tranClass = tranClass;
	}
	public String getTranTypeName() {
		return tranTypeName;
	}
	public void setTranTypeName(String tranTypeName) {
		this.tranTypeName = tranTypeName;
	}
	public Integer getHistNo() {
		return histNo;
	}
	public void setHistNo(Integer histNo) {
		this.histNo = histNo;
	}
	public String getRefNo() {
		return refNo;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	public DateTime getTranDate() {
		return tranDate;
	}
	public void setTranDate(DateTime tranDate) {
		this.tranDate = tranDate;
	}
	public String getPayee() {
		return payee;
	}
	public void setPayee(String payee) {
		this.payee = payee;
	}
	public String getParticulars() {
		return particulars;
	}
	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public BigDecimal getCurrRate() {
		return currRate;
	}
	public void setCurrRate(BigDecimal currRate) {
		this.currRate = currRate;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
		this.localAmt = localAmt;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getEditedBy() {
		return editedBy;
	}
	public void setEditedBy(String editedBy) {
		this.editedBy = editedBy;
	}
	public DateTime getEditDate() {
		return editDate;
	}
	public void setEditDate(DateTime editDate) {
		this.editDate = editDate;
	}
	@Override
	public String toString() {
		return "AcseEditedAcctEntries [tranId=" + tranId + ", tranClass=" + tranClass + ", tranTypeName=" + tranTypeName
				+ ", histNo=" + histNo + ", refNo=" + refNo + ", tranDate=" + tranDate + ", payee=" + payee
				+ ", particulars=" + particulars + ", currCd=" + currCd + ", currRate=" + currRate + ", amount="
				+ amount + ", localAmt=" + localAmt + ", status=" + status + ", reason=" + reason + ", editedBy="
				+ editedBy + ", editDate=" + editDate + "]";
	}
}
