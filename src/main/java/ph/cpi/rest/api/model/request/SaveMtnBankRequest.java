package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveMtnBankRequest {
	private List<SaveMtnBank> saveList;
	private List<SaveMtnBank> delList;
	public List<SaveMtnBank> getSaveList() {
		return saveList;
	}
	public void setSaveList(List<SaveMtnBank> saveList) {
		this.saveList = saveList;
	}
	public List<SaveMtnBank> getDelList() {
		return delList;
	}
	public void setDelList(List<SaveMtnBank> delList) {
		this.delList = delList;
	}
	@Override
	public String toString() {
		return "SaveMtnBankRequest [saveList=" + saveList + ", delList=" + delList + "]";
	}
	
}

class SaveMtnBank{
	private String bankCd;
	private String shortName;
	private String officialName;
	private String remarks;
	private String activeTag;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public String getBankCd() {
		return bankCd;
	}
	public void setBankCd(String bankCd) {
		this.bankCd = bankCd;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getOfficialName() {
		return officialName;
	}
	public void setOfficialName(String officialName) {
		this.officialName = officialName;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
		return "SaveMtnBank [bankCd=" + bankCd + ", shortName=" + shortName + ", officialName=" + officialName
				+ ", remarks=" + remarks + ", activeTag=" + activeTag + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
	
}