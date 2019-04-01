package ph.cpi.rest.api.model.underwriting;

import java.util.List;

public class PolicyOc {
	private Integer policyIdOc;
	private String openPolicyNo;
	private List<AttachmentOc> attachmentsOc;
	private List<EndtOc> endorsementsOc;
	
	public Integer getPolicyIdOc() {
		return policyIdOc;
	}
	public void setPolicyIdOc(Integer policyIdOc) {
		this.policyIdOc = policyIdOc;
	}
	public String getOpenPolicyNo() {
		return openPolicyNo;
	}
	public void setOpenPolicyNo(String openPolicyNo) {
		this.openPolicyNo = openPolicyNo;
	}
	public List<AttachmentOc> getAttachmentsOc() {
		return attachmentsOc;
	}
	public void setAttachmentsOc(List<AttachmentOc> attachmentsOc) {
		this.attachmentsOc = attachmentsOc;
	}
	public List<EndtOc> getEndorsementsOc() {
		return endorsementsOc;
	}
	public void setEndorsementsOc(List<EndtOc> endorsementsOc) {
		this.endorsementsOc = endorsementsOc;
	}
	
	@Override
	public String toString() {
		return "PolicyOc [policyIdOc=" + policyIdOc + ", openPolicyNo=" + openPolicyNo + ", attachmentsOc="
				+ attachmentsOc + ", endorsementsOc=" + endorsementsOc + "]";
	}
}
