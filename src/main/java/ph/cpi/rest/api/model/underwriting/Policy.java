package ph.cpi.rest.api.model.underwriting;

import java.util.List;

public class Policy {
	private Integer policyId;
	private String policyNo;
	private List<Deductibles> deductibles;
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
	public List<Deductibles> getDeductibles() {
		return deductibles;
	}
	public void setDeductibles(List<Deductibles> deductibles) {
		this.deductibles = deductibles;
	}
	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policyNo=" + policyNo + ", deductibles=" + deductibles + "]";
	}
	
	
}
