package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitPrqTrans {
	private Integer reqId;
	private Integer itemNo;
	private Integer claimId;
	private Integer projId;
	private Integer histNo;
	private Integer policyId;
	private Integer instNo;
	private DateTime quarterEnding;
	private Integer investmentId;
	private String refNo;
	private String paymentFor;
	private String currCd;
	private Integer currRate;
	private BigDecimal currAmt;
	private BigDecimal localAmt;
	private String remarks;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
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
	public Integer getInvestmentId() {
		return investmentId;
	}
	public void setInvestmentId(Integer investmentId) {
		this.investmentId = investmentId;
	}
	public String getRefNo() {
		return refNo;
	}
	public void setRefNo(String refNo) {
		this.refNo = refNo;
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
	public Integer getCurrRate() {
		return currRate;
	}
	public void setCurrRate(Integer currRate) {
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
	@Override
	public String toString() {
		return "AcitPrqTrans [reqId=" + reqId + ", itemNo=" + itemNo + ", claimId=" + claimId + ", projId=" + projId
				+ ", histNo=" + histNo + ", policyId=" + policyId + ", instNo=" + instNo + ", quarterEnding="
				+ quarterEnding + ", investmentId=" + investmentId + ", refNo=" + refNo + ", paymentFor=" + paymentFor
				+ ", currCd=" + currCd + ", currRate=" + currRate + ", currAmt=" + currAmt + ", localAmt=" + localAmt
				+ ", remarks=" + remarks + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser="
				+ updateUser + ", updateDate=" + updateDate + "]";
	}
}
