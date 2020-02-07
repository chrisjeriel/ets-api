package ph.cpi.rest.api.model.underwriting;

public class PolicyLOV {
	private String policyId;
	private String policyNo;
	private String riskName;
	private String insuredDesc;
	private String cedingName;
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getRiskName() {
		return riskName;
	}
	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}
	public String getInsuredDesc() {
		return insuredDesc;
	}
	public void setInsuredDesc(String insuredDesc) {
		this.insuredDesc = insuredDesc;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	@Override
	public String toString() {
		return "PolicyLOV [policyId=" + policyId + ", policyNo=" + policyNo + ", riskName=" + riskName
				+ ", insuredDesc=" + insuredDesc + ", cedingName=" + cedingName + "]";
	}
}
