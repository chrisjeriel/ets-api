package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveMtnNonRenewalReasonRequest {
	private List<NonRenewalReason> saveNonRenewalReasonList;
	private List<NonRenewalReason> delNonRenewalReasonList;
	
	public List<NonRenewalReason> getSaveNonRenewalReasonList() {
		return saveNonRenewalReasonList;
	}
	public void setSaveNonRenewalReasonList(List<NonRenewalReason> saveNonRenewalReasonList) {
		this.saveNonRenewalReasonList = saveNonRenewalReasonList;
	}
	public List<NonRenewalReason> getDelNonRenewalReasonList() {
		return delNonRenewalReasonList;
	}
	public void setDelNonRenewalReasonList(List<NonRenewalReason> delNonRenewalReasonList) {
		this.delNonRenewalReasonList = delNonRenewalReasonList;
	}
	
	@Override
	public String toString() {
		return "SaveMtnNonRenewalReasonRequest [saveNonRenewalReasonList=" + saveNonRenewalReasonList
				+ ", delNonRenewalReasonList=" + delNonRenewalReasonList + "]";
	}
}

@Alias("SaveNonRenewalReason")
class NonRenewalReason{
	private String reasonCd;
	private String description;
	private String activeTag;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public String getReasonCd() {
		return reasonCd;
	}
	public void setReasonCd(String reasonCd) {
		this.reasonCd = reasonCd;
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
		return "NonRenewalReason [reasonCd=" + reasonCd + ", description=" + description + ", activeTag=" + activeTag
				+ ", remarks=" + remarks + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}
}