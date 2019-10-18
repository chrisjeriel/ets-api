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
	private BigDecimal transDebitBal;
	private BigDecimal transCreditBal;
	
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
	@Override
	public String toString() {
		return "AcitEomMonthlyTotals [eomDate=" + eomDate + ", eomMm=" + eomMm + ", eomYear=" + eomYear + ", currCd="
				+ currCd + ", glAcctId=" + glAcctId + ", shortCode=" + shortCode + ", shortDesc=" + shortDesc
				+ ", longDesc=" + longDesc + ", transDebitBal=" + transDebitBal + ", transCreditBal=" + transCreditBal
				+ "]";
	}
}
