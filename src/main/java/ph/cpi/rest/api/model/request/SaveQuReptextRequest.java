package ph.cpi.rest.api.model.request;

public class SaveQuReptextRequest {
	private String quoteId;
	private String reportId;
	private String reptext01;
	private String reptext02;
	private String reptext03;
	private String reptext04;
	private String reptext05;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public String getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}
	public String getReportId() {
		return reportId;
	}
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}
	public String getReptext01() {
		return reptext01;
	}
	public void setReptext01(String reptext01) {
		this.reptext01 = reptext01;
	}
	public String getReptext02() {
		return reptext02;
	}
	public void setReptext02(String reptext02) {
		this.reptext02 = reptext02;
	}
	public String getReptext03() {
		return reptext03;
	}
	public void setReptext03(String reptext03) {
		this.reptext03 = reptext03;
	}
	public String getReptext04() {
		return reptext04;
	}
	public void setReptext04(String reptext04) {
		this.reptext04 = reptext04;
	}
	public String getReptext05() {
		return reptext05;
	}
	public void setReptext05(String reptext05) {
		this.reptext05 = reptext05;
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
		return "SaveQuReptextRequest [quoteId=" + quoteId + ", reportId=" + reportId + ", reptext01=" + reptext01
				+ ", reptext02=" + reptext02 + ", reptext03=" + reptext03 + ", reptext04=" + reptext04 + ", reptext05="
				+ reptext05 + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	
}
