package ph.cpi.rest.api.model.underwriting;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.DateTime;

public class InwPolBalance {
	private Integer instNo;
	private DateTime dueDate;
	private DateTime bookingDate;
	private BigDecimal premAmt;
	private BigDecimal otherChargesInw;
	private BigDecimal amtDue;
	private BigDecimal commAmt;
	private BigDecimal commRt;
	private BigDecimal vatRiComm;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private DateTime acctEntDate;
	private List<OtherCharges> otherCharges;
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
	public DateTime getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(DateTime bookingDate) {
		this.bookingDate = bookingDate;
	}
	public BigDecimal getPremAmt() {
		return premAmt;
	}
	public void setPremAmt(BigDecimal premAmt) {
		this.premAmt = premAmt;
	}
	public BigDecimal getOtherChargesInw() {
		return otherChargesInw;
	}
	public void setOtherChargesInw(BigDecimal otherChargesInw) {
		this.otherChargesInw = otherChargesInw;
	}
	public BigDecimal getAmtDue() {
		return amtDue;
	}
	public void setAmtDue(BigDecimal amtDue) {
		this.amtDue = amtDue;
	}
	public BigDecimal getCommAmt() {
		return commAmt;
	}
	public void setCommAmt(BigDecimal commAmt) {
		this.commAmt = commAmt;
	}
	public BigDecimal getCommRt() {
		return commRt;
	}
	public void setCommRt(BigDecimal commRt) {
		this.commRt = commRt;
	}
	public BigDecimal getVatRiComm() {
		return vatRiComm;
	}
	public void setVatRiComm(BigDecimal vatRiComm) {
		this.vatRiComm = vatRiComm;
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
	public List<OtherCharges> getOtherCharges() {
		return otherCharges;
	}
	public void setOtherCharges(List<OtherCharges> otherCharges) {
		this.otherCharges = otherCharges;
	}
	public DateTime getAcctEntDate() {
		return acctEntDate;
	}
	public void setAcctEntDate(DateTime acctEntDate) {
		this.acctEntDate = acctEntDate;
	}
	@Override
	public String toString() {
		return "InwPolBalance [instNo=" + instNo + ", dueDate=" + dueDate + ", bookingDate=" + bookingDate
				+ ", premAmt=" + premAmt + ", otherChargesInw=" + otherChargesInw + ", amtDue=" + amtDue + ", commAmt="
				+ commAmt + ", commRt=" + commRt + ", vatRiComm=" + vatRiComm + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate
				+ ", acctEntDate=" + acctEntDate + ", otherCharges=" + otherCharges + "]";
	}
}
