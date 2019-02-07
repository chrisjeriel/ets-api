package ph.cpi.rest.api.model.request;

import java.io.Serializable;
import java.util.List;

public class SaveQuoteAttachmentRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1839816883024234079L;
	private Integer quoteId;
	private List<Attachment> attachmentsList;
	
	public SaveQuoteAttachmentRequest() {
	}

	public Integer getQuoteId() {
		return quoteId;
	}
	
	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}

	public List<Attachment> getAttachmentsList() {
		return attachmentsList;
	}

	public void setAttachmentsList(List<Attachment> attachmentsList) {
		this.attachmentsList = attachmentsList;
	}

	@Override
	public String toString() {
		return "SaveQuoteAttachmentRequest [quoteId=" + quoteId + ", attachmentsList=" + attachmentsList + "]";
	}

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
	
}


