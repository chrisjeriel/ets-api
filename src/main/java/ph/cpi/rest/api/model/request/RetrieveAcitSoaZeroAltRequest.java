package ph.cpi.rest.api.model.request;

public class RetrieveAcitSoaZeroAltRequest {
	private String policyId;

	public String getPolicyId() {
		return policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	@Override
	public String toString() {
		return "RetrieveAcitSoaZeroAltRequest [policyId=" + policyId + "]";
	}
	
}
