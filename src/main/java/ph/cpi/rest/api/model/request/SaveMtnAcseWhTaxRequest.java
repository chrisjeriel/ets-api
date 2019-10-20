package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveMtnAcseWhTaxRequest {
	private List<whTax> saveWhTax;
	private List<whTax> delWhTax;
	public List<whTax> getSaveWhTax() {
		return saveWhTax;
	}
	public void setSaveWhTax(List<whTax> saveWhTax) {
		this.saveWhTax = saveWhTax;
	}
	public List<whTax> getDelWhTax() {
		return delWhTax;
	}
	public void setDelWhTax(List<whTax> delWhTax) {
		this.delWhTax = delWhTax;
	}
	@Override
	public String toString() {
		return "SaveMtnAcseWhTaxRequest [saveWhTax=" + saveWhTax + ", delWhTax=" + delWhTax + "]";
	}
	
}

@Alias("SaveMtnWhTax")
class whTax{
	private Integer whtaxId;
	private String taxCd;
	private String taxName;
	private String taxType;
	private BigDecimal taxRate;
	private String defaultAcitGl;
	private String defaultAcseGl;
	private String creditableTag;
	private String fixedTag;
	private String activeTag;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public Integer getWhtaxId() {
		return whtaxId;
	}

	public void setWhtaxId(Integer whtaxId) {
		this.whtaxId = whtaxId;
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

	public BigDecimal getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
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
		return "whTax [whtaxId=" + whtaxId + ", taxCd=" + taxCd + ", taxName=" + taxName + ", taxType=" + taxType
				+ ", taxRate=" + taxRate + ", defaultAcitGl=" + defaultAcitGl + ", defaultAcseGl=" + defaultAcseGl
				+ ", creditableTag=" + creditableTag + ", fixedTag=" + fixedTag + ", activeTag=" + activeTag
				+ ", remarks=" + remarks + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}
	
}