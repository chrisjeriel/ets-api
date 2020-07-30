package ph.cpi.rest.api.model.utils;

import java.math.BigDecimal;

public class POLR044R {
	private String extractUser;
	private String extractDate;
	private String currencyCd;
	private String lineCd;
	private Integer policyId;
	private String policyNo;
	private BigDecimal tsiAmt;
	private String cedingId;
	private String cedingName;
	private BigDecimal premTotal;
	private BigDecimal premQuota;
	private BigDecimal premQuotaRet1;
	private BigDecimal premQuotaRet2;
	private BigDecimal prem1stSurplus;
	private BigDecimal prem2ndSurplus;
	private BigDecimal premFacul;
	private Integer siRange;
	private String amtRangeDesc;
	private String fromDate;
	private String toDate;
	private BigDecimal amtRangeFrom;
	private BigDecimal amtRangeTo;
	private String dateParam;
	private String dateRange;
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
	public Integer getPolicyId() {
		return policyId;
	}
	public void setPolicyId(Integer policyId) {
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
	public BigDecimal getPremTotal() {
		return premTotal;
	}
	public void setPremTotal(BigDecimal premTotal) {
		this.premTotal = premTotal;
	}
	public BigDecimal getPremQuota() {
		return premQuota;
	}
	public void setPremQuota(BigDecimal premQuota) {
		this.premQuota = premQuota;
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
	public BigDecimal getPrem1stSurplus() {
		return prem1stSurplus;
	}
	public void setPrem1stSurplus(BigDecimal prem1stSurplus) {
		this.prem1stSurplus = prem1stSurplus;
	}
	public BigDecimal getPrem2ndSurplus() {
		return prem2ndSurplus;
	}
	public void setPrem2ndSurplus(BigDecimal prem2ndSurplus) {
		this.prem2ndSurplus = prem2ndSurplus;
	}
	public BigDecimal getPremFacul() {
		return premFacul;
	}
	public void setPremFacul(BigDecimal premFacul) {
		this.premFacul = premFacul;
	}
	public Integer getSiRange() {
		return siRange;
	}
	public void setSiRange(Integer siRange) {
		this.siRange = siRange;
	}
	public String getAmtRangeDesc() {
		return amtRangeDesc;
	}
	public void setAmtRangeDesc(String amtRangeDesc) {
		this.amtRangeDesc = amtRangeDesc;
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
	public String getIncRecTag() {
		return incRecTag;
	}
	public void setIncRecTag(String incRecTag) {
		this.incRecTag = incRecTag;
	}
	@Override
	public String toString() {
		return "POLR044R [extractUser=" + extractUser + ", extractDate=" + extractDate + ", currencyCd=" + currencyCd
				+ ", lineCd=" + lineCd + ", policyId=" + policyId + ", policyNo=" + policyNo + ", tsiAmt=" + tsiAmt
				+ ", cedingId=" + cedingId + ", cedingName=" + cedingName + ", premTotal=" + premTotal + ", premQuota="
				+ premQuota + ", premQuotaRet1=" + premQuotaRet1 + ", premQuotaRet2=" + premQuotaRet2
				+ ", prem1stSurplus=" + prem1stSurplus + ", prem2ndSurplus=" + prem2ndSurplus + ", premFacul="
				+ premFacul + ", siRange=" + siRange + ", amtRangeDesc=" + amtRangeDesc + ", fromDate=" + fromDate
				+ ", toDate=" + toDate + ", amtRangeFrom=" + amtRangeFrom + ", amtRangeTo=" + amtRangeTo
				+ ", dateParam=" + dateParam + ", dateRange=" + dateRange + ", incRecTag=" + incRecTag + "]";
	}
}
