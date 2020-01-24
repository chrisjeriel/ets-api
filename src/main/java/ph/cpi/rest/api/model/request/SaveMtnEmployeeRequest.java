package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveMtnEmployeeRequest {
	
	private List<SaveMtnEmployee> saveList;
	private List<SaveMtnEmployee> delList;
	
	public List<SaveMtnEmployee> getSaveList() {
		return saveList;
	}
	public void setSaveList(List<SaveMtnEmployee> saveList) {
		this.saveList = saveList;
	}
	public List<SaveMtnEmployee> getDelList() {
		return delList;
	}
	public void setDelList(List<SaveMtnEmployee> delList) {
		this.delList = delList;
	}
	
	@Override
	public String toString() {
		return "SaveMtnEmployeeRequest [saveList=" + saveList + ", delList="
				+ delList + "]";
	}
}

class SaveMtnEmployee{
	
	private String companyId;
	private String companyName;
	private String employeeId;
	private String employeeNo;
	private String lastName;
	private String firstName;
	private String middleName;
	private String printableName;
	private String gender;
	private String hireDate;
	private String terminationDate;
	private String department;
	private String designation;
	private String supervisor;
	private String supervisorName;
	private String birthDate;
	private String civilStatus;
	private String presentAdd;
	private String permanentAdd;
	private String tin;
	private String sssNo;
	private String philhealthNo;
	private String pagibigNo;
	private String contactNos;
	private String email;
	private String contactPerson;
	private String emergencyNo;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	private String okDelete;
	private String activeTag;
	
	@Override
	public String toString() {
		return "SaveMtnEmployee [companyId=" + companyId + ", companyName="
				+ companyName + ", employeeId=" + employeeId + ", employeeNo="
				+ employeeNo + ", lastName=" + lastName + ", firstName="
				+ firstName + ", middleName=" + middleName + ", printableName="
				+ printableName + ", gender=" + gender + ", hireDate="
				+ hireDate + ", terminationDate=" + terminationDate
				+ ", department=" + department + ", designation=" + designation
				+ ", supervisor=" + supervisor + ", supervisorName="
				+ supervisorName + ", birthDate=" + birthDate
				+ ", civilStatus=" + civilStatus + ", presentAdd=" + presentAdd
				+ ", permanentAdd=" + permanentAdd + ", tin=" + tin
				+ ", sssNo=" + sssNo + ", philhealthNo=" + philhealthNo
				+ ", pagibigNo=" + pagibigNo + ", contactNos=" + contactNos
				+ ", email=" + email + ", contactPerson=" + contactPerson
				+ ", emergencyNo=" + emergencyNo + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", okDelete=" + okDelete
				+ ", activeTag=" + activeTag + "]";
	}
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getPrintableName() {
		return printableName;
	}
	public void setPrintableName(String printableName) {
		this.printableName = printableName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public String getTerminationDate() {
		return terminationDate;
	}
	public void setTerminationDate(String terminationDate) {
		this.terminationDate = terminationDate;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSupervisor() {
		return supervisor;
	}
	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}
	public String getSupervisorName() {
		return supervisorName;
	}
	public void setSupervisorName(String supervisorName) {
		this.supervisorName = supervisorName;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public String getCivilStatus() {
		return civilStatus;
	}
	public void setCivilStatus(String civilStatus) {
		this.civilStatus = civilStatus;
	}
	public String getPresentAdd() {
		return presentAdd;
	}
	public void setPresentAdd(String presentAdd) {
		this.presentAdd = presentAdd;
	}
	public String getPermanentAdd() {
		return permanentAdd;
	}
	public void setPermanentAdd(String permanentAdd) {
		this.permanentAdd = permanentAdd;
	}
	public String getTin() {
		return tin;
	}
	public void setTin(String tin) {
		this.tin = tin;
	}
	public String getSssNo() {
		return sssNo;
	}
	public void setSssNo(String sssNo) {
		this.sssNo = sssNo;
	}
	public String getPhilhealthNo() {
		return philhealthNo;
	}
	public void setPhilhealthNo(String philhealthNo) {
		this.philhealthNo = philhealthNo;
	}
	public String getPagibigNo() {
		return pagibigNo;
	}
	public void setPagibigNo(String pagibigNo) {
		this.pagibigNo = pagibigNo;
	}
	public String getContactNos() {
		return contactNos;
	}
	public void setContactNos(String contactNos) {
		this.contactNos = contactNos;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactPerson() {
		return contactPerson;
	}
	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}
	public String getEmergencyNo() {
		return emergencyNo;
	}
	public void setEmergencyNo(String emergencyNo) {
		this.emergencyNo = emergencyNo;
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
	public String getOkDelete() {
		return okDelete;
	}
	public void setOkDelete(String okDelete) {
		this.okDelete = okDelete;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
	}

	
}
