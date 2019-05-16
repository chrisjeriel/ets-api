package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveMtnSpoilageReasonRequest {
	private List<SaveSpoilageReason> saveSpoilReason;
	private List<SaveSpoilageReason> delSpoilReason;
	public List<SaveSpoilageReason> getSaveSpoilReason() {
		return saveSpoilReason;
	}
	public void setSaveSpoilReason(List<SaveSpoilageReason> saveSpoilReason) {
		this.saveSpoilReason = saveSpoilReason;
	}
	public List<SaveSpoilageReason> getDelSpoilReason() {
		return delSpoilReason;
	}
	public void setDelSpoilReason(List<SaveSpoilageReason> delSpoilReason) {
		this.delSpoilReason = delSpoilReason;
	}
	@Override
	public String toString() {
		return "SaveMtnSpoilageReasonRequest [saveSpoilReason=" + saveSpoilReason + ", delSpoilReason=" + delSpoilReason
				+ "]";
	}
	
}


class SaveSpoilageReason{
	private String spoilCd;
	private String description;
	private String remarks;
	private String activeTag;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public String getSpoilCd() {
		return spoilCd;
	}
	public void setSpoilCd(String spoilCd) {
		this.spoilCd = spoilCd;
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
		return "SaveSpoilageReason [spoilCd=" + spoilCd + ", description=" + description + ", remarks=" + remarks
				+ ", activeTag=" + activeTag + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}