package ph.cpi.rest.api.model.maintenance;

public class SaveModule {
	private String userId;
	private String userGrp;
	private Integer tranCd;    
	private String moduleId;
	private String remarks;    
	private String createUser;
	private String updateUser;
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
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	
	public String getModuleId() {
		return moduleId;
	}
	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
	}
	public String getUserGrp() {
		return userGrp;
	}
	public void setUserGrp(String userGrp) {
		this.userGrp = userGrp;
	}
	@Override
	public String toString() {
		return "SaveModule [userId=" + userId + ", userGrp=" + userGrp + ", tranCd=" + tranCd + ", moduleId=" + moduleId
				+ ", remarks=" + remarks + ", createUser=" + createUser + ", updateUser=" + updateUser + "]";
	}
	
}
