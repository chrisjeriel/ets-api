package ph.cpi.rest.api.model.underwriting;

public class PolOcLov {
	private String policyIdOc;
	private String policyNoOc;
	private String riskId;
	private String riskName;
	private String cedingName;
	private String insuredDesc;
	public String getPolicyIdOc() {
		return policyIdOc;
	}
	public void setPolicyIdOc(String policyIdOc) {
		this.policyIdOc = policyIdOc;
	}
	public String getPolicyNoOc() {
		return policyNoOc;
	}
	public void setPolicyNoOc(String policyNoOc) {
		this.policyNoOc = policyNoOc;
	}
	public String getRiskId() {
		return riskId;
	}
	public void setRiskId(String riskId) {
		this.riskId = riskId;
	}
	public String getRiskName() {
		return riskName;
	}
	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	public String getInsuredDesc() {
		return insuredDesc;
	}
	public void setInsuredDesc(String insuredDesc) {
		this.insuredDesc = insuredDesc;
	}
	@Override
	public String toString() {
		return "PolOcLov [policyIdOc=" + policyIdOc + ", policyNoOc=" + policyNoOc + ", riskId=" + riskId
				+ ", riskName=" + riskName + ", cedingName=" + cedingName + ", insuredDesc=" + insuredDesc + "]";
	}
	
	
}
