package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveMtnAdjusterRateRequest {
	private List<AdjRates> saveAdjusterRate;
	private List<AdjRates> deleteAdjusterRate;
	public List<AdjRates> getSaveAdjusterRate() {
		return saveAdjusterRate;
	}
	public void setSaveAdjusterRate(List<AdjRates> saveAdjusterRate) {
		this.saveAdjusterRate = saveAdjusterRate;
	}
	public List<AdjRates> getDeleteAdjusterRate() {
		return deleteAdjusterRate;
	}
	public void setDeleteAdjusterRate(List<AdjRates> deleteAdjusterRate) {
		this.deleteAdjusterRate = deleteAdjusterRate;
	}
	@Override
	public String toString() {
		return "SaveMtnAdjusterRateRequest [saveAdjusterRate=" + saveAdjusterRate + ", deleteAdjusterRate="
				+ deleteAdjusterRate + "]";
	}
}

class AdjRates {
	private String adjRateId;
	private String adjRate;
	private String effDateFrom;
	private String activeTag;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public String getAdjRateId() {
		return adjRateId;
	}
	public void setAdjRateId(String adjRateId) {
		this.adjRateId = adjRateId;
	}
	public String getAdjRate() {
		return adjRate;
	}
	public void setAdjRate(String adjRate) {
		this.adjRate = adjRate;
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
		return "AdjRates [adjRateId=" + adjRateId + ", adjRate=" + adjRate + ", effDateFrom=" + effDateFrom
				+ ", activeTag=" + activeTag + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}