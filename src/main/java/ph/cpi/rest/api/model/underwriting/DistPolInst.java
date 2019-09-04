package ph.cpi.rest.api.model.underwriting;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.DateTime;

public class DistPolInst {
	private Integer distId;
	private String policyNo;
	private Integer instNo;
	private DateTime dueDate;
	private DateTime bookingDate;
	private DateTime acctEntDate;
	private BigDecimal premAmt;
	private BigDecimal commRt;
	private BigDecimal commAmt;
	private BigDecimal vatRiComm;
	private BigDecimal netDue;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	List <DistPolInstTreaty> treatyList;
	public Integer getDistId() {
		return distId;
	}
	public void setDistId(Integer distId) {
		this.distId = distId;
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
	public DateTime getAcctEntDate() {
		return acctEntDate;
	}
	public void setAcctEntDate(DateTime acctEntDate) {
		this.acctEntDate = acctEntDate;
	}
	public BigDecimal getPremAmt() {
		return premAmt;
	}
	public void setPremAmt(BigDecimal premAmt) {
		this.premAmt = premAmt;
	}
	public BigDecimal getCommRt() {
		return commRt;
	}
	public void setCommRt(BigDecimal commRt) {
		this.commRt = commRt;
	}
	public BigDecimal getCommAmt() {
		return commAmt;
	}
	public void setCommAmt(BigDecimal commAmt) {
		this.commAmt = commAmt;
	}
	public BigDecimal getVatRiComm() {
		return vatRiComm;
	}
	public void setVatRiComm(BigDecimal vatRiComm) {
		this.vatRiComm = vatRiComm;
	}
	public BigDecimal getNetDue() {
		return netDue;
	}
	public void setNetDue(BigDecimal netDue) {
		this.netDue = netDue;
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
	public List<DistPolInstTreaty> getTreatyList() {
		return treatyList;
	}
	public void setTreatyList(List<DistPolInstTreaty> treatyList) {
		this.treatyList = treatyList;
	}
	@Override
	public String toString() {
		return "DistPolInst [distId=" + distId + ", policyNo=" + policyNo + ", instNo=" + instNo + ", dueDate="
				+ dueDate + ", bookingDate=" + bookingDate + ", acctEntDate=" + acctEntDate + ", premAmt=" + premAmt
				+ ", commRt=" + commRt + ", commAmt=" + commAmt + ", vatRiComm=" + vatRiComm + ", netDue=" + netDue
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", treatyList=" + treatyList + "]";
	}
}
