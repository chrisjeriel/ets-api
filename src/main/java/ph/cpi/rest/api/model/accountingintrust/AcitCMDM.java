package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitCMDM {
	private Integer tranId;
	private String memoType;
	private String memoTranType;
	private Integer memoYear;
	private Integer memoMm;
	private Integer memoSeqNo;
	private Integer tranTypeCd;
	private String tranTypeName;
	private String groupTag;
	private String autoTag;
	private DateTime memoDate;
	private String memoStatus;
	private String refNo;
	private Integer refNoTranId;
	private DateTime refNoDate;
	private Integer payeeNo;
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
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
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
	public String getTranTypeName() {
		return tranTypeName;
	}
	public void setTranTypeName(String tranTypeName) {
		this.tranTypeName = tranTypeName;
	}
	public String getGroupTag() {
		return groupTag;
	}
	public void setGroupTag(String groupTag) {
		this.groupTag = groupTag;
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
	public String getRefNo() {
		return refNo;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	public Integer getRefNoTranId() {
		return refNoTranId;
	}
	public void setRefNoTranId(Integer refNoTranId) {
		this.refNoTranId = refNoTranId;
	}
	public DateTime getRefNoDate() {
		return refNoDate;
	}
	public void setRefNoDate(DateTime refNoDate) {
		this.refNoDate = refNoDate;
	}
	public Integer getPayeeNo() {
		return payeeNo;
	}
	public void setPayeeNo(Integer payeeNo) {
		this.payeeNo = payeeNo;
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
	@Override
	public String toString() {
		return "AcitCMDM [tranId=" + tranId + ", memoType=" + memoType + ", memoTranType=" + memoTranType
				+ ", memoYear=" + memoYear + ", memoMm=" + memoMm + ", memoSeqNo=" + memoSeqNo + ", tranTypeCd="
				+ tranTypeCd + ", tranTypeName=" + tranTypeName + ", groupTag=" + groupTag + ", autoTag=" + autoTag
				+ ", memoDate=" + memoDate + ", memoStatus=" + memoStatus + ", refNo=" + refNo + ", refNoTranId="
				+ refNoTranId + ", refNoDate=" + refNoDate + ", payeeNo=" + payeeNo + ", payee=" + payee
				+ ", particulars=" + particulars + ", currCd=" + currCd + ", currRate=" + currRate + ", cmdmAmt="
				+ cmdmAmt + ", localAmt=" + localAmt + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + ", status=" + status + "]";
	}
}
