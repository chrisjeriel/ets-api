package ph.cpi.rest.api.model.maintenance;

import org.apache.ibatis.type.Alias;
import org.joda.time.DateTime;

@Alias("MtnApprover")
public class Approver {
	private String userId;
	private String userName;
	private String userGrp;
	private String userGrpDesc;
	private String emailAddress;
	private String remarks;
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
	public String getUserGrp() {
		return userGrp;
	}
	public void setUserGrp(String userGrp) {
		this.userGrp = userGrp;
	}
	public String getUserGrpDesc() {
		return userGrpDesc;
	}
	public void setUserGrpDesc(String userGrpDesc) {
		this.userGrpDesc = userGrpDesc;
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
		return "Approver [userId=" + userId + ", userName=" + userName + ", userGrp=" + userGrp + ", userGrpDesc="
				+ userGrpDesc + ", emailAddress=" + emailAddress + ", remarks=" + remarks + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
