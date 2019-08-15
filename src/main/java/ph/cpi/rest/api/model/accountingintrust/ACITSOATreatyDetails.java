package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class ACITSOATreatyDetails {
	private Integer policyId;
	private String cedingId;
	private String refCd;
	private String payeeNo;
	private String payeeName;
	private String policyNo;
	private String soaNo;
	private String coRefNo;
	private Integer instNo;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal totalAmtDue;
	private BigDecimal totalPayments;
	private BigDecimal tempPayments;
	private BigDecimal netDuePayments;
	private BigDecimal trtyPrem;
	private BigDecimal trtyCharges;
	private BigDecimal trtyRiComm;
	private BigDecimal trtyRiCommVat;
	private BigDecimal balOverdueInt;
	private DateTime effDate;
	private DateTime dueDate;
	private String bookingDate;
	private Integer agingId;
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
	public String getPayeeNo() {
		return payeeNo;
	}
	public void setPayeeNo(String payeeNo) {
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
	public BigDecimal getTrtyPrem() {
		return trtyPrem;
	}
	public void setTrtyPrem(BigDecimal trtyPrem) {
		this.trtyPrem = trtyPrem;
	}
	public BigDecimal getTrtyCharges() {
		return trtyCharges;
	}
	public void setTrtyCharges(BigDecimal trtyCharges) {
		this.trtyCharges = trtyCharges;
	}
	public BigDecimal getTrtyRiComm() {
		return trtyRiComm;
	}
	public void setTrtyRiComm(BigDecimal trtyRiComm) {
		this.trtyRiComm = trtyRiComm;
	}
	public BigDecimal getTrtyRiCommVat() {
		return trtyRiCommVat;
	}
	public void setTrtyRiCommVat(BigDecimal trtyRiCommVat) {
		this.trtyRiCommVat = trtyRiCommVat;
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
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public Integer getAgingId() {
		return agingId;
	}
	public void setAgingId(Integer agingId) {
		this.agingId = agingId;
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
		return "ACITSOATreatyDetails [policyId=" + policyId + ", cedingId=" + cedingId + ", refCd=" + refCd
				+ ", payeeNo=" + payeeNo + ", payeeName=" + payeeName + ", policyNo=" + policyNo + ", soaNo=" + soaNo
				+ ", coRefNo=" + coRefNo + ", instNo=" + instNo + ", currCd=" + currCd + ", currRate=" + currRate
				+ ", totalAmtDue=" + totalAmtDue + ", totalPayments=" + totalPayments + ", tempPayments=" + tempPayments
				+ ", netDuePayments=" + netDuePayments + ", trtyPrem=" + trtyPrem + ", trtyCharges=" + trtyCharges
				+ ", trtyRiComm=" + trtyRiComm + ", trtyRiCommVat=" + trtyRiCommVat + ", balOverdueInt=" + balOverdueInt
				+ ", effDate=" + effDate + ", dueDate=" + dueDate + ", bookingDate=" + bookingDate + ", agingId="
				+ agingId + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}
