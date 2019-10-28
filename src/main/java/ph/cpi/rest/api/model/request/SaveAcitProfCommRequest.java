package ph.cpi.rest.api.model.request;

public class SaveAcitProfCommRequest {

	private String cedingId;
	private String gnrtDate;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getGnrtDate() {
		return gnrtDate;
	}
	public void setGnrtDate(String gnrtDate) {
		this.gnrtDate = gnrtDate;
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
		return "SaveAcitProfCommRequest [cedingId=" + cedingId + ", gnrtDate=" + gnrtDate + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
