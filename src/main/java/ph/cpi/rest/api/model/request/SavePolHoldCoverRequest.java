package ph.cpi.rest.api.model.request;

public class SavePolHoldCoverRequest {
	private String policyId;
	private String holdCovId;
	private String lineCd;
	private String holdCovYear;
	private String holdCovSeqNo;
	private String holdCovRevNo;
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
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getHoldCovId() {
		return holdCovId;
	}
	public void setHoldCovId(String holdCovId) {
		this.holdCovId = holdCovId;
	}
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public String getHoldCovYear() {
		return holdCovYear;
	}
	public void setHoldCovYear(String holdCovYear) {
		this.holdCovYear = holdCovYear;
	}
	public String getHoldCovSeqNo() {
		return holdCovSeqNo;
	}
	public void setHoldCovSeqNo(String holdCovSeqNo) {
		this.holdCovSeqNo = holdCovSeqNo;
	}
	public String getHoldCovRevNo() {
		return holdCovRevNo;
	}
	public void setHoldCovRevNo(String holdCovRevNo) {
		this.holdCovRevNo = holdCovRevNo;
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
	
	@Override
	public String toString() {
		return "SavePolHoldCoverRequest [policyId=" + policyId + ", holdCovId=" + holdCovId + ", lineCd=" + lineCd
				+ ", holdCovYear=" + holdCovYear + ", holdCovSeqNo=" + holdCovSeqNo + ", holdCovRevNo=" + holdCovRevNo
				+ ", periodFrom=" + periodFrom + ", periodTo=" + periodTo + ", compRefHoldCovNo=" + compRefHoldCovNo
				+ ", status=" + status + ", reqBy=" + reqBy + ", reqDate=" + reqDate + ", preparedBy=" + preparedBy
				+ ", approvedBy=" + approvedBy + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", totalNoDays=" + totalNoDays
				+ ", premAmt=" + premAmt + ", commAmt=" + commAmt + ", vatRiComm=" + vatRiComm + ", netDue=" + netDue
				+ ", currCd=" + currCd + ", currRt=" + currRt + "]";
	}
}
