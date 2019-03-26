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
	private BigDecimal sumInsured;
	private BigDecimal premRt;
	private BigDecimal premAmt;
	private String addSi;
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
	@Override
	public String toString() {
		return "SectionCovers [lineCd=" + lineCd + ", lineCdDesc=" + lineCdDesc + ", section=" + section + ", coverCd="
				+ coverCd + ", description=" + description + ", bulletNo=" + bulletNo + ", sumInsured=" + sumInsured
				+ ", premRt=" + premRt + ", premAmt=" + premAmt + ", addSi=" + addSi + ", createUserSec="
				+ createUserSec + ", createDateSec=" + createDateSec + ", updateUserSec=" + updateUserSec
				+ ", updateDateSec=" + updateDateSec + "]";
	}
	
	
	
}