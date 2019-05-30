package ph.cpi.rest.api.model.underwriting;

import org.joda.time.DateTime;

public class ExpCoverage {
	private String policyId;
	private String projId;
	private String riskId;
	private String sectionISi;
	private String sectionIiSi;
	private String sectionIiiSi;
	private String totalSi;
	private String sectionIPrem;
	private String sectionIiPrem;
	private String sectionIiiPrem;
	private String totalPrem;
	private String currencyCd;
	private String currencyRt;
	private String pctShare;
	private String pctPml;
	private String totalValue;
	private String remarks;
	private String origSeciSi;
	private String origSeciiSi;
	private String origSeciiiSi;
	private String origTsi;
	private String origSeciPrem;
	private String origSeciiPrem;
	private String origSeciiiPrem;
	private String origTprem;
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
	public String getSectionISi() {
		return sectionISi;
	}
	public void setSectionISi(String sectionISi) {
		this.sectionISi = sectionISi;
	}
	public String getSectionIiSi() {
		return sectionIiSi;
	}
	public void setSectionIiSi(String sectionIiSi) {
		this.sectionIiSi = sectionIiSi;
	}
	public String getSectionIiiSi() {
		return sectionIiiSi;
	}
	public void setSectionIiiSi(String sectionIiiSi) {
		this.sectionIiiSi = sectionIiiSi;
	}
	public String getTotalSi() {
		return totalSi;
	}
	public void setTotalSi(String totalSi) {
		this.totalSi = totalSi;
	}
	public String getSectionIPrem() {
		return sectionIPrem;
	}
	public void setSectionIPrem(String sectionIPrem) {
		this.sectionIPrem = sectionIPrem;
	}
	public String getSectionIiPrem() {
		return sectionIiPrem;
	}
	public void setSectionIiPrem(String sectionIiPrem) {
		this.sectionIiPrem = sectionIiPrem;
	}
	public String getSectionIiiPrem() {
		return sectionIiiPrem;
	}
	public void setSectionIiiPrem(String sectionIiiPrem) {
		this.sectionIiiPrem = sectionIiiPrem;
	}
	public String getTotalPrem() {
		return totalPrem;
	}
	public void setTotalPrem(String totalPrem) {
		this.totalPrem = totalPrem;
	}
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public String getCurrencyRt() {
		return currencyRt;
	}
	public void setCurrencyRt(String currencyRt) {
		this.currencyRt = currencyRt;
	}
	public String getPctShare() {
		return pctShare;
	}
	public void setPctShare(String pctShare) {
		this.pctShare = pctShare;
	}
	public String getPctPml() {
		return pctPml;
	}
	public void setPctPml(String pctPml) {
		this.pctPml = pctPml;
	}
	public String getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(String totalValue) {
		this.totalValue = totalValue;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getOrigSeciSi() {
		return origSeciSi;
	}
	public void setOrigSeciSi(String origSeciSi) {
		this.origSeciSi = origSeciSi;
	}
	public String getOrigSeciiSi() {
		return origSeciiSi;
	}
	public void setOrigSeciiSi(String origSeciiSi) {
		this.origSeciiSi = origSeciiSi;
	}
	public String getOrigSeciiiSi() {
		return origSeciiiSi;
	}
	public void setOrigSeciiiSi(String origSeciiiSi) {
		this.origSeciiiSi = origSeciiiSi;
	}
	public String getOrigTsi() {
		return origTsi;
	}
	public void setOrigTsi(String origTsi) {
		this.origTsi = origTsi;
	}
	public String getOrigSeciPrem() {
		return origSeciPrem;
	}
	public void setOrigSeciPrem(String origSeciPrem) {
		this.origSeciPrem = origSeciPrem;
	}
	public String getOrigSeciiPrem() {
		return origSeciiPrem;
	}
	public void setOrigSeciiPrem(String origSeciiPrem) {
		this.origSeciiPrem = origSeciiPrem;
	}
	public String getOrigSeciiiPrem() {
		return origSeciiiPrem;
	}
	public void setOrigSeciiiPrem(String origSeciiiPrem) {
		this.origSeciiiPrem = origSeciiiPrem;
	}
	public String getOrigTprem() {
		return origTprem;
	}
	public void setOrigTprem(String origTprem) {
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
