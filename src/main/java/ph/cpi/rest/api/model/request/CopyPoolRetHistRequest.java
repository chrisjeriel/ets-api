package ph.cpi.rest.api.model.request;

public class CopyPoolRetHistRequest {

	private Integer copyFromRetHistId;
	private String copyToEffDateFrom;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public Integer getCopyFromRetHistId() {
		return copyFromRetHistId;
	}
	public void setCopyFromRetHistId(Integer copyFromRetHistId) {
		this.copyFromRetHistId = copyFromRetHistId;
	}
	public String getCopyToEffDateFrom() {
		return copyToEffDateFrom;
	}
	public void setCopyToEffDateFrom(String copyToEffDateFrom) {
		this.copyToEffDateFrom = copyToEffDateFrom;
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
		return "CopyPoolRetHistRequest [copyFromRetHistId=" + copyFromRetHistId + ", copyToEffDateFrom="
				+ copyToEffDateFrom + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}
}
