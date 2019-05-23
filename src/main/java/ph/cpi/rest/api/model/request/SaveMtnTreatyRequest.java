package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveMtnTreatyRequest {

	private List<Treaty> saveTreaty;
	private List<Treaty> deleteTreaty;
	
	public List<Treaty> getSaveTreaty() {
		return saveTreaty;
	}
	public void setSaveTreaty(List<Treaty> saveTreaty) {
		this.saveTreaty = saveTreaty;
	}
	public List<Treaty> getDeleteTreaty() {
		return deleteTreaty;
	}
	public void setDeleteTreaty(List<Treaty> deleteTreaty) {
		this.deleteTreaty = deleteTreaty;
	}
	@Override
	public String toString() {
		return "SaveMtnTreatyRequest [saveTreaty=" + saveTreaty + ", deleteTreaty=" + deleteTreaty + "]";
	}
}

@Alias("SaveMtnTreaty")
class Treaty {
	private Integer treatyId;
	private String treatyName;
	private String treatyAbbr;
	private String treatyType;
	private String activeTag;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public Integer getTreatyId() {
		return treatyId;
	}
	public void setTreatyId(Integer treatyId) {
		this.treatyId = treatyId;
	}
	public String getTreatyName() {
		return treatyName;
	}
	public void setTreatyName(String treatyName) {
		this.treatyName = treatyName;
	}
	public String getTreatyAbbr() {
		return treatyAbbr;
	}
	public void setTreatyAbbr(String treatyAbbr) {
		this.treatyAbbr = treatyAbbr;
	}
	public String getTreatyType() {
		return treatyType;
	}
	public void setTreatyType(String treatyType) {
		this.treatyType = treatyType;
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
		return "Treaty [treatyId=" + treatyId + ", treatyName=" + treatyName + ", treatyAbbr=" + treatyAbbr
				+ ", treatyType=" + treatyType + ", activeTag=" + activeTag + ", remarks=" + remarks + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + "]";
	}
}
