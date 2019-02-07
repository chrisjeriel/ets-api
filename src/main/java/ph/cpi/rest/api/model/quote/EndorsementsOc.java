package ph.cpi.rest.api.model.quote;

import org.joda.time.LocalDateTime;

public class EndorsementsOc {
	
	private Integer endtCd;
	private Integer quoteId;
	private String quotationNo;
	private Integer projId;
	private String projDesc;
	/* private String endtCd; */ //Removed should be Integer
	private String endtTitle;
	private String remarks;
	private String createUser;
	private LocalDateTime createDate;
	private String updateUser;
	private LocalDateTime updateDate;
	public Integer getEndtCd() {
		return endtCd;
	}
	public void setEndtCd(Integer endtCd) {
		this.endtCd = endtCd;
	}
	public Integer getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}
	public String getQuotationNo() {
		return quotationNo;
	}
	public void setQuotationNo(String quotationNo) {
		this.quotationNo = quotationNo;
	}
	public Integer getProjId() {
		return projId;
	}
	public void setProjId(Integer projId) {
		this.projId = projId;
	}
	public String getProjDesc() {
		return projDesc;
	}
	public void setProjDesc(String projDesc) {
		this.projDesc = projDesc;
	}
	public String getEndtTitle() {
		return endtTitle;
	}
	public void setEndtTitle(String endtTitle) {
		this.endtTitle = endtTitle;
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
		return "EndorsementsOc [endtCd=" + endtCd + ", quoteId=" + quoteId + ", quotationNo=" + quotationNo
				+ ", projId=" + projId + ", projDesc=" + projDesc + ", endtTitle=" + endtTitle + ", remarks=" + remarks
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	
}
