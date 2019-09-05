package ph.cpi.rest.api.model.maintenance;

public class SaveTransaction {
	private String userId;
	private Integer tranCd;    
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
	@Override
	public String toString() {
		return "Transaction [userId=" + userId + ", tranCd=" + tranCd + ", remarks=" + remarks + ", createUser="
				+ createUser + ", updateUser=" + updateUser + "]";
	}
}
