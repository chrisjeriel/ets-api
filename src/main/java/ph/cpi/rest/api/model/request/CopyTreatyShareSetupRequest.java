package ph.cpi.rest.api.model.request;

public class CopyTreatyShareSetupRequest {

	private String currencyCd;
	private Integer checker;
	private Integer copyFromYear;
	private Integer copyToYear;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public Integer getChecker() {
		return checker;
	}
	public void setChecker(Integer checker) {
		this.checker = checker;
	}
	public Integer getCopyFromYear() {
		return copyFromYear;
	}
	public void setCopyFromYear(Integer copyFromYear) {
		this.copyFromYear = copyFromYear;
	}
	public Integer getCopyToYear() {
		return copyToYear;
	}
	public void setCopyToYear(Integer copyToYear) {
		this.copyToYear = copyToYear;
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
		return "CopyTreatyShareSetupRequest [currencyCd=" + currencyCd + ", checker=" + checker + ", copyFromYear="
				+ copyFromYear + ", copyToYear=" + copyToYear + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
