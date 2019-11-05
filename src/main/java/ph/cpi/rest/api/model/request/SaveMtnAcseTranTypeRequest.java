package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveMtnAcseTranTypeRequest {
	private List<acseTranType> saveTranType;
	private List<acseTranType> delTranType;
	public List<acseTranType> getSaveTranType() {
		return saveTranType;
	}
	public void setSaveTranType(List<acseTranType> saveTranType) {
		this.saveTranType = saveTranType;
	}
	public List<acseTranType> getDelTranType() {
		return delTranType;
	}
	public void setDelTranType(List<acseTranType> delTranType) {
		this.delTranType = delTranType;
	}
	@Override
	public String toString() {
		return "SaveMtnAcseTranTypeRequest [saveTranType=" + saveTranType + ", delTranType=" + delTranType + "]";
	}
	
	
}

class acseTranType{
	private String tranClass;
	private Integer tranTypeCd;
	private String typePrefix;
	private String tranTypeName;
	private String defaultParticulars;
	private String remarks;
	private String autoTag;
	private String baeTag;
	private String activeTag;
	private String groupTag;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public String getTranClass() {
		return tranClass;
	}
	public void setTranClass(String tranClass) {
		this.tranClass = tranClass;
	}
	public Integer getTranTypeCd() {
		return tranTypeCd;
	}
	public void setTranTypeCd(Integer tranTypeCd) {
		this.tranTypeCd = tranTypeCd;
	}
	public String getTypePrefix() {
		return typePrefix;
	}
	public void setTypePrefix(String typePrefix) {
		this.typePrefix = typePrefix;
	}
	public String getTranTypeName() {
		return tranTypeName;
	}
	public void setTranTypeName(String tranTypeName) {
		this.tranTypeName = tranTypeName;
	}
	public String getDefaultParticulars() {
		return defaultParticulars;
	}
	public void setDefaultParticulars(String defaultParticulars) {
		this.defaultParticulars = defaultParticulars;
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
	public String getBaeTag() {
		return baeTag;
	}
	public void setBaeTag(String baeTag) {
		this.baeTag = baeTag;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
	}
	public String getGroupTag() {
		return groupTag;
	}
	public void setGroupTag(String groupTag) {
		this.groupTag = groupTag;
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
		return "acseTranType [tranClass=" + tranClass + ", tranTypeCd=" + tranTypeCd + ", typePrefix=" + typePrefix
				+ ", tranTypeName=" + tranTypeName + ", defaultParticulars=" + defaultParticulars + ", remarks="
				+ remarks + ", autoTag=" + autoTag + ", baeTag=" + baeTag + ", activeTag=" + activeTag + ", groupTag="
				+ groupTag + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	
}