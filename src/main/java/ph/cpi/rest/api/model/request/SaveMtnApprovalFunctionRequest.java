package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveMtnApprovalFunctionRequest {
	private List<AprrovalFn> saveMtnApprovalFn;
	private List<AprrovalFn> deleteMtnApprovalFn;
	public List<AprrovalFn> getSaveMtnApprovalFn() {
		return saveMtnApprovalFn;
	}
	public void setSaveMtnApprovalFn(List<AprrovalFn> saveMtnApprovalFn) {
		this.saveMtnApprovalFn = saveMtnApprovalFn;
	}
	public List<AprrovalFn> getDeleteMtnApprovalFn() {
		return deleteMtnApprovalFn;
	}
	public void setDeleteMtnApprovalFn(List<AprrovalFn> deleteMtnApprovalFn) {
		this.deleteMtnApprovalFn = deleteMtnApprovalFn;
	}
	@Override
	public String toString() {
		return "SaveMtnApprovalFunctionRequest [saveMtnApprovalFn=" + saveMtnApprovalFn + ", deleteMtnApprovalFn="
				+ deleteMtnApprovalFn + "]";
	}

}

@Alias("MtnApprovalFn")
class AprrovalFn {
	private String approvalCd;
	private String userId;
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
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
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
		return "AprrovalFn [approvalCd=" + approvalCd + ", userId=" + userId + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}