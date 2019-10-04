package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class BussType {
	private Integer bussTypeCd;
	private String bussTypeName;
	private String description;
	private String activeTag;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private String okDelete;
	
	public String getOkDelete() {
		return okDelete;
	}
	public void setOkDelete(String okDelete) {
		this.okDelete = okDelete;
	}
	public Integer getBussTypeCd() {
		return bussTypeCd;
	}
	public void setBussTypeCd(Integer bussTypeCd) {
		this.bussTypeCd = bussTypeCd;
	}
	public String getBussTypeName() {
		return bussTypeName;
	}
	public void setBussTypeName(String bussTypeName) {
		this.bussTypeName = bussTypeName;
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
		return "BussType [bussTypeCd=" + bussTypeCd + ", bussTypeName="
				+ bussTypeName + ", description=" + description
				+ ", activeTag=" + activeTag + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", okDelete=" + okDelete + "]";
	}
	
}
