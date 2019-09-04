package ph.cpi.rest.api.model.request;

public class RetrievePolInstTagAcctDateRequest {
	private String policyId;

	public String getPolicyId() {
		return policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	@Override
	public String toString() {
		return "RetrievePolInstTagAcctDateRequest [policyId=" + policyId + "]";
	}
	
	
}
