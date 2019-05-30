package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class ApproverFn {
	private String approvalCd;
	private String userId;
	private String userName;
	private String description;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	public String getApprovalCd() {
		return approvalCd;
	}
	public void setApprovalCd(String approvalCd) {
		this.approvalCd = approvalCd;
	}
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
		return "ApproverFn [approvalCd=" + approvalCd + ", userId=" + userId + ", userName=" + userName
				+ ", description=" + description + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
