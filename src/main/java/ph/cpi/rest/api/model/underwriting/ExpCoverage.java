package ph.cpi.rest.api.model.underwriting;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class ExpCoverage {
	private String policyId;
	private String projId;
	private String riskId;
	private BigDecimal sectionISi;
	private BigDecimal sectionIiSi;
	private BigDecimal sectionIiiSi;
	private BigDecimal totalSi;
	private BigDecimal sectionIPrem;
	private BigDecimal sectionIiPrem;
	private BigDecimal sectionIiiPrem;
	private BigDecimal totalPrem;
	private String currencyCd;
	private BigDecimal currencyRt;
	private BigDecimal pctShare;
	private BigDecimal pctPml;
	private BigDecimal totalValue;
	private String remarks;
	private BigDecimal origSeciSi;
	private BigDecimal origSeciiSi;
	private BigDecimal origSeciiiSi;
	private BigDecimal origTsi;
	private BigDecimal origSeciPrem;
	private BigDecimal origSeciiPrem;
	private BigDecimal origSeciiiPrem;
	private BigDecimal origTprem;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getProjId() {
		return projId;
	}
	public void setProjId(String projId) {
		this.projId = projId;
	}
	public String getRiskId() {
		return riskId;
	}
	public void setRiskId(String riskId) {
		this.riskId = riskId;
	}
	public BigDecimal getSectionISi() {
		return sectionISi;
	}
	public void setSectionISi(BigDecimal sectionISi) {
		this.sectionISi = sectionISi;
	}
	public BigDecimal getSectionIiSi() {
		return sectionIiSi;
	}
	public void setSectionIiSi(BigDecimal sectionIiSi) {
		this.sectionIiSi = sectionIiSi;
	}
	public BigDecimal getSectionIiiSi() {
		return sectionIiiSi;
	}
	public void setSectionIiiSi(BigDecimal sectionIiiSi) {
		this.sectionIiiSi = sectionIiiSi;
	}
	public BigDecimal getTotalSi() {
		return totalSi;
	}
	public void setTotalSi(BigDecimal totalSi) {
		this.totalSi = totalSi;
	}
	public BigDecimal getSectionIPrem() {
		return sectionIPrem;
	}
	public void setSectionIPrem(BigDecimal sectionIPrem) {
		this.sectionIPrem = sectionIPrem;
	}
	public BigDecimal getSectionIiPrem() {
		return sectionIiPrem;
	}
	public void setSectionIiPrem(BigDecimal sectionIiPrem) {
		this.sectionIiPrem = sectionIiPrem;
	}
	public BigDecimal getSectionIiiPrem() {
		return sectionIiiPrem;
	}
	public void setSectionIiiPrem(BigDecimal sectionIiiPrem) {
		this.sectionIiiPrem = sectionIiiPrem;
	}
	public BigDecimal getTotalPrem() {
		return totalPrem;
	}
	public void setTotalPrem(BigDecimal totalPrem) {
		this.totalPrem = totalPrem;
	}
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public BigDecimal getCurrencyRt() {
		return currencyRt;
	}
	public void setCurrencyRt(BigDecimal currencyRt) {
		this.currencyRt = currencyRt;
	}
	public BigDecimal getPctShare() {
		return pctShare;
	}
	public void setPctShare(BigDecimal pctShare) {
		this.pctShare = pctShare;
	}
	public BigDecimal getPctPml() {
		return pctPml;
	}
	public void setPctPml(BigDecimal pctPml) {
		this.pctPml = pctPml;
	}
	public BigDecimal getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(BigDecimal totalValue) {
		this.totalValue = totalValue;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public BigDecimal getOrigSeciSi() {
		return origSeciSi;
	}
	public void setOrigSeciSi(BigDecimal origSeciSi) {
		this.origSeciSi = origSeciSi;
	}
	public BigDecimal getOrigSeciiSi() {
		return origSeciiSi;
	}
	public void setOrigSeciiSi(BigDecimal origSeciiSi) {
		this.origSeciiSi = origSeciiSi;
	}
	public BigDecimal getOrigSeciiiSi() {
		return origSeciiiSi;
	}
	public void setOrigSeciiiSi(BigDecimal origSeciiiSi) {
		this.origSeciiiSi = origSeciiiSi;
	}
	public BigDecimal getOrigTsi() {
		return origTsi;
	}
	public void setOrigTsi(BigDecimal origTsi) {
		this.origTsi = origTsi;
	}
	public BigDecimal getOrigSeciPrem() {
		return origSeciPrem;
	}
	public void setOrigSeciPrem(BigDecimal origSeciPrem) {
		this.origSeciPrem = origSeciPrem;
	}
	public BigDecimal getOrigSeciiPrem() {
		return origSeciiPrem;
	}
	public void setOrigSeciiPrem(BigDecimal origSeciiPrem) {
		this.origSeciiPrem = origSeciiPrem;
	}
	public BigDecimal getOrigSeciiiPrem() {
		return origSeciiiPrem;
	}
	public void setOrigSeciiiPrem(BigDecimal origSeciiiPrem) {
		this.origSeciiiPrem = origSeciiiPrem;
	}
	public BigDecimal getOrigTprem() {
		return origTprem;
	}
	public void setOrigTprem(BigDecimal origTprem) {
		this.origTprem = origTprem;
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
		return "ExpCoverage [policyId=" + policyId + ", projId=" + projId + ", riskId=" + riskId + ", sectionISi="
				+ sectionISi + ", sectionIiSi=" + sectionIiSi + ", sectionIiiSi=" + sectionIiiSi + ", totalSi="
				+ totalSi + ", sectionIPrem=" + sectionIPrem + ", sectionIiPrem=" + sectionIiPrem + ", sectionIiiPrem="
				+ sectionIiiPrem + ", totalPrem=" + totalPrem + ", currencyCd=" + currencyCd + ", currencyRt="
				+ currencyRt + ", pctShare=" + pctShare + ", pctPml=" + pctPml + ", totalValue=" + totalValue
				+ ", remarks=" + remarks + ", origSeciSi=" + origSeciSi + ", origSeciiSi=" + origSeciiSi
				+ ", origSeciiiSi=" + origSeciiiSi + ", origTsi=" + origTsi + ", origSeciPrem=" + origSeciPrem
				+ ", origSeciiPrem=" + origSeciiPrem + ", origSeciiiPrem=" + origSeciiiPrem + ", origTprem=" + origTprem
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}
