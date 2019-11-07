package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class BankLov {
	private Integer bankCd;
	private String shortName;
	private String officialName;
	private String remarks;
	private String activeTag;
	private String currCd;
	private String acitGlDepNo;
	private String acseGlDepNo;
	private String dcbTag;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	public Integer getBankCd() {
		return bankCd;
	}
	public void setBankCd(Integer bankCd) {
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
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
	}
	public String getAcitGlDepNo() {
		return acitGlDepNo;
	}
	public void setAcitGlDepNo(String acitGlDepNo) {
		this.acitGlDepNo = acitGlDepNo;
	}
	public String getAcseGlDepNo() {
		return acseGlDepNo;
	}
	public void setAcseGlDepNo(String acseGlDepNo) {
		this.acseGlDepNo = acseGlDepNo;
	}
	public String getDcbTag() {
		return dcbTag;
	}
	public void setDcbTag(String dcbTag) {
		this.dcbTag = dcbTag;
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
		return "BankLov [bankCd=" + bankCd + ", shortName=" + shortName + ", officialName=" + officialName
				+ ", remarks=" + remarks + ", activeTag=" + activeTag + ", currCd=" + currCd + ", acitGlDepNo="
				+ acitGlDepNo + ", acseGlDepNo=" + acseGlDepNo + ", dcbTag=" + dcbTag + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
