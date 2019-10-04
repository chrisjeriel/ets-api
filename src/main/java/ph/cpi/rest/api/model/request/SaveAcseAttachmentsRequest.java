package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveAcseAttachmentsRequest {
	private List<acseAttachments> saveAttachmentsList;
	private List<acseAttachments> delAttachmentsList;
	
	public List<acseAttachments> getSaveAttachmentsList() {
		return saveAttachmentsList;
	}
	public void setSaveAttachmentsList(List<acseAttachments> saveAttachmentsList) {
		this.saveAttachmentsList = saveAttachmentsList;
	}
	public List<acseAttachments> getDelAttachmentsList() {
		return delAttachmentsList;
	}
	public void setDelAttachmentsList(List<acseAttachments> delAttachmentsList) {
		this.delAttachmentsList = delAttachmentsList;
	}
	@Override
	public String toString() {
		return "SaveAcseAttachmentsRequest [saveAttachmentsList=" + saveAttachmentsList + ", delAttachmentsList="
				+ delAttachmentsList + "]";
	}
	
}

@Alias ("ACSEattachment")
class acseAttachments {
	private String tranId;
	private String fileNo;
	private String fileName;
	private String description;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public String getTranId() {
		return tranId;
	}
	public void setTranId(String tranId) {
		this.tranId = tranId;
	}
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
		return "acseAttachments [tranId=" + tranId + ", fileNo=" + fileNo + ", fileName=" + fileName + ", description="
				+ description + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}
	
}
