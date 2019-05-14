package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveMtnQuoteReasonRequest {
	private List<SaveQuoteReason> saveQuReason;
	private List<SaveQuoteReason> delQuReason;
	public List<SaveQuoteReason> getSaveQuReason() {
		return saveQuReason;
	}
	public void setSaveQuReason(List<SaveQuoteReason> saveQuReason) {
		this.saveQuReason = saveQuReason;
	}
	public List<SaveQuoteReason> getDelQuReason() {
		return delQuReason;
	}
	public void setDelQuReason(List<SaveQuoteReason> delQuReason) {
		this.delQuReason = delQuReason;
	}
	@Override
	public String toString() {
		return "SaveMtnQuoteReasonRequest [saveQuReason=" + saveQuReason + ", delQuReason=" + delQuReason + "]";
	}
	
}


class SaveQuoteReason{
	private String reasonCd;
	private String description;
	private String remarks;
	private String activeTag;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public String getReasonCd() {
		return reasonCd;
	}
	public void setReasonCd(String reasonCd) {
		this.reasonCd = reasonCd;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
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
		return "SaveQuoteReason [reasonCd=" + reasonCd + ", description=" + description + ", remarks=" + remarks
				+ ", activeTag=" + activeTag + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}