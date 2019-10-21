package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveMtnGenTaxRequest {
	
	private List<SaveMtnGenTax> saveList;
	private List<SaveMtnGenTax> delList;
	
	public List<SaveMtnGenTax> getSaveList() {
		return saveList;
	}
	public void setSaveList(List<SaveMtnGenTax> saveList) {
		this.saveList = saveList;
	}
	public List<SaveMtnGenTax> getDelList() {
		return delList;
	}
	public void setDelList(List<SaveMtnGenTax> delList) {
		this.delList = delList;
	}
	
	@Override
	public String toString() {
		return "SaveMtnGenTaxRequest [saveList=" + saveList + ", delList="
				+ delList + "]";
	}
}

class SaveMtnGenTax {
	private String taxId;
	private String taxCd;
	private String taxName;
	private String chargeType;
	private String taxRate;
	private String amount;
	private String glAcctId;
	private String fixedTag;
	private String activeTag;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public String getTaxId() {
		return taxId;
	}
	public void setTaxId(String taxId) {
		this.taxId = taxId;
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
	public String getChargeType() {
		return chargeType;
	}
	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}
	public String getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(String taxRate) {
		this.taxRate = taxRate;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getGlAcctId() {
		return glAcctId;
	}
	public void setGlAcctId(String glAcctId) {
		this.glAcctId = glAcctId;
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
		return "SaveMtnGenTax [taxId=" + taxId + ", taxCd=" + taxCd
				+ ", taxName=" + taxName + ", chargeType=" + chargeType
				+ ", taxRate=" + taxRate + ", amount=" + amount + ", glAcctId="
				+ glAcctId + ", fixedTag=" + fixedTag + ", activeTag="
				+ activeTag + ", remarks=" + remarks + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}
}