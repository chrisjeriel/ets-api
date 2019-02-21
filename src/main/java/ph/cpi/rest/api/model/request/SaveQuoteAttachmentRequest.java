package ph.cpi.rest.api.model.request;


import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveQuoteAttachmentRequest {

	private Integer quoteId;
	private List<Attachment> saveAttachmentsList;
	private List<Attachment> deleteAttachmentsList;
	public Integer getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}
	public List<Attachment> getSaveAttachmentsList() {
		return saveAttachmentsList;
	}
	public void setSaveAttachmentsList(List<Attachment> saveAttachmentsList) {
		this.saveAttachmentsList = saveAttachmentsList;
	}
	public List<Attachment> getDeleteAttachmentsList() {
		return deleteAttachmentsList;
	}
	public void setDeleteAttachmentsList(List<Attachment> deleteAttachmentsList) {
		this.deleteAttachmentsList = deleteAttachmentsList;
	}
	@Override
	public String toString() {
		return "SaveQuoteAttachmentRequest [quoteId=" + quoteId + ", saveAttachmentsList=" + saveAttachmentsList
				+ ", deleteAttachmentsList=" + deleteAttachmentsList + "]";
	}
}

@Alias("SaveQuoteAttachment")
class Attachment {
	private Integer fileNo ;
	private String fileName;
	private String description;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public Integer getFileNo() {
		return fileNo;
	}
	public void setFileNo(Integer fileNo) {
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
