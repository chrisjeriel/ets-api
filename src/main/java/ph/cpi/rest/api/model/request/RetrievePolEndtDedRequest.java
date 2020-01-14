package ph.cpi.rest.api.model.request;

public class RetrievePolEndtDedRequest {
	private String policyId;
	private String lineCd;
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	@Override
	public String toString() {
		return "RetrievePolEndtDedRequest [policyId=" + policyId + ", lineCd=" + lineCd + "]";
	}
	
}
