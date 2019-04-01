package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class Line {
	private String lineCd;
	private String description;
	private DateTime cutOffTime;
	private String activeTag;
	private String catTag;
	private String renewalTag;
	private String openCoverTag;
	private Integer referenceNo;
	private Integer sortSeq;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private String alopTag;
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
	public DateTime getCutOffTime() {
		return cutOffTime;
	}
	public void setCutOffTime(DateTime cutOffTime) {
		this.cutOffTime = cutOffTime;
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
	public <T> DateTime getCreateDate() {
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
	public String getAlopTag() {
		return alopTag;
	}
	public void setAlopTag(String alopTag) {
		this.alopTag = alopTag;
	}
	@Override
	public String toString() {
		return "Line [lineCd=" + lineCd + ", description=" + description + ", cutOffTime=" + cutOffTime + ", activeTag="
				+ activeTag + ", catTag=" + catTag + ", renewalTag=" + renewalTag + ", openCoverTag=" + openCoverTag
				+ ", referenceNo=" + referenceNo + ", sortSeq=" + sortSeq + ", remarks=" + remarks + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + ", alopTag=" + alopTag + "]";
	}

}
