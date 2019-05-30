package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class Reports {
	 private String reportId;
	 private String reportTitle;
	 private String fileName;
	 private String reportGrp;
	 private String genFreq;
	 private String remarks;
	 private String createUser;
	 private DateTime createDate;
	 private String updateUser;
	 private DateTime updateDate;
	 
	 private ReportsParam reportsParam;

	public String getReportId() {
		return reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public String getReportTitle() {
		return reportTitle;
	}

	public void setReportTitle(String reportTitle) {
		this.reportTitle = reportTitle;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getReportGrp() {
		return reportGrp;
	}

	public void setReportGrp(String reportGrp) {
		this.reportGrp = reportGrp;
	}

	public String getGenFreq() {
		return genFreq;
	}

	public void setGenFreq(String genFreq) {
		this.genFreq = genFreq;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public DateTime getCreateDate() {
		return createDate;
	}

	public void setCreateDate(DateTime createDate) {
		this.createDate = createDate;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public DateTime getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(DateTime updateDate) {
		this.updateDate = updateDate;
	}

	public ReportsParam getReportsParam() {
		return reportsParam;
	}

	public void setReportsParam(ReportsParam reportsParam) {
		this.reportsParam = reportsParam;
	}

	@Override
	public String toString() {
		return "Reports [reportId=" + reportId + ", reportTitle=" + reportTitle + ", fileName=" + fileName
				+ ", reportGrp=" + reportGrp + ", genFreq=" + genFreq + ", remarks="
				+ remarks + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", reportsParam=" + reportsParam + "]";
	}

}
