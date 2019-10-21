package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveMtnSLRequest {
	
	private List<SaveSL> saveList;
	private List<SaveSL> delList;
	
	public List<SaveSL> getSaveList() {
		return saveList;
	}
	public void setSaveList(List<SaveSL> saveList) {
		this.saveList = saveList;
	}
	public List<SaveSL> getDelList() {
		return delList;
	}
	public void setDelList(List<SaveSL> delList) {
		this.delList = delList;
	}
	
	@Override
	public String toString() {
		return "SaveMtnSLRequest [saveList=" + saveList + ", delList="
				+ delList + "]";
	}
}

class SaveSL{

	private String slTypeCd;
	private String slCd;
	private String slName;
	private String remarks;
	private String autoTag;
	private String activeTag;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public String getSlTypeCd() {
		return slTypeCd;
	}
	public void setSlTypeCd(String slTypeCd) {
		this.slTypeCd = slTypeCd;
	}
	public String getSlCd() {
		return slCd;
	}
	public void setSlCd(String slCd) {
		this.slCd = slCd;
	}
	public String getSlName() {
		return slName;
	}
	public void setSlName(String slName) {
		this.slName = slName;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getAutoTag() {
		return autoTag;
	}
	public void setAutoTag(String autoTag) {
		this.autoTag = autoTag;
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
		return "SaveSL [slTypeCd=" + slTypeCd + ", slCd=" + slCd + ", slName="
				+ slName + ", remarks=" + remarks + ", autoTag=" + autoTag
				+ ", activeTag=" + activeTag + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}