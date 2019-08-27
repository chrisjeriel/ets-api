package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitArClmRecoverLov {
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
	private String histCatDesc;
	private String histType;
	private String histTypeDesc;
	private String currencyCd;
	private BigDecimal currencyRt;
	private BigDecimal reserveAmt;
	private BigDecimal paytAmt;
	private String createUser;
	private DateTime createDate;
	private String updateUser;
	private DateTime updateDate;
	
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
	public String getHistCatDesc() {
		return histCatDesc;
	}
	public void setHistCatDesc(String histCatDesc) {
		this.histCatDesc = histCatDesc;
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
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public BigDecimal getCurrencyRt() {
		return currencyRt;
	}
	public void setCurrencyRt(BigDecimal currencyRt) {
		this.currencyRt = currencyRt;
	}
	public BigDecimal getReserveAmt() {
		return reserveAmt;
	}
	public void setReserveAmt(BigDecimal reserveAmt) {
		this.reserveAmt = reserveAmt;
	}
	public BigDecimal getPaytAmt() {
		return paytAmt;
	}
	public void setPaytAmt(BigDecimal paytAmt) {
		this.paytAmt = paytAmt;
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
		return "AcitArClmRecoverLov [claimId=" + claimId + ", insuredDesc=" + insuredDesc + ", claimNo=" + claimNo
				+ ", policyNo=" + policyNo + ", lossDate=" + lossDate + ", lossCd=" + lossCd + ", lossAbbr=" + lossAbbr
				+ ", projId=" + projId + ", histNo=" + histNo + ", histCategory=" + histCategory + ", histCatDesc="
				+ histCatDesc + ", histType=" + histType + ", histTypeDesc=" + histTypeDesc + ", currencyCd="
				+ currencyCd + ", currencyRt=" + currencyRt + ", reserveAmt=" + reserveAmt + ", paytAmt=" + paytAmt
				+ ", createUser=" + createUser + ", createDate=" + createDate + ", updateUser=" + updateUser
				+ ", updateDate=" + updateDate + "]";
	}
}
