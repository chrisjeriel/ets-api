package ph.cpi.rest.api.model.request;

public class SaveAcitQSOARequest {

	private String cedingId;
	private Integer gnrtQtr;
	private Integer gnrtYear;
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
	public Integer getGnrtQtr() {
		return gnrtQtr;
	}
	public void setGnrtQtr(Integer gnrtQtr) {
		this.gnrtQtr = gnrtQtr;
	}
	public Integer getGnrtYear() {
		return gnrtYear;
	}
	public void setGnrtYear(Integer gnrtYear) {
		this.gnrtYear = gnrtYear;
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
		return "SaveAcitQSOARequest [cedingId=" + cedingId + ", gnrtQtr=" + gnrtQtr + ", gnrtYear=" + gnrtYear
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}
