package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveMtnApproverFnRequest {
	private String userId;
	private List<SaveApproverFn> saveList;
	private List<SaveApproverFn> delList;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public List<SaveApproverFn> getSaveList() {
		return saveList;
	}
	public void setSaveList(List<SaveApproverFn> saveList) {
		this.saveList = saveList;
	}
	public List<SaveApproverFn> getDelList() {
		return delList;
	}
	public void setDelList(List<SaveApproverFn> delList) {
		this.delList = delList;
	}
	@Override
	public String toString() {
		return "SaveMtnApproverFnRequest [userId=" + userId + ", saveList=" + saveList + ", delList=" + delList + "]";
	}
	
}

class SaveApproverFn{
	private String approvalCd;
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
		return "SaveApproverFn [approvalCd=" + approvalCd + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}