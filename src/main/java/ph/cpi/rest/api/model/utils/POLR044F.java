package ph.cpi.rest.api.model.utils;

import java.math.BigDecimal;

public class POLR044F {
	private String extractUser;
	private String currencyCd;
	private String cedingName;
	private String prevYear;
	private BigDecimal prevMthPrem;
	private BigDecimal prevCumPrem;
	private BigDecimal prevMthNoPol;
	private BigDecimal prevCumNoPol;
	private String currYear;
	private BigDecimal currMthPrem;
	private BigDecimal currCumPrem;
	private BigDecimal currMthNoPol;
	private BigDecimal currCumNoPol;
	public String getExtractUser() {
		return extractUser;
	}
	public void setExtractUser(String extractUser) {
		this.extractUser = extractUser;
	}
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public String getPrevYear() {
		return prevYear;
	}
	public void setPrevYear(String prevYear) {
		this.prevYear = prevYear;
	}
	public BigDecimal getPrevMthPrem() {
		return prevMthPrem;
	}
	public void setPrevMthPrem(BigDecimal prevMthPrem) {
		this.prevMthPrem = prevMthPrem;
	}
	public BigDecimal getPrevCumPrem() {
		return prevCumPrem;
	}
	public void setPrevCumPrem(BigDecimal prevCumPrem) {
		this.prevCumPrem = prevCumPrem;
	}
	public BigDecimal getPrevMthNoPol() {
		return prevMthNoPol;
	}
	public void setPrevMthNoPol(BigDecimal prevMthNoPol) {
		this.prevMthNoPol = prevMthNoPol;
	}
	public BigDecimal getPrevCumNoPol() {
		return prevCumNoPol;
	}
	public void setPrevCumNoPol(BigDecimal prevCumNoPol) {
		this.prevCumNoPol = prevCumNoPol;
	}
	public String getCurrYear() {
		return currYear;
	}
	public void setCurrYear(String currYear) {
		this.currYear = currYear;
	}
	public BigDecimal getCurrMthPrem() {
		return currMthPrem;
	}
	public void setCurrMthPrem(BigDecimal currMthPrem) {
		this.currMthPrem = currMthPrem;
	}
	public BigDecimal getCurrCumPrem() {
		return currCumPrem;
	}
	public void setCurrCumPrem(BigDecimal currCumPrem) {
		this.currCumPrem = currCumPrem;
	}
	public BigDecimal getCurrMthNoPol() {
		return currMthNoPol;
	}
	public void setCurrMthNoPol(BigDecimal currMthNoPol) {
		this.currMthNoPol = currMthNoPol;
	}
	public BigDecimal getCurrCumNoPol() {
		return currCumNoPol;
	}
	public void setCurrCumNoPol(BigDecimal currCumNoPol) {
		this.currCumNoPol = currCumNoPol;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	@Override
	public String toString() {
		return "POLR044F [extractUser=" + extractUser + ", currencyCd=" + currencyCd + ", cedingName=" + cedingName
				+ ", prevYear=" + prevYear + ", prevMthPrem=" + prevMthPrem + ", prevCumPrem=" + prevCumPrem
				+ ", prevMthNoPol=" + prevMthNoPol + ", prevCumNoPol=" + prevCumNoPol + ", currYear=" + currYear
				+ ", currMthPrem=" + currMthPrem + ", currCumPrem=" + currCumPrem + ", currMthNoPol=" + currMthNoPol
				+ ", currCumNoPol=" + currCumNoPol + "]";
	}
}
