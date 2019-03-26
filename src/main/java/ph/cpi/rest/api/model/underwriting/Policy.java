package ph.cpi.rest.api.model.underwriting;

public class Policy {
	
	private Integer policyId;
	private String policyNo;
	private InwPolBalance inwPolBalance;
	private CoInsurance coInsurance;
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
	public InwPolBalance getInwPolBalance() {
		return inwPolBalance;
	}
	public void setInwPolBalance(InwPolBalance inwPolBalance) {
		this.inwPolBalance = inwPolBalance;
	}
	public CoInsurance getCoInsurance() {
		return coInsurance;
	}
	public void setCoInsurance(CoInsurance coInsurance) {
		this.coInsurance = coInsurance;
	}
	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policyNo=" + policyNo + ", inwPolBalance=" + inwPolBalance
				+ ", coInsurance=" + coInsurance + "]";
	}
	
}
