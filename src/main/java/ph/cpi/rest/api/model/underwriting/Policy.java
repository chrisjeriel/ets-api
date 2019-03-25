package ph.cpi.rest.api.model.underwriting;

public class Policy {
	
	private Integer policyId;
	private String policyNo;
	private Alop alop;
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public Alop getAlop() {
		return alop;
	}
	public void setAlop(Alop alop) {
		this.alop = alop;
	}
	
	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policyNo=" + policyNo + ", alop=" + alop + "]";
	}
	
	
}
