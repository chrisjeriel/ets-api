package ph.cpi.rest.api.model.maintenance;

public class SaveTransaction {
	private String userId;
	private String userGrp;
	private Integer tranCd;    
	private String tranDesc;
	private String remarks;    
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	
	public String getTranDesc() {
		return tranDesc;
	}
	public void setTranDesc(String tranDesc) {
		this.tranDesc = tranDesc;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
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
	public String getUserGrp() {
		return userGrp;
	}
	public void setUserGrp(String userGrp) {
		this.userGrp = userGrp;
	}
	@Override
	public String toString() {
		return "SaveTransaction [userId=" + userId + ", userGrp=" + userGrp + ", tranCd=" + tranCd + ", tranDesc="
				+ tranDesc + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
