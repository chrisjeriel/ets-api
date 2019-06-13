package ph.cpi.rest.api.model.underwriting;

public class PolicyNonRenewal {
	
	private String policyId;
	private String policyNo;
	private String nrReasonCd;
	private String nrReasonDesc;
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
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getNrReasonDesc() {
		return nrReasonDesc;
	}
	public void setNrReasonDesc(String nrReasonDesc) {
		this.nrReasonDesc = nrReasonDesc;
	}
	@Override
	public String toString() {
		return "PolicyNonRenewal [policyId=" + policyId + ", policyNo=" + policyNo + ", nrReasonCd=" + nrReasonCd
				+ ", nrReasonDesc=" + nrReasonDesc + ", newPolicyId=" + newPolicyId + ", newPolicyNo=" + newPolicyNo
				+ ", procBy=" + procBy + "]";
	}
}