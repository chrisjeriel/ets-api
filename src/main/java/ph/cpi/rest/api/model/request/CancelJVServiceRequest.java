package ph.cpi.rest.api.model.request;

public class CancelJVServiceRequest {
	private Integer tranId;
	private String updateUser;
	private String updateDate;
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
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
		return "CancelJVServiceRequest [tranId=" + tranId + ", updateUser=" + updateUser + ", updateDate=" + updateDate
				+ "]";
	}
}
