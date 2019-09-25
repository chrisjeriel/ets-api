package ph.cpi.rest.api.model.request;

import java.util.List;

public class SaveMtnAcseDCBNoRequest {
	private List<SaveAcseDCBNo> saveDCBNo;
	private List<SaveAcseDCBNo> delDCBNo;
	
	public List<SaveAcseDCBNo> getSaveDCBNo() {
		return saveDCBNo;
	}
	public void setSaveDCBNo(List<SaveAcseDCBNo> saveDCBNo) {
		this.saveDCBNo = saveDCBNo;
	}
	public List<SaveAcseDCBNo> getDelDCBNo() {
		return delDCBNo;
	}
	public void setDelDCBNo(List<SaveAcseDCBNo> delDCBNo) {
		this.delDCBNo = delDCBNo;
	}
	
	@Override
	public String toString() {
		return "SaveMtnAcseDCBNoRequest [saveDCBNo=" + saveDCBNo + ", delDCBNo=" + delDCBNo + "]";
	}
}

class SaveAcseDCBNo{
	private String dcbYear;
	private String dcbNo;
	private String dcbDate;
	private String dcbStatus;
	private String remarks;
	private String autoTag;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	public String getDcbYear() {
		return dcbYear;
	}
	public void setDcbYear(String dcbYear) {
		this.dcbYear = dcbYear;
	}
	public String getDcbNo() {
		return dcbNo;
	}
	public void setDcbNo(String dcbNo) {
		this.dcbNo = dcbNo;
	}
	public String getDcbDate() {
		return dcbDate;
	}
	public void setDcbDate(String dcbDate) {
		this.dcbDate = dcbDate;
	}
	public String getDcbStatus() {
		return dcbStatus;
	}
	public void setDcbStatus(String dcbStatus) {
		this.dcbStatus = dcbStatus;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getAutoTag() {
		return autoTag;
	}
	public void setAutoTag(String autoTag) {
		this.autoTag = autoTag;
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
		return "SaveAcseDCBNo [dcbYear=" + dcbYear + ", dcbNo=" + dcbNo + ", dcbDate=" + dcbDate + ", dcbStatus="
				+ dcbStatus + ", remarks=" + remarks + ", autoTag=" + autoTag + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
}
