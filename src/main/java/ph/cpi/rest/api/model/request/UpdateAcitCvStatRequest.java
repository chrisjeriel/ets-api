package ph.cpi.rest.api.model.request;

public class UpdateAcitCvStatRequest {
	private String tranId;
	private String cvStatus;
	private String updateUser;
	public String getTranId() {
		return tranId;
	}
	public void setTranId(String tranId) {
		this.tranId = tranId;
	}
	public String getCvStatus() {
		return cvStatus;
	}
	public void setCvStatus(String cvStatus) {
		this.cvStatus = cvStatus;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	@Override
	public String toString() {
		return "UpdateAcitCvStatRequest [tranId=" + tranId + ", cvStatus=" + cvStatus + ", updateUser=" + updateUser
				+ "]";
	}
}
