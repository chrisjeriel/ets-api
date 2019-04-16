package ph.cpi.rest.api.model.request;

public class UpdatePolicyStatusRequest {

	private Integer policyId;
	private String status;
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
	@Override
	public String toString() {
		return "UpdatePolicyStatusRequest [policyId=" + policyId + ", status=" + status + "]";
	}
	
}
