package ph.cpi.rest.api.model.request;

public class ExtractRenExpPolicyRequest {
	String policyId;
	String extractUser;
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getExtractUser() {
		return extractUser;
	}
	public void setExtractUser(String extractUser) {
		this.extractUser = extractUser;
	}
	@Override
	public String toString() {
		return "ExtractRenExpPolicyRequest [policyId=" + policyId + ", extractUser=" + extractUser + "]";
	}
	
}
