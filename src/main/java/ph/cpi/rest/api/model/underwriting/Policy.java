package ph.cpi.rest.api.model.underwriting;

import java.util.List;

import ph.cpi.rest.api.model.quote.Project;

public class Policy {
	private Integer policyId;
	private String policyNo;
	private List<Deductibles> deductibles;
	private Project project;
	private List<Endorsements> endorsements;
	private List<Attachment> attachments;
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
	public List<Endorsements> getEndorsements() {
		return endorsements;
	}
	public void setEndorsements(List<Endorsements> endorsements) {
		this.endorsements = endorsements;
	}
	public List<Attachment> getAttachments() {
		return attachments;
	}
	public void setAttachments(List<Attachment> attachments) {
		this.attachments = attachments;
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
		return "Policy [policyId=" + policyId + ", policyNo=" + policyNo + ", deductibles=" + deductibles + ", project="
				+ project + ", endorsements=" + endorsements + ", attachments=" + attachments + ", inwPolBalance="
				+ inwPolBalance + ", coInsurance=" + coInsurance + "]";
	}
}
