package ph.cpi.rest.api.model.maintenance;

import java.util.List;

import org.joda.time.DateTime;

public class CedingCompany {
	private String cedingId ;
	private String cedingName;
	private String cedingAbbr;
	private String addrLine1;
	private String addrLine2;
	private String addrLine3;
	private String zipCd;
	private String address;
	private String contactNo;
	private Integer bussTypeId;
	private String tinNo;
	private String emailAdd;
	private String activeTag;
	private String govtTag;
	private String oldCedingId;
	private String membershipTag;
	private DateTime membershipDate;
	private DateTime terminationDate;
	private DateTime inactiveDate;
	private String treatyTag;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private List<CedingRepresentative> cedingRepresentative;
	
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
	public Integer getBussTypeId() {
		return bussTypeId;
	}
	public void setBussTypeId(Integer bussTypeId) {
		this.bussTypeId = bussTypeId;
	}
	public String getTinNo() {
		return tinNo;
	}
	public void setTinNo(String tinNo) {
		this.tinNo = tinNo;
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
	public DateTime getMembershipDate() {
		return membershipDate;
	}
	public void setMembershipDate(DateTime membershipDate) {
		this.membershipDate = membershipDate;
	}
	public DateTime getTerminationDate() {
		return terminationDate;
	}
	public void setTerminationDate(DateTime terminationDate) {
		this.terminationDate = terminationDate;
	}
	public DateTime getInactiveDate() {
		return inactiveDate;
	}
	public void setInactiveDate(DateTime inactiveDate) {
		this.inactiveDate = inactiveDate;
	}
	public String getTreatyTag() {
		return treatyTag;
	}
	public void setTreatyTag(String treatyTag) {
		this.treatyTag = treatyTag;
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
	public List<CedingRepresentative> getCedingRepresentative() {
		return cedingRepresentative;
	}
	public void setCedingRepresentative(List<CedingRepresentative> cedingRepresentative) {
		this.cedingRepresentative = cedingRepresentative;
	}
	
	@Override
	public String toString() {
		return "CedingCompany [cedingId=" + cedingId + ", cedingName=" + cedingName + ", cedingAbbr=" + cedingAbbr
				+ ", addrLine1=" + addrLine1 + ", addrLine2=" + addrLine2 + ", addrLine3=" + addrLine3 + ", zipCd="
				+ zipCd + ", address=" + address + ", contactNo=" + contactNo + ", bussTypeId=" + bussTypeId
				+ ", tinNo=" + tinNo + ", emailAdd=" + emailAdd + ", activeTag=" + activeTag + ", govtTag=" + govtTag
				+ ", oldCedingId=" + oldCedingId + ", membershipTag=" + membershipTag + ", membershipDate="
				+ membershipDate + ", terminationDate=" + terminationDate + ", inactiveDate=" + inactiveDate
				+ ", treatyTag=" + treatyTag + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", cedingRepresentative="
				+ cedingRepresentative + "]";
	}
}
