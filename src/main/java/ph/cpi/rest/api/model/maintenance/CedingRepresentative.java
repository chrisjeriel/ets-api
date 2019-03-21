package ph.cpi.rest.api.model.maintenance;

import org.joda.time.LocalDateTime;

public class CedingRepresentative {
	private String cedingId;
	private Integer cedingRepId;
	private String designation;
	private String firstName;
	private String middleInitial;
	private String lastName;
	private String fullName;
	private String defaultTag;
	private String position;
	private String department;
	private Integer contactNo;
	private String emailAdd;
	private String eSignature;
	private String createUser;
	private LocalDateTime createDate;
	private String updateUser;
	private LocalDateTime updateDate;
	
	
	public String getCedingId() {
		return cedingId;
	}


	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}


	public Integer getCedingRepId() {
		return cedingRepId;
	}


	public void setCedingRepId(Integer cedingRepId) {
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


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
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


	public Integer getContactNo() {
		return contactNo;
	}


	public void setContactNo(Integer contactNo) {
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


	@Override
	public String toString() {
		return "CedingRepresentative [cedingId=" + cedingId + ", cedingRepId=" + cedingRepId + ", designation="
				+ designation + ", firstName=" + firstName + ", middleInitial=" + middleInitial + ", lastName="
				+ lastName + ", fullName=" + fullName + ", defaultTag=" + defaultTag + ", position=" + position
				+ ", department=" + department + ", contactNo=" + contactNo + ", emailAdd=" + emailAdd + ", eSignature="
				+ eSignature + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}
	
	
}
