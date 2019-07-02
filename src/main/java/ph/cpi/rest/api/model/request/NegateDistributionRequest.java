package ph.cpi.rest.api.model.request;

public class NegateDistributionRequest {
	private String riskDistId;
	private String distId;
	private String policyId;
	private String updateUser;
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
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	@Override
	public String toString() {
		return "NegateDistributionRequest [riskDistId=" + riskDistId + ", distId=" + distId + ", policyId=" + policyId
				+ ", updateUser=" + updateUser + "]";
	}
	
}
