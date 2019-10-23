package ph.cpi.rest.api.model.maintenance;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class SecIITreatyLimit {

	private String lineCd;
	private String lineClassCd;
	private String currencyCd;
	private Integer seciiTrtyLimId;
    private BigDecimal amount;
    private DateTime effDateFrom;
    private String activeTag;
    private String remarks;
    private String createUser;
    private DateTime createDate;
    private String updateUser;
    private DateTime updateDate;
    private String okDelete;
    private BigDecimal pctShareTsi;
    
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
	public Integer getSeciiTrtyLimId() {
		return seciiTrtyLimId;
	}
	public void setSeciiTrtyLimId(Integer seciiTrtyLimId) {
		this.seciiTrtyLimId = seciiTrtyLimId;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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
	public BigDecimal getPctShareTsi() {
		return pctShareTsi;
	}
	public void setPctShareTsi(BigDecimal pctShareTsi) {
		this.pctShareTsi = pctShareTsi;
	}
	@Override
	public String toString() {
		return "SecIITreatyLimit [lineCd=" + lineCd + ", lineClassCd=" + lineClassCd + ", currencyCd=" + currencyCd
				+ ", seciiTrtyLimId=" + seciiTrtyLimId + ", amount=" + amount + ", effDateFrom=" + effDateFrom
				+ ", activeTag=" + activeTag + ", remarks=" + remarks + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", okDelete=" + okDelete
				+ ", pctShareTsi=" + pctShareTsi + "]";
	}
}
