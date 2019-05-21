package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

public class Cession {

	private Integer cessionId;
	private String cessionAbbr;
	private String description;
	private String activeTag ;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private String okDelete;
	public Integer getCessionId() {
		return cessionId;
	}
	public void setCessionId(Integer cessionId) {
		this.cessionId = cessionId;
	}
	public String getCessionAbbr() {
		return cessionAbbr;
	}
	public void setCessionAbbr(String cessionAbbr) {
		this.cessionAbbr = cessionAbbr;
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
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
		return "Cession [cessionId=" + cessionId + ", cessionAbbr=" + cessionAbbr + ", description=" + description
				+ ", activeTag=" + activeTag + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", okDelete=" + okDelete
				+ "]";
	}
	
}
