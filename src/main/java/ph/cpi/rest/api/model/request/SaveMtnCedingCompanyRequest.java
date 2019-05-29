package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveMtnCedingCompanyRequest {
	private String cedingId;
	private String cedingName;
	private String cedingAbbr;
	private String addrLine1;
	private String addrLine2;
	private String addrLine3;
	private String zipCd;
	private String contactNo;
	private String emailAdd;
	private String bussTypeId;
	private String tinNo;
	private String activeTag;
	private String govtTag;
	private String oldCedingId;
	private String membershipTag;
	private String membershipDate;
	private String terminationDate;
	private String inactiveDate;
	private String treatyTag;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	private List<CedingRep> saveCedingRepList;
	private List<CedingRep> delCedingRepList;
	
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
	public String getBussTypeId() {
		return bussTypeId;
	}
	public void setBussTypeId(String bussTypeId) {
		this.bussTypeId = bussTypeId;
	}
	public String getTinNo() {
		return tinNo;
	}
	public void setTinNo(String tinNo) {
		this.tinNo = tinNo;
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
	public String getMembershipDate() {
		return membershipDate;
	}
	public void setMembershipDate(String membershipDate) {
		this.membershipDate = membershipDate;
	}
	public String getTerminationDate() {
		return terminationDate;
	}
	public void setTerminationDate(String terminationDate) {
		this.terminationDate = terminationDate;
	}
	public String getInactiveDate() {
		return inactiveDate;
	}
	public void setInactiveDate(String inactiveDate) {
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
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public List<CedingRep> getSaveCedingRepList() {
		return saveCedingRepList;
	}
	public void setSaveCedingRepList(List<CedingRep> saveCedingRepList) {
		this.saveCedingRepList = saveCedingRepList;
	}
	public List<CedingRep> getDelCedingRepList() {
		return delCedingRepList;
	}
	public void setDelCedingRepList(List<CedingRep> delCedingRepList) {
		this.delCedingRepList = delCedingRepList;
	}
	
	@Override
	public String toString() {
		return "SaveMtnCedingCompanyRequest [cedingId=" + cedingId + ", cedingName=" + cedingName + ", cedingAbbr="
				+ cedingAbbr + ", addrLine1=" + addrLine1 + ", addrLine2=" + addrLine2 + ", addrLine3=" + addrLine3
				+ ", zipCd=" + zipCd + ", contactNo=" + contactNo + ", emailAdd=" + emailAdd + ", bussTypeId="
				+ bussTypeId + ", tinNo=" + tinNo + ", activeTag=" + activeTag + ", govtTag=" + govtTag
				+ ", oldCedingId=" + oldCedingId + ", membershipTag=" + membershipTag + ", membershipDate="
				+ membershipDate + ", terminationDate=" + terminationDate + ", inactiveDate=" + inactiveDate
				+ ", treatyTag=" + treatyTag + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", saveCedingRepList="
				+ saveCedingRepList + ", delCedingRepList=" + delCedingRepList + "]";
	}
	
}

@Alias("SaveCedingRep")
class CedingRep{
	private String cedingId;
	private String cedingRepId;
	private String designation;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private String defaultTag;
	private String position;
	private String department;
	private String contactNo;
	private String emailAdd;
	private String eSignature;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getCedingRepId() {
		return cedingRepId;
	}
	public void setCedingRepId(String cedingRepId) {
		this.cedingRepId = cedingRepId;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleInitial() {
		return middleInitial;
	}
	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDefaultTag() {
		return defaultTag;
	}
	public void setDefaultTag(String defaultTag) {
		this.defaultTag = defaultTag;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
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
	public String geteSignature() {
		return eSignature;
	}
	public void seteSignature(String eSignature) {
		this.eSignature = eSignature;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	
	@Override
	public String toString() {
		return "CedingRep [cedingId=" + cedingId + ", cedingRepId=" + cedingRepId + ", designation=" + designation
				+ ", firstName=" + firstName + ", middleInitial=" + middleInitial + ", lastName=" + lastName
				+ ", defaultTag=" + defaultTag + ", position=" + position + ", department=" + department
				+ ", contactNo=" + contactNo + ", emailAdd=" + emailAdd + ", eSignature=" + eSignature + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + "]";
	}
}
