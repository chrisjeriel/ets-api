package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitJVAdjstInwPolBal {
	private Integer tranId;
	private Integer itemNo;
	private Integer policyId;
	private String policyNo;
	private Integer instNo;
	private String coRefNo;
	private DateTime effDate;
	private DateTime dueDate;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal prevPremAmt;
	private BigDecimal prevRiComm;
	private BigDecimal prevRiCommVat;
	private BigDecimal prevCharges;
	private BigDecimal prevNetDue;
	private BigDecimal cumPayment;
	private BigDecimal balance;
	private BigDecimal localAmt;
	private BigDecimal paytAmt;
	private BigDecimal premAmt;
	private BigDecimal riComm;
	private BigDecimal riCommVat;
	private BigDecimal charges;
	private BigDecimal netDue;
	private BigDecimal totalPayt;
	private BigDecimal remainingBal;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private String okDelete;
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public Integer getItemNo() {
		return itemNo;
	}
	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
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
	public String getCoRefNo() {
		return coRefNo;
	}
	public void setCoRefNo(String coRefNo) {
		this.coRefNo = coRefNo;
	}
	public DateTime getEffDate() {
		return effDate;
	}
	public void setEffDate(DateTime effDate) {
		this.effDate = effDate;
	}
	public DateTime getDueDate() {
		return dueDate;
	}
	public void setDueDate(DateTime dueDate) {
		this.dueDate = dueDate;
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
	public BigDecimal getPrevPremAmt() {
		return prevPremAmt;
	}
	public void setPrevPremAmt(BigDecimal prevPremAmt) {
		this.prevPremAmt = prevPremAmt;
	}
	public BigDecimal getPrevRiComm() {
		return prevRiComm;
	}
	public void setPrevRiComm(BigDecimal prevRiComm) {
		this.prevRiComm = prevRiComm;
	}
	public BigDecimal getPrevRiCommVat() {
		return prevRiCommVat;
	}
	public void setPrevRiCommVat(BigDecimal prevRiCommVat) {
		this.prevRiCommVat = prevRiCommVat;
	}
	public BigDecimal getPrevCharges() {
		return prevCharges;
	}
	public void setPrevCharges(BigDecimal prevCharges) {
		this.prevCharges = prevCharges;
	}
	public BigDecimal getPrevNetDue() {
		return prevNetDue;
	}
	public void setPrevNetDue(BigDecimal prevNetDue) {
		this.prevNetDue = prevNetDue;
	}
	public BigDecimal getCumPayment() {
		return cumPayment;
	}
	public void setCumPayment(BigDecimal cumPayment) {
		this.cumPayment = cumPayment;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
		this.localAmt = localAmt;
	}
	public BigDecimal getPaytAmt() {
		return paytAmt;
	}
	public void setPaytAmt(BigDecimal paytAmt) {
		this.paytAmt = paytAmt;
	}
	public BigDecimal getPremAmt() {
		return premAmt;
	}
	public void setPremAmt(BigDecimal premAmt) {
		this.premAmt = premAmt;
	}
	public BigDecimal getRiComm() {
		return riComm;
	}
	public void setRiComm(BigDecimal riComm) {
		this.riComm = riComm;
	}
	public BigDecimal getRiCommVat() {
		return riCommVat;
	}
	public void setRiCommVat(BigDecimal riCommVat) {
		this.riCommVat = riCommVat;
	}
	public BigDecimal getCharges() {
		return charges;
	}
	public void setCharges(BigDecimal charges) {
		this.charges = charges;
	}
	public BigDecimal getNetDue() {
		return netDue;
	}
	public void setNetDue(BigDecimal netDue) {
		this.netDue = netDue;
	}
	public BigDecimal getTotalPayt() {
		return totalPayt;
	}
	public void setTotalPayt(BigDecimal totalPayt) {
		this.totalPayt = totalPayt;
	}
	public BigDecimal getRemainingBal() {
		return remainingBal;
	}
	public void setRemainingBal(BigDecimal remainingBal) {
		this.remainingBal = remainingBal;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public DateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(DateTime createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public DateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(DateTime updateDate) {
		this.updateDate = updateDate;
	}
	
	public String getOkDelete() {
		return okDelete;
	}
	public void setOkDelete(String okDelete) {
		this.okDelete = okDelete;
	}
	@Override
	public String toString() {
		return "AcitJVAdjstInwPolBal [tranId=" + tranId + ", itemNo=" + itemNo + ", policyId=" + policyId
				+ ", policyNo=" + policyNo + ", instNo=" + instNo + ", coRefNo=" + coRefNo + ", effDate=" + effDate
				+ ", dueDate=" + dueDate + ", currCd=" + currCd + ", currRate=" + currRate + ", prevPremAmt="
				+ prevPremAmt + ", prevRiComm=" + prevRiComm + ", prevRiCommVat=" + prevRiCommVat + ", prevCharges="
				+ prevCharges + ", prevNetDue=" + prevNetDue + ", cumPayment=" + cumPayment + ", balance=" + balance
				+ ", localAmt=" + localAmt + ", paytAmt=" + paytAmt + ", premAmt=" + premAmt + ", riComm=" + riComm
				+ ", riCommVat=" + riCommVat + ", charges=" + charges + ", netDue=" + netDue + ", totalPayt="
				+ totalPayt + ", remainingBal=" + remainingBal + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", okDelete=" + okDelete
				+ "]";
	}
	
}
