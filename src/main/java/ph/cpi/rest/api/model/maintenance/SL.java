package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class SL {
	private Integer slTypeCd;
	private String slTypeName;
	private Integer slCd;
	private String slName;
	private Integer payeeNo;
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
	public Integer getSlCd() {
		return slCd;
	}
	public void setSlCd(Integer slCd) {
		this.slCd = slCd;
	}
	public String getSlName() {
		return slName;
	}
	public void setSlName(String slName) {
		this.slName = slName;
	}
	public Integer getPayeeNo() {
		return payeeNo;
	}
	public void setPayeeNo(Integer payeeNo) {
		this.payeeNo = payeeNo;
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
		return "SL [slTypeCd=" + slTypeCd + ", slTypeName=" + slTypeName + ", slCd=" + slCd + ", slName=" + slName
				+ ", payeeNo=" + payeeNo + ", remarks=" + remarks + ", autoTag=" + autoTag + ", activeTag=" + activeTag
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}
