package ph.cpi.rest.api.model.request;

public class UpdateAcitPaytReqStatRequest {
	private String reqId;
	private String reqStatus;
	private String updateUser;
	public String getReqId() {
		return reqId;
	}
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}
	public String getReqStatus() {
		return reqStatus;
	}
	public void setReqStatus(String reqStatus) {
		this.reqStatus = reqStatus;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	@Override
	public String toString() {
		return "UpdateAcitPaytReqStatRequest [reqId=" + reqId + ", reqStatus=" + reqStatus + ", updateUser="
				+ updateUser + "]";
	}
}
