package ph.cpi.rest.api.model.maintenance;

import org.joda.time.LocalDateTime;

public class Treaty {
	private Integer treatyId;
	private String treatyName;
	private String treatyAbbr;
	private String activeTag;
	private String comRate;
	private LocalDateTime effDateFrom;
	private LocalDateTime effDateTo;
	private Integer sortSeq;
	private String treatyType;
	private String remarks;
	private String createUser;
	private LocalDateTime createDate;
	private String updateUser;
	private LocalDateTime updateDate;
	public Integer getTreatyId() {
		return treatyId;
	}
	public void setTreatyId(Integer treatyId) {
		this.treatyId = treatyId;
	}
	public String getTreatyName() {
		return treatyName;
	}
	public void setTreatyName(String treatyName) {
		this.treatyName = treatyName;
	}
	public String getTreatyAbbr() {
		return treatyAbbr;
	}
	public void setTreatyAbbr(String treatyAbbr) {
		this.treatyAbbr = treatyAbbr;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
	}
	public String getComRate() {
		return comRate;
	}
	public void setComRate(String comRate) {
		this.comRate = comRate;
	}
	public LocalDateTime getEffDateFrom() {
		return effDateFrom;
	}
	public void setEffDateFrom(LocalDateTime effDateFrom) {
		this.effDateFrom = effDateFrom;
	}
	public LocalDateTime getEffDateTo() {
		return effDateTo;
	}
	public void setEffDateTo(LocalDateTime effDateTo) {
		this.effDateTo = effDateTo;
	}
	public Integer getSortSeq() {
		return sortSeq;
	}
	public void setSortSeq(Integer sortSeq) {
		this.sortSeq = sortSeq;
	}
	public String getTreatyType() {
		return treatyType;
	}
	public void setTreatyType(String treatyType) {
		this.treatyType = treatyType;
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
		return "Treaty [treatyId=" + treatyId + ", treatyName=" + treatyName + ", treatyAbbr=" + treatyAbbr
				+ ", activeTag=" + activeTag + ", comRate=" + comRate + ", effDateFrom=" + effDateFrom + ", effDateTo="
				+ effDateTo + ", sortSeq=" + sortSeq + ", treatyType=" + treatyType + ", remarks=" + remarks
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	
	
}
