package ph.cpi.rest.api.model.request;

public class CancelArRequest {
	private String tranId;
	private String reopen;
	private String updateUser;
	private String updateDate;
	
	public String getTranId() {
		return tranId;
	}
	public void setTranId(String tranId) {
		this.tranId = tranId;
	}
	public String getReopen() {
		return reopen;
	}
	public void setReopen(String reopen) {
		this.reopen = reopen;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	
	@Override
	public String toString() {
		return "CancelArRequest [tranId=" + tranId + ", reopen=" + reopen + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}
