package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;

public class SavePolCoverageOcRequest {
	private  Integer policyIdOc;
	private  Integer riskId;
	private  Integer projId;
	private BigDecimal sectionISi;
	private BigDecimal sectionIISi;
	private BigDecimal sectionIIISi;
	private BigDecimal totalSi;
	private BigDecimal sectionIPrem;
	private BigDecimal sectionIIPrem;
	private BigDecimal sectionIIIPrem;
	private BigDecimal totalPrem;
	private String currencyCd;
	private BigDecimal currencyRt;
	private BigDecimal pctShare;
	private BigDecimal pctPml;
	private BigDecimal totalValue;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	private List<SectionCoversOc> saveSectionCoversOc;
	private List<SectionCoversOc> delSectionCoversOc;
	private List<UwDeductible> saveDeductibleList;
	private List<UwDeductible> deleteDeductibleList;
	public Integer getPolicyIdOc() {
		return policyIdOc;
	}
	public void setPolicyIdOc(Integer policyIdOc) {
		this.policyIdOc = policyIdOc;
	}
	public Integer getRiskId() {
		return riskId;
	}
	public void setRiskId(Integer riskId) {
		this.riskId = riskId;
	}
	public Integer getProjId() {
		return projId;
	}
	public void setProjId(Integer projId) {
		this.projId = projId;
	}
	public BigDecimal getSectionISi() {
		return sectionISi;
	}
	public void setSectionISi(BigDecimal sectionISi) {
		this.sectionISi = sectionISi;
	}
	public BigDecimal getSectionIISi() {
		return sectionIISi;
	}
	public void setSectionIISi(BigDecimal sectionIISi) {
		this.sectionIISi = sectionIISi;
	}
	public BigDecimal getSectionIIISi() {
		return sectionIIISi;
	}
	public void setSectionIIISi(BigDecimal sectionIIISi) {
		this.sectionIIISi = sectionIIISi;
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
	public BigDecimal getSectionIIPrem() {
		return sectionIIPrem;
	}
	public void setSectionIIPrem(BigDecimal sectionIIPrem) {
		this.sectionIIPrem = sectionIIPrem;
	}
	public BigDecimal getSectionIIIPrem() {
		return sectionIIIPrem;
	}
	public void setSectionIIIPrem(BigDecimal sectionIIIPrem) {
		this.sectionIIIPrem = sectionIIIPrem;
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
	public List<SectionCoversOc> getSaveSectionCoversOc() {
		return saveSectionCoversOc;
	}
	public void setSaveSectionCoversOc(List<SectionCoversOc> saveSectionCoversOc) {
		this.saveSectionCoversOc = saveSectionCoversOc;
	}
	public List<SectionCoversOc> getDelSectionCoversOc() {
		return delSectionCoversOc;
	}
	public void setDelSectionCoversOc(List<SectionCoversOc> delSectionCoversOc) {
		this.delSectionCoversOc = delSectionCoversOc;
	}
	public List<UwDeductible> getSaveDeductibleList() {
		return saveDeductibleList;
	}
	public void setSaveDeductibleList(List<UwDeductible> saveDeductibleList) {
		this.saveDeductibleList = saveDeductibleList;
	}
	public List<UwDeductible> getDeleteDeductibleList() {
		return deleteDeductibleList;
	}
	public void setDeleteDeductibleList(List<UwDeductible> deleteDeductibleList) {
		this.deleteDeductibleList = deleteDeductibleList;
	}
	@Override
	public String toString() {
		return "SavePolCoverageOcRequest [policyIdOc=" + policyIdOc + ", riskId=" + riskId + ", projId=" + projId
				+ ", sectionISi=" + sectionISi + ", sectionIISi=" + sectionIISi + ", sectionIIISi=" + sectionIIISi
				+ ", totalSi=" + totalSi + ", sectionIPrem=" + sectionIPrem + ", sectionIIPrem=" + sectionIIPrem
				+ ", sectionIIIPrem=" + sectionIIIPrem + ", totalPrem=" + totalPrem + ", currencyCd=" + currencyCd
				+ ", currencyRt=" + currencyRt + ", pctShare=" + pctShare + ", pctPml=" + pctPml + ", totalValue="
				+ totalValue + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", saveSectionCoversOc="
				+ saveSectionCoversOc + ", delSectionCoversOc=" + delSectionCoversOc + ", saveDeductibleList="
				+ saveDeductibleList + ", deleteDeductibleList=" + deleteDeductibleList + "]";
	}
	
	
	
}

 class SectionCoversOc {
	 private String lineCd;
	 private String section  ;
	 private String coverCd ;
	 private String bulletNo;
	 private String sumInsured;
	 private String premRt;
	 private String premAmt;
	 private String addSi;
	 private String createUserSec;
	 private String createDateSec;
	 private String updateUserSec;
	 private String updateDateSec;
	 private String remarks;
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
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
	public String getBulletNo() {
		return bulletNo;
	}
	public void setBulletNo(String bulletNo) {
		this.bulletNo = bulletNo;
	}
	public String getSumInsured() {
		return sumInsured;
	}
	public void setSumInsured(String sumInsured) {
		this.sumInsured = sumInsured;
	}
	public String getPremRt() {
		return premRt;
	}
	public void setPremRt(String premRt) {
		this.premRt = premRt;
	}
	public String getPremAmt() {
		return premAmt;
	}
	public void setPremAmt(String premAmt) {
		this.premAmt = premAmt;
	}
	public String getAddSi() {
		return addSi;
	}
	public void setAddSi(String addSi) {
		this.addSi = addSi;
	}
	public String getCreateUserSec() {
		return createUserSec;
	}
	public void setCreateUserSec(String createUserSec) {
		this.createUserSec = createUserSec;
	}
	public String getCreateDateSec() {
		return createDateSec;
	}
	public void setCreateDateSec(String createDateSec) {
		this.createDateSec = createDateSec;
	}
	public String getUpdateUserSec() {
		return updateUserSec;
	}
	public void setUpdateUserSec(String updateUserSec) {
		this.updateUserSec = updateUserSec;
	}
	public String getUpdateDateSec() {
		return updateDateSec;
	}
	public void setUpdateDateSec(String updateDateSec) {
		this.updateDateSec = updateDateSec;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "SectionCoversOc [lineCd=" + lineCd + ", section=" + section + ", coverCd=" + coverCd + ", bulletNo="
				+ bulletNo + ", sumInsured=" + sumInsured + ", premRt=" + premRt + ", premAmt=" + premAmt + ", addSi="
				+ addSi + ", createUserSec=" + createUserSec + ", createDateSec=" + createDateSec + ", updateUserSec="
				+ updateUserSec + ", updateDateSec=" + updateDateSec + ", remarks=" + remarks + "]";
	}
	
	 
}
