package ph.cpi.rest.api.model.request;

public class CopyTreatyLimitRequest {

	private Integer copyFromTreatyLimitId;
	private String copyToLineCd;
	private String copyToLineClassCd;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public Integer getCopyFromTreatyLimitId() {
		return copyFromTreatyLimitId;
	}
	public void setCopyFromTreatyLimitId(Integer copyFromTreatyLimitId) {
		this.copyFromTreatyLimitId = copyFromTreatyLimitId;
	}
	public String getCopyToLineCd() {
		return copyToLineCd;
	}
	public void setCopyToLineCd(String copyToLineCd) {
		this.copyToLineCd = copyToLineCd;
	}
	public String getCopyToLineClassCd() {
		return copyToLineClassCd;
	}
	public void setCopyToLineClassCd(String copyToLineClassCd) {
		this.copyToLineClassCd = copyToLineClassCd;
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
		return "CopyTreatyLimitRequest [copyFromTreatyLimitId=" + copyFromTreatyLimitId + ", copyToLineCd="
				+ copyToLineCd + ", copyToLineClassCd=" + copyToLineClassCd + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}