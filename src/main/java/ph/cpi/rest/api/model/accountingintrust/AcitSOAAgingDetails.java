package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitSOAAgingDetails {
	private Integer policyId;
	private String cedingId;
	private String refCd;
	private Integer payeeNo;
	private String payeeName;
	private String policyNo;
	private String soaNo;
	private String coRefNo;
	private Integer instNo;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal prevPremAmt;
	private BigDecimal prevRiComm;
	private BigDecimal prevRiCommVat;
	private BigDecimal prevCharges;
	private BigDecimal prevNetDue;
	private BigDecimal cumPayment;
	private BigDecimal prevBalance;
	private BigDecimal totalAmtDue;
	private BigDecimal totalPayments;
	private BigDecimal tempPayments;
	private BigDecimal netDuePayments;
	private BigDecimal balAmtDue;
	private BigDecimal balPremDue;
	private BigDecimal balChargesDue;
	private BigDecimal balRiComm;
	private BigDecimal balRiCommVat;
	private BigDecimal balOverdueInt;
	private DateTime effDate;
	private DateTime dueDate;
	private DateTime bookingDate;
	private Integer agingId;
	private BigDecimal netDue;
	private BigDecimal balance;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getRefCd() {
		return refCd;
	}
	public void setRefCd(String refCd) {
		this.refCd = refCd;
	}
	public Integer getPayeeNo() {
		return payeeNo;
	}
	public void setPayeeNo(Integer payeeNo) {
		this.payeeNo = payeeNo;
	}
	public String getPayeeName() {
		return payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
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
	public BigDecimal getPrevBalance() {
		return prevBalance;
	}
	public void setPrevBalance(BigDecimal prevBalance) {
		this.prevBalance = prevBalance;
	}
	public BigDecimal getTotalAmtDue() {
		return totalAmtDue;
	}
	public void setTotalAmtDue(BigDecimal totalAmtDue) {
		this.totalAmtDue = totalAmtDue;
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
	public BigDecimal getNetDuePayments() {
		return netDuePayments;
	}
	public void setNetDuePayments(BigDecimal netDuePayments) {
		this.netDuePayments = netDuePayments;
	}
	public BigDecimal getBalAmtDue() {
		return balAmtDue;
	}
	public void setBalAmtDue(BigDecimal balAmtDue) {
		this.balAmtDue = balAmtDue;
	}
	public BigDecimal getBalPremDue() {
		return balPremDue;
	}
	public void setBalPremDue(BigDecimal balPremDue) {
		this.balPremDue = balPremDue;
	}
	public BigDecimal getBalChargesDue() {
		return balChargesDue;
	}
	public void setBalChargesDue(BigDecimal balChargesDue) {
		this.balChargesDue = balChargesDue;
	}
	public BigDecimal getBalRiComm() {
		return balRiComm;
	}
	public void setBalRiComm(BigDecimal balRiComm) {
		this.balRiComm = balRiComm;
	}
	public BigDecimal getBalRiCommVat() {
		return balRiCommVat;
	}
	public void setBalRiCommVat(BigDecimal balRiCommVat) {
		this.balRiCommVat = balRiCommVat;
	}
	public BigDecimal getBalOverdueInt() {
		return balOverdueInt;
	}
	public void setBalOverdueInt(BigDecimal balOverdueInt) {
		this.balOverdueInt = balOverdueInt;
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
	public Integer getAgingId() {
		return agingId;
	}
	public void setAgingId(Integer agingId) {
		this.agingId = agingId;
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
	@Override
	public String toString() {
		return "AcitSOAAgingDetails [policyId=" + policyId + ", cedingId=" + cedingId + ", refCd=" + refCd
				+ ", payeeNo=" + payeeNo + ", payeeName=" + payeeName + ", policyNo=" + policyNo + ", soaNo=" + soaNo
				+ ", coRefNo=" + coRefNo + ", instNo=" + instNo + ", currCd=" + currCd + ", currRate=" + currRate
				+ ", prevPremAmt=" + prevPremAmt + ", prevRiComm=" + prevRiComm + ", prevRiCommVat=" + prevRiCommVat
				+ ", prevCharges=" + prevCharges + ", prevNetDue=" + prevNetDue + ", cumPayment=" + cumPayment
				+ ", prevBalance=" + prevBalance + ", totalAmtDue=" + totalAmtDue + ", totalPayments=" + totalPayments
				+ ", tempPayments=" + tempPayments + ", netDuePayments=" + netDuePayments + ", balAmtDue=" + balAmtDue
				+ ", balPremDue=" + balPremDue + ", balChargesDue=" + balChargesDue + ", balRiComm=" + balRiComm
				+ ", balRiCommVat=" + balRiCommVat + ", balOverdueInt=" + balOverdueInt + ", effDate=" + effDate
				+ ", dueDate=" + dueDate + ", bookingDate=" + bookingDate + ", agingId=" + agingId + ", netDue="
				+ netDue + ", balance=" + balance + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}
