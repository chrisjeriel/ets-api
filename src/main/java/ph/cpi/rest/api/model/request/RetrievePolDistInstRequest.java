package ph.cpi.rest.api.model.request;

public class RetrievePolDistInstRequest {
	private Integer policyId;

	public Integer getPolicyId() {
		return policyId;
	}

	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}

	@Override
	public String toString() {
		return "RetrievePolDistInstRequest [policyId=" + policyId + "]";
	}
	
}
