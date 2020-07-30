package ph.cpi.rest.api.model.utils;

import java.math.BigDecimal;

public class POLR044M {
	private String extractUser;
	private String extractDate;
	private String currencyCd;
	private Integer zoneCd;
	private String zoneCdDesc;
	private Integer polCount;
	private BigDecimal siAmt;
	private BigDecimal premAmt;
	private BigDecimal avRiskAmt;
	private String fromDate;
	private String toDate;
	public String getExtractUser() {
		return extractUser;
	}
	public void setExtractUser(String extractUser) {
		this.extractUser = extractUser;
	}
	public String getExtractDate() {
		return extractDate;
	}
	public void setExtractDate(String extractDate) {
		this.extractDate = extractDate;
	}
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public Integer getZoneCd() {
		return zoneCd;
	}
	public void setZoneCd(Integer zoneCd) {
		this.zoneCd = zoneCd;
	}
	public String getZoneCdDesc() {
		return zoneCdDesc;
	}
	public void setZoneCdDesc(String zoneCdDesc) {
		this.zoneCdDesc = zoneCdDesc;
	}
	public Integer getPolCount() {
		return polCount;
	}
	public void setPolCount(Integer polCount) {
		this.polCount = polCount;
	}
	public BigDecimal getSiAmt() {
		return siAmt;
	}
	public void setSiAmt(BigDecimal siAmt) {
		this.siAmt = siAmt;
	}
	public BigDecimal getPremAmt() {
		return premAmt;
	}
	public void setPremAmt(BigDecimal premAmt) {
		this.premAmt = premAmt;
	}
	public BigDecimal getAvRiskAmt() {
		return avRiskAmt;
	}
	public void setAvRiskAmt(BigDecimal avRiskAmt) {
		this.avRiskAmt = avRiskAmt;
	}
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	@Override
	public String toString() {
		return "POLR044M [extractUser=" + extractUser + ", extractDate=" + extractDate + ", currencyCd=" + currencyCd
				+ ", zoneCd=" + zoneCd + ", zoneCdDesc=" + zoneCdDesc + ", polCount=" + polCount + ", siAmt=" + siAmt
				+ ", premAmt=" + premAmt + ", avRiskAmt=" + avRiskAmt + ", fromDate=" + fromDate + ", toDate=" + toDate
				+ "]";
	}
}
