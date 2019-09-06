package ph.cpi.rest.api.model.claims;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class ClaimPaytReqInq {
	private String claimId;
	private String projId;
	private String claimNo;
	private String histNo;
	private String policyNo;
	private String paytReqNo;
	private String payee;
	private String paymentType;
	private String status;
	private String currCd;
	private BigDecimal reqAmount;
	private String particulars;
	private DateTime reqDate;
	private String requestedBy;
	private String acctRefNo;
	private DateTime tranDate;
	private String insuredDesc;
	private String riskName;
	private DateTime lossDate;
	
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
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
	public String getClaimNo() {
		return claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}
	public String getHistNo() {
		return histNo;
	}
	public void setHistNo(String histNo) {
		this.histNo = histNo;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public String getPaytReqNo() {
		return paytReqNo;
	}
	public void setPaytReqNo(String paytReqNo) {
		this.paytReqNo = paytReqNo;
	}
	public String getPayee() {
		return payee;
	}
	public void setPayee(String payee) {
		this.payee = payee;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public BigDecimal getReqAmount() {
		return reqAmount;
	}
	public void setReqAmount(BigDecimal reqAmount) {
		this.reqAmount = reqAmount;
	}
	public String getParticulars() {
		return particulars;
	}
	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}
	public DateTime getReqDate() {
		return reqDate;
	}
	public void setReqDate(DateTime reqDate) {
		this.reqDate = reqDate;
	}
	public String getRequestedBy() {
		return requestedBy;
	}
	public void setRequestedBy(String requestedBy) {
		this.requestedBy = requestedBy;
	}
	public String getAcctRefNo() {
		return acctRefNo;
	}
	public void setAcctRefNo(String acctRefNo) {
		this.acctRefNo = acctRefNo;
	}
	public DateTime getTranDate() {
		return tranDate;
	}
	public void setTranDate(DateTime tranDate) {
		this.tranDate = tranDate;
	}
	public String getInsuredDesc() {
		return insuredDesc;
	}
	public void setInsuredDesc(String insuredDesc) {
		this.insuredDesc = insuredDesc;
	}
	public String getRiskName() {
		return riskName;
	}
	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}
	public DateTime getLossDate() {
		return lossDate;
	}
	public void setLossDate(DateTime lossDate) {
		this.lossDate = lossDate;
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
	@Override
	public String toString() {
		return "ClaimPaytReqInq [claimId=" + claimId + ", projId=" + projId + ", claimNo=" + claimNo + ", histNo="
				+ histNo + ", policyNo=" + policyNo + ", paytReqNo=" + paytReqNo + ", payee=" + payee + ", paymentType="
				+ paymentType + ", status=" + status + ", currCd=" + currCd + ", reqAmount=" + reqAmount
				+ ", particulars=" + particulars + ", reqDate=" + reqDate + ", requestedBy=" + requestedBy
				+ ", acctRefNo=" + acctRefNo + ", tranDate=" + tranDate + ", insuredDesc=" + insuredDesc + ", riskName="
				+ riskName + ", lossDate=" + lossDate + ", createUser=" + createUser + ", createDate=" + createDate
				+ ", updateUser=" + updateUser + ", updateDate=" + updateDate + "]";
	}
	
}
