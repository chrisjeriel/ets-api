package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class PayeeClass {
	
	private Integer payeeClassCd;
	private String payeeClassName;
	private String remarks;
	private String masterPayeeClass;
	private String slTag;
	private String slTypeCd;
	private String slTypeName;
	private String autoTag;
	private String activeTag;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private String okDelete;
	
	
	public String getSlTypeName() {
		return slTypeName;
	}
	public void setSlTypeName(String slTypeName) {
		this.slTypeName = slTypeName;
	}
	
	public String getSlTypeCd() {
		return slTypeCd;
	}
	public void setSlTypeCd(String slTypeCd) {
		this.slTypeCd = slTypeCd;
	}
	
	public Integer getPayeeClassCd() {
		return payeeClassCd;
	}
	public void setPayeeClassCd(Integer payeeClassCd) {
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
	public String getOkDelete() {
		return okDelete;
	}
	public void setOkDelete(String okDelete) {
		this.okDelete = okDelete;
	}
	
	@Override
	public String toString() {
		return "PayeeClass [payeeClassCd=" + payeeClassCd + ", payeeClassName="
				+ payeeClassName + ", remarks=" + remarks
				+ ", masterPayeeClass=" + masterPayeeClass + ", slTag=" + slTag
				+ ", slTypeCd=" + slTypeCd + ", slTypeName=" + slTypeName
				+ ", autoTag=" + autoTag + ", activeTag=" + activeTag
				+ ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate
				+ ", okDelete=" + okDelete + "]";
	}


}
