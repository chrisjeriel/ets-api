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
	private Integer entryId;
	private String tranTypeName;
	private String acctCode;
	private String acctName;
	private Integer slTypeCd;
	private String slCd;
	private String slName;
	private BigDecimal creditAmt;
	private BigDecimal debitAmt;
	private BigDecimal foreignCreditAmt;
	private BigDecimal foreignDebitAmt;
	
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
	
	public Integer getEntryId() {
		return entryId;
	}
	public void setEntryId(Integer entryId) {
		this.entryId = entryId;
	}
	public String getTranTypeName() {
		return tranTypeName;
	}
	public void setTranTypeName(String tranTypeName) {
		this.tranTypeName = tranTypeName;
	}
	public String getAcctCode() {
		return acctCode;
	}
	public void setAcctCode(String acctCode) {
		this.acctCode = acctCode;
	}
	public String getAcctName() {
		return acctName;
	}
	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}
	public Integer getSlTypeCd() {
		return slTypeCd;
	}
	public void setSlTypeCd(Integer slTypeCd) {
		this.slTypeCd = slTypeCd;
	}
	public String getSlCd() {
		return slCd;
	}
	public void setSlCd(String slCd) {
		this.slCd = slCd;
	}
	public String getSlName() {
		return slName;
	}
	public void setSlName(String slName) {
		this.slName = slName;
	}
	public BigDecimal getCreditAmt() {
		return creditAmt;
	}
	public void setCreditAmt(BigDecimal creditAmt) {
		this.creditAmt = creditAmt;
	}
	public BigDecimal getDebitAmt() {
		return debitAmt;
	}
	public void setDebitAmt(BigDecimal debitAmt) {
		this.debitAmt = debitAmt;
	}
	public BigDecimal getForeignCreditAmt() {
		return foreignCreditAmt;
	}
	public void setForeignCreditAmt(BigDecimal foreignCreditAmt) {
		this.foreignCreditAmt = foreignCreditAmt;
	}
	public BigDecimal getForeignDebitAmt() {
		return foreignDebitAmt;
	}
	public void setForeignDebitAmt(BigDecimal foreignDebitAmt) {
		this.foreignDebitAmt = foreignDebitAmt;
	}
	@Override
	public String toString() {
		return "AcitAllInvtIncome [tranId=" + tranId + ", tranClass=" + tranClass + ", tranNo=" + tranNo + ", tranDate="
				+ tranDate + ", payor=" + payor + ", arStatus=" + arStatus + ", statusDesc=" + statusDesc
				+ ", particulars=" + particulars + ", bankCharge=" + bankCharge + ", whtaxAmt=" + whtaxAmt
				+ ", incomeAmt=" + incomeAmt + ", invtId=" + invtId + ", currCd=" + currCd + ", currRate=" + currRate
				+ ", entryId=" + entryId + ", tranTypeName=" + tranTypeName + ", acctCode=" + acctCode + ", acctName="
				+ acctName + ", slTypeCd=" + slTypeCd + ", slCd=" + slCd + ", slName=" + slName + ", creditAmt="
				+ creditAmt + ", debitAmt=" + debitAmt + ", foreignCreditAmt=" + foreignCreditAmt + ", foreignDebitAmt="
				+ foreignDebitAmt + "]";
	}
	
	

}
