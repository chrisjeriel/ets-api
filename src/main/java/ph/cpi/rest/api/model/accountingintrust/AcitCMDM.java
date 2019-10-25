package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitCMDM {
	private Integer memoId;
	private String memoType;
	private String memoTranType;
	private String tranTypeName;
	private Integer memoYear;
	private Integer memoMm;
	private Integer memoSeqNo;
	private Integer tranTypeCd;
	private String autoTag;
	private DateTime memoDate;
	private String memoStatus;
	private String refNoTranId;
	private String refNo;
	private DateTime refNoDate;
	private Integer policyId;
	private Integer instNo;
	private Integer claimId;
	private Integer projId;
	private Integer histNo;
	private Integer payeeClassCd;
	private String payeeCd;
	private String payee;
	private String particulars;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal cmdmAmt;
	private BigDecimal localAmt;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private String status;
	private String groupTag;
	private String unbalAcctEntryTag;
	public Integer getMemoId() {
		return memoId;
	}
	public void setMemoId(Integer memoId) {
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
	public String getTranTypeName() {
		return tranTypeName;
	}
	public void setTranTypeName(String tranTypeName) {
		this.tranTypeName = tranTypeName;
	}
	public Integer getMemoYear() {
		return memoYear;
	}
	public void setMemoYear(Integer memoYear) {
		this.memoYear = memoYear;
	}
	public Integer getMemoMm() {
		return memoMm;
	}
	public void setMemoMm(Integer memoMm) {
		this.memoMm = memoMm;
	}
	public Integer getMemoSeqNo() {
		return memoSeqNo;
	}
	public void setMemoSeqNo(Integer memoSeqNo) {
		this.memoSeqNo = memoSeqNo;
	}
	public Integer getTranTypeCd() {
		return tranTypeCd;
	}
	public void setTranTypeCd(Integer tranTypeCd) {
		this.tranTypeCd = tranTypeCd;
	}
	public String getAutoTag() {
		return autoTag;
	}
	public void setAutoTag(String autoTag) {
		this.autoTag = autoTag;
	}
	public DateTime getMemoDate() {
		return memoDate;
	}
	public void setMemoDate(DateTime memoDate) {
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
	public String getRefNo() {
		return refNo;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	public DateTime getRefNoDate() {
		return refNoDate;
	}
	public void setRefNoDate(DateTime refNoDate) {
		this.refNoDate = refNoDate;
	}
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}
	public Integer getInstNo() {
		return instNo;
	}
	public void setInstNo(Integer instNo) {
		this.instNo = instNo;
	}
	public Integer getClaimId() {
		return claimId;
	}
	public void setClaimId(Integer claimId) {
		this.claimId = claimId;
	}
	public Integer getProjId() {
		return projId;
	}
	public void setProjId(Integer projId) {
		this.projId = projId;
	}
	public Integer getHistNo() {
		return histNo;
	}
	public void setHistNo(Integer histNo) {
		this.histNo = histNo;
	}
	public Integer getPayeeClassCd() {
		return payeeClassCd;
	}
	public void setPayeeClassCd(Integer payeeClassCd) {
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
	public BigDecimal getCurrRate() {
		return currRate;
	}
	public void setCurrRate(BigDecimal currRate) {
		this.currRate = currRate;
	}
	public BigDecimal getCmdmAmt() {
		return cmdmAmt;
	}
	public void setCmdmAmt(BigDecimal cmdmAmt) {
		this.cmdmAmt = cmdmAmt;
	}
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
		this.localAmt = localAmt;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGroupTag() {
		return groupTag;
	}
	public void setGroupTag(String groupTag) {
		this.groupTag = groupTag;
	}
	public String getUnbalAcctEntryTag() {
		return unbalAcctEntryTag;
	}
	public void setUnbalAcctEntryTag(String unbalAcctEntryTag) {
		this.unbalAcctEntryTag = unbalAcctEntryTag;
	}
	@Override
	public String toString() {
		return "AcitCMDM [memoId=" + memoId + ", memoType=" + memoType + ", memoTranType=" + memoTranType
				+ ", tranTypeName=" + tranTypeName + ", memoYear=" + memoYear + ", memoMm=" + memoMm + ", memoSeqNo="
				+ memoSeqNo + ", tranTypeCd=" + tranTypeCd + ", autoTag=" + autoTag + ", memoDate=" + memoDate
				+ ", memoStatus=" + memoStatus + ", refNoTranId=" + refNoTranId + ", refNo=" + refNo + ", refNoDate="
				+ refNoDate + ", policyId=" + policyId + ", instNo=" + instNo + ", claimId=" + claimId + ", projId="
				+ projId + ", histNo=" + histNo + ", payeeClassCd=" + payeeClassCd + ", payeeCd=" + payeeCd + ", payee="
				+ payee + ", particulars=" + particulars + ", currCd=" + currCd + ", currRate=" + currRate
				+ ", cmdmAmt=" + cmdmAmt + ", localAmt=" + localAmt + ", createUser=" + createUser + ", createDate="
				+ createDate + ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", status=" + status
				+ ", groupTag=" + groupTag + ", unbalAcctEntryTag=" + unbalAcctEntryTag + "]";
	}
	
	
}
