package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitPaytReq {
	private String paytReqNo;
	private Integer reqId;
	private String reqPrefix;
	private Integer reqYear;
	private Integer reqMm;
	private Integer reqSeqNo;
	private Integer tranTypeCd;
	private String tranTypeDesc;
	private DateTime reqDate;
	private String reqStatus;
	private String reqStatusDesc;
	private Integer payeeNo;
	private String payee;
	private String currCd;
	private Integer currRate;
	private BigDecimal reqAmt;
	private BigDecimal localAmt;
	private String particulars;
	private String preparedBy;
	private DateTime preparedDate;
	private String requestedBy;
	private String approvedBy;
	private DateTime approvedDate;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
	private String tranStat;
	private String tranStatDesc;
	private String refNo;
	
	public String getPaytReqNo() {
		return paytReqNo;
	}
	public void setPaytReqNo(String paytReqNo) {
		this.paytReqNo = paytReqNo;
	}
	public Integer getReqId() {
		return reqId;
	}
	public void setReqId(Integer reqId) {
		this.reqId = reqId;
	}
	public String getReqPrefix() {
		return reqPrefix;
	}
	public void setReqPrefix(String reqPrefix) {
		this.reqPrefix = reqPrefix;
	}
	public Integer getReqYear() {
		return reqYear;
	}
	public void setReqYear(Integer reqYear) {
		this.reqYear = reqYear;
	}
	public Integer getReqMm() {
		return reqMm;
	}
	public void setReqMm(Integer reqMm) {
		this.reqMm = reqMm;
	}
	public Integer getReqSeqNo() {
		return reqSeqNo;
	}
	public void setReqSeqNo(Integer reqSeqNo) {
		this.reqSeqNo = reqSeqNo;
	}
	public Integer getTranTypeCd() {
		return tranTypeCd;
	}
	public void setTranTypeCd(Integer tranTypeCd) {
		this.tranTypeCd = tranTypeCd;
	}
	public String getTranTypeDesc() {
		return tranTypeDesc;
	}
	public void setTranTypeDesc(String tranTypeDesc) {
		this.tranTypeDesc = tranTypeDesc;
	}
	public DateTime getReqDate() {
		return reqDate;
	}
	public void setReqDate(DateTime reqDate) {
		this.reqDate = reqDate;
	}
	public String getReqStatus() {
		return reqStatus;
	}
	public void setReqStatus(String reqStatus) {
		this.reqStatus = reqStatus;
	}
	public String getReqStatusDesc() {
		return reqStatusDesc;
	}
	public void setReqStatusDesc(String reqStatusDesc) {
		this.reqStatusDesc = reqStatusDesc;
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
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public Integer getCurrRate() {
		return currRate;
	}
	public void setCurrRate(Integer currRate) {
		this.currRate = currRate;
	}
	public BigDecimal getReqAmt() {
		return reqAmt;
	}
	public void setReqAmt(BigDecimal reqAmt) {
		this.reqAmt = reqAmt;
	}
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
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
	public DateTime getPreparedDate() {
		return preparedDate;
	}
	public void setPreparedDate(DateTime preparedDate) {
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
	public DateTime getApprovedDate() {
		return approvedDate;
	}
	public void setApprovedDate(DateTime approvedDate) {
		this.approvedDate = approvedDate;
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
	public String getTranStat() {
		return tranStat;
	}
	public void setTranStat(String tranStat) {
		this.tranStat = tranStat;
	}
	public String getTranStatDesc() {
		return tranStatDesc;
	}
	public void setTranStatDesc(String tranStatDesc) {
		this.tranStatDesc = tranStatDesc;
	}
	public String getRefNo() {
		return refNo;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	@Override
	public String toString() {
		return "AcitPaytReq [paytReqNo=" + paytReqNo + ", reqId=" + reqId + ", reqPrefix=" + reqPrefix + ", reqYear="
				+ reqYear + ", reqMm=" + reqMm + ", reqSeqNo=" + reqSeqNo + ", tranTypeCd=" + tranTypeCd
				+ ", tranTypeDesc=" + tranTypeDesc + ", reqDate=" + reqDate + ", reqStatus=" + reqStatus
				+ ", reqStatusDesc=" + reqStatusDesc + ", payeeNo=" + payeeNo + ", payee=" + payee + ", currCd="
				+ currCd + ", currRate=" + currRate + ", reqAmt=" + reqAmt + ", localAmt=" + localAmt + ", particulars="
				+ particulars + ", preparedBy=" + preparedBy + ", preparedDate=" + preparedDate + ", requestedBy="
				+ requestedBy + ", approvedBy=" + approvedBy + ", approvedDate=" + approvedDate + ", createUser="
				+ createUser + ", createDate=" + createDate + ", updateUser=" + updateUser + ", updateDate="
				+ updateDate + ", tranStat=" + tranStat + ", tranStatDesc=" + tranStatDesc + ", refNo=" + refNo + "]";
	}
}
