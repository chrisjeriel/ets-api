package ph.cpi.rest.api.model.underwriting;

public class PolicyAsIs {
	
	private String policyId;
	private String policyNo;
	private String summaryTag;
	private String newPolicyId;
	private String newPolicyNo;
	private String procBy;
	private String renewalFlag;
	private String remarks;
	
	
	public String getRenewalFlag() {
		return renewalFlag;
	}
	public void setRenewalFlag(String renewalFlag) {
		this.renewalFlag = renewalFlag;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
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
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	@Override
	public String toString() {
		return "PolicyAsIs [policyId=" + policyId + ", policyNo=" + policyNo + ", summaryTag=" + summaryTag
				+ ", newPolicyId=" + newPolicyId + ", newPolicyNo=" + newPolicyNo + ", procBy=" + procBy
				+ ", renewalFlag=" + renewalFlag + ", remarks=" + remarks + "]";
	}
	
	
	
}