package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveMtnSectionCoverRequest {
	List<SaveSectionCover> saveSectionCover;
	List<SaveSectionCover> delSectionCover;
	List<SaveSectionCover> addSectionCover;
	List<Deductibless> saveDeductibles;
	List<Deductibless> deleteDeductibles;
	public List<SaveSectionCover> getSaveSectionCover() {
		return saveSectionCover;
	}
	public void setSaveSectionCover(List<SaveSectionCover> saveSectionCover) {
		this.saveSectionCover = saveSectionCover;
	}
	public List<SaveSectionCover> getDelSectionCover() {
		return delSectionCover;
	}
	public void setDelSectionCover(List<SaveSectionCover> delSectionCover) {
		this.delSectionCover = delSectionCover;
	}
	public List<Deductibless> getSaveDeductibles() {
		return saveDeductibles;
	}
	public void setSaveDeductibles(List<Deductibless> saveDeductibles) {
		this.saveDeductibles = saveDeductibles;
	}
	public List<Deductibless> getDeleteDeductibles() {
		return deleteDeductibles;
	}
	public void setDeleteDeductibles(List<Deductibless> deleteDeductibles) {
		this.deleteDeductibles = deleteDeductibles;
	}
	public List<SaveSectionCover> getAddSectionCover() {
		return addSectionCover;
	}
	public void setAddSectionCover(List<SaveSectionCover> addSectionCover) {
		this.addSectionCover = addSectionCover;
	}
	@Override
	public String toString() {
		return "SaveMtnSectionCoverRequest [saveSectionCover=" + saveSectionCover + ", delSectionCover="
				+ delSectionCover + ", addSectionCover=" + addSectionCover + ", saveDeductibles=" + saveDeductibles
				+ ", deleteDeductibles=" + deleteDeductibles + "]";
	}
}

class SaveSectionCover{
	private String lineCd ;
	private Integer coverCd ;
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
	private String createDate;
	private String updateUser;
	private String updateDate;
	private List<Deductibless> deductibles;
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public Integer getCoverCd() {
		return coverCd;
	}
	public void setCoverCd(Integer coverCd) {
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
	public List<Deductibless> getDeductibles() {
		return deductibles;
	}
	public void setDeductibles(List<Deductibless> deductibles) {
		this.deductibles = deductibles;
	}
	@Override
	public String toString() {
		return "SaveSectionCover [lineCd=" + lineCd + ", coverCd=" + coverCd + ", coverCdAbbr=" + coverCdAbbr
				+ ", coverName=" + coverName + ", activeTag=" + activeTag + ", section=" + section + ", sortSeq="
				+ sortSeq + ", defaultTag=" + defaultTag + ", bulletNo=" + bulletNo + ", addSi=" + addSi + ", remarks="
				+ remarks + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", deductibles=" + deductibles + "]";
	}
	
	
	
}