package ph.cpi.rest.api.model.maintenance;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class RetAmt {
	
	private String lineCd;
	private String lineClassCd;
	private String currencyCd;
	private Integer retentionId;
    private BigDecimal retLineAmt;
    private DateTime effDateFrom;
    private String activeTag;
    private String remarks;
    private String createUser;
    private DateTime createDate;
    private String updateUser;
    private DateTime updateDate;
    private String okDelete;
    
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
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public Integer getRetentionId() {
		return retentionId;
	}
	public void setRetentionId(Integer retentionId) {
		this.retentionId = retentionId;
	}
	public BigDecimal getRetLineAmt() {
		return retLineAmt;
	}
	public void setRetLineAmt(BigDecimal retLineAmt) {
		this.retLineAmt = retLineAmt;
	}
	public DateTime getEffDateFrom() {
		return effDateFrom;
	}
	public void setEffDateFrom(DateTime effDateFrom) {
		this.effDateFrom = effDateFrom;
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
		return "RetAmt [lineCd=" + lineCd + ", lineClassCd=" + lineClassCd + ", currencyCd=" + currencyCd
				+ ", retentionId=" + retentionId + ", retLineAmt=" + retLineAmt + ", effDateFrom=" + effDateFrom
				+ ", activeTag=" + activeTag + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", okDelete=" + okDelete
				+ "]";
	}
}
