package ph.cpi.rest.api.model.request;

import java.util.List;

public class SavePolAttachmentOcRequest {
	private String policyId;
	private List<SavePolAttachment> savePolAttachments;
	private List<SavePolAttachment> deletePolAttachments;
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public List<SavePolAttachment> getSavePolAttachments() {
		return savePolAttachments;
	}
	public void setSavePolAttachments(List<SavePolAttachment> savePolAttachments) {
		this.savePolAttachments = savePolAttachments;
	}
	public List<SavePolAttachment> getDeletePolAttachments() {
		return deletePolAttachments;
	}
	public void setDeletePolAttachments(List<SavePolAttachment> deletePolAttachments) {
		this.deletePolAttachments = deletePolAttachments;
	}
	@Override
	public String toString() {
		return "SavePolAttachmentOcRequest [policyId=" + policyId + ", savePolAttachments=" + savePolAttachments
				+ ", deletePolAttachments=" + deletePolAttachments + "]";
	}
	
}
