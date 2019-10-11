package ph.cpi.rest.api.model.request;

public class GenerateAcitCVSeriesRequest {
	private Integer cvFrom;
	private Integer cvTo;
	private Integer cvYear;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public Integer getCvFrom() {
		return cvFrom;
	}
	public void setCvFrom(Integer cvFrom) {
		this.cvFrom = cvFrom;
	}
	public Integer getCvTo() {
		return cvTo;
	}
	public void setCvTo(Integer cvTo) {
		this.cvTo = cvTo;
	}
	public Integer getCvYear() {
		return cvYear;
	}
	public void setCvYear(Integer cvYear) {
		this.cvYear = cvYear;
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
		return "GenerateAcitCVSeriesRequest [cvFrom=" + cvFrom + ", cvTo=" + cvTo + ", cvYear=" + cvYear
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}
