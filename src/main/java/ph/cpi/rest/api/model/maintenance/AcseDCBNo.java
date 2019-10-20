package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class AcseDCBNo {
	private Integer dcbYear;
	private Integer dcbNo;
	private DateTime dcbDate;
	private String dcbStatus;
	private String remarks;
	private String autoTag;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private String okDelete;
	
	public Integer getDcbYear() {
		return dcbYear;
	}
	public void setDcbYear(Integer dcbYear) {
		this.dcbYear = dcbYear;
	}
	public Integer getDcbNo() {
		return dcbNo;
	}
	public void setDcbNo(Integer dcbNo) {
		this.dcbNo = dcbNo;
	}
	public DateTime getDcbDate() {
		return dcbDate;
	}
	public void setDcbDate(DateTime dcbDate) {
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
	
	
	public String getOkDelete() {
		return okDelete;
	}
	public void setOkDelete(String okDelete) {
		this.okDelete = okDelete;
	}
	@Override
	public String toString() {
		return "AcseDCBNo [dcbYear=" + dcbYear + ", dcbNo=" + dcbNo + ", dcbDate=" + dcbDate + ", dcbStatus="
				+ dcbStatus + ", remarks=" + remarks + ", autoTag=" + autoTag + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate
				+ ", okDelete=" + okDelete + "]";
	}
	
}
