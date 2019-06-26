package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveMtnClaimReasonRequest {
	private List<ClmReason> saveClmReason;
	private List<ClmReason> delClmReason;
	public List<ClmReason> getSaveClmReason() {
		return saveClmReason;
	}
	public void setSaveClmReason(List<ClmReason> saveClmReason) {
		this.saveClmReason = saveClmReason;
	}
	public List<ClmReason> getDelClmReason() {
		return delClmReason;
	}
	public void setDelClmReason(List<ClmReason> delClmReason) {
		this.delClmReason = delClmReason;
	}
	@Override
	public String toString() {
		return "SaveMtnClaimReasonRequest [saveClmReason=" + saveClmReason + ", delClmReason=" + delClmReason + "]";
	}
}

@Alias("SaveMtnClaimReason")
class ClmReason{
	private String reasonCd;
	private String description;
	private String clmStatCd;
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
	public String getClmStatCd() {
		return clmStatCd;
	}
	public void setClmStatCd(String clmStatCd) {
		this.clmStatCd = clmStatCd;
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
		return "ClmReason [reasonCd=" + reasonCd + ", description=" + description + ", clmStatCd=" + clmStatCd
				+ ", activeTag=" + activeTag + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
