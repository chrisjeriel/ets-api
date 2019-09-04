package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitArClmRecover {
	private Integer tranId;
	private Integer billId;
	private Integer itemNo;
	private Integer claimId;
	private String insuredDesc;
	private String claimNo;
	private String policyNo;
	private DateTime lossDate;
	private String lossCd;
	private String lossAbbr;
	private Integer projId;
	private Integer histNo;
	private String histCategory;
	private String histCategoryDesc;
	private String histType;
	private String histTypeDesc;
	private String exGratia;
	private String paymentFor;
	private String currCd;
	private BigDecimal currRate;
	private BigDecimal reserveAmt;
	private BigDecimal cumulativeAmt;
	private BigDecimal recOverAmt;
	private BigDecimal localAmt;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public Integer getBillId() {
		return billId;
	}
	public void setBillId(Integer billId) {
		this.billId = billId;
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
	public String getInsuredDesc() {
		return insuredDesc;
	}
	public void setInsuredDesc(String insuredDesc) {
		this.insuredDesc = insuredDesc;
	}
	public String getClaimNo() {
		return claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public DateTime getLossDate() {
		return lossDate;
	}
	public void setLossDate(DateTime lossDate) {
		this.lossDate = lossDate;
	}
	public String getLossCd() {
		return lossCd;
	}
	public void setLossCd(String lossCd) {
		this.lossCd = lossCd;
	}
	public String getLossAbbr() {
		return lossAbbr;
	}
	public void setLossAbbr(String lossAbbr) {
		this.lossAbbr = lossAbbr;
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
	public String getHistCategory() {
		return histCategory;
	}
	public void setHistCategory(String histCategory) {
		this.histCategory = histCategory;
	}
	public String getHistCategoryDesc() {
		return histCategoryDesc;
	}
	public void setHistCategoryDesc(String histCategoryDesc) {
		this.histCategoryDesc = histCategoryDesc;
	}
	public String getHistType() {
		return histType;
	}
	public void setHistType(String histType) {
		this.histType = histType;
	}
	public String getHistTypeDesc() {
		return histTypeDesc;
	}
	public void setHistTypeDesc(String histTypeDesc) {
		this.histTypeDesc = histTypeDesc;
	}
	public String getExGratia() {
		return exGratia;
	}
	public void setExGratia(String exGratia) {
		this.exGratia = exGratia;
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
	public BigDecimal getCurrRate() {
		return currRate;
	}
	public void setCurrRate(BigDecimal currRate) {
		this.currRate = currRate;
	}
	public BigDecimal getReserveAmt() {
		return reserveAmt;
	}
	public void setReserveAmt(BigDecimal reserveAmt) {
		this.reserveAmt = reserveAmt;
	}
	public BigDecimal getCumulativeAmt() {
		return cumulativeAmt;
	}
	public void setCumulativeAmt(BigDecimal cumulativeAmt) {
		this.cumulativeAmt = cumulativeAmt;
	}
	public BigDecimal getRecOverAmt() {
		return recOverAmt;
	}
	public void setRecOverAmt(BigDecimal recOverAmt) {
		this.recOverAmt = recOverAmt;
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
	@Override
	public String toString() {
		return "AcitArClmRecover [tranId=" + tranId + ", billId=" + billId + ", itemNo=" + itemNo + ", claimId="
				+ claimId + ", insuredDesc=" + insuredDesc + ", claimNo=" + claimNo + ", policyNo=" + policyNo
				+ ", lossDate=" + lossDate + ", lossCd=" + lossCd + ", lossAbbr=" + lossAbbr + ", projId=" + projId
				+ ", histNo=" + histNo + ", histCategory=" + histCategory + ", histCategoryDesc=" + histCategoryDesc
				+ ", histType=" + histType + ", histTypeDesc=" + histTypeDesc + ", exGratia=" + exGratia
				+ ", paymentFor=" + paymentFor + ", currCd=" + currCd + ", currRate=" + currRate + ", reserveAmt="
				+ reserveAmt + ", cumulativeAmt=" + cumulativeAmt + ", recOverAmt=" + recOverAmt + ", localAmt="
				+ localAmt + ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}
