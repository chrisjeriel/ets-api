package ph.cpi.rest.api.model.claims;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class ClaimApprovedAmt {
	private Integer  	claimId;
	private Integer  	histNo;
	private BigDecimal  approvedAmt;
	private String   	approvedBy;
	private DateTime 	approvedDate;
	private String   	remarks;
	private String 	 	activeTag;
	private String 	 	createUser;
	private DateTime 	createDate;
	private String 	 	updateUser;
	private DateTime 	updateDate;
	public Integer getClaimId() {
		return claimId;
	}
	public void setClaimId(Integer claimId) {
		this.claimId = claimId;
	}
	public Integer getHistNo() {
		return histNo;
	}
	public void setHistNo(Integer histNo) {
		this.histNo = histNo;
	}
	public BigDecimal getApprovedAmt() {
		return approvedAmt;
	}
	public void setApprovedAmt(BigDecimal approvedAmt) {
		this.approvedAmt = approvedAmt;
	}
	public String getApprovedBy() {
		return approvedBy;
	}
	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}
	public DateTime getApprovedDate() {
		return approvedDate;
	}
	public void setApprovedDate(DateTime approvedDate) {
		this.approvedDate = approvedDate;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
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
		return "ClaimApprovedAmt [claimId=" + claimId + ", histNo=" + histNo + ", approvedAmt=" + approvedAmt
				+ ", approvedBy=" + approvedBy + ", approvedDate=" + approvedDate + ", remarks=" + remarks
				+ ", activeTag=" + activeTag + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
