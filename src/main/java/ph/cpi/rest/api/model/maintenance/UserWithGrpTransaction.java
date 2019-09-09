package ph.cpi.rest.api.model.maintenance;

public class UserWithGrpTransaction extends Transaction {
	
	private String userId;
	private String userName;
	private String activeTag;
	private Integer userGrp;
	private String userGrpDesc;
	
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
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
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
	@Override
	public String toString() {
		return "UserWithGrpTransaction [userId=" + userId + ", userName=" + userName + ", activeTag=" + activeTag
				+ ", userGrp=" + userGrp + ", userGrpDesc=" + userGrpDesc + "]";
	}
	
	
}
