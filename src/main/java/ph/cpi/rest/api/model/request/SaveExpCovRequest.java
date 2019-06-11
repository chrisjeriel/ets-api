package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.DateTime;

public class SaveExpCovRequest {
	
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
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	private List<ExpSecCovers> expSecCovers;

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

	

	public List<ExpSecCovers> getExpSecCovers() {
		return expSecCovers;
	}

	public void setExpSecCovers(List<ExpSecCovers> expSecCovers) {
		this.expSecCovers = expSecCovers;
	}

	@Override
	public String toString() {
		return "SaveExpCovRequest [policyId=" + policyId + ", projId=" + projId + ", riskId=" + riskId + ", sectionISi="
				+ sectionISi + ", sectionIiSi=" + sectionIiSi + ", sectionIiiSi=" + sectionIiiSi + ", totalSi="
				+ totalSi + ", sectionIPrem=" + sectionIPrem + ", sectionIiPrem=" + sectionIiPrem + ", sectionIiiPrem="
				+ sectionIiiPrem + ", totalPrem=" + totalPrem + ", currencyCd=" + currencyCd + ", currencyRt="
				+ currencyRt + ", pctShare=" + pctShare + ", pctPml=" + pctPml + ", totalValue=" + totalValue
				+ ", remarks=" + remarks + ", origSeciSi=" + origSeciSi + ", origSeciiSi=" + origSeciiSi
				+ ", origSeciiiSi=" + origSeciiiSi + ", origTsi=" + origTsi + ", origSeciPrem=" + origSeciPrem
				+ ", origSeciiPrem=" + origSeciiPrem + ", origSeciiiPrem=" + origSeciiiPrem + ", origTprem=" + origTprem
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", expSecCovers=" + expSecCovers + "]";
	}
	
}

class ExpSecCovers {
	private String policyId;
	private String lineCd;
	private String projId;
	private String riskId;
	private String section;
	private String coverCd;
	private String coverName;
	private String bulletNo;
	private BigDecimal sumInsured;
	private BigDecimal premRt;
	private BigDecimal premAmt;
	private String addSi;
	private String discountTag;
	private BigDecimal origSi;
	private BigDecimal origPremRt;
	private BigDecimal origPrem;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
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
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getCoverCd() {
		return coverCd;
	}
	public void setCoverCd(String coverCd) {
		this.coverCd = coverCd;
	}
	public String getCoverName() {
		return coverName;
	}
	public void setCoverName(String coverName) {
		this.coverName = coverName;
	}
	public String getBulletNo() {
		return bulletNo;
	}
	public void setBulletNo(String bulletNo) {
		this.bulletNo = bulletNo;
	}
	public BigDecimal getSumInsured() {
		return sumInsured;
	}
	public void setSumInsured(BigDecimal sumInsured) {
		this.sumInsured = sumInsured;
	}
	public BigDecimal getPremRt() {
		return premRt;
	}
	public void setPremRt(BigDecimal premRt) {
		this.premRt = premRt;
	}
	public BigDecimal getPremAmt() {
		return premAmt;
	}
	public void setPremAmt(BigDecimal premAmt) {
		this.premAmt = premAmt;
	}
	public String getAddSi() {
		return addSi;
	}
	public void setAddSi(String addSi) {
		this.addSi = addSi;
	}
	public String getDiscountTag() {
		return discountTag;
	}
	public void setDiscountTag(String discountTag) {
		this.discountTag = discountTag;
	}
	public BigDecimal getOrigSi() {
		return origSi;
	}
	public void setOrigSi(BigDecimal origSi) {
		this.origSi = origSi;
	}
	public BigDecimal getOrigPremRt() {
		return origPremRt;
	}
	public void setOrigPremRt(BigDecimal origPremRt) {
		this.origPremRt = origPremRt;
	}
	public BigDecimal getOrigPrem() {
		return origPrem;
	}
	public void setOrigPrem(BigDecimal origPrem) {
		this.origPrem = origPrem;
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
		return "ExpSecCovers [policyId=" + policyId + ", lineCd=" + lineCd + ", projId=" + projId + ", riskId=" + riskId
				+ ", section=" + section + ", coverCd=" + coverCd + ", coverName=" + coverName + ", bulletNo="
				+ bulletNo + ", sumInsured=" + sumInsured + ", premRt=" + premRt + ", premAmt=" + premAmt + ", addSi="
				+ addSi + ", discountTag=" + discountTag + ", origSi=" + origSi + ", origPremRt=" + origPremRt
				+ ", origPrem=" + origPrem + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
	
}
