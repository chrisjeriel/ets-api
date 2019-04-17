package ph.cpi.rest.api.model.request;

public class UpdatePolicyStatusRequest {

	private Integer policyId;
	private String status;
	private String updateUser;
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	@Override
	public String toString() {
		return "UpdatePolicyStatusRequest [policyId=" + policyId + ", status=" + status + ", updateUser=" + updateUser
				+ "]";
	}
	
}
