package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitCancelledTransactions {
	private Integer tranId;
	private String tranClass;
	private String refNo;
	private DateTime tranDate;
	private Integer tranType;
	private String tranTypeDesc;
	private String payee;
	private String particulars;
	private String cancelledBy;
	private DateTime cancelledDate;
	private String reason;
	private BigDecimal amount;
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
	public Integer getTranType() {
		return tranType;
	}
	public void setTranType(Integer tranType) {
		this.tranType = tranType;
	}
	public String getTranTypeDesc() {
		return tranTypeDesc;
	}
	public void setTranTypeDesc(String tranTypeDesc) {
		this.tranTypeDesc = tranTypeDesc;
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
	public String getCancelledBy() {
		return cancelledBy;
	}
	public void setCancelledBy(String cancelledBy) {
		this.cancelledBy = cancelledBy;
	}
	public DateTime getCancelledDate() {
		return cancelledDate;
	}
	public void setCancelledDate(DateTime cancelledDate) {
		this.cancelledDate = cancelledDate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "AcitCancelledTransactions [tranId=" + tranId + ", tranClass=" + tranClass + ", refNo=" + refNo
				+ ", tranDate=" + tranDate + ", tranType=" + tranType + ", tranTypeDesc=" + tranTypeDesc + ", payee="
				+ payee + ", particulars=" + particulars + ", cancelledBy=" + cancelledBy + ", cancelledDate="
				+ cancelledDate + ", reason=" + reason + ", amount=" + amount + "]";
	}
	
}
