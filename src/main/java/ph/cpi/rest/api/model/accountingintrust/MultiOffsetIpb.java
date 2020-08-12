package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class MultiOffsetIpb {
	private Integer tranId;
	private Integer policyId;
	private String policyNo;
	private String cedingId;
	private String cedingName;
	private Integer instNo;
	private String currCd;
	private String coRefNo;
	private DateTime dueDate;
	private BigDecimal currRate;
	private BigDecimal prevPremAmt;
	private BigDecimal prevRiComm; 
	private BigDecimal prevRiCommVat;
	private BigDecimal prevCharges;
	private BigDecimal prevNetDue;
	private BigDecimal premAmt;
	private BigDecimal riComm;
	private BigDecimal riCommVat;
	private BigDecimal charges;
	private BigDecimal netDue;
	private BigDecimal balance;
	private BigDecimal cumPayment;
	private BigDecimal paytAmt;
	private BigDecimal localAmt;
	private BigDecimal totalPayt;
	private BigDecimal remainingBal;
	private BigDecimal overdueInt;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private String insuredDesc;
	private String soaNo;
	private String cedingAbbr;
	
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
	public Integer getInstNo() {
		return instNo;
	}
	public void setInstNo(Integer instNo) {
		this.instNo = instNo;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public String getCoRefNo() {
		return coRefNo;
	}
	public void setCoRefNo(String coRefNo) {
		this.coRefNo = coRefNo;
	}
	public DateTime getDueDate() {
		return dueDate;
	}
	public void setDueDate(DateTime dueDate) {
		this.dueDate = dueDate;
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
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public BigDecimal getCumPayment() {
		return cumPayment;
	}
	public void setCumPayment(BigDecimal cumPayment) {
		this.cumPayment = cumPayment;
	}
	public BigDecimal getPaytAmt() {
		return paytAmt;
	}
	public void setPaytAmt(BigDecimal paytAmt) {
		this.paytAmt = paytAmt;
	}
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
		this.localAmt = localAmt;
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
	public BigDecimal getOverdueInt() {
		return overdueInt;
	}
	public void setOverdueInt(BigDecimal overdueInt) {
		this.overdueInt = overdueInt;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
	public String getInsuredDesc() {
		return insuredDesc;
	}
	public void setInsuredDesc(String insuredDesc) {
		this.insuredDesc = insuredDesc;
	}
	public String getSoaNo() {
		return soaNo;
	}
	public void setSoaNo(String soaNo) {
		this.soaNo = soaNo;
	}
	public String getCedingAbbr() {
		return cedingAbbr;
	}
	public void setCedingAbbr(String cedingAbbr) {
		this.cedingAbbr = cedingAbbr;
	}
	@Override
	public String toString() {
		return "MultiOffsetIpb [tranId=" + tranId + ", policyId=" + policyId + ", policyNo=" + policyNo + ", cedingId="
				+ cedingId + ", cedingName=" + cedingName + ", instNo=" + instNo + ", currCd=" + currCd + ", coRefNo="
				+ coRefNo + ", dueDate=" + dueDate + ", currRate=" + currRate + ", prevPremAmt=" + prevPremAmt
				+ ", prevRiComm=" + prevRiComm + ", prevRiCommVat=" + prevRiCommVat + ", prevCharges=" + prevCharges
				+ ", prevNetDue=" + prevNetDue + ", premAmt=" + premAmt + ", riComm=" + riComm + ", riCommVat="
				+ riCommVat + ", charges=" + charges + ", netDue=" + netDue + ", balance=" + balance + ", cumPayment="
				+ cumPayment + ", paytAmt=" + paytAmt + ", localAmt=" + localAmt + ", totalPayt=" + totalPayt
				+ ", remainingBal=" + remainingBal + ", overdueInt=" + overdueInt + ", remarks=" + remarks
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", insuredDesc=" + insuredDesc + ", soaNo=" + soaNo + ", cedingAbbr="
				+ cedingAbbr + "]";
	}
}
