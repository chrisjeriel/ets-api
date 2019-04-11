package ph.cpi.rest.api.model.underwriting;

import java.math.BigDecimal;

import org.apache.ibatis.type.Alias;
import org.joda.time.DateTime;

@Alias("UnderwritingSectionCovers")
public class SectionCovers {
	private String lineCd;
	private String lineCdDesc;
	private String section  ;  
	private String coverCd ; 
	private String description;
	private String bulletNo;
	private BigDecimal prevSumInsured;
	private BigDecimal prevPremRt;
	private BigDecimal prevPremAmt;
	private BigDecimal sumInsured;
	private BigDecimal premRt;
	private BigDecimal premAmt;
	private String addSi;
	private String discountTag;
	private String cumSi;
	private String cumPrem;
	private String createUserSec;
	private DateTime createDateSec;
	private String updateUserSec;
	private DateTime updateDateSec;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public String getCumSi() {
		return cumSi;
	}
	public void setCumSi(String cumSi) {
		this.cumSi = cumSi;
	}
	public String getCumPrem() {
		return cumPrem;
	}
	public void setCumPrem(String cumPrem) {
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
	@Override
	public String toString() {
		return "SectionCovers [lineCd=" + lineCd + ", lineCdDesc=" + lineCdDesc + ", section=" + section + ", coverCd="
				+ coverCd + ", description=" + description + ", bulletNo=" + bulletNo + ", prevSumInsured="
				+ prevSumInsured + ", prevPremRt=" + prevPremRt + ", prevPremAmt=" + prevPremAmt + ", sumInsured="
				+ sumInsured + ", premRt=" + premRt + ", premAmt=" + premAmt + ", addSi=" + addSi + ", discountTag="
				+ discountTag + ", cumSi=" + cumSi + ", cumPrem=" + cumPrem + ", createUserSec=" + createUserSec
				+ ", createDateSec=" + createDateSec + ", updateUserSec=" + updateUserSec + ", updateDateSec="
				+ updateDateSec + "]";
	}
	
	
	
}
