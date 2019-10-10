package ph.cpi.rest.api.model.request;

public class RetrieveAcitInwPolPaytsRequest {
	private String policyId;
	private String policyNo; 

	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getPolicyId() {
		return policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}

	@Override
	public String toString() {
		return "RetrieveAcitInwPolPaytsRequest [policyId=" + policyId + ", policyNo=" + policyNo + "]";
	}
	
}
