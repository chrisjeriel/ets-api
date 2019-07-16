package ph.cpi.rest.api.model.request;

public class SaveAcitPaytReqRequest {
	private String reqId;
	private String reqPrefix;
	private String reqYear;
	private String reqMm;
	private String reqSeqNo;
	private String tranTypeCd;
	private String reqDate;
	private String reqStatus;
	private String payeeNo;
	private String payee;
	private String currCd;
	private String currRate;
	private String reqAmt;
	private String localAmt;
	private String particulars;
	private String preparedBy;
	private String preparedDate;
	private String requestedBy;
	private String approvedBy;
	private String approvedDate;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public String getReqId() {
		return reqId;
	}
	public void setReqId(String reqId) {
		this.reqId = reqId;
	}
	public String getReqPrefix() {
		return reqPrefix;
	}
	public void setReqPrefix(String reqPrefix) {
		this.reqPrefix = reqPrefix;
	}
	public String getReqYear() {
		return reqYear;
	}
	public void setReqYear(String reqYear) {
		this.reqYear = reqYear;
	}
	public String getReqMm() {
		return reqMm;
	}
	public void setReqMm(String reqMm) {
		this.reqMm = reqMm;
	}
	public String getReqSeqNo() {
		return reqSeqNo;
	}
	public void setReqSeqNo(String reqSeqNo) {
		this.reqSeqNo = reqSeqNo;
	}
	public String getTranTypeCd() {
		return tranTypeCd;
	}
	public void setTranTypeCd(String tranTypeCd) {
		this.tranTypeCd = tranTypeCd;
	}
	public String getReqDate() {
		return reqDate;
	}
	public void setReqDate(String reqDate) {
		this.reqDate = reqDate;
	}
	public String getReqStatus() {
		return reqStatus;
	}
	public void setReqStatus(String reqStatus) {
		this.reqStatus = reqStatus;
	}
	public String getPayeeNo() {
		return payeeNo;
	}
	public void setPayeeNo(String payeeNo) {
		this.payeeNo = payeeNo;
	}
	public String getPayee() {
		return payee;
	}
	public void setPayee(String payee) {
		this.payee = payee;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public String getCurrRate() {
		return currRate;
	}
	public void setCurrRate(String currRate) {
		this.currRate = currRate;
	}
	public String getReqAmt() {
		return reqAmt;
	}
	public void setReqAmt(String reqAmt) {
		this.reqAmt = reqAmt;
	}
	public String getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(String localAmt) {
		this.localAmt = localAmt;
	}
	public String getParticulars() {
		return particulars;
	}
	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}
	public String getPreparedBy() {
		return preparedBy;
	}
	public void setPreparedBy(String preparedBy) {
		this.preparedBy = preparedBy;
	}
	public String getPreparedDate() {
		return preparedDate;
	}
	public void setPreparedDate(String preparedDate) {
		this.preparedDate = preparedDate;
	}
	public String getRequestedBy() {
		return requestedBy;
	}
	public void setRequestedBy(String requestedBy) {
		this.requestedBy = requestedBy;
	}
	public String getApprovedBy() {
		return approvedBy;
	}
	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}
	public String getApprovedDate() {
		return approvedDate;
	}
	public void setApprovedDate(String approvedDate) {
		this.approvedDate = approvedDate;
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
		return "SaveAcitPaytReqRequest [reqId=" + reqId + ", reqPrefix=" + reqPrefix + ", reqYear=" + reqYear
				+ ", reqMm=" + reqMm + ", reqSeqNo=" + reqSeqNo + ", tranTypeCd=" + tranTypeCd + ", reqDate=" + reqDate
				+ ", reqStatus=" + reqStatus + ", payeeNo=" + payeeNo + ", payee=" + payee + ", currCd=" + currCd
				+ ", currRate=" + currRate + ", reqAmt=" + reqAmt + ", localAmt=" + localAmt + ", particulars="
				+ particulars + ", preparedBy=" + preparedBy + ", preparedDate=" + preparedDate + ", requestedBy="
				+ requestedBy + ", approvedBy=" + approvedBy + ", approvedDate=" + approvedDate + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + "]";
	}
}
