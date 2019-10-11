package ph.cpi.rest.api.model.request;

public class GenerateAcitARSeriesRequest {
	private Integer arFrom;
	private Integer arTo;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public Integer getArFrom() {
		return arFrom;
	}
	public void setArFrom(Integer arFrom) {
		this.arFrom = arFrom;
	}
	public Integer getArTo() {
		return arTo;
	}
	public void setArTo(Integer arTo) {
		this.arTo = arTo;
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
		return "GenerateAcitARSeriesRequest [arFrom=" + arFrom + ", arTo=" + arTo + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
