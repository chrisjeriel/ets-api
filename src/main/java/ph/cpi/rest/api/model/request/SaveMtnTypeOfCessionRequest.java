package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveMtnTypeOfCessionRequest {
	 List<Cessions> saveTypeOfCession;
	 List<Cessions> deleteTypeOfCession;
	public List<Cessions> getSaveTypeOfCession() {
		return saveTypeOfCession;
	}
	public void setSaveTypeOfCession(List<Cessions> saveTypeOfCession) {
		this.saveTypeOfCession = saveTypeOfCession;
	}
	public List<Cessions> getDeleteTypeOfCession() {
		return deleteTypeOfCession;
	}
	public void setDeleteTypeOfCession(List<Cessions> deleteTypeOfCession) {
		this.deleteTypeOfCession = deleteTypeOfCession;
	}
	@Override
	public String toString() {
		return "SaveMtnTypeOfCessionRequest [saveTypeOfCession=" + saveTypeOfCession + ", deleteTypeOfCession="
				+ deleteTypeOfCession + "]";
	}
	
}

class Cessions {
	private String cessionId;
    private String cessionAbbr;
    private String description;
    private String activeTag;
    private String remarks;
    private String createUser;
    private String createDate;
    private String updateUser;
    private String updateDate;
	public String getCessionId() {
		return cessionId;
	}
	public void setCessionId(String cessionId) {
		this.cessionId = cessionId;
	}
	public String getCessionAbbr() {
		return cessionAbbr;
	}
	public void setCessionAbbr(String cessionAbbr) {
		this.cessionAbbr = cessionAbbr;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
		return "Cessions [cessionId=" + cessionId + ", cessionAbbr=" + cessionAbbr + ", description=" + description
				+ ", activeTag=" + activeTag + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
