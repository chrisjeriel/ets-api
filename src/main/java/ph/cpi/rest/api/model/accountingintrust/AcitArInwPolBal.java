package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitArInwPolBal {
	private Integer tranId;
	private Integer billId;
	private Integer	itemNo;
	private Integer policyId;
	private String policyNo;
	private String soaNo;
	private String coRefNo;
	private Integer instNo;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal totalPayments;
	private BigDecimal tempPayments;
	
	private BigDecimal prevPremAmt;
	private BigDecimal prevRiComm;
	private BigDecimal prevRiCommVat;
	private BigDecimal prevCharges;
	private BigDecimal prevNetDue;
	private BigDecimal prevCumPayment;
	private BigDecimal prevBalance;
	
	private BigDecimal premAmt;
	private BigDecimal charges;
	private BigDecimal riComm;
	private BigDecimal riCommVat;
	private BigDecimal overdueInt;
	private DateTime effDate;
	private DateTime dueDate;
	private DateTime bookingDate;
	private BigDecimal netDue;
	private BigDecimal balPaytAmt;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	private BigDecimal allotedAmt;

	public Integer getTranId() {
		return tranId;
	}

	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}

	public Integer getBillId() {
		return billId;
	}

	public void setBillId(Integer billId) {
		this.billId = billId;
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

	public String getSoaNo() {
		return soaNo;
	}

	public void setSoaNo(String soaNo) {
		this.soaNo = soaNo;
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

	public BigDecimal getTotalPayments() {
		return totalPayments;
	}

	public void setTotalPayments(BigDecimal totalPayments) {
		this.totalPayments = totalPayments;
	}

	public BigDecimal getTempPayments() {
		return tempPayments;
	}

	public void setTempPayments(BigDecimal tempPayments) {
		this.tempPayments = tempPayments;
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

	public BigDecimal getPrevCumPayment() {
		return prevCumPayment;
	}

	public void setPrevCumPayment(BigDecimal prevCumPayment) {
		this.prevCumPayment = prevCumPayment;
	}

	public BigDecimal getPrevBalance() {
		return prevBalance;
	}

	public void setPrevBalance(BigDecimal prevBalance) {
		this.prevBalance = prevBalance;
	}

	public BigDecimal getPremAmt() {
		return premAmt;
	}

	public void setPremAmt(BigDecimal premAmt) {
		this.premAmt = premAmt;
	}

	public BigDecimal getCharges() {
		return charges;
	}

	public void setCharges(BigDecimal charges) {
		this.charges = charges;
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

	public BigDecimal getOverdueInt() {
		return overdueInt;
	}

	public void setOverdueInt(BigDecimal overdueInt) {
		this.overdueInt = overdueInt;
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

	public DateTime getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(DateTime bookingDate) {
		this.bookingDate = bookingDate;
	}

	public BigDecimal getNetDue() {
		return netDue;
	}

	public void setNetDue(BigDecimal netDue) {
		this.netDue = netDue;
	}

	public BigDecimal getBalPaytAmt() {
		return balPaytAmt;
	}

	public void setBalPaytAmt(BigDecimal balPaytAmt) {
		this.balPaytAmt = balPaytAmt;
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

	public BigDecimal getAllotedAmt() {
		return allotedAmt;
	}

	public void setAllotedAmt(BigDecimal allotedAmt) {
		this.allotedAmt = allotedAmt;
	}

	@Override
	public String toString() {
		return "AcitArInwPolBal [tranId=" + tranId + ", billId=" + billId + ", itemNo=" + itemNo + ", policyId="
				+ policyId + ", policyNo=" + policyNo + ", soaNo=" + soaNo + ", coRefNo=" + coRefNo + ", instNo="
				+ instNo + ", currCd=" + currCd + ", currRate=" + currRate + ", totalPayments=" + totalPayments
				+ ", tempPayments=" + tempPayments + ", prevPremAmt=" + prevPremAmt + ", prevRiComm=" + prevRiComm
				+ ", prevRiCommVat=" + prevRiCommVat + ", prevCharges=" + prevCharges + ", prevNetDue=" + prevNetDue
				+ ", prevCumPayment=" + prevCumPayment + ", prevBalance=" + prevBalance + ", premAmt=" + premAmt
				+ ", charges=" + charges + ", riComm=" + riComm + ", riCommVat=" + riCommVat + ", overdueInt="
				+ overdueInt + ", effDate=" + effDate + ", dueDate=" + dueDate + ", bookingDate=" + bookingDate
				+ ", netDue=" + netDue + ", balPaytAmt=" + balPaytAmt + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", allotedAmt="
				+ allotedAmt + "]";
	}
	
}
