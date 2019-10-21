package ph.cpi.rest.api.model.request;

import java.util.List;

import org.joda.time.DateTime;



public class SaveMtnPayeeClassRequest {
	
	private List<SavePayeeClass> saveList;
	private List<SavePayeeClass> delList;
	
	public List<SavePayeeClass> getSaveList() {
		return saveList;
	}
	public void setSaveList(List<SavePayeeClass> saveList) {
		this.saveList = saveList;
	}
	public List<SavePayeeClass> getDelList() {
		return delList;
	}
	public void setDelList(List<SavePayeeClass> delList) {
		this.delList = delList;
	}
	@Override
	public String toString() {
		return "SaveMtnPayeeClassRequest [saveList=" + saveList + ", delList="
				+ delList + "]";
	}
}

class SavePayeeClass{
	
	private String payeeClassCd;
	private String payeeClassName;
	private String remarks;
	private String masterPayeeClass;
	private String slTag;
	private String slTypeCd;
	private String autoTag;
	private String activeTag;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public String getPayeeClassCd() {
		return payeeClassCd;
	}
	public void setPayeeClassCd(String payeeClassCd) {
		this.payeeClassCd = payeeClassCd;
	}
	public String getPayeeClassName() {
		return payeeClassName;
	}
	public void setPayeeClassName(String payeeClassName) {
		this.payeeClassName = payeeClassName;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getMasterPayeeClass() {
		return masterPayeeClass;
	}
	public void setMasterPayeeClass(String masterPayeeClass) {
		this.masterPayeeClass = masterPayeeClass;
	}
	public String getSlTag() {
		return slTag;
	}
	public void setSlTag(String slTag) {
		this.slTag = slTag;
	}
	public String getSlTypeCd() {
		return slTypeCd;
	}
	public void setSlTypeCd(String slTypeCd) {
		this.slTypeCd = slTypeCd;
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
		return "SavePayeeClass [payeeClassCd=" + payeeClassCd
				+ ", payeeClassName=" + payeeClassName + ", remarks=" + remarks
				+ ", masterPayeeClass=" + masterPayeeClass + ", slTag=" + slTag
				+ ", slTypeCd=" + slTypeCd + ", autoTag=" + autoTag
				+ ", activeTag=" + activeTag + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	
}
