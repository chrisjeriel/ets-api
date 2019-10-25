package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveMtnAcitTranTypeRequest {
	private List<tranType> saveTranType;
	private List<tranType> delTranType;
	public List<tranType> getSaveTranType() {
		return saveTranType;
	}
	public void setSaveTranType(List<tranType> saveTranType) {
		this.saveTranType = saveTranType;
	}
	public List<tranType> getDelTranType() {
		return delTranType;
	}
	public void setDelTranType(List<tranType> delTranType) {
		this.delTranType = delTranType;
	}
	@Override
	public String toString() {
		return "SaveMtnAcitTranTypeRequest [saveTranType=" + saveTranType + ", delTranType=" + delTranType + "]";
	}
	
}

@Alias("acitTranType")
class tranType{
	private String tranClass;
	private String tranTypeCd;
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
	public String getTranTypeCd() {
		return tranTypeCd;
	}
	public void setTranTypeCd(String tranTypeCd) {
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
		return "tranType [tranClass=" + tranClass + ", tranTypeCd=" + tranTypeCd + ", typePrefix=" + typePrefix
				+ ", tranTypeName=" + tranTypeName + ", defaultParticulars=" + defaultParticulars + ", remarks="
				+ remarks + ", autoTag=" + autoTag + ", baeTag=" + baeTag + ", activeTag=" + activeTag + ", groupTag="
				+ groupTag + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	
}