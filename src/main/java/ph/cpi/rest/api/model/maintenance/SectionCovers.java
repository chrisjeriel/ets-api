package ph.cpi.rest.api.model.maintenance;

import org.apache.ibatis.type.Alias;
import org.joda.time.DateTime;
import org.joda.time.LocalDateTime;

@Alias("MaintenanceSectionCovers")
public class SectionCovers {

	private String lineCd ;
	private String lineDesc;
	private String coverCd ;
	private String coverCdAbbr;
	private String coverName;
	private String activeTag;
	private String section;
	private Integer sortSeq;
	private String defaultTag;
	private String bulletNo;
	private String addSi;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public String getLineDesc() {
		return lineDesc;
	}
	public void setLineDesc(String lineDesc) {
		this.lineDesc = lineDesc;
	}
	public String getCoverCd() {
		return coverCd;
	}
	public void setCoverCd(String coverCd) {
		this.coverCd = coverCd;
	}
	public String getCoverCdAbbr() {
		return coverCdAbbr;
	}
	public void setCoverCdAbbr(String coverCdAbbr) {
		this.coverCdAbbr = coverCdAbbr;
	}
	
	public String getCoverName() {
		return coverName;
	}
	public void setCoverName(String coverName) {
		this.coverName = coverName;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public Integer getSortSeq() {
		return sortSeq;
	}
	public void setSortSeq(Integer sortSeq) {
		this.sortSeq = sortSeq;
	}
	public String getDefaultTag() {
		return defaultTag;
	}
	public void setDefaultTag(String defaultTag) {
		this.defaultTag = defaultTag;
	}
	public String getBulletNo() {
		return bulletNo;
	}
	public void setBulletNo(String bulletNo) {
		this.bulletNo = bulletNo;
	}
	public String getAddSi() {
		return addSi;
	}
	public void setAddSi(String addSi) {
		this.addSi = addSi;
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
		return "SectionCovers [lineCd=" + lineCd + ", lineDesc=" + lineDesc + ", coverCd=" + coverCd + ", coverCdAbbr="
				+ coverCdAbbr + ", coverName=" + coverName + ", activeTag=" + activeTag + ", section=" + section
				+ ", sortSeq=" + sortSeq + ", defaultTag=" + defaultTag + ", bulletNo=" + bulletNo + ", addSi=" + addSi
				+ ", remarks=" + remarks + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}
	
}
