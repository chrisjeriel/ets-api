package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitPrqInwPol {
	private Integer reqId;
	private Integer itemNo;
	private String policyNo;
	private String coRefNo;
	private Integer instNo;
	private DateTime dueDate;
	private String currCd;
	private Double currRate;
	private BigDecimal prevPremAmt;
	private BigDecimal prevRiComm;
	private BigDecimal prevRiCommVat;
	private BigDecimal prevCharges;
	private BigDecimal cumPayment;
	private BigDecimal prevBalance;
	private BigDecimal returnAmt;
	private BigDecimal premAmt;
	private BigDecimal riComm;
	private BigDecimal riCommVat;
	private BigDecimal charges;
	private BigDecimal prevNetDue;
	private BigDecimal totalPayt;
	private BigDecimal remainingBal;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	public Integer getReqId() {
		return reqId;
	}
	public void setReqId(Integer reqId) {
		this.reqId = reqId;
	}
	public Integer getItemNo() {
		return itemNo;
	}
	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
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
	public Integer getInstNo() {
		return instNo;
	}
	public void setInstNo(Integer instNo) {
		this.instNo = instNo;
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
	public Double getCurrRate() {
		return currRate;
	}
	public void setCurrRate(Double currRate) {
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
	public BigDecimal getReturnAmt() {
		return returnAmt;
	}
	public void setReturnAmt(BigDecimal returnAmt) {
		this.returnAmt = returnAmt;
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
	public BigDecimal getPrevNetDue() {
		return prevNetDue;
	}
	public void setPrevNetDue(BigDecimal prevNetDue) {
		this.prevNetDue = prevNetDue;
	}
	@Override
	public String toString() {
		return "AcitPrqInwPol [reqId=" + reqId + ", itemNo=" + itemNo + ", policyNo=" + policyNo + ", coRefNo="
				+ coRefNo + ", instNo=" + instNo + ", dueDate=" + dueDate + ", currCd=" + currCd + ", currRate="
				+ currRate + ", prevPremAmt=" + prevPremAmt + ", prevRiComm=" + prevRiComm + ", prevRiCommVat="
				+ prevRiCommVat + ", prevCharges=" + prevCharges + ", cumPayment=" + cumPayment + ", prevBalance="
				+ prevBalance + ", returnAmt=" + returnAmt + ", premAmt=" + premAmt + ", riComm=" + riComm
				+ ", riCommVat=" + riCommVat + ", charges=" + charges + ", prevNetDue=" + prevNetDue + ", totalPayt="
				+ totalPayt + ", remainingBal=" + remainingBal + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
