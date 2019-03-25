package ph.cpi.rest.api.model.underwriting;

import java.util.List;

public class Policy {
	
	private Integer policyId;
	private String policyNo;
	private List<Endorsements> endorsements;
	private List<Attachment> attachments;
	
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
	
	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policyNo=" + policyNo + ", endorsements=" + endorsements
				+ ", attachments=" + attachments + "]";
	}
	
}
