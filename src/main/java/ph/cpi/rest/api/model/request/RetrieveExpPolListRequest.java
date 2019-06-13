package ph.cpi.rest.api.model.request;

public class RetrieveExpPolListRequest {
	
	private String policyId;
	private String processTag;
	private String renewalFlag;
	private String extractUser;
	private String renewable;
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getProcessTag() {
		return processTag;
	}
	public void setProcessTag(String processTag) {
		this.processTag = processTag;
	}
	public String getRenewalFlag() {
		return renewalFlag;
	}
	public void setRenewalFlag(String renewalFlag) {
		this.renewalFlag = renewalFlag;
	}
	public String getExtractUser() {
		return extractUser;
	}
	public void setExtractUser(String extractUser) {
		this.extractUser = extractUser;
	}
	public String getRenewable() {
		return renewable;
	}
	public void setRenewable(String renewable) {
		this.renewable = renewable;
	}
	@Override
	public String toString() {
		return "RetrieveExpPolListRequest [policyId=" + policyId + ", processTag=" + processTag + ", renewalFlag="
				+ renewalFlag + ", extractUser=" + extractUser + ", renewable=" + renewable + "]";
	}
}
