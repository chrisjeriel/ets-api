package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class AdjRepresentative {
	private Integer adjRepId;
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
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	public Integer getAdjRepId() {
		return adjRepId;
	}
	public void setAdjRepId(Integer adjRepId) {
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
		return "AdjRepresentative [adjRepId=" + adjRepId + ", designation=" + designation + ", firstName=" + firstName
				+ ", middleInitial=" + middleInitial + ", lastName=" + lastName + ", defaultTag=" + defaultTag
				+ ", position=" + position + ", department=" + department + ", contactNo=" + contactNo + ", emailAdd="
				+ emailAdd + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}
