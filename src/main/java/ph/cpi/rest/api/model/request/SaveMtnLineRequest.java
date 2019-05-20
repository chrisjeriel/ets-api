package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveMtnLineRequest {
	 
   private List<Lines> saveLine;
   private List<Lines> deleteLine;
   
	public List<Lines> getSaveLine() {
		return saveLine;
	}
	public void setSaveLine(List<Lines> saveLine) {
		this.saveLine = saveLine;
	}
	public List<Lines> getDeleteLine() {
		return deleteLine;
	}
	public void setDeleteLine(List<Lines> deleteLine) {
		this.deleteLine = deleteLine;
	}
	@Override
	public String toString() {
		return "SaveMtnLineRequest [saveLine=" + saveLine + ", deleteLine=" + deleteLine + "]";
	}
  
}

@Alias("SaveMtnLine")
class Lines {
	private String lineCd ;
    private String description ;
    private String saveCutOffTime;
    private String activeTag ;
    private String catTag ;
    private String renewalTag ;
    private String openCoverTag ;
    private String referenceNo ;
    private String sortSeq ;
    private String remarks ;
    private String createUser ;
    private String createDate ;
    private String updateUser ;
    private String updateDate ;
    private String alopTag ;
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSaveCutOffTime() {
		return saveCutOffTime;
	}
	public void setSaveCutOffTime(String saveCutOffTime) {
		this.saveCutOffTime = saveCutOffTime;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
	}
	public String getCatTag() {
		return catTag;
	}
	public void setCatTag(String catTag) {
		this.catTag = catTag;
	}
	public String getRenewalTag() {
		return renewalTag;
	}
	public void setRenewalTag(String renewalTag) {
		this.renewalTag = renewalTag;
	}
	public String getOpenCoverTag() {
		return openCoverTag;
	}
	public void setOpenCoverTag(String openCoverTag) {
		this.openCoverTag = openCoverTag;
	}
	public String getReferenceNo() {
		return referenceNo;
	}
	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}
	public String getSortSeq() {
		return sortSeq;
	}
	public void setSortSeq(String sortSeq) {
		this.sortSeq = sortSeq;
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
	public String getAlopTag() {
		return alopTag;
	}
	public void setAlopTag(String alopTag) {
		this.alopTag = alopTag;
	}
	@Override
	public String toString() {
		return "Lines [lineCd=" + lineCd + ", description=" + description + ", saveCutOffTime=" + saveCutOffTime
				+ ", activeTag=" + activeTag + ", catTag=" + catTag + ", renewalTag=" + renewalTag + ", openCoverTag="
				+ openCoverTag + ", referenceNo=" + referenceNo + ", sortSeq=" + sortSeq + ", remarks=" + remarks
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", alopTag=" + alopTag + "]";
	}
	
    
}