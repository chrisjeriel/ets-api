package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveMtnDcbUserRequest {
	
	private List<SaveDcbUser> saveList;
	private List<SaveDcbUser> delList;
	
	public List<SaveDcbUser> getSaveList() {
		return saveList;
	}
	public void setSaveList(List<SaveDcbUser> saveList) {
		this.saveList = saveList;
	}
	public List<SaveDcbUser> getDelList() {
		return delList;
	}
	public void setDelList(List<SaveDcbUser> delList) {
		this.delList = delList;
	}
	
	@Override
	public String toString() {
		return "SaveMtnDcbUserRequest [saveList=" + saveList + ", delList="
				+ delList + "]";
	}
}

class SaveDcbUser{
	
	private String dcbUserCd;
	private String userId;
	private String printableName;
	private String validFrom;
	private String validTo;
	private String defaultArBank;
	private String defaultArBankAcct;
	private String defaultOrBank;
	private String defaultOrBankAcct;
	private String activeTag;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getDcbUserCd() {
		return dcbUserCd;
	}
	public void setDcbUserCd(String dcbUserCd) {
		this.dcbUserCd = dcbUserCd;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPrintableName() {
		return printableName;
	}
	public void setPrintableName(String printableName) {
		this.printableName = printableName;
	}
	public String getValidFrom() {
		return validFrom;
	}
	public void setValidFrom(String validFrom) {
		this.validFrom = validFrom;
	}
	public String getValidTo() {
		return validTo;
	}
	public void setValidTo(String validTo) {
		this.validTo = validTo;
	}
	public String getDefaultArBank() {
		return defaultArBank;
	}
	public void setDefaultArBank(String defaultArBank) {
		this.defaultArBank = defaultArBank;
	}
	public String getDefaultArBankAcct() {
		return defaultArBankAcct;
	}
	public void setDefaultArBankAcct(String defaultArBankAcct) {
		this.defaultArBankAcct = defaultArBankAcct;
	}
	public String getDefaultOrBank() {
		return defaultOrBank;
	}
	public void setDefaultOrBank(String defaultOrBank) {
		this.defaultOrBank = defaultOrBank;
	}
	public String getDefaultOrBankAcct() {
		return defaultOrBankAcct;
	}
	public void setDefaultOrBankAcct(String defaultOrBankAcct) {
		this.defaultOrBankAcct = defaultOrBankAcct;
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
		return "SaveDcbUser [dcbUserCd=" + dcbUserCd + ", userId=" + userId
				+ ", printableName=" + printableName + ", validFrom="
				+ validFrom + ", validTo=" + validTo + ", defaultArBank="
				+ defaultArBank + ", defaultArBankAcct=" + defaultArBankAcct
				+ ", defaultOrBank=" + defaultOrBank + ", defaultOrBankAcct="
				+ defaultOrBankAcct + ", activeTag=" + activeTag + ", remarks="
				+ remarks + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + "]";
	}
}
