package ph.cpi.rest.api.model.request;

public class RetrievePolEndtDedRequest {
	private String policyId;
	private String endtCd;
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getEndtCd() {
		return endtCd;
	}
	public void setEndtCd(String endtCd) {
		this.endtCd = endtCd;
	}
	@Override
	public String toString() {
		return "RetrievePolEndtDedRequest [policyId=" + policyId + ", endtCd=" + endtCd + "]";
	}
}
