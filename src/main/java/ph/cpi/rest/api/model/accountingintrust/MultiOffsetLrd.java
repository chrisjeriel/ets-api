package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class MultiOffsetLrd {

	private String cedingId;
	private String cedingName;
	private String address;
	private DateTime membershipDate;
	private Integer bussTypeCd;
	private String bussTypeName;
	private String tin;
	private String activeTag;
	private String cedingRep;
	private String contactNo;
	private String emailAdd;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal totalLossresdep;
	private BigDecimal localAmt;
	private Integer tranId;
	private BigDecimal lossresdepAmt;
	private BigDecimal moLocalAmt;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public DateTime getMembershipDate() {
		return membershipDate;
	}
	public void setMembershipDate(DateTime membershipDate) {
		this.membershipDate = membershipDate;
	}
	public Integer getBussTypeCd() {
		return bussTypeCd;
	}
	public void setBussTypeCd(Integer bussTypeCd) {
		this.bussTypeCd = bussTypeCd;
	}
	public String getBussTypeName() {
		return bussTypeName;
	}
	public void setBussTypeName(String bussTypeName) {
		this.bussTypeName = bussTypeName;
	}
	public String getTin() {
		return tin;
	}
	public void setTin(String tin) {
		this.tin = tin;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
	}
	public String getCedingRep() {
		return cedingRep;
	}
	public void setCedingRep(String cedingRep) {
		this.cedingRep = cedingRep;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailAdd() {
		return emailAdd;
	}
	public void setEmailAdd(String emailAdd) {
		this.emailAdd = emailAdd;
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
	public BigDecimal getTotalLossresdep() {
		return totalLossresdep;
	}
	public void setTotalLossresdep(BigDecimal totalLossresdep) {
		this.totalLossresdep = totalLossresdep;
	}
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
		this.localAmt = localAmt;
	}
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public BigDecimal getLossresdepAmt() {
		return lossresdepAmt;
	}
	public void setLossresdepAmt(BigDecimal lossresdepAmt) {
		this.lossresdepAmt = lossresdepAmt;
	}
	public BigDecimal getMoLocalAmt() {
		return moLocalAmt;
	}
	public void setMoLocalAmt(BigDecimal moLocalAmt) {
		this.moLocalAmt = moLocalAmt;
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
	@Override
	public String toString() {
		return "MultiOffsetLrd [cedingId=" + cedingId + ", cedingName=" + cedingName + ", address=" + address
				+ ", membershipDate=" + membershipDate + ", bussTypeCd=" + bussTypeCd + ", bussTypeName=" + bussTypeName
				+ ", tin=" + tin + ", activeTag=" + activeTag + ", cedingRep=" + cedingRep + ", contactNo=" + contactNo
				+ ", emailAdd=" + emailAdd + ", currCd=" + currCd + ", currRate=" + currRate + ", totalLossresdep="
				+ totalLossresdep + ", localAmt=" + localAmt + ", tranId=" + tranId + ", lossresdepAmt=" + lossresdepAmt
				+ ", moLocalAmt=" + moLocalAmt + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
