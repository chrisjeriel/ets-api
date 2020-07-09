package ph.cpi.rest.api.model.request;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.type.Alias;

public class SavePolFullCoverageRequest {
	private Integer policyId;
	private Integer riskId;
	private Integer projId;
	private BigDecimal treatyShare;
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
	private String altWordings;
	private String polWordings;
	private BigDecimal cumSecISi;
	private BigDecimal cumSecIISi;
	private BigDecimal cumSecIIISi;
	private BigDecimal cumTSi;
	private BigDecimal cumSecIPrem;
	private BigDecimal cumSecIIPrem;
	private BigDecimal cumSecIIIPrem;
	private BigDecimal cumTPrem;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	private List<FullSectionCovers> saveFullSectionCovers;
	private List<FullSectionCovers> deleteFullSectionCovers;
	List<PolDeductible> saveDeductibleList;
	List<PolDeductible> deleteDeductibleList;
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
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
	public BigDecimal getTreatyShare() {
		return treatyShare;
	}
	public void setTreatyShare(BigDecimal treatyShare) {
		this.treatyShare = treatyShare;
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
	public String getAltWordings() {
		return altWordings;
	}
	public void setAltWordings(String altWordings) {
		this.altWordings = altWordings;
	}
	public String getPolWordings() {
		return polWordings;
	}
	public void setPolWordings(String polWordings) {
		this.polWordings = polWordings;
	}
	public BigDecimal getCumSecISi() {
		return cumSecISi;
	}
	public void setCumSecISi(BigDecimal cumSecISi) {
		this.cumSecISi = cumSecISi;
	}
	public BigDecimal getCumSecIISi() {
		return cumSecIISi;
	}
	public void setCumSecIISi(BigDecimal cumSecIISi) {
		this.cumSecIISi = cumSecIISi;
	}
	public BigDecimal getCumSecIIISi() {
		return cumSecIIISi;
	}
	public void setCumSecIIISi(BigDecimal cumSecIIISi) {
		this.cumSecIIISi = cumSecIIISi;
	}
	public BigDecimal getCumTSi() {
		return cumTSi;
	}
	public void setCumTSi(BigDecimal cumTSi) {
		this.cumTSi = cumTSi;
	}
	public BigDecimal getCumSecIPrem() {
		return cumSecIPrem;
	}
	public void setCumSecIPrem(BigDecimal cumSecIPrem) {
		this.cumSecIPrem = cumSecIPrem;
	}
	public BigDecimal getCumSecIIPrem() {
		return cumSecIIPrem;
	}
	public void setCumSecIIPrem(BigDecimal cumSecIIPrem) {
		this.cumSecIIPrem = cumSecIIPrem;
	}
	public BigDecimal getCumSecIIIPrem() {
		return cumSecIIIPrem;
	}
	public void setCumSecIIIPrem(BigDecimal cumSecIIIPrem) {
		this.cumSecIIIPrem = cumSecIIIPrem;
	}
	public BigDecimal getCumTPrem() {
		return cumTPrem;
	}
	public void setCumTPrem(BigDecimal cumTPrem) {
		this.cumTPrem = cumTPrem;
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
	public List<FullSectionCovers> getSaveFullSectionCovers() {
		return saveFullSectionCovers;
	}
	public void setSaveFullSectionCovers(List<FullSectionCovers> saveFullSectionCovers) {
		this.saveFullSectionCovers = saveFullSectionCovers;
	}
	public List<FullSectionCovers> getDeleteFullSectionCovers() {
		return deleteFullSectionCovers;
	}
	public void setDeleteFullSectionCovers(List<FullSectionCovers> deleteFullSectionCovers) {
		this.deleteFullSectionCovers = deleteFullSectionCovers;
	}
	
	public List<PolDeductible> getSaveDeductibleList() {
		return saveDeductibleList;
	}
	public void setSaveDeductibleList(List<PolDeductible> saveDeductibleList) {
		this.saveDeductibleList = saveDeductibleList;
	}
	public List<PolDeductible> getDeleteDeductibleList() {
		return deleteDeductibleList;
	}
	public void setDeleteDeductibleList(List<PolDeductible> deleteDeductibleList) {
		this.deleteDeductibleList = deleteDeductibleList;
	}
	@Override
	public String toString() {
		return "SavePolFullCoverageRequest [policyId=" + policyId + ", riskId=" + riskId + ", projId=" + projId
				+ ", treatyShare=" + treatyShare + ", sectionISi=" + sectionISi + ", sectionIISi=" + sectionIISi
				+ ", sectionIIISi=" + sectionIIISi + ", totalSi=" + totalSi + ", sectionIPrem=" + sectionIPrem
				+ ", sectionIIPrem=" + sectionIIPrem + ", sectionIIIPrem=" + sectionIIIPrem + ", totalPrem=" + totalPrem
				+ ", currencyCd=" + currencyCd + ", currencyRt=" + currencyRt + ", pctShare=" + pctShare + ", pctPml="
				+ pctPml + ", totalValue=" + totalValue + ", altWordings=" + altWordings + ", polWordings="
				+ polWordings + ", cumSecISi=" + cumSecISi + ", cumSecIISi=" + cumSecIISi + ", cumSecIIISi="
				+ cumSecIIISi + ", cumTSi=" + cumTSi + ", cumSecIPrem=" + cumSecIPrem + ", cumSecIIPrem=" + cumSecIIPrem
				+ ", cumSecIIIPrem=" + cumSecIIIPrem + ", cumTPrem=" + cumTPrem + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate
				+ ", saveFullSectionCovers=" + saveFullSectionCovers + ", deleteFullSectionCovers="
				+ deleteFullSectionCovers + ", saveDeductibleList=" + saveDeductibleList + ", deleteDeductibleList="
				+ deleteDeductibleList + "]";
	}
}


@Alias ("UWSaveFullSec")
class FullSectionCovers {
	private String lineCd;
	private String section;  
	private String coverCd; 
	private String coverName;
	private String bulletNo;
	private BigDecimal sumInsured;
	private BigDecimal premRt;
	private BigDecimal premAmt;
	private String addSi;
	private String discountTag;
	private BigDecimal cumSi;
	private BigDecimal cumPrem;
	private String createUserSec;
	private String createDateSec;
	private String updateUserSec;
	private String updateDateSec;
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
	public BigDecimal getCumSi() {
		return cumSi;
	}
	public void setCumSi(BigDecimal cumSi) {
		this.cumSi = cumSi;
	}
	public BigDecimal getCumPrem() {
		return cumPrem;
	}
	public void setCumPrem(BigDecimal cumPrem) {
		this.cumPrem = cumPrem;
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
	@Override
	public String toString() {
		return "FullSectionCovers [lineCd=" + lineCd + ", section=" + section + ", coverCd=" + coverCd + ", coverName="
				+ coverName + ", bulletNo=" + bulletNo + ", sumInsured=" + sumInsured + ", premRt=" + premRt
				+ ", premAmt=" + premAmt + ", addSi=" + addSi + ", discountTag=" + discountTag + ", cumSi=" + cumSi
				+ ", cumPrem=" + cumPrem + ", createUserSec=" + createUserSec + ", createDateSec=" + createDateSec
				+ ", updateUserSec=" + updateUserSec + ", updateDateSec=" + updateDateSec + "]";
	}
	
	
}


@Alias("SavePolDeductibles")
class PolDeductible {
	private String deductibleCd;
	private String coverCd;
	private String endtCd;
	private BigDecimal deductibleRt;
	private BigDecimal deductibleAmt;
	private String deductibleTxt;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public String getDeductibleCd() {
		return deductibleCd;
	}
	public void setDeductibleCd(String deductibleCd) {
		this.deductibleCd = deductibleCd;
	}
	public String getCoverCd() {
		return coverCd;
	}
	public void setCoverCd(String coverCd) {
		this.coverCd = coverCd;
	}
	public String getEndtCd() {
		return endtCd;
	}
	public void setEndtCd(String endtCd) {
		this.endtCd = endtCd;
	}
	public BigDecimal getDeductibleRt() {
		return deductibleRt;
	}
	public void setDeductibleRt(BigDecimal deductibleRt) {
		this.deductibleRt = deductibleRt;
	}
	public BigDecimal getDeductibleAmt() {
		return deductibleAmt;
	}
	public void setDeductibleAmt(BigDecimal deductibleAmt) {
		this.deductibleAmt = deductibleAmt;
	}
	public String getDeductibleTxt() {
		return deductibleTxt;
	}
	public void setDeductibleTxt(String deductibleTxt) {
		this.deductibleTxt = deductibleTxt;
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
		return "UwDeductible [deductibleCd=" + deductibleCd + ", coverCd=" + coverCd + ", endtCd=" + endtCd
				+ ", deductibleRt=" + deductibleRt + ", deductibleAmt=" + deductibleAmt + ", deductibleTxt="
				+ deductibleTxt + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}
	
	
}
