package ph.cpi.rest.api.model.request;

public class UpdateClmDetailsRequest {

	private Integer claimId;
	private Integer refPolId;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public Integer getClaimId() {
		return claimId;
	}
	public void setClaimId(Integer claimId) {
		this.claimId = claimId;
	}
	public Integer getRefPolId() {
		return refPolId;
	}
	public void setRefPolId(Integer refPolId) {
		this.refPolId = refPolId;
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
		return "UpdateClmDetailsRequest [claimId=" + claimId + ", refPolId=" + refPolId + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
