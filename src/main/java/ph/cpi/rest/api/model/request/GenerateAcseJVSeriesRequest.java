package ph.cpi.rest.api.model.request;

public class GenerateAcseJVSeriesRequest {
	private Integer jvFrom;
	private Integer jvTo;
	private Integer jvYear;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public Integer getJvFrom() {
		return jvFrom;
	}
	public void setJvFrom(Integer jvFrom) {
		this.jvFrom = jvFrom;
	}
	public Integer getJvTo() {
		return jvTo;
	}
	public void setJvTo(Integer jvTo) {
		this.jvTo = jvTo;
	}
	public Integer getJvYear() {
		return jvYear;
	}
	public void setJvYear(Integer jvYear) {
		this.jvYear = jvYear;
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
		return "GenerateAcseJVSeriesRequest [jvFrom=" + jvFrom + ", jvTo=" + jvTo + ", jvYear=" + jvYear
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	
}
