package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class ARPaymentDetails {
	private Integer paytId;
	private String paytMode;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal paytAmt;
	private Integer bank;
	private String bankAcct;
	private String checkNo;
	private DateTime checkDate;
	private String checkClass;
	private String remarks;
	
	
	public Integer getPaytId() {
		return paytId;
	}
	public void setPaytId(Integer paytId) {
		this.paytId = paytId;
	}
	public String getPaytMode() {
		return paytMode;
	}
	public void setPaytMode(String paytMode) {
		this.paytMode = paytMode;
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
	public BigDecimal getPaytAmt() {
		return paytAmt;
	}
	public void setPaytAmt(BigDecimal paytAmt) {
		this.paytAmt = paytAmt;
	}
	public Integer getBank() {
		return bank;
	}
	public void setBank(Integer bank) {
		this.bank = bank;
	}
	public String getBankAcct() {
		return bankAcct;
	}
	public void setBankAcct(String bankAcct) {
		this.bankAcct = bankAcct;
	}
	public String getCheckNo() {
		return checkNo;
	}
	public void setCheckNo(String checkNo) {
		this.checkNo = checkNo;
	}
	public DateTime getCheckDate() {
		return checkDate;
	}
	public void setCheckDate(DateTime checkDate) {
		this.checkDate = checkDate;
	}
	public String getCheckClass() {
		return checkClass;
	}
	public void setCheckClass(String checkClass) {
		this.checkClass = checkClass;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	@Override
	public String toString() {
		return "ARPaymentDetails [paytId=" + paytId + ", paytMode=" + paytMode + ", currCd=" + currCd + ", currRate="
				+ currRate + ", paytAmt=" + paytAmt + ", bank=" + bank + ", bankAcct=" + bankAcct + ", checkNo="
				+ checkNo + ", checkDate=" + checkDate + ", checkClass=" + checkClass + ", remarks=" + remarks + "]";
	}
}
