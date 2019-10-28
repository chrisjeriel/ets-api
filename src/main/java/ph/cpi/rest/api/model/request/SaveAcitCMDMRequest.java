package ph.cpi.rest.api.model.request;

public class SaveAcitCMDMRequest {
	private String memoId;
	private String memoType;
	private String memoTranType;
	private String memoYear;
	private String memoMm;
	private String memoSeqNo;
	private String tranTypeCd;
	private String autoTag;
	private String memoDate;
	private String memoStatus;
	private String refNoTranId;
	private String refNoDate;
	private String policyId;
	private String instNo;
	private String claimId;
	private String projId;
	private String histNo;
	private String payeeClassCd;
	private String payeeCd;
	private String payee;
	private String particulars;
	private String currCd;
	private String currRate;
	private String cmdmAmt;
	private String localAmt;
	private String createUser;
	private String createDate;
	private String updateUser;
	private String updateDate;
	public String getMemoId() {
		return memoId;
	}
	public void setMemoId(String memoId) {
		this.memoId = memoId;
	}
	public String getMemoType() {
		return memoType;
	}
	public void setMemoType(String memoType) {
		this.memoType = memoType;
	}
	public String getMemoTranType() {
		return memoTranType;
	}
	public void setMemoTranType(String memoTranType) {
		this.memoTranType = memoTranType;
	}
	public String getMemoYear() {
		return memoYear;
	}
	public void setMemoYear(String memoYear) {
		this.memoYear = memoYear;
	}
	public String getMemoMm() {
		return memoMm;
	}
	public void setMemoMm(String memoMm) {
		this.memoMm = memoMm;
	}
	public String getMemoSeqNo() {
		return memoSeqNo;
	}
	public void setMemoSeqNo(String memoSeqNo) {
		this.memoSeqNo = memoSeqNo;
	}
	public String getTranTypeCd() {
		return tranTypeCd;
	}
	public void setTranTypeCd(String tranTypeCd) {
		this.tranTypeCd = tranTypeCd;
	}
	public String getAutoTag() {
		return autoTag;
	}
	public void setAutoTag(String autoTag) {
		this.autoTag = autoTag;
	}
	public String getMemoDate() {
		return memoDate;
	}
	public void setMemoDate(String memoDate) {
		this.memoDate = memoDate;
	}
	public String getMemoStatus() {
		return memoStatus;
	}
	public void setMemoStatus(String memoStatus) {
		this.memoStatus = memoStatus;
	}
	public String getRefNoTranId() {
		return refNoTranId;
	}
	public void setRefNoTranId(String refNoTranId) {
		this.refNoTranId = refNoTranId;
	}
	public String getRefNoDate() {
		return refNoDate;
	}
	public void setRefNoDate(String refNoDate) {
		this.refNoDate = refNoDate;
	}
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getInstNo() {
		return instNo;
	}
	public void setInstNo(String instNo) {
		this.instNo = instNo;
	}
	public String getClaimId() {
		return claimId;
	}
	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}
	public String getProjId() {
		return projId;
	}
	public void setProjId(String projId) {
		this.projId = projId;
	}
	public String getHistNo() {
		return histNo;
	}
	public void setHistNo(String histNo) {
		this.histNo = histNo;
	}
	public String getPayeeClassCd() {
		return payeeClassCd;
	}
	public void setPayeeClassCd(String payeeClassCd) {
		this.payeeClassCd = payeeClassCd;
	}
	public String getPayeeCd() {
		return payeeCd;
	}
	public void setPayeeCd(String payeeCd) {
		this.payeeCd = payeeCd;
	}
	public String getPayee() {
		return payee;
	}
	public void setPayee(String payee) {
		this.payee = payee;
	}
	public String getParticulars() {
		return particulars;
	}
	public void setParticulars(String particulars) {
		this.particulars = particulars;
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
	public String getCmdmAmt() {
		return cmdmAmt;
	}
	public void setCmdmAmt(String cmdmAmt) {
		this.cmdmAmt = cmdmAmt;
	}
	public String getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(String localAmt) {
		this.localAmt = localAmt;
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
		return "SaveAcitCMDMRequest [memoId=" + memoId + ", memoType=" + memoType + ", memoTranType=" + memoTranType
				+ ", memoYear=" + memoYear + ", memoMm=" + memoMm + ", memoSeqNo=" + memoSeqNo + ", tranTypeCd="
				+ tranTypeCd + ", autoTag=" + autoTag + ", memoDate=" + memoDate + ", memoStatus=" + memoStatus
				+ ", refNoTranId=" + refNoTranId + ", refNoDate=" + refNoDate + ", policyId=" + policyId + ", instNo="
				+ instNo + ", claimId=" + claimId + ", projId=" + projId + ", histNo=" + histNo + ", payeeClassCd="
				+ payeeClassCd + ", payeeCd=" + payeeCd + ", payee=" + payee + ", particulars=" + particulars
				+ ", currCd=" + currCd + ", currRate=" + currRate + ", cmdmAmt=" + cmdmAmt + ", localAmt=" + localAmt
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
	
	
}
