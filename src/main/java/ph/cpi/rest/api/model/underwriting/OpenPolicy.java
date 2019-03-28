package ph.cpi.rest.api.model.underwriting;

public class OpenPolicy {
	private Integer policyId;
	private String policyNo;
	
	private ProjectOc projectOc;

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

	public ProjectOc getProjectOc() {
		return projectOc;
	}

	public void setProjectOc(ProjectOc projectOc) {
		this.projectOc = projectOc;
	}

	@Override
	public String toString() {
		return "OpenPolicy [policyId=" + policyId + ", policyNo=" + policyNo + ", projectOc=" + projectOc + "]";
	}

	
}
