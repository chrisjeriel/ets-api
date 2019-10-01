package ph.cpi.rest.api.model.maintenance;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class WithholdingTaxes {
	private Integer whTaxId;
	private String taxCd;
	private String taxName;
	private String taxType;
	private BigDecimal taxRate;
	private Integer defaultAcitGl;
	private Integer defaultAcseGl;
	private String creditableTag;
	private String fixedTag;
	private String activeTag;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	public Integer getWhTaxId() {
		return whTaxId;
	}
	public void setWhTaxId(Integer whTaxId) {
		this.whTaxId = whTaxId;
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
	public Integer getDefaultAcitGl() {
		return defaultAcitGl;
	}
	public void setDefaultAcitGl(Integer defaultAcitGl) {
		this.defaultAcitGl = defaultAcitGl;
	}
	public Integer getDefaultAcseGl() {
		return defaultAcseGl;
	}
	public void setDefaultAcseGl(Integer defaultAcseGl) {
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
		return "WithholdingTaxes [whTaxId=" + whTaxId + ", taxCd=" + taxCd + ", taxName=" + taxName + ", taxType="
				+ taxType + ", taxRate=" + taxRate + ", defaultAcitGl=" + defaultAcitGl + ", defaultAcseGl="
				+ defaultAcseGl + ", creditableTag=" + creditableTag + ", fixedTag=" + fixedTag + ", activeTag="
				+ activeTag + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
