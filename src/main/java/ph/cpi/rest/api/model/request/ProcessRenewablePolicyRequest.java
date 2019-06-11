package ph.cpi.rest.api.model.request;

import java.util.List;

import ph.cpi.rest.api.model.underwriting.PolicyAsIs;
import ph.cpi.rest.api.model.underwriting.PolicyNonRenewal;
import ph.cpi.rest.api.model.underwriting.PolicyWithChanges;

public class ProcessRenewablePolicyRequest {

	private List<PolicyAsIs> renAsIsPolicyList;
	private List<PolicyWithChanges> renWithChangesPolicyList;
	private List<PolicyNonRenewal> nonRenPolicyList;
	
	public List<PolicyAsIs> getRenAsIsPolicyList() {
		return renAsIsPolicyList;
	}
	public void setRenAsIsPolicyList(List<PolicyAsIs> renAsIsPolicyList) {
		this.renAsIsPolicyList = renAsIsPolicyList;
	}
	public List<PolicyWithChanges> getRenWithChangesPolicyList() {
		return renWithChangesPolicyList;
	}
	public void setRenWithChangesPolicyList(List<PolicyWithChanges> renWithChangesPolicyList) {
		this.renWithChangesPolicyList = renWithChangesPolicyList;
	}
	public List<PolicyNonRenewal> getNonRenPolicyList() {
		return nonRenPolicyList;
	}
	public void setNonRenPolicyList(List<PolicyNonRenewal> nonRenPolicyList) {
		this.nonRenPolicyList = nonRenPolicyList;
	}
	@Override
	public String toString() {
		return "ProcessRenewablePolicyRequest [renAsIsPolicyList=" + renAsIsPolicyList + ", renWithChangesPolicyList="
				+ renWithChangesPolicyList + ", nonRenPolicyList=" + nonRenPolicyList + "]";
	}
}

class PolicyAsIs {
	
	private String policyId;
	private String summaryTag;
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getSummaryTag() {
		return summaryTag;
	}
	public void setSummaryTag(String summaryTag) {
		this.summaryTag = summaryTag;
	}
	@Override
	public String toString() {
		return "PolicyAsIs [policyId=" + policyId + ", summaryTag=" + summaryTag + "]";
	}
	
	
}

class PolicyWithChanges {
	private String policyId;
	private List<ExpProject> projectList;
	private List<ExpSectionCover> secCovList;
	private List<ExpDeductibles> deductiblesList;
	private String summaryTag;
	private String processBy;
	
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
	
	public String getProcessBy() {
		return processBy;
	}
	public void setProcessBy(String processBy) {
		this.processBy = processBy;
	}
	@Override
	public String toString() {
		return "PolicyWithChanges [policyId=" + policyId + ", projectList=" + projectList + ", secCovList=" + secCovList
				+ ", deductiblesList=" + deductiblesList + ", summaryTag=" + summaryTag + ", processBy=" + processBy
				+ "]";
	}
}
