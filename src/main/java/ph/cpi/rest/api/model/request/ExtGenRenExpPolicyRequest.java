package ph.cpi.rest.api.model.request;

public class ExtGenRenExpPolicyRequest {
	String policyId;
	String procBy;
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getProcBy() {
		return procBy;
	}
	public void setProcBy(String procBy) {
		this.procBy = procBy;
	}
	@Override
	public String toString() {
		return "ExtGenRenExpPolicyRequest [policyId=" + policyId + ", procBy=" + procBy + "]";
	}
	
}
