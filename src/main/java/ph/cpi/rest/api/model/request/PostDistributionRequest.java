package ph.cpi.rest.api.model.request;

public class PostDistributionRequest {
	private String riskDistId;
	private String distId;
	private String policyId;
	private String user;
	public String getRiskDistId() {
		return riskDistId;
	}
	public void setRiskDistId(String riskDistId) {
		this.riskDistId = riskDistId;
	}
	public String getDistId() {
		return distId;
	}
	public void setDistId(String distId) {
		this.distId = distId;
	}
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "PostDistributionRequest [riskDistId=" + riskDistId + ", distId=" + distId + ", policyId=" + policyId
				+ ", user=" + user + "]";
	}
	
}
