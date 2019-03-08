package ph.cpi.rest.api.model.maintenance;

import org.joda.time.LocalDateTime;

public class Line {
	private String lineCd;
	private String description;
	private String activeTag;
	private String catTag;
	private String renewalTag;
	private String openCoverTag;
	private Integer referenceNo;
	private Integer sortSeq;
	private String remarks;
	private String createUser;
	private LocalDateTime createDate;
	private String updateUser;
	private LocalDateTime updateDate;
	
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
	public Integer getReferenceNo() {
		return referenceNo;
	}
	public void setReferenceNo(Integer referenceNo) {
		this.referenceNo = referenceNo;
	}
	public Integer getSortSeq() {
		return sortSeq;
	}
	public void setSortSeq(Integer sortSeq) {
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
	public LocalDateTime getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public LocalDateTime getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}
	
	@Override
	public String toString() {
		return "Line [lineCd=" + lineCd + ", description=" + description + ", activeTag=" + activeTag + ", catTag="
				+ catTag + ", renewalTag=" + renewalTag + ", openCoverTag=" + openCoverTag + ", referenceNo="
				+ referenceNo + ", sortSeq=" + sortSeq + ", remarks=" + remarks + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
