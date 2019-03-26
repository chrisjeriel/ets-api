package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;
import org.joda.time.DateTime;

public class SavePolCoverageRequest {
	private  Integer policyId;
	private  Integer riskId;
	private  Integer projId;
	private  Integer sectionISi;
	private  Integer sectionIISi;
	private  Integer sectionIIISi;
	private  Integer totalSi;
	private  Integer sectionIPrem;
	private  Integer sectionIIPrem;
	private  Integer sectionIIIPrem;
	private  Integer totalPrem;
	private  String currencyCd;
	private  Integer currencyRt;
	private  Integer pctShare;
	private  Integer pctPml;
	private  Integer totalValue;
	private  String remarks;
	private  String createUser;
	private  String createDate;
	private  String updateUser;
	private  String 	updateDate;
	
	private List<SectionCoversUw> saveSectionCovers;
	private List<SectionCoversUw> deleteSectionCovers;
	
	
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
	public Integer getSectionISi() {
		return sectionISi;
	}
	public void setSectionISi(Integer sectionISi) {
		this.sectionISi = sectionISi;
	}
	public Integer getSectionIISi() {
		return sectionIISi;
	}
	public void setSectionIISi(Integer sectionIISi) {
		this.sectionIISi = sectionIISi;
	}
	public Integer getSectionIIISi() {
		return sectionIIISi;
	}
	public void setSectionIIISi(Integer sectionIIISi) {
		this.sectionIIISi = sectionIIISi;
	}
	public Integer getTotalSi() {
		return totalSi;
	}
	public void setTotalSi(Integer totalSi) {
		this.totalSi = totalSi;
	}
	public Integer getSectionIPrem() {
		return sectionIPrem;
	}
	public void setSectionIPrem(Integer sectionIPrem) {
		this.sectionIPrem = sectionIPrem;
	}
	public Integer getSectionIIPrem() {
		return sectionIIPrem;
	}
	public void setSectionIIPrem(Integer sectionIIPrem) {
		this.sectionIIPrem = sectionIIPrem;
	}
	public Integer getSectionIIIPrem() {
		return sectionIIIPrem;
	}
	public void setSectionIIIPrem(Integer sectionIIIPrem) {
		this.sectionIIIPrem = sectionIIIPrem;
	}
	public Integer getTotalPrem() {
		return totalPrem;
	}
	public void setTotalPrem(Integer totalPrem) {
		this.totalPrem = totalPrem;
	}
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public Integer getCurrencyRt() {
		return currencyRt;
	}
	public void setCurrencyRt(Integer currencyRt) {
		this.currencyRt = currencyRt;
	}
	public Integer getPctShare() {
		return pctShare;
	}
	public void setPctShare(Integer pctShare) {
		this.pctShare = pctShare;
	}
	public Integer getPctPml() {
		return pctPml;
	}
	public void setPctPml(Integer pctPml) {
		this.pctPml = pctPml;
	}
	public Integer getTotalValue() {
		return totalValue;
	}
	public void setTotalValue(Integer totalValue) {
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
	public List<SectionCoversUw> getSaveSectionCovers() {
		return saveSectionCovers;
	}
	public void setSaveSectionCovers(List<SectionCoversUw> saveSectionCovers) {
		this.saveSectionCovers = saveSectionCovers;
	}
	public List<SectionCoversUw> getDeleteSectionCovers() {
		return deleteSectionCovers;
	}
	public void setDeleteSectionCovers(List<SectionCoversUw> deleteSectionCovers) {
		this.deleteSectionCovers = deleteSectionCovers;
	}
	@Override
	public String toString() {
		return "SavePolCoverageRequest [policyId=" + policyId + ", riskId=" + riskId + ", projId=" + projId
				+ ", sectionISi=" + sectionISi + ", sectionIISi=" + sectionIISi + ", sectionIIISi=" + sectionIIISi
				+ ", totalSi=" + totalSi + ", sectionIPrem=" + sectionIPrem + ", sectionIIPrem=" + sectionIIPrem
				+ ", sectionIIIPrem=" + sectionIIIPrem + ", totalPrem=" + totalPrem + ", currencyCd=" + currencyCd
				+ ", currencyRt=" + currencyRt + ", pctShare=" + pctShare + ", pctPml=" + pctPml + ", totalValue="
				+ totalValue + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", saveSectionCovers="
				+ saveSectionCovers + ", deleteSectionCovers=" + deleteSectionCovers + "]";
	}
	
	
	
}

@Alias ("UWSaveSec")
class SectionCoversUw {
	private String lineCd;
	private String section;  
	private String coverCd; 
	private String bulletNo;
	private Integer sumInsured;
	private Integer premRt;
	private Integer premAmt;
	private String addSi;
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
	public String getBulletNo() {
		return bulletNo;
	}
	public void setBulletNo(String bulletNo) {
		this.bulletNo = bulletNo;
	}
	public Integer getSumInsured() {
		return sumInsured;
	}
	public void setSumInsured(Integer sumInsured) {
		this.sumInsured = sumInsured;
	}
	public Integer getPremRt() {
		return premRt;
	}
	public void setPremRt(Integer premRt) {
		this.premRt = premRt;
	}
	public Integer getPremAmt() {
		return premAmt;
	}
	public void setPremAmt(Integer premAmt) {
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
	@Override
	public String toString() {
		return "SectionCovers [lineCd=" + lineCd + ", section=" + section + ", coverCd=" + coverCd + ", bulletNo="
				+ bulletNo + ", sumInsured=" + sumInsured + ", premRt=" + premRt + ", premAmt=" + premAmt + ", addSi="
				+ addSi + ", createUserSec=" + createUserSec + ", createDateSec=" + createDateSec + ", updateUserSec=" + updateUserSec
				+ ", updateDateSec=" + updateDateSec + "]";
	}
	
	
}