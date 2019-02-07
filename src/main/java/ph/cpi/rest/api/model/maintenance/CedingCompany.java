package ph.cpi.rest.api.model.maintenance;

import org.joda.time.LocalDateTime;

public class CedingCompany {
	private Integer cedingId ;
	private String cedingName;
	private String cedingAbbr;
	private String addrLine1;
	private String addrLine2;
	private String addrLine3;
	private String zipCd;
	private String address;
	private String contactNo;
	private String emailAdd;
	private String activeTag;
	private String govtTag;
	private String oldCedingId;
	private String membershipTag;
	private LocalDateTime membershipDate;
	private LocalDateTime terminationDate;
	private LocalDateTime inactiveDate;
	private String remarks;
	private String createUser;
	private LocalDateTime createDate;
	private String updateUser;
	private LocalDateTime updateDate;
	private CedingRepresentative cedingRepresentative;
	
	public Integer getCedingId() {
		return cedingId;
	}
	public void setCedingId(Integer cedingId) {
		this.cedingId = cedingId;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	public String getCedingAbbr() {
		return cedingAbbr;
	}
	public void setCedingAbbr(String cedingAbbr) {
		this.cedingAbbr = cedingAbbr;
	}
	public String getAddrLine1() {
		return addrLine1;
	}
	public void setAddrLine1(String addrLine1) {
		this.addrLine1 = addrLine1;
	}
	public String getAddrLine2() {
		return addrLine2;
	}
	public void setAddrLine2(String addrLine2) {
		this.addrLine2 = addrLine2;
	}
	public String getAddrLine3() {
		return addrLine3;
	}
	public void setAddrLine3(String addrLine3) {
		this.addrLine3 = addrLine3;
	}
	public String getZipCd() {
		return zipCd;
	}
	public void setZipCd(String zipCd) {
		this.zipCd = zipCd;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
	}
	public String getGovtTag() {
		return govtTag;
	}
	public void setGovtTag(String govtTag) {
		this.govtTag = govtTag;
	}
	public String getOldCedingId() {
		return oldCedingId;
	}
	public void setOldCedingId(String oldCedingId) {
		this.oldCedingId = oldCedingId;
	}
	public String getMembershipTag() {
		return membershipTag;
	}
	public void setMembershipTag(String membershipTag) {
		this.membershipTag = membershipTag;
	}
	public LocalDateTime getMembershipDate() {
		return membershipDate;
	}
	public void setMembershipDate(LocalDateTime membershipDate) {
		this.membershipDate = membershipDate;
	}
	public LocalDateTime getTerminationDate() {
		return terminationDate;
	}
	public void setTerminationDate(LocalDateTime terminationDate) {
		this.terminationDate = terminationDate;
	}
	public LocalDateTime getInactiveDate() {
		return inactiveDate;
	}
	public void setInactiveDate(LocalDateTime inactiveDate) {
		this.inactiveDate = inactiveDate;
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
	public LocalDateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public LocalDateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}
	
	
	public CedingRepresentative getCedingRepresentative() {
		return cedingRepresentative;
	}
	public void setCedingRepresentative(CedingRepresentative cedingRepresentative) {
		this.cedingRepresentative = cedingRepresentative;
	}
	
	@Override
	public String toString() {
		return "CedingCompany [cedingId=" + cedingId + ", cedingName=" + cedingName + ", cedingAbbr=" + cedingAbbr
				+ ", addrLine1=" + addrLine1 + ", addrLine2=" + addrLine2 + ", addrLine3=" + addrLine3 + ", zipCd="
				+ zipCd + ", address=" + address + ", contactNo=" + contactNo + ", emailAdd=" + emailAdd
				+ ", activeTag=" + activeTag + ", govtTag=" + govtTag + ", oldCedingId=" + oldCedingId
				+ ", membershipTag=" + membershipTag + ", membershipDate=" + membershipDate + ", terminationDate="
				+ terminationDate + ", inactiveDate=" + inactiveDate + ", remarks=" + remarks + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + ", cedingRepresentative=" + cedingRepresentative + "]";
	}
	
}
