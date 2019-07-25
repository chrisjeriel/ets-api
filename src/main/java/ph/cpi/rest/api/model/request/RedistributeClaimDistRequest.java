package ph.cpi.rest.api.model.request;

public class RedistributeClaimDistRequest {
	private String claimId;
	private String projId;
	private String histNo;
	private String clmDistNo;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public String getClaimId() {
		return claimId;
	}
	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}
	public String getProjId() {
		return projId;
	}
	public void setProjId(String projId) {
		this.projId = projId;
	}
	public String getHistNo() {
		return histNo;
	}
	public void setHistNo(String histNo) {
		this.histNo = histNo;
	}
	public String getClmDistNo() {
		return clmDistNo;
	}
	public void setClmDistNo(String clmDistNo) {
		this.clmDistNo = clmDistNo;
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
		return "RedistributeClaimDistRequest [claimId=" + claimId + ", projId=" + projId + ", histNo=" + histNo
				+ ", clmDistNo=" + clmDistNo + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}
