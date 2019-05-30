package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class UsersLov {
	private String userId;
	private String userName;
	private String UserGroup;
	private String UserDescription;
	private String emailAddress;
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserGroup() {
		return UserGroup;
	}
	public void setUserGroup(String userGroup) {
		UserGroup = userGroup;
	}
	public String getUserDescription() {
		return UserDescription;
	}
	public void setUserDescription(String userDescription) {
		UserDescription = userDescription;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
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
		return "UsersLov [userId=" + userId + ", userName=" + userName + ", UserGroup=" + UserGroup
				+ ", UserDescription=" + UserDescription + ", emailAddress=" + emailAddress + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + "]";
	}
}
