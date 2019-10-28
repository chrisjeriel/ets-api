package ph.cpi.rest.api.model.maintenance;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class GeneralTaxes {
	private Integer taxId;
	private String taxCd;
	private String taxName;
	private String chargeType;
	private BigDecimal taxRate;
	private BigDecimal amount;
	private Integer defaultAcitGl;
	private Integer defaultAcseGl;
	private String fixedTag;
	private String activeTag;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private String defaultGLBankAcctCd;
	private String defaultGLBankAcctName;
	private DateTime effDateTo;
	private DateTime effDateFrom;
	private String histNo;
	private String rangeNo;
	private BigDecimal maxVal;
	private BigDecimal minVal;
	private String birRlfType;
	
	public String getRangeNo() {
		return rangeNo;
	}
	public void setRangeNo(String rangeNo) {
		this.rangeNo = rangeNo;
	}
	public BigDecimal getMaxVal() {
		return maxVal;
	}
	public void setMaxVal(BigDecimal maxVal) {
		this.maxVal = maxVal;
	}
	public BigDecimal getMinVal() {
		return minVal;
	}
	public void setMinVal(BigDecimal minVal) {
		this.minVal = minVal;
	}
	
	
	public String getHistNo() {
		return histNo;
	}
	public void setHistNo(String histNo) {
		this.histNo = histNo;
	}
	public DateTime getEffDateTo() {
		return effDateTo;
	}
	public void setEffDateTo(DateTime effDateTo) {
		this.effDateTo = effDateTo;
	}
	public DateTime getEffDateFrom() {
		return effDateFrom;
	}
	public void setEffDateFrom(DateTime effDateFrom) {
		this.effDateFrom = effDateFrom;
	}
	
	public String getDefaultGLBankAcctCd() {
		return defaultGLBankAcctCd;
	}
	public void setDefaultGLBankAcctCd(String defaultGLBankAcctCd) {
		this.defaultGLBankAcctCd = defaultGLBankAcctCd;
	}
	public String getDefaultGLBankAcctName() {
		return defaultGLBankAcctName;
	}
	public void setDefaultGLBankAcctName(String defaultGLBankAcctName) {
		this.defaultGLBankAcctName = defaultGLBankAcctName;
	}

	public Integer getTaxId() {
		return taxId;
	}
	public void setTaxId(Integer taxId) {
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
	public BigDecimal getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(BigDecimal taxRate) {
		this.taxRate = taxRate;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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
	public String getBirRlfType() {
		return birRlfType;
	}
	public void setBirRlfType(String birRlfType) {
		this.birRlfType = birRlfType;
	}
	@Override
	public String toString() {
		return "GeneralTaxes [taxId=" + taxId + ", taxCd=" + taxCd + ", taxName=" + taxName + ", chargeType="
				+ chargeType + ", taxRate=" + taxRate + ", amount=" + amount + ", defaultAcitGl=" + defaultAcitGl
				+ ", defaultAcseGl=" + defaultAcseGl + ", fixedTag=" + fixedTag + ", activeTag=" + activeTag
				+ ", remarks=" + remarks + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + ", defaultGLBankAcctCd=" + defaultGLBankAcctCd
				+ ", defaultGLBankAcctName=" + defaultGLBankAcctName + ", effDateTo=" + effDateTo + ", effDateFrom="
				+ effDateFrom + ", histNo=" + histNo + ", rangeNo=" + rangeNo + ", maxVal=" + maxVal + ", minVal="
				+ minVal + ", birRlfType=" + birRlfType + "]";
	}
}
