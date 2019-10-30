package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveMtnPayeeRequest {
	
	private List<savePayee> saveList;
	private List<savePayee> delList;
	
	public List<savePayee> getSaveList() {
		return saveList;
	}

	public void setSaveList(List<savePayee> saveList) {
		this.saveList = saveList;
	}

	public List<savePayee> getDelList() {
		return delList;
	}

	public void setDelList(List<savePayee> delList) {
		this.delList = delList;
	}

	@Override
	public String toString() {
		return "SaveMtnPayeeRequest [saveList=" + saveList + ", delList="
				+ delList + "]";
	}
}

class savePayee{
	private String payeeNo;
	private String payeeClassCd;
	private String payeeName;
	private String bussTypeCd;
	private String tin;
	private String contactNo;
	private String mailAddress;
	private String email;
	private String remarks;
	private String designation;
	private String department;
	private String mailAddress2;
	private String permAddress;
	private String contactPerson1;
	private String contactPerson2;
	private String phoneNo;
	private String mobileNo;
	private String faxNo;
	private String bankCd1;
	private String bankBranch1;
	private String bankAcctType1;
	private String bankAcctName1;
	private String bankAcctNo1;
	private String bankCd2;
	private String bankBranch2;
	private String bankAcctType2;
	private String bankAcctName2;
	private String bankAcctNo2;
	private String autoTag;
	private String activeTag;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public String getPayeeNo() {
		return payeeNo;
	}
	public void setPayeeNo(String payeeNo) {
		this.payeeNo = payeeNo;
	}
	public String getPayeeClassCd() {
		return payeeClassCd;
	}
	public void setPayeeClassCd(String payeeClassCd) {
		this.payeeClassCd = payeeClassCd;
	}
	public String getPayeeName() {
		return payeeName;
	}
	public void setPayeeName(String payeeName) {
		this.payeeName = payeeName;
	}
	public String getBussTypeCd() {
		return bussTypeCd;
	}
	public void setBussTypeCd(String bussTypeCd) {
		this.bussTypeCd = bussTypeCd;
	}
	public String getTin() {
		return tin;
	}
	public void setTin(String tin) {
		this.tin = tin;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getMailAddress() {
		return mailAddress;
	}
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getMailAddress2() {
		return mailAddress2;
	}
	public void setMailAddress2(String mailAddress2) {
		this.mailAddress2 = mailAddress2;
	}
	public String getPermAddress() {
		return permAddress;
	}
	public void setPermAddress(String permAddress) {
		this.permAddress = permAddress;
	}
	public String getContactPerson1() {
		return contactPerson1;
	}
	public void setContactPerson1(String contactPerson1) {
		this.contactPerson1 = contactPerson1;
	}
	public String getContactPerson2() {
		return contactPerson2;
	}
	public void setContactPerson2(String contactPerson2) {
		this.contactPerson2 = contactPerson2;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getFaxNo() {
		return faxNo;
	}
	public void setFaxNo(String faxNo) {
		this.faxNo = faxNo;
	}
	public String getBankCd1() {
		return bankCd1;
	}
	public void setBankCd1(String bankCd1) {
		this.bankCd1 = bankCd1;
	}
	public String getBankBranch1() {
		return bankBranch1;
	}
	public void setBankBranch1(String bankBranch1) {
		this.bankBranch1 = bankBranch1;
	}
	public String getBankAcctType1() {
		return bankAcctType1;
	}
	public void setBankAcctType1(String bankAcctType1) {
		this.bankAcctType1 = bankAcctType1;
	}
	public String getBankAcctName1() {
		return bankAcctName1;
	}
	public void setBankAcctName1(String bankAcctName1) {
		this.bankAcctName1 = bankAcctName1;
	}
	public String getBankAcctNo1() {
		return bankAcctNo1;
	}
	public void setBankAcctNo1(String bankAcctNo1) {
		this.bankAcctNo1 = bankAcctNo1;
	}
	public String getBankCd2() {
		return bankCd2;
	}
	public void setBankCd2(String bankCd2) {
		this.bankCd2 = bankCd2;
	}
	public String getBankBranch2() {
		return bankBranch2;
	}
	public void setBankBranch2(String bankBranch2) {
		this.bankBranch2 = bankBranch2;
	}
	public String getBankAcctType2() {
		return bankAcctType2;
	}
	public void setBankAcctType2(String bankAcctType2) {
		this.bankAcctType2 = bankAcctType2;
	}
	public String getBankAcctName2() {
		return bankAcctName2;
	}
	public void setBankAcctName2(String bankAcctName2) {
		this.bankAcctName2 = bankAcctName2;
	}
	public String getBankAcctNo2() {
		return bankAcctNo2;
	}
	public void setBankAcctNo2(String bankAcctNo2) {
		this.bankAcctNo2 = bankAcctNo2;
	}
	public String getAutoTag() {
		return autoTag;
	}
	public void setAutoTag(String autoTag) {
		this.autoTag = autoTag;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
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
		return "savePayee [payeeNo=" + payeeNo + ", payeeClassCd="
				+ payeeClassCd + ", payeeName=" + payeeName + ", bussTypeCd="
				+ bussTypeCd + ", tin=" + tin + ", contactNo=" + contactNo
				+ ", mailAddress=" + mailAddress + ", email=" + email
				+ ", remarks=" + remarks + ", designation=" + designation
				+ ", department=" + department + ", mailAddress2="
				+ mailAddress2 + ", permAddress=" + permAddress
				+ ", contactPerson1=" + contactPerson1 + ", contactPerson2="
				+ contactPerson2 + ", phoneNo=" + phoneNo + ", mobileNo="
				+ mobileNo + ", faxNo=" + faxNo + ", bankCd1=" + bankCd1
				+ ", bankBranch1=" + bankBranch1 + ", bankAcctType1="
				+ bankAcctType1 + ", bankAcctName1=" + bankAcctName1
				+ ", bankAcctNo1=" + bankAcctNo1 + ", bankCd2=" + bankCd2
				+ ", bankBranch2=" + bankBranch2 + ", bankAcctType2="
				+ bankAcctType2 + ", bankAcctName2=" + bankAcctName2
				+ ", bankAcctNo2=" + bankAcctNo2 + ", autoTag=" + autoTag
				+ ", activeTag=" + activeTag + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}