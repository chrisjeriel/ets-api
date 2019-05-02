package ph.cpi.rest.api.model.request;

public class PostPolicyRequest {
	private String policyId;
	private String updateUser;
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	@Override
	public String toString() {
		return "PostPolicyRequest [policyId=" + policyId + ", updateUser=" + updateUser + "]";
	}
	
}
