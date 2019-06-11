package ph.cpi.rest.api.model.underwriting;

import java.util.List;

public class PolicyWithChanges {
	private String policyId;
	private List<ExpProject> projectList;
	private List<ExpSectionCover> secCovList;
	private List<ExpDeductibles> deductiblesList;
	private String summaryTag;
	
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public List<ExpProject> getProjectList() {
		return projectList;
	}
	public void setProjectList(List<ExpProject> projectList) {
		this.projectList = projectList;
	}
	public List<ExpSectionCover> getSecCovList() {
		return secCovList;
	}
	public void setSecCovList(List<ExpSectionCover> secCovList) {
		this.secCovList = secCovList;
	}
	public List<ExpDeductibles> getDeductiblesList() {
		return deductiblesList;
	}
	public void setDeductiblesList(List<ExpDeductibles> deductiblesList) {
		this.deductiblesList = deductiblesList;
	}
	public String getSummaryTag() {
		return summaryTag;
	}
	public void setSummaryTag(String summaryTag) {
		this.summaryTag = summaryTag;
	}
	@Override
	public String toString() {
		return "PolicyWithChanges [policyId=" + policyId + ", projectList=" + projectList + ", secCovList=" + secCovList
				+ ", deductiblesList=" + deductiblesList + ", summaryTag=" + summaryTag + "]";
	}
}