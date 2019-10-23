package ph.cpi.rest.api.model.request;

public class GenerateAcseORSeriesRequest {
	private String orType;
	private Integer orFrom;
	private Integer orTo;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public String getOrType() {
		return orType;
	}
	public void setOrType(String orType) {
		this.orType = orType;
	}
	public Integer getOrFrom() {
		return orFrom;
	}
	public void setOrFrom(Integer orFrom) {
		this.orFrom = orFrom;
	}
	public Integer getOrTo() {
		return orTo;
	}
	public void setOrTo(Integer orTo) {
		this.orTo = orTo;
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
		return "GenerateAcseORSeriesRequest [orType=" + orType + ", orFrom=" + orFrom + ", orTo=" + orTo
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	
}
