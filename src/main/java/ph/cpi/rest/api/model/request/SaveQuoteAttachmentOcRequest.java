package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveQuoteAttachmentOcRequest {
	private Integer quoteIdOc;
	private List<AttachmentOc> saveAttachmentsOcList;
	private List<AttachmentOc> deleteAttachmentsOcList;
	
	public List<AttachmentOc> getSaveAttachmentsOcList() {
		return saveAttachmentsOcList;
	}

	public void setSaveAttachmentsOcList(List<AttachmentOc> saveAttachmentsOcList) {
		this.saveAttachmentsOcList = saveAttachmentsOcList;
	}

	public List<AttachmentOc> getDeleteAttachmentsOcList() {
		return deleteAttachmentsOcList;
	}

	public void setDeleteAttachmentsOcList(List<AttachmentOc> deleteAttachmentsOcList) {
		this.deleteAttachmentsOcList = deleteAttachmentsOcList;
	}

	public Integer getQuoteIdOc() {
		return quoteIdOc;
	}

	public void setQuoteId(Integer quoteIdOc) {
		this.quoteIdOc = quoteIdOc;
	}

	@Override
	public String toString() {
		return "SaveQuoteAttachmentOcRequest [quoteIdOc=" + quoteIdOc + ", saveAttachmentsOcList=" + saveAttachmentsOcList + ", deleteAttachmentsOcList=" + deleteAttachmentsOcList + "]";
	}
}

@Alias("SaveQuoteAttachmentOc")
class AttachmentOc {
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
		return "AttachmentOc [fileNo=" + fileNo + ", fileName=" + fileName + ", description=" + description
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	
}
