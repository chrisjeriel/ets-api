package ph.cpi.rest.api.model.accountingintrust;

import java.math.BigDecimal;

import org.joda.time.DateTime;

public class AcitEomMonthlyTotals {

	private DateTime eomDate;
	private Integer eomMm;
	private Integer eomYear;
	private String currCd;
	private Integer glAcctId;
	private String shortCode;
	private String shortDesc;
	private String longDesc;
	private BigDecimal begDebitAmt;
	private BigDecimal begCreditAmt;
	private BigDecimal totalDebitAmt;
	private BigDecimal totalCreditAmt;
	private BigDecimal transDebitBal;
	private BigDecimal transCreditBal;
	private BigDecimal transBalance;
	private BigDecimal endDebitAmt;
	private BigDecimal endCreditAmt;
	
	public DateTime getEomDate() {
		return eomDate;
	}
	public void setEomDate(DateTime eomDate) {
		this.eomDate = eomDate;
	}
	public Integer getEomMm() {
		return eomMm;
	}
	public void setEomMm(Integer eomMm) {
		this.eomMm = eomMm;
	}
	public Integer getEomYear() {
		return eomYear;
	}
	public void setEomYear(Integer eomYear) {
		this.eomYear = eomYear;
	}
	public String getCurrCd() {
		return currCd;
	}
	public void setCurrCd(String currCd) {
		this.currCd = currCd;
	}
	public Integer getGlAcctId() {
		return glAcctId;
	}
	public void setGlAcctId(Integer glAcctId) {
		this.glAcctId = glAcctId;
	}
	public String getShortCode() {
		return shortCode;
	}
	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}
	public String getShortDesc() {
		return shortDesc;
	}
	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}
	public String getLongDesc() {
		return longDesc;
	}
	public void setLongDesc(String longDesc) {
		this.longDesc = longDesc;
	}
	public BigDecimal getBegDebitAmt() {
		return begDebitAmt;
	}
	public void setBegDebitAmt(BigDecimal begDebitAmt) {
		this.begDebitAmt = begDebitAmt;
	}
	public BigDecimal getBegCreditAmt() {
		return begCreditAmt;
	}
	public void setBegCreditAmt(BigDecimal begCreditAmt) {
		this.begCreditAmt = begCreditAmt;
	}
	public BigDecimal getTotalDebitAmt() {
		return totalDebitAmt;
	}
	public void setTotalDebitAmt(BigDecimal totalDebitAmt) {
		this.totalDebitAmt = totalDebitAmt;
	}
	public BigDecimal getTotalCreditAmt() {
		return totalCreditAmt;
	}
	public void setTotalCreditAmt(BigDecimal totalCreditAmt) {
		this.totalCreditAmt = totalCreditAmt;
	}
	public BigDecimal getTransDebitBal() {
		return transDebitBal;
	}
	public void setTransDebitBal(BigDecimal transDebitBal) {
		this.transDebitBal = transDebitBal;
	}
	public BigDecimal getTransCreditBal() {
		return transCreditBal;
	}
	public void setTransCreditBal(BigDecimal transCreditBal) {
		this.transCreditBal = transCreditBal;
	}
	public BigDecimal getTransBalance() {
		return transBalance;
	}
	public void setTransBalance(BigDecimal transBalance) {
		this.transBalance = transBalance;
	}
	public BigDecimal getEndDebitAmt() {
		return endDebitAmt;
	}
	public void setEndDebitAmt(BigDecimal endDebitAmt) {
		this.endDebitAmt = endDebitAmt;
	}
	public BigDecimal getEndCreditAmt() {
		return endCreditAmt;
	}
	public void setEndCreditAmt(BigDecimal endCreditAmt) {
		this.endCreditAmt = endCreditAmt;
	}
	@Override
	public String toString() {
		return "AcitEomMonthlyTotals [eomDate=" + eomDate + ", eomMm=" + eomMm + ", eomYear=" + eomYear + ", currCd="
				+ currCd + ", glAcctId=" + glAcctId + ", shortCode=" + shortCode + ", shortDesc=" + shortDesc
				+ ", longDesc=" + longDesc + ", begDebitAmt=" + begDebitAmt + ", begCreditAmt=" + begCreditAmt
				+ ", totalDebitAmt=" + totalDebitAmt + ", totalCreditAmt=" + totalCreditAmt + ", transDebitBal="
				+ transDebitBal + ", transCreditBal=" + transCreditBal + ", transBalance=" + transBalance
				+ ", endDebitAmt=" + endDebitAmt + ", endCreditAmt=" + endCreditAmt + "]";
	}
}
