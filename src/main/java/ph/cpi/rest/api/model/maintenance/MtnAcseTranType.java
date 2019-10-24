package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class MtnAcseTranType {
	private String tranClass;
	private String tranName;
	private Integer tranTypeCd;
	private String typePrefix;
	private String tranTypeName;
	private String defaultParticulars;
	private Integer masterTranType;
	private String remarks;
	private String autoTag;
	private String baeTag;
	private String activeTag;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private String groupTag;
	private String okDelete;
	public String getTranClass() {
		return tranClass;
	}
	public void setTranClass(String tranClass) {
		this.tranClass = tranClass;
	}
	
	public String getTranName() {
		return tranName;
	}
	public void setTranName(String tranName) {
		this.tranName = tranName;
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
	public Integer getMasterTranType() {
		return masterTranType;
	}
	public void setMasterTranType(Integer masterTranType) {
		this.masterTranType = masterTranType;
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
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public DateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(DateTime createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public DateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(DateTime updateDate) {
		this.updateDate = updateDate;
	}
	public String getGroupTag() {
		return groupTag;
	}
	public void setGroupTag(String groupTag) {
		this.groupTag = groupTag;
	}
	
	public String getOkDelete() {
		return okDelete;
	}
	public void setOkDelete(String okDelete) {
		this.okDelete = okDelete;
	}
	@Override
	public String toString() {
		return "MtnAcseTranType [tranClass=" + tranClass + ", tranName=" + tranName + ", tranTypeCd=" + tranTypeCd
				+ ", typePrefix=" + typePrefix + ", tranTypeName=" + tranTypeName + ", defaultParticulars="
				+ defaultParticulars + ", masterTranType=" + masterTranType + ", remarks=" + remarks + ", autoTag="
				+ autoTag + ", baeTag=" + baeTag + ", activeTag=" + activeTag + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate
				+ ", groupTag=" + groupTag + ", okDelete=" + okDelete + "]";
	}
	
}
