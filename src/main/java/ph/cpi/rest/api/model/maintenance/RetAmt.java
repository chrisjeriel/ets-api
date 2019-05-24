package ph.cpi.rest.api.model.maintenance;

import org.joda.time.DateTime;

public class RetAmt {
	
	private String retentionId;
    private String lineCd;
    private String lineClassCd;
    private String retLineAmt;
    private DateTime effDateFrom;
    private DateTime effDateTo;
    private String activeTag;
    private String remarks;
    private String createUser;
    private DateTime createDate;
    private String updateUser;
    private DateTime updateDate;
    private String okDelete;
    
	public String getRetentionId() {
		return retentionId;
	}
	public void setRetentionId(String retentionId) {
		this.retentionId = retentionId;
	}
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public String getLineClassCd() {
		return lineClassCd;
	}
	public void setLineClassCd(String lineClassCd) {
		this.lineClassCd = lineClassCd;
	}
	public String getRetLineAmt() {
		return retLineAmt;
	}
	public void setRetLineAmt(String retLineAmt) {
		this.retLineAmt = retLineAmt;
	}
	public DateTime getEffDateFrom() {
		return effDateFrom;
	}
	public void setEffDateFrom(DateTime effDateFrom) {
		this.effDateFrom = effDateFrom;
	}
	public DateTime getEffDateTo() {
		return effDateTo;
	}
	public void setEffDateTo(DateTime effDateTo) {
		this.effDateTo = effDateTo;
	}
	public String getActiveTag() {
		return activeTag;
	}
	public void setActiveTag(String activeTag) {
		this.activeTag = activeTag;
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
	public String getOkDelete() {
		return okDelete;
	}
	public void setOkDelete(String okDelete) {
		this.okDelete = okDelete;
	}
	@Override
	public String toString() {
		return "RetAmt [retentionId=" + retentionId + ", lineCd=" + lineCd + ", lineClassCd=" + lineClassCd
				+ ", retLineAmt=" + retLineAmt + ", effDateFrom=" + effDateFrom + ", effDateTo=" + effDateTo
				+ ", activeTag=" + activeTag + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", okDelete=" + okDelete
				+ "]";
	}
}
