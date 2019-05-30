package ph.cpi.rest.api.model.underwriting;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.type.Alias;
import org.joda.time.DateTime;

@Alias("UnderwritingSectionCovers")
public class SectionCovers {
	private String lineCd;
	private String lineCdDesc;
	private String section  ;  
	private String coverCd ; 
	private String coverName;
	private String bulletNo;
	private BigDecimal prevSumInsured;
	private BigDecimal prevPremRt;
	private BigDecimal prevPremAmt;
	private BigDecimal sumInsured;
	private BigDecimal premRt;
	private BigDecimal premAmt;
	private String addSi;
	private String discountTag;
	private BigDecimal exPremRt;
	private BigDecimal exPremAmt;
	private String exDiscTag;
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
	
	public BigDecimal getExPremRt() {
		return exPremRt;
	}
	public void setExPremRt(BigDecimal exPremRt) {
		this.exPremRt = exPremRt;
	}
	public BigDecimal getExPremAmt() {
		return exPremAmt;
	}
	public void setExPremAmt(BigDecimal exPremAmt) {
		this.exPremAmt = exPremAmt;
	}
	public String getExDiscTag() {
		return exDiscTag;
	}
	public void setExDiscTag(String exDiscTag) {
		this.exDiscTag = exDiscTag;
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
	
	public BigDecimal getPrevSumInsured() {
		return prevSumInsured;
	}
	public void setPrevSumInsured(BigDecimal prevSumInsured) {
		this.prevSumInsured = prevSumInsured;
	}
	public BigDecimal getPrevPremRt() {
		return prevPremRt;
	}
	public void setPrevPremRt(BigDecimal prevPremRt) {
		this.prevPremRt = prevPremRt;
	}
	public BigDecimal getPrevPremAmt() {
		return prevPremAmt;
	}
	public void setPrevPremAmt(BigDecimal prevPremAmt) {
		this.prevPremAmt = prevPremAmt;
	}
	public List<Deductibles> getDeductiblesSec() {
		return deductiblesSec;
	}
	public void setDeductiblesSec(List<Deductibles> deductiblesSec) {
		this.deductiblesSec = deductiblesSec;
	}
	@Override
	public String toString() {
		return "SectionCovers [lineCd=" + lineCd + ", lineCdDesc=" + lineCdDesc + ", section=" + section + ", coverCd="
				+ coverCd + ", coverName=" + coverName + ", bulletNo=" + bulletNo + ", prevSumInsured=" + prevSumInsured
				+ ", prevPremRt=" + prevPremRt + ", prevPremAmt=" + prevPremAmt + ", sumInsured=" + sumInsured
				+ ", premRt=" + premRt + ", premAmt=" + premAmt + ", addSi=" + addSi + ", discountTag=" + discountTag
				+ ", exPremRt=" + exPremRt + ", exPremAmt=" + exPremAmt + ", exDiscTag=" + exDiscTag + ", cumSi="
				+ cumSi + ", cumPrem=" + cumPrem + ", createUserSec=" + createUserSec + ", createDateSec="
				+ createDateSec + ", updateUserSec=" + updateUserSec + ", updateDateSec=" + updateDateSec
				+ ", deductiblesSec=" + deductiblesSec + "]";
	}
}
