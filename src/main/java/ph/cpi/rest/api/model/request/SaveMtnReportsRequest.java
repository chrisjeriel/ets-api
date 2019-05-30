package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveMtnReportsRequest {
	private List<SaveReports> saveReports;
	private List<SaveReports> delReports;
	
	public List<SaveReports> getSaveReports() {
		return saveReports;
	}
	public void setSaveReports(List<SaveReports> saveReports) {
		this.saveReports = saveReports;
	}
	public List<SaveReports> getDelReports() {
		return delReports;
	}
	public void setDelReports(List<SaveReports> delReports) {
		this.delReports = delReports;
	}
	
	@Override
	public String toString() {
		return "SaveMtnReportsRequest [saveReports=" + saveReports + ", delReports=" + delReports + "]";
	}
}

@Alias("SaveMtnReports")
class SaveReports{
	private String reportId;
	private String reportTitle;
	private String fileName;
	private String reportGrp;
	private String genFreq;
	private String remarks;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
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
		return "SaveReports [reportId=" + reportId + ", reportTitle=" + reportTitle + ", fileName=" + fileName
				+ ", reportGrp=" + reportGrp + ", genFreq=" + genFreq + ", remarks=" + remarks + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + "]";
	}
}
