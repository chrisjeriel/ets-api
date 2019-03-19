package ph.cpi.rest.api.model.maintenance;

import org.joda.time.LocalDateTime;

public class Reports {
	 private String reportId;
	 private String reportTitle;
	 private String fileName;
	 private String reportGrp;
	 private String genFreq;
	 private String csvFileSw;
	 private String remarks;
	 private String createUser;
	 private LocalDateTime createDate;
	 private String updateUser;
	 private LocalDateTime updateDate;
	 
	 
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


	public String getCsvFileSw() {
		return csvFileSw;
	}


	public void setCsvFileSw(String csvFileSw) {
		this.csvFileSw = csvFileSw;
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


	public LocalDateTime getCreateDate() {
		return createDate;
	}


	public void setCreateDate(LocalDateTime createDate) {
		this.createDate = createDate;
	}


	public String getUpdateUser() {
		return updateUser;
	}


	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}


	public LocalDateTime getUpdateDate() {
		return updateDate;
	}


	public void setUpdateDate(LocalDateTime updateDate) {
		this.updateDate = updateDate;
	}


	@Override
	public String toString() {
		return "Reports [reportId=" + reportId + ", reportTitle=" + reportTitle + ", fileName=" + fileName
				+ ", reportGrp=" + reportGrp + ", genFreq=" + genFreq + ", csvFileSw=" + csvFileSw + ", remarks="
				+ remarks + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	 
	 
	 
}
