package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class AdviceWordings {
	private Integer  adviceWordId;
	private String description;
	private String activeTag;
	private String wordings;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	public Integer getAdviceWordId() {
		return adviceWordId;
	}
	public void setAdviceWordId(Integer adviceWordId) {
		this.adviceWordId = adviceWordId;
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
	public String getWordings() {
		return wordings;
	}
	public void setWordings(String wordings) {
		this.wordings = wordings;
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
	@Override
	public String toString() {
		return "AdviceWordings [adviceWordId=" + adviceWordId + ", description=" + description + ", activeTag="
				+ activeTag + ", wordings=" + wordings + ", remarks=" + remarks + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
	
	
}
