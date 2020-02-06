package ph.cpi.rest.api.model.underwriting;

public class PolOcList {
	private String policyId;
	private String policyNo;
	private String policyIdOc;
	private String policyNoOc;
	private String riskId;
	private String riskName;
	private String coinsGrpId;
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
	public String getCoinsGrpId() {
		return coinsGrpId;
	}
	public void setCoinsGrpId(String coinsGrpId) {
		this.coinsGrpId = coinsGrpId;
	}
	@Override
	public String toString() {
		return "PolOcList [policyId=" + policyId + ", policyNo=" + policyNo + ", policyIdOc=" + policyIdOc
				+ ", policyNoOc=" + policyNoOc + ", riskId=" + riskId + ", riskName=" + riskName + ", coinsGrpId="
				+ coinsGrpId + "]";
	}
	
	
}
