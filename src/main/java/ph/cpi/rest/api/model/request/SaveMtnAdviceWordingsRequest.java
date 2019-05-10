package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveMtnAdviceWordingsRequest {
	private List<AdvWordings> saveAdvWordList;
	private List<AdvWordings> deleteAdvWordList;
	
	public List<AdvWordings> getSaveAdvWordList() {
		return saveAdvWordList;
	}
	public void setSaveAdvWordList(List<AdvWordings> saveAdvWordList) {
		this.saveAdvWordList = saveAdvWordList;
	}
	public List<AdvWordings> getDeleteAdvWordList() {
		return deleteAdvWordList;
	}
	public void setDeleteAdvWordList(List<AdvWordings> deleteAdvWordList) {
		this.deleteAdvWordList = deleteAdvWordList;
	}
	
	@Override
	public String toString() {
		return "SaveMtnAdviceWordingsRequest [saveAdvWordList=" + saveAdvWordList + ", deleteAdvWordList="
				+ deleteAdvWordList + "]";
	}
}

@Alias("MtnAdvWord")
class AdvWordings{
	private String adviceWordId;
	private String description;
	private String activeTag;
	private String wordings;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public String getAdviceWordId() {
		return adviceWordId;
	}
	public void setAdviceWordId(String adviceWordId) {
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
		return "SaveMtnAdviceWordingsRequest [adviceWordId=" + adviceWordId + ", description=" + description
				+ ", activeTag=" + activeTag + ", wordings=" + wordings + ", remarks=" + remarks + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + "]";
	}
}
