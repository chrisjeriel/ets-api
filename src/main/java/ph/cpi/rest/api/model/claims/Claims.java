package ph.cpi.rest.api.model.claims;

import java.util.List;

import ph.cpi.rest.api.model.claims.Attachment;

public class Claims {
	
	private Integer claimId;	
	private String claimNo;
	private List<Attachment> attachments;

	public Integer getClaimId() {
		return claimId;
	}

	public void setClaimId(Integer claimId) {
		this.claimId = claimId;
	}

	public String getClaimNo() {
		return claimNo;
	}

	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}
	public List<Attachment> getAttachments() {
		return attachments;
	}

	public void setAttachments(List<Attachment> attachments) {
		this.attachments = attachments;
	}
	
	@Override
	public String toString() {
		return "Claims [claimId=" + claimId + ", claimNo=" + claimNo + ", attachments=" + attachments + "]";
	}

	
}
