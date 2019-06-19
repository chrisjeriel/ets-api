package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveMtnRoundingErrorRequest {
	private List<MtnRoundingError> delRoundingError;
	private List<MtnRoundingError> saveRoundingError;
	public List<MtnRoundingError> getDelRoundingError() {
		return delRoundingError;
	}
	public void setDelRoundingError(List<MtnRoundingError> delRoundingError) {
		this.delRoundingError = delRoundingError;
	}
	public List<MtnRoundingError> getSaveRoundingError() {
		return saveRoundingError;
	}
	public void setSaveRoundingError(List<MtnRoundingError> saveRoundingError) {
		this.saveRoundingError = saveRoundingError;
	}
	@Override
	public String toString() {
		return "SaveMtnRoundingErrorRequest [delRoundingError=" + delRoundingError + ", saveRoundingError="
				+ saveRoundingError + "]";
	}
}

@Alias ("MtnRoundingError")
class MtnRoundingError{
	private String companyId;
	private String effDateFrom;
	private String activeTag;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public String getCompanyId() {
		return companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}
	public String getEffDateFrom() {
		return effDateFrom;
	}
	public void setEffDateFrom(String effDateFrom) {
		this.effDateFrom = effDateFrom;
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
		return "MtnRoundingError [companyId=" + companyId + ", effDateFrom=" + effDateFrom + ", activeTag=" + activeTag + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}

}