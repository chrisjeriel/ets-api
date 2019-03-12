package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class Users {
	private String userId;
	private Integer userGrp;
	private String userGrpDesc;
	private String userName;
	private String activeTag;
	private String password;
	private String emailAddress;
	private String remarks;
	private DateTime lastLogin;
	private DateTime passwordResetDate;
	private String salt;
	private Integer invalidLoginTries;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Integer getUserGrp() {
		return userGrp;
	}
	public void setUserGrp(Integer userGrp) {
		this.userGrp = userGrp;
	}
	public String getUserGrpDesc() {
		return userGrpDesc;
	}
	public void setUserGrpDesc(String userGrpDesc) {
		this.userGrpDesc = userGrpDesc;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public DateTime getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(DateTime lastLogin) {
		this.lastLogin = lastLogin;
	}
	public DateTime getPasswordResetDate() {
		return passwordResetDate;
	}
	public void setPasswordResetDate(DateTime passwordResetDate) {
		this.passwordResetDate = passwordResetDate;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public Integer getInvalidLoginTries() {
		return invalidLoginTries;
	}
	public void setInvalidLoginTries(Integer invalidLoginTries) {
		this.invalidLoginTries = invalidLoginTries;
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
		return "Users [userId=" + userId + ", userGrp=" + userGrp + ", userGrpDesc=" + userGrpDesc + ", userName="
				+ userName + ", activeTag=" + activeTag + ", password=" + password + ", emailAddress=" + emailAddress
				+ ", remarks=" + remarks + ", lastLogin=" + lastLogin + ", passwordResetDate=" + passwordResetDate
				+ ", salt=" + salt + ", invalidLoginTries=" + invalidLoginTries + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}
