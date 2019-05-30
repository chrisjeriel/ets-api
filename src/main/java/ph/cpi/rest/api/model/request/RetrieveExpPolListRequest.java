package ph.cpi.rest.api.model.request;

public class RetrieveExpPolListRequest {
	
	private String renTag;
	private String policyId;
	private String extractUser;
	public String getRenTag() {
		return renTag;
	}
	public void setRenTag(String renTag) {
		this.renTag = renTag;
	}
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getExtractUser() {
		return extractUser;
	}
	public void setExtractUser(String extractUser) {
		this.extractUser = extractUser;
	}
	@Override
	public String toString() {
		return "RetrieveExpPolListRequest [renTag=" + renTag + ", policyId=" + policyId + ", extractUser=" + extractUser
				+ "]";
	}
	
}
