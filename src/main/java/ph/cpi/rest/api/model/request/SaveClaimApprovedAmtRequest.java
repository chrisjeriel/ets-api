package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveClaimApprovedAmtRequest {
	private List<ApprovedAmts> saveClaimApprovedAmt;

	public List<ApprovedAmts> getSaveClaimApprovedAmt() {
		return saveClaimApprovedAmt;
	}

	public void setSaveClaimApprovedAmt(List<ApprovedAmts> saveClaimApprovedAmt) {
		this.saveClaimApprovedAmt = saveClaimApprovedAmt;
	}

	@Override
	public String toString() {
		return "SaveClaimApprovedAmtRequest [saveClaimApprovedAmt=" + saveClaimApprovedAmt + "]";
	}
	
}
class ApprovedAmts {
	private String  claimId;
	private String  histNo;
	private String  approvedAmt;
	private String  approvedBy;
	private String  approvedDate;
	private String  remarks;
	private String 	activeTag;
	private String 	createUser;
	private String  createDate;
	private String 	updateUser;
	private String  updateDate;
	public String getClaimId() {
		return claimId;
	}
	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}
	public String getHistNo() {
		return histNo;
	}
	public void setHistNo(String histNo) {
		this.histNo = histNo;
	}
	public String getApprovedAmt() {
		return approvedAmt;
	}
	public void setApprovedAmt(String approvedAmt) {
		this.approvedAmt = approvedAmt;
	}
	public String getApprovedBy() {
		return approvedBy;
	}
	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}
	public String getApprovedDate() {
		return approvedDate;
	}
	public void setApprovedDate(String approvedDate) {
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
	@Override
	public String toString() {
		return "ApprovedAmts [claimId=" + claimId + ", histNo=" + histNo + ", approvedAmt=" + approvedAmt
				+ ", approvedBy=" + approvedBy + ", approvedDate=" + approvedDate + ", remarks=" + remarks
				+ ", activeTag=" + activeTag + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
