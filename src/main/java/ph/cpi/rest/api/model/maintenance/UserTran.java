package ph.cpi.rest.api.model.maintenance;

import java.util.List;

import org.joda.time.DateTime;

public class UserTran {
	private String userId;    
	private Integer tranCd;    
	private String description;
	private String remarks;    
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private List<UserModule> userModule;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Integer getTranCd() {
		return tranCd;
	}
	public void setTranCd(Integer tranCd) {
		this.tranCd = tranCd;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public List<UserModule> getUserModule() {
		return userModule;
	}
	public void setUserModule(List<UserModule> userModule) {
		this.userModule = userModule;
	}
	
	@Override
	public String toString() {
		return "UserTran [userId=" + userId + ", tranCd=" + tranCd + ", description=" + description + ", remarks="
				+ remarks + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", userModule=" + userModule + "]";
	}
}
