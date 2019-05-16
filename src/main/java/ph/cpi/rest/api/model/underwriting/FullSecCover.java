package ph.cpi.rest.api.model.underwriting;

import java.math.BigDecimal;
import java.util.List;

import org.joda.time.DateTime;

public class FullSecCover {
	private String lineCd;
	private String lineCdDesc;
	private String section  ;  
	private String coverCd ; 
	private String coverName;
	private String bulletNo;
	private BigDecimal orgSumInsured;
	private BigDecimal orgPremRt;
	private BigDecimal orgPremAmt;
	private BigDecimal sumInsured;
	private BigDecimal premRt;
	private BigDecimal premAmt;
	private String addSi;
	private String discountTag;
	private BigDecimal cumSi;
	private BigDecimal cumPrem;
	private String createUserSec;
	private DateTime createDateSec;
	private String updateUserSec;
	private DateTime updateDateSec;
	
	private List<Deductibles> deductiblesSec;

	public String getLineCd() {
		return lineCd;
	}

	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}

	public String getLineCdDesc() {
		return lineCdDesc;
	}

	public void setLineCdDesc(String lineCdDesc) {
		this.lineCdDesc = lineCdDesc;
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

	public BigDecimal getOrgSumInsured() {
		return orgSumInsured;
	}

	public void setOrgSumInsured(BigDecimal orgSumInsured) {
		this.orgSumInsured = orgSumInsured;
	}

	public BigDecimal getOrgPremRt() {
		return orgPremRt;
	}

	public void setOrgPremRt(BigDecimal orgPremRt) {
		this.orgPremRt = orgPremRt;
	}

	public BigDecimal getOrgPremAmt() {
		return orgPremAmt;
	}

	public void setOrgPremAmt(BigDecimal orgPremAmt) {
		this.orgPremAmt = orgPremAmt;
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

	public DateTime getCreateDateSec() {
		return createDateSec;
	}

	public void setCreateDateSec(DateTime createDateSec) {
		this.createDateSec = createDateSec;
	}

	public String getUpdateUserSec() {
		return updateUserSec;
	}

	public void setUpdateUserSec(String updateUserSec) {
		this.updateUserSec = updateUserSec;
	}

	public DateTime getUpdateDateSec() {
		return updateDateSec;
	}

	public void setUpdateDateSec(DateTime updateDateSec) {
		this.updateDateSec = updateDateSec;
	}

	public List<Deductibles> getDeductiblesSec() {
		return deductiblesSec;
	}

	public void setDeductiblesSec(List<Deductibles> deductiblesSec) {
		this.deductiblesSec = deductiblesSec;
	}

	@Override
	public String toString() {
		return "FullSecCover [lineCd=" + lineCd + ", lineCdDesc=" + lineCdDesc + ", section=" + section + ", coverCd="
				+ coverCd + ", coverName=" + coverName + ", bulletNo=" + bulletNo + ", orgSumInsured=" + orgSumInsured
				+ ", orgPremRt=" + orgPremRt + ", orgPremAmt=" + orgPremAmt + ", sumInsured=" + sumInsured + ", premRt="
				+ premRt + ", premAmt=" + premAmt + ", addSi=" + addSi + ", discountTag=" + discountTag + ", cumSi="
				+ cumSi + ", cumPrem=" + cumPrem + ", createUserSec=" + createUserSec + ", createDateSec="
				+ createDateSec + ", updateUserSec=" + updateUserSec + ", updateDateSec=" + updateDateSec
				+ ", deductiblesSec=" + deductiblesSec + "]";
	}
}
