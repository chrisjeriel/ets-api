package ph.cpi.rest.api.model.request;

public class SaveQuoteHoldCoverRequest {
	private String quoteId;
	private String holdCoverId ;
	private String lineCd;
	private String holdCoverYear;
	private String holdCoverSeqNo;
	private String holdCoverRevNo;
	private String optionId;
	private String periodFrom;
	private String periodTo;
	private String compRefHoldCovNo;
	private String status;
	private String reqBy;
	private String reqDate;
	private String preparedBy;
	private String approvedBy;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	
	private String totalNoDays;
	private String premAmt;
	private String commAmt;
	private String vatRiComm;
	private String netDue;
	private String currCd;
	private String currRt;
	
	public String getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}
	public String getHoldCoverId() {
		return holdCoverId;
	}
	public void setHoldCoverId(String holdCoverId) {
		this.holdCoverId = holdCoverId;
	}
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public String getHoldCoverYear() {
		return holdCoverYear;
	}
	public void setHoldCoverYear(String holdCoverYear) {
		this.holdCoverYear = holdCoverYear;
	}
	public String getHoldCoverSeqNo() {
		return holdCoverSeqNo;
	}
	public void setHoldCoverSeqNo(String holdCoverSeqNo) {
		this.holdCoverSeqNo = holdCoverSeqNo;
	}
	public String getHoldCoverRevNo() {
		return holdCoverRevNo;
	}
	public void setHoldCoverRevNo(String holdCoverRevNo) {
		this.holdCoverRevNo = holdCoverRevNo;
	}
	public String getOptionId() {
		return optionId;
	}
	public void setOptionId(String optionId) {
		this.optionId = optionId;
	}
	public String getPeriodFrom() {
		return periodFrom;
	}
	public void setPeriodFrom(String periodFrom) {
		this.periodFrom = periodFrom;
	}
	public String getPeriodTo() {
		return periodTo;
	}
	public void setPeriodTo(String periodTo) {
		this.periodTo = periodTo;
	}
	public String getCompRefHoldCovNo() {
		return compRefHoldCovNo;
	}
	public void setCompRefHoldCovNo(String compRefHoldCovNo) {
		this.compRefHoldCovNo = compRefHoldCovNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getReqBy() {
		return reqBy;
	}
	public void setReqBy(String reqBy) {
		this.reqBy = reqBy;
	}
	public String getReqDate() {
		return reqDate;
	}
	public void setReqDate(String reqDate) {
		this.reqDate = reqDate;
	}
	public String getPreparedBy() {
		return preparedBy;
	}
	public void setPreparedBy(String preparedBy) {
		this.preparedBy = preparedBy;
	}
	public String getApprovedBy() {
		return approvedBy;
	}
	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
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
	public String getTotalNoDays() {
		return totalNoDays;
	}
	public void setTotalNoDays(String totalNoDays) {
		this.totalNoDays = totalNoDays;
	}
	public String getPremAmt() {
		return premAmt;
	}
	public void setPremAmt(String premAmt) {
		this.premAmt = premAmt;
	}
	public String getCommAmt() {
		return commAmt;
	}
	public void setCommAmt(String commAmt) {
		this.commAmt = commAmt;
	}
	public String getVatRiComm() {
		return vatRiComm;
	}
	public void setVatRiComm(String vatRiComm) {
		this.vatRiComm = vatRiComm;
	}
	public String getNetDue() {
		return netDue;
	}
	public void setNetDue(String netDue) {
		this.netDue = netDue;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public String getCurrRt() {
		return currRt;
	}
	public void setCurrRt(String currRt) {
		this.currRt = currRt;
	}
	@Override
	public String toString() {
		return "SaveQuoteHoldCoverRequest [quoteId=" + quoteId + ", holdCoverId=" + holdCoverId + ", lineCd=" + lineCd
				+ ", holdCoverYear=" + holdCoverYear + ", holdCoverSeqNo=" + holdCoverSeqNo + ", holdCoverRevNo="
				+ holdCoverRevNo + ", optionId=" + optionId + ", periodFrom=" + periodFrom + ", periodTo=" + periodTo
				+ ", compRefHoldCovNo=" + compRefHoldCovNo + ", status=" + status + ", reqBy=" + reqBy + ", reqDate="
				+ reqDate + ", preparedBy=" + preparedBy + ", approvedBy=" + approvedBy + ", createUser=" + createUser
				+ ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate
				+ ", totalNoDays=" + totalNoDays + ", premAmt=" + premAmt + ", commAmt=" + commAmt + ", vatRiComm="
				+ vatRiComm + ", netDue=" + netDue + ", currCd=" + currCd + ", currRt=" + currRt + "]";
	}
}
