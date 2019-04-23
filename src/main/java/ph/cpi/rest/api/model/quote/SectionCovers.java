package ph.cpi.rest.api.model.quote;

import java.math.BigDecimal;

import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

public class SectionCovers {
	private Integer coverCd;
	private String coverName;
	private String section;
	private String bulletNo;
	private BigDecimal sumInsured;
	private String addSi;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	public Integer getCoverCd() {
		return coverCd;
	}
	public void setCoverCd(Integer coverCd) {
		this.coverCd = coverCd;
	}
	
	public String getCoverName() {
		return coverName;
	}
	public void setCoverName(String coverName) {
		this.coverName = coverName;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
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
	public String getAddSi() {
		return addSi;
	}
	public void setAddSi(String addSi) {
		this.addSi = addSi;
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
		return "SectionCovers [coverCd=" + coverCd + ", coverName=" + coverName + ", section=" + section + ", bulletNo="
				+ bulletNo + ", sumInsured=" + sumInsured + ", addSi=" + addSi + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
	
}