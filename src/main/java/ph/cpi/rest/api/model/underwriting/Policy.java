package ph.cpi.rest.api.model.underwriting;

import java.util.List;

import ph.cpi.rest.api.model.quote.Project;

public class Policy {
	private Integer policyId;
	private String policyNo;
	private List<Deductibles> deductibles;
	private Project project;
	
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
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}
	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policyNo=" + policyNo + ", deductibles=" + deductibles + ", project="
				+ project + "]";
	}
	
}
