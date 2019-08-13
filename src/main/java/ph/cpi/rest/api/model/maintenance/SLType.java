package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class SLType {
	private Integer slTypeCd;
	private String slTypeName;
	private String remarks;
	private String autoTag;
	private String activeTag;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	public Integer getSlTypeCd() {
		return slTypeCd;
	}
	public void setSlTypeCd(Integer slTypeCd) {
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
	@Override
	public String toString() {
		return "SLType [slTypeCd=" + slTypeCd + ", slTypeName=" + slTypeName + ", remarks=" + remarks + ", autoTag="
				+ autoTag + ", activeTag=" + activeTag + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}
