package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveMtnSLTypeRequest {

	private List<SaveSLType> saveList;
	private List<SaveSLType> delList;
	
	public List<SaveSLType> getSaveList() {
		return saveList;
	}
	public void setSaveList(List<SaveSLType> saveList) {
		this.saveList = saveList;
	}
	public List<SaveSLType> getDelList() {
		return delList;
	}
	public void setDelList(List<SaveSLType> delList) {
		this.delList = delList;
	}
	
	@Override
	public String toString() {
		return "SaveMtnSLTypeRequest [saveList=" + saveList + ", delList="
				+ delList + "]";
	}
	
}

class SaveSLType{

	private String slTypeCd;
	private String slTypeName;
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
	public String getSlTypeName() {
		return slTypeName;
	}
	public void setSlTypeName(String slTypeName) {
		this.slTypeName = slTypeName;
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
		return "SaveSLType [slTypeCd=" + slTypeCd + ", slTypeName="
				+ slTypeName + ", remarks=" + remarks + ", autoTag=" + autoTag
				+ ", activeTag=" + activeTag + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}
