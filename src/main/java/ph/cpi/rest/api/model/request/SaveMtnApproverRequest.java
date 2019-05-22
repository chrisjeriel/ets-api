package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveMtnApproverRequest {
	private List<SaveApprover> saveList;
	private List<SaveApprover> delList;
	public List<SaveApprover> getSaveList() {
		return saveList;
	}
	public void setSaveList(List<SaveApprover> saveList) {
		this.saveList = saveList;
	}
	public List<SaveApprover> getDelList() {
		return delList;
	}
	public void setDelList(List<SaveApprover> delList) {
		this.delList = delList;
	}
	@Override
	public String toString() {
		return "SaveMtnApproverRequest [saveList=" + saveList + ", delList=" + delList + "]";
	}
	
}

class SaveApprover{
	private String userId;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
		return "SaveApprover [userId=" + userId + ", remarks=" + remarks + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}