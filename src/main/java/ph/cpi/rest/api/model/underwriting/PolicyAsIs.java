package ph.cpi.rest.api.model.underwriting;

public class PolicyAsIs {
	
	private String policyId;
	private String summaryTag;
	private String newPolicyId;
	private String newPolicyNo;
	private String procBy;
	
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getSummaryTag() {
		return summaryTag;
	}
	public void setSummaryTag(String summaryTag) {
		this.summaryTag = summaryTag;
	}
	public String getNewPolicyId() {
		return newPolicyId;
	}
	public void setNewPolicyId(String newPolicyId) {
		this.newPolicyId = newPolicyId;
	}
	public String getNewPolicyNo() {
		return newPolicyNo;
	}
	public void setNewPolicyNo(String newPolicyNo) {
		this.newPolicyNo = newPolicyNo;
	}
	public String getProcBy() {
		return procBy;
	}
	public void setProcBy(String procBy) {
		this.procBy = procBy;
	}
	@Override
	public String toString() {
		return "PolicyAsIs [policyId=" + policyId + ", summaryTag=" + summaryTag + ", newPolicyId=" + newPolicyId
				+ ", newPolicyNo=" + newPolicyNo + ", procBy=" + procBy + "]";
	}
	
}