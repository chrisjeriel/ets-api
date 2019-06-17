package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveClaimsAttachmentRequest {
	
	private String claimId;
	private List<SaveClaimsAttachment> saveClaimsAttachments;
	private List<SaveClaimsAttachment> deleteClaimsAttachments;
	
	public String getClaimId() {
		return claimId;
	}
	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}
	public List<SaveClaimsAttachment> getSaveClaimsAttachments() {
		return saveClaimsAttachments;
	}
	public void setSaveClaimsAttachments(List<SaveClaimsAttachment> saveClaimsAttachments) {
		this.saveClaimsAttachments = saveClaimsAttachments;
	}
	public List<SaveClaimsAttachment> getDeleteClaimsAttachments() {
		return deleteClaimsAttachments;
	}
	public void setDeleteClaimsAttachments(List<SaveClaimsAttachment> deleteClaimsAttachments) {
		this.deleteClaimsAttachments = deleteClaimsAttachments;
	}
	
	@Override
	public String toString() {
		return "SaveClaimsAttachmentRequest [claimId=" + claimId + ", saveClaimsAttachments=" + saveClaimsAttachments
				+ ", deleteClaimsAttachments=" + deleteClaimsAttachments + "]";
	}
	
}

@Alias("SaveClaimsAttachments")
class SaveClaimsAttachment{
	
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
		return "SaveClaimsAttachment [fileNo=" + fileNo + ", fileName=" + fileName + ", description=" + description
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}

}
