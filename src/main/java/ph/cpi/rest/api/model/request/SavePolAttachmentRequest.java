package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SavePolAttachmentRequest {
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
		return "SavePolAttachmentRequest [policyId=" + policyId + ", savePolAttachments=" + savePolAttachments
				+ ", deletePolAttachments=" + deletePolAttachments + "]";
	}
}

@Alias("SavePolAttachments")
class SavePolAttachment{
	private String fileNo;
	private String fileName;
	private String description;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public String getFileNo() {
		return fileNo;
	}
	public void setFileNo(String fileNo) {
		this.fileNo = fileNo;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	
	@Override
	public String toString() {
		return "Attachment [fileNo=" + fileNo + ", fileName=" + fileName + ", description=" + description
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}
