package ph.cpi.rest.api.model.request;

public class CancelCMDMCMDMRequest {
	private String tranId;
	private String updateUser;
	private String updateDate;
	public String getTranId() {
		return tranId;
	}
	public void setTranId(String tranId) {
		this.tranId = tranId;
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
		return "CancelCMDMCMDMRequest [tranId=" + tranId + ", updateUser=" + updateUser + ", updateDate=" + updateDate
				+ "]";
	}
	
	
}
