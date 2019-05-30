package ph.cpi.rest.api.model.request;

import java.util.List;

import org.apache.ibatis.type.Alias;

public class SaveMtnReportParamRequest {
	private List<SaveReportParam> saveReportParam;
	private List<SaveReportParam> delReportParam;
	
	public List<SaveReportParam> getSaveReportParam() {
		return saveReportParam;
	}
	public void setSaveReportParam(List<SaveReportParam> saveReportParam) {
		this.saveReportParam = saveReportParam;
	}
	public List<SaveReportParam> getDelReportParam() {
		return delReportParam;
	}
	public void setDelReportParam(List<SaveReportParam> delReportParam) {
		this.delReportParam = delReportParam;
	}
	@Override
	public String toString() {
		return "SaveMtnReportParamRequest [saveReportParam=" + saveReportParam + ", delReportParam=" + delReportParam
				+ "]";
	}
}

@Alias("SaveMtnReportParam")
class SaveReportParam{
	private String reportId;
	private String title;
	private String text;
	private String lineCd;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
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
		return "SaveReportParam [reportId=" + reportId + ", title=" + title + ", text=" + text + ", lineCd="
				+ lineCd + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
