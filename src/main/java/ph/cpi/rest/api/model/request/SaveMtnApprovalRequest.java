package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveMtnApprovalRequest {
	private List<Approvals> saveMtnApproval;
	private List<Approvals> deleteMtnApproval;
	public List<Approvals> getSaveMtnApproval() {
		return saveMtnApproval;
	}
	public void setSaveMtnApproval(List<Approvals> saveMtnApproval) {
		this.saveMtnApproval = saveMtnApproval;
	}
	public List<Approvals> getDeleteMtnApproval() {
		return deleteMtnApproval;
	}
	public void setDeleteMtnApproval(List<Approvals> deleteMtnApproval) {
		this.deleteMtnApproval = deleteMtnApproval;
	}
	@Override
	public String toString() {
		return "SaveMtnApprovalRequest [saveMtnApproval=" + saveMtnApproval + ", deleteMtnApproval=" + deleteMtnApproval
				+ "]";
	}
	
}

@Alias("MtnApprovals")
class Approvals {
	private String approvalCd;
	private String description;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public String getApprovalCd() {
		return approvalCd;
	}
	public void setApprovalCd(String approvalCd) {
		this.approvalCd = approvalCd;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	@Override
	public String toString() {
		return "Approval [approvalCd=" + approvalCd + ", description=" + description + ", remarks=" + remarks
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}