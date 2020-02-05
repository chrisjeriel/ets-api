package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveMtnAdjusterRequest {
	private String adjId;
	private String adjName;
	private String addrLine1;
	private String addrLine2;
	private String addrLine3;
	private String zipCd;
	private String contactNo;
	private String emailAdd;
	private String activeTag;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	private String accreditedTag;
	
	public String getAccreditedTag() {
		return accreditedTag;
	}
	public void setAccreditedTag(String accreditedTag) {
		this.accreditedTag = accreditedTag;
	}

	private List<AdjRep> delAdjRepList;
	private List<AdjRep> saveAdjRepList;
	
	public String getAdjId() {
		return adjId;
	}
	public void setAdjId(String adjId) {
		this.adjId = adjId;
	}
	public String getAdjName() {
		return adjName;
	}
	public void setAdjName(String adjName) {
		this.adjName = adjName;
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
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
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
	public List<AdjRep> getDelAdjRepList() {
		return delAdjRepList;
	}
	public void setDelAdjRepList(List<AdjRep> delAdjRepList) {
		this.delAdjRepList = delAdjRepList;
	}
	public List<AdjRep> getSaveAdjRepList() {
		return saveAdjRepList;
	}
	public void setSaveAdjRepList(List<AdjRep> saveAdjRepList) {
		this.saveAdjRepList = saveAdjRepList;
	}
	
	@Override
	public String toString() {
		return "SaveMtnAdjusterRequest [adjId=" + adjId + ", adjName=" + adjName + ", addrLine1=" + addrLine1
				+ ", addrLine2=" + addrLine2 + ", addrLine3=" + addrLine3 + ", zipCd=" + zipCd + ", contactNo="
				+ contactNo + ", emailAdd=" + emailAdd + ", activeTag=" + activeTag + ", remarks=" + remarks
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", accreditedTag=" + accreditedTag + ", delAdjRepList=" + delAdjRepList
				+ ", saveAdjRepList=" + saveAdjRepList + "]";
	}
}

@Alias("SaveMtnAdjRep")
class AdjRep{
	private String adjId;
	private String adjRepId;
	private String designation;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private String defaultTag;
	private String position;
	private String department;
	private String contactNo;
	private String emailAdd;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public String getAdjId() {
		return adjId;
	}
	public void setAdjId(String adjId) {
		this.adjId = adjId;
	}
	public String getAdjRepId() {
		return adjRepId;
	}
	public void setAdjRepId(String adjRepId) {
		this.adjRepId = adjRepId;
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
		return "AdjRep [adjId=" + adjId + ", adjRepId=" + adjRepId + ", designation=" + designation + ", firstName="
				+ firstName + ", middleInitial=" + middleInitial + ", lastName=" + lastName + ", defaultTag="
				+ defaultTag + ", position=" + position + ", department=" + department + ", contactNo=" + contactNo
				+ ", emailAdd=" + emailAdd + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}

