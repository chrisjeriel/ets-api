package ph.cpi.rest.api.model.request;

public class RetrievePolOcInfoRequest {
	private String policyId;

	public String getPolicyId() {
		return policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	@Override
	public String toString() {
		return "RetrievePolOcInfoRequest [policyId=" + policyId + "]";
	}
	
	
}
