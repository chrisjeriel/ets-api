package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class AcseWhTaxHistory {
	private Integer whtaxId;
	private Integer histNo;
	private String taxCd;
	private String taxName;
	private String taxType;
	private String rate;
	private String defaultAcitGl;
	private String defaultAcseGl;
	private String creditableTag;
	private String fixedTag;
	private String activeTag;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	public Integer getWhtaxId() {
		return whtaxId;
	}
	public void setWhtaxId(Integer whtaxId) {
		this.whtaxId = whtaxId;
	}
	public Integer getHistNo() {
		return histNo;
	}
	public void setHistNo(Integer histNo) {
		this.histNo = histNo;
	}
	public String getTaxCd() {
		return taxCd;
	}
	public void setTaxCd(String taxCd) {
		this.taxCd = taxCd;
	}
	public String getTaxName() {
		return taxName;
	}
	public void setTaxName(String taxName) {
		this.taxName = taxName;
	}
	public String getTaxType() {
		return taxType;
	}
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getDefaultAcitGl() {
		return defaultAcitGl;
	}
	public void setDefaultAcitGl(String defaultAcitGl) {
		this.defaultAcitGl = defaultAcitGl;
	}
	public String getDefaultAcseGl() {
		return defaultAcseGl;
	}
	public void setDefaultAcseGl(String defaultAcseGl) {
		this.defaultAcseGl = defaultAcseGl;
	}
	public String getCreditableTag() {
		return creditableTag;
	}
	public void setCreditableTag(String creditableTag) {
		this.creditableTag = creditableTag;
	}
	public String getFixedTag() {
		return fixedTag;
	}
	public void setFixedTag(String fixedTag) {
		this.fixedTag = fixedTag;
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
		return "AcseWhTaxHistory [whtaxId=" + whtaxId + ", histNo=" + histNo + ", taxCd=" + taxCd + ", taxName="
				+ taxName + ", taxType=" + taxType + ", rate=" + rate + ", defaultAcitGl=" + defaultAcitGl
				+ ", defaultAcseGl=" + defaultAcseGl + ", creditableTag=" + creditableTag + ", fixedTag=" + fixedTag
				+ ", activeTag=" + activeTag + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
