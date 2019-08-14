package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitAllInvtIncome {
	
	private Integer 	tranId;
	private String 		tranClass;
	private String		tranNo;	
	private DateTime  	tranDate;
	private String 		payor;
	private String		arStatus;
	private String		statusDesc;
	private String  	particulars;
	private BigDecimal 	bankCharge;
	private BigDecimal 	whtaxAmt;	
	private BigDecimal  incomeAmt;
	private Integer		invtId;
	private String		currCd;
	private Integer		currRate;
	
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public Integer getCurrRate() {
		return currRate;
	}
	public void setCurrRate(Integer currRate) {
		this.currRate = currRate;
	}


	public String getTranNo() {
		return tranNo;
	}
	public void setTranNo(String tranNo) {
		this.tranNo = tranNo;
	}
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
	public DateTime getTranDate() {
		return tranDate;
	}
	public void setTranDate(DateTime tranDate) {
		this.tranDate = tranDate;
	}
	public String getPayor() {
		return payor;
	}
	public void setPayor(String payor) {
		this.payor = payor;
	}
	public String getArStatus() {
		return arStatus;
	}
	public void setArStatus(String arStatus) {
		this.arStatus = arStatus;
	}
	public String getStatusDesc() {
		return statusDesc;
	}
	public void setStatusDesc(String statusDesc) {
		this.statusDesc = statusDesc;
	}
	public String getParticulars() {
		return particulars;
	}
	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}
	public BigDecimal getBankCharge() {
		return bankCharge;
	}
	public void setBankCharge(BigDecimal bankCharge) {
		this.bankCharge = bankCharge;
	}
	public BigDecimal getWhtaxAmt() {
		return whtaxAmt;
	}
	public void setWhtaxAmt(BigDecimal whtaxAmt) {
		this.whtaxAmt = whtaxAmt;
	}
	public BigDecimal getIncomeAmt() {
		return incomeAmt;
	}
	public void setIncomeAmt(BigDecimal incomeAmt) {
		this.incomeAmt = incomeAmt;
	}
	public Integer getInvtId() {
		return invtId;
	}
	public void setInvtId(Integer invtId) {
		this.invtId = invtId;
	}
	
	@Override
	public String toString() {
		return "AcitAllInvtIncome [tranId=" + tranId + ", tranClass=" + tranClass + ", tranNo=" + tranNo + ", tranDate="
				+ tranDate + ", payor=" + payor + ", arStatus=" + arStatus + ", statusDesc=" + statusDesc
				+ ", particulars=" + particulars + ", bankCharge=" + bankCharge + ", whtaxAmt=" + whtaxAmt
				+ ", incomeAmt=" + incomeAmt + ", invtId=" + invtId + ", currCd=" + currCd + ", currRate=" + currRate
				+ "]";
	}
	
	

}
