package ph.cpi.rest.api.model.underwriting;

public class PolicyNonRenewal {
	
	private String policyId;
	private String nrReasonCd;
	private String newPolicyId;
	private String newPolicyNo;
	private String procBy;
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getNrReasonCd() {
		return nrReasonCd;
	}
	public void setNrReasonCd(String nrReasonCd) {
		this.nrReasonCd = nrReasonCd;
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
		return "PolicyNonRenewal [policyId=" + policyId + ", nrReasonCd=" + nrReasonCd + ", newPolicyId=" + newPolicyId
				+ ", newPolicyNo=" + newPolicyNo + ", procBy=" + procBy + "]";
	}
	
}