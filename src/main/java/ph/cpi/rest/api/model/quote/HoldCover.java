package ph.cpi.rest.api.model.quote;

import org.joda.time.LocalDateTime;

public class HoldCover {
	private Integer holdCoverId ;
	private String holdCoverNo;
	private String lineCd;
	private String lineCdDesc;
	private Integer holdCoverYear;
	private Integer holdCoverSeqNo;
	private Integer holdCoverRevNo;
	private LocalDateTime periodFrom;
	private LocalDateTime periodTo;
	private String compRefHoldCovNo;
	private String status;
	private String reqBy;
	private LocalDateTime reqDate;
	private String preparedBy;
	private String approvedBy;
	private String createUser;
	private LocalDateTime createDate;
	private String updateUser;
	private LocalDateTime updateDate;
	public Integer getHoldCoverId() {
		return holdCoverId;
	}
	public void setHoldCoverId(Integer holdCoverId) {
		this.holdCoverId = holdCoverId;
	}
	public String getHoldCoverNo() {
		return holdCoverNo;
	}
	public void setHoldCoverNo(String holdCoverNo) {
		this.holdCoverNo = holdCoverNo;
	}
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
	public Integer getHoldCoverYear() {
		return holdCoverYear;
	}
	public void setHoldCoverYear(Integer holdCoverYear) {
		this.holdCoverYear = holdCoverYear;
	}
	public Integer getHoldCoverSeqNo() {
		return holdCoverSeqNo;
	}
	public void setHoldCoverSeqNo(Integer holdCoverSeqNo) {
		this.holdCoverSeqNo = holdCoverSeqNo;
	}
	public Integer getHoldCoverRevNo() {
		return holdCoverRevNo;
	}
	public void setHoldCoverRevNo(Integer holdCoverRevNo) {
		this.holdCoverRevNo = holdCoverRevNo;
	}
	public LocalDateTime getPeriodFrom() {
		return periodFrom;
	}
	public void setPeriodFrom(LocalDateTime periodFrom) {
		this.periodFrom = periodFrom;
	}
	public LocalDateTime getPeriodTo() {
		return periodTo;
	}
	public void setPeriodTo(LocalDateTime periodTo) {
		this.periodTo = periodTo;
	}
	public String getCompRefHoldCovNo() {
		return compRefHoldCovNo;
	}
	public void setCompRefHoldCovNo(String compRefHoldCovNo) {
		this.compRefHoldCovNo = compRefHoldCovNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getReqBy() {
		return reqBy;
	}
	public void setReqBy(String reqBy) {
		this.reqBy = reqBy;
	}
	public LocalDateTime getReqDate() {
		return reqDate;
	}
	public void setReqDate(LocalDateTime reqDate) {
		this.reqDate = reqDate;
	}
	public String getPreparedBy() {
		return preparedBy;
	}
	public void setPreparedBy(String preparedBy) {
		this.preparedBy = preparedBy;
	}
	public String getApprovedBy() {
		return approvedBy;
	}
	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
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
		return "HoldCover [holdCoverId=" + holdCoverId + ", holdCoverNo=" + holdCoverNo + ", lineCd=" + lineCd
				+ ", lineCdDesc=" + lineCdDesc + ", holdCoverYear=" + holdCoverYear + ", holdCoverSeqNo="
				+ holdCoverSeqNo + ", holdCoverRevNo=" + holdCoverRevNo + ", periodFrom=" + periodFrom + ", periodTo="
				+ periodTo + ", compRefHoldCovNo=" + compRefHoldCovNo + ", status=" + status + ", reqBy=" + reqBy
				+ ", reqDate=" + reqDate + ", preparedBy=" + preparedBy + ", approvedBy=" + approvedBy + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + "]";
	}

}
