package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitPrqTrans {
	private Integer reqId;
	private Integer itemNo;
	private	Integer tranTypeCd;
	private Integer claimId;
	private Integer projId;
	private Integer histNo;
	private Integer policyId;
	private Integer instNo;
	private DateTime quarterEnding;
	private Integer invtId;
	private String refNo;
	private String transdtlType;
	private String transdtlTypeDesc;
	private String itemName;
	private String paymentFor;
	private String currCd;
	private Double currRate;
	private BigDecimal currAmt;
	private BigDecimal localAmt;
	private BigDecimal allotedAmt;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	private BigDecimal serviceFee;
	
	private Integer qsoaId;
	private BigDecimal netQsoaAmt;
	private BigDecimal prevPaytAmt;
	private BigDecimal prevBalance;
	private BigDecimal newPaytAmt;
	private BigDecimal newBalance;
	private String insuredDesc;
	private String returnTag;
	private Integer unappliedId;
	
	public Integer getReqId() {
		return reqId;
	}
	public void setReqId(Integer reqId) {
		this.reqId = reqId;
	}
	public Integer getItemNo() {
		return itemNo;
	}
	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}
	public Integer getTranTypeCd() {
		return tranTypeCd;
	}
	public void setTranTypeCd(Integer tranTypeCd) {
		this.tranTypeCd = tranTypeCd;
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
	public DateTime getQuarterEnding() {
		return quarterEnding;
	}
	public void setQuarterEnding(DateTime quarterEnding) {
		this.quarterEnding = quarterEnding;
	}
	public Integer getInvtId() {
		return invtId;
	}
	public void setInvtId(Integer invtId) {
		this.invtId = invtId;
	}
	public String getRefNo() {
		return refNo;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	public String getTransdtlType() {
		return transdtlType;
	}
	public void setTransdtlType(String transdtlType) {
		this.transdtlType = transdtlType;
	}
	public String getTransdtlTypeDesc() {
		return transdtlTypeDesc;
	}
	public void setTransdtlTypeDesc(String transdtlTypeDesc) {
		this.transdtlTypeDesc = transdtlTypeDesc;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getPaymentFor() {
		return paymentFor;
	}
	public void setPaymentFor(String paymentFor) {
		this.paymentFor = paymentFor;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public Double getCurrRate() {
		return currRate;
	}
	public void setCurrRate(Double currRate) {
		this.currRate = currRate;
	}
	public BigDecimal getCurrAmt() {
		return currAmt;
	}
	public void setCurrAmt(BigDecimal currAmt) {
		this.currAmt = currAmt;
	}
	public BigDecimal getLocalAmt() {
		return localAmt;
	}
	public void setLocalAmt(BigDecimal localAmt) {
		this.localAmt = localAmt;
	}
	public BigDecimal getAllotedAmt() {
		return allotedAmt;
	}
	public void setAllotedAmt(BigDecimal allotedAmt) {
		this.allotedAmt = allotedAmt;
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
	public BigDecimal getServiceFee() {
		return serviceFee;
	}
	public void setServiceFee(BigDecimal serviceFee) {
		this.serviceFee = serviceFee;
	}
	public Integer getQsoaId() {
		return qsoaId;
	}
	public void setQsoaId(Integer qsoaId) {
		this.qsoaId = qsoaId;
	}
	public BigDecimal getNetQsoaAmt() {
		return netQsoaAmt;
	}
	public void setNetQsoaAmt(BigDecimal netQsoaAmt) {
		this.netQsoaAmt = netQsoaAmt;
	}
	public BigDecimal getPrevPaytAmt() {
		return prevPaytAmt;
	}
	public void setPrevPaytAmt(BigDecimal prevPaytAmt) {
		this.prevPaytAmt = prevPaytAmt;
	}
	public BigDecimal getPrevBalance() {
		return prevBalance;
	}
	public void setPrevBalance(BigDecimal prevBalance) {
		this.prevBalance = prevBalance;
	}
	public BigDecimal getNewPaytAmt() {
		return newPaytAmt;
	}
	public void setNewPaytAmt(BigDecimal newPaytAmt) {
		this.newPaytAmt = newPaytAmt;
	}
	public BigDecimal getNewBalance() {
		return newBalance;
	}
	public void setNewBalance(BigDecimal newBalance) {
		this.newBalance = newBalance;
	}
	public String getInsuredDesc() {
		return insuredDesc;
	}
	public void setInsuredDesc(String insuredDesc) {
		this.insuredDesc = insuredDesc;
	}
	public String getReturnTag() {
		return returnTag;
	}
	public void setReturnTag(String returnTag) {
		this.returnTag = returnTag;
	}
	public Integer getUnappliedId() {
		return unappliedId;
	}
	public void setUnappliedId(Integer unappliedId) {
		this.unappliedId = unappliedId;
	}
	@Override
	public String toString() {
		return "AcitPrqTrans [reqId=" + reqId + ", itemNo=" + itemNo + ", tranTypeCd=" + tranTypeCd + ", claimId="
				+ claimId + ", projId=" + projId + ", histNo=" + histNo + ", policyId=" + policyId + ", instNo="
				+ instNo + ", quarterEnding=" + quarterEnding + ", invtId=" + invtId + ", refNo=" + refNo
				+ ", transdtlType=" + transdtlType + ", transdtlTypeDesc=" + transdtlTypeDesc + ", itemName=" + itemName
				+ ", paymentFor=" + paymentFor + ", currCd=" + currCd + ", currRate=" + currRate + ", currAmt="
				+ currAmt + ", localAmt=" + localAmt + ", allotedAmt=" + allotedAmt + ", remarks=" + remarks
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + ", serviceFee=" + serviceFee + ", qsoaId=" + qsoaId + ", netQsoaAmt="
				+ netQsoaAmt + ", prevPaytAmt=" + prevPaytAmt + ", prevBalance=" + prevBalance + ", newPaytAmt="
				+ newPaytAmt + ", newBalance=" + newBalance + ", insuredDesc=" + insuredDesc + ", returnTag="
				+ returnTag + ", unappliedId=" + unappliedId + "]";
	}
}
