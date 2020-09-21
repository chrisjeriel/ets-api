package ph.cpi.rest.api.model.utils;

import java.math.BigDecimal;

public class POLR044RA {

	private String extractUser;
	private String extractDate;
	private String currencyCd;
	private String lineCd;
	private String policyId;
	private String policyNo;
	private BigDecimal tsiAmt;
	private String cedingId;
	private String cedingName;
	private BigDecimal premQuotaRet1;
	private BigDecimal premQuotaRet2;
	private BigDecimal premTotalRet;
	private Integer siRange;
	private BigDecimal amtRangeFrom;
	private BigDecimal amtRangeTo;
	private String dateParam;
	private String dateRange;
	private String fromDate;
	private String toDate;
	private String incRecTag;
	
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
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getPolicyNo() {
		return policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	public BigDecimal getTsiAmt() {
		return tsiAmt;
	}
	public void setTsiAmt(BigDecimal tsiAmt) {
		this.tsiAmt = tsiAmt;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
	public String getCedingName() {
		return cedingName;
	}
	public void setCedingName(String cedingName) {
		this.cedingName = cedingName;
	}
	public BigDecimal getPremQuotaRet1() {
		return premQuotaRet1;
	}
	public void setPremQuotaRet1(BigDecimal premQuotaRet1) {
		this.premQuotaRet1 = premQuotaRet1;
	}
	public BigDecimal getPremQuotaRet2() {
		return premQuotaRet2;
	}
	public void setPremQuotaRet2(BigDecimal premQuotaRet2) {
		this.premQuotaRet2 = premQuotaRet2;
	}
	public BigDecimal getPremTotalRet() {
		return premTotalRet;
	}
	public void setPremTotalRet(BigDecimal premTotalRet) {
		this.premTotalRet = premTotalRet;
	}
	public Integer getSiRange() {
		return siRange;
	}
	public void setSiRange(Integer siRange) {
		this.siRange = siRange;
	}
	public BigDecimal getAmtRangeFrom() {
		return amtRangeFrom;
	}
	public void setAmtRangeFrom(BigDecimal amtRangeFrom) {
		this.amtRangeFrom = amtRangeFrom;
	}
	public BigDecimal getAmtRangeTo() {
		return amtRangeTo;
	}
	public void setAmtRangeTo(BigDecimal amtRangeTo) {
		this.amtRangeTo = amtRangeTo;
	}
	public String getDateParam() {
		return dateParam;
	}
	public void setDateParam(String dateParam) {
		this.dateParam = dateParam;
	}
	public String getDateRange() {
		return dateRange;
	}
	public void setDateRange(String dateRange) {
		this.dateRange = dateRange;
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
	public String getIncRecTag() {
		return incRecTag;
	}
	public void setIncRecTag(String incRecTag) {
		this.incRecTag = incRecTag;
	}
	@Override
	public String toString() {
		return "POLR044RA [extractUser=" + extractUser + ", extractDate=" + extractDate + ", currencyCd=" + currencyCd
				+ ", lineCd=" + lineCd + ", policyId=" + policyId + ", policyNo=" + policyNo + ", tsiAmt=" + tsiAmt
				+ ", cedingId=" + cedingId + ", cedingName=" + cedingName + ", premQuotaRet1=" + premQuotaRet1
				+ ", premQuotaRet2=" + premQuotaRet2 + ", premTotalRet=" + premTotalRet + ", siRange=" + siRange
				+ ", amtRangeFrom=" + amtRangeFrom + ", amtRangeTo=" + amtRangeTo + ", dateParam=" + dateParam
				+ ", dateRange=" + dateRange + ", fromDate=" + fromDate + ", toDate=" + toDate + ", incRecTag="
				+ incRecTag + "]";
	}
}
