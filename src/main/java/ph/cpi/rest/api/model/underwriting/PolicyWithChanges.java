package ph.cpi.rest.api.model.underwriting;

import java.util.List;

public class PolicyWithChanges {
	private String policyId;
	private String newPolicyId;
	private String newPolicyNo;
	private List<ExpProject> projectList;
	private List<ExpSectionCover> secCovList;
	private List<ExpDeductibles> deductiblesList;
	private String summaryTag;
	private String procBy;
	private String remarks;
	private String renewalFlag;
	
	
	public String getNewPolicyId() {
		return newPolicyId;
	}
	public void setNewPolicyId(String newPolicyId) {
		this.newPolicyId = newPolicyId;
	}
	public String getNewPolicyNo() {
		return newPolicyNo;
	}
	public void setNewPolicyNo(String newPolicyNo) {
		this.newPolicyNo = newPolicyNo;
	}
	public String getProcBy() {
		return procBy;
	}
	public void setProcBy(String procBy) {
		this.procBy = procBy;
	}
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
	
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getRenewalFlag() {
		return renewalFlag;
	}
	public void setRenewalFlag(String renewalFlag) {
		this.renewalFlag = renewalFlag;
	}
	@Override
	public String toString() {
		return "PolicyWithChanges [policyId=" + policyId + ", newPolicyId=" + newPolicyId + ", newPolicyNo="
				+ newPolicyNo + ", projectList=" + projectList + ", secCovList=" + secCovList + ", deductiblesList="
				+ deductiblesList + ", summaryTag=" + summaryTag + ", procBy=" + procBy + ", remarks=" + remarks
				+ ", renewalFlag=" + renewalFlag + "]";
	}
}