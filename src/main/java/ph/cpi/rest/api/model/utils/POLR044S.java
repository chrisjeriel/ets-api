package ph.cpi.rest.api.model.utils;

import java.math.BigDecimal;

public class POLR044S {
	private String extractUser;
	private String extractDate;
	private String currencyCd;
	private String lineCd;
	private Integer policyId;
	private String policyNo;
	private BigDecimal tsiAmt;
	private String cedingId;
	private String cedingName;
	private Integer polCount;
	private BigDecimal siTotal;
	private BigDecimal siQuota;
	private BigDecimal siQuotaRet1;
	private BigDecimal siQuotaRet2;
	private BigDecimal si1stSurplus;
	private BigDecimal si2ndSurplus;
	private BigDecimal siFacul;
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
	public Integer getPolCount() {
		return polCount;
	}
	public void setPolCount(Integer polCount) {
		this.polCount = polCount;
	}
	public BigDecimal getSiTotal() {
		return siTotal;
	}
	public void setSiTotal(BigDecimal siTotal) {
		this.siTotal = siTotal;
	}
	public BigDecimal getSiQuota() {
		return siQuota;
	}
	public void setSiQuota(BigDecimal siQuota) {
		this.siQuota = siQuota;
	}
	public BigDecimal getSiQuotaRet1() {
		return siQuotaRet1;
	}
	public void setSiQuotaRet1(BigDecimal siQuotaRet1) {
		this.siQuotaRet1 = siQuotaRet1;
	}
	public BigDecimal getSiQuotaRet2() {
		return siQuotaRet2;
	}
	public void setSiQuotaRet2(BigDecimal siQuotaRet2) {
		this.siQuotaRet2 = siQuotaRet2;
	}
	public BigDecimal getSi1stSurplus() {
		return si1stSurplus;
	}
	public void setSi1stSurplus(BigDecimal si1stSurplus) {
		this.si1stSurplus = si1stSurplus;
	}
	public BigDecimal getSi2ndSurplus() {
		return si2ndSurplus;
	}
	public void setSi2ndSurplus(BigDecimal si2ndSurplus) {
		this.si2ndSurplus = si2ndSurplus;
	}
	public BigDecimal getSiFacul() {
		return siFacul;
	}
	public void setSiFacul(BigDecimal siFacul) {
		this.siFacul = siFacul;
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
		return "POLR044S [extractUser=" + extractUser + ", extractDate=" + extractDate + ", currencyCd=" + currencyCd
				+ ", lineCd=" + lineCd + ", policyId=" + policyId + ", policyNo=" + policyNo + ", tsiAmt=" + tsiAmt
				+ ", cedingId=" + cedingId + ", cedingName=" + cedingName + ", polCount=" + polCount + ", siTotal="
				+ siTotal + ", siQuota=" + siQuota + ", siQuotaRet1=" + siQuotaRet1 + ", siQuotaRet2=" + siQuotaRet2
				+ ", si1stSurplus=" + si1stSurplus + ", si2ndSurplus=" + si2ndSurplus + ", siFacul=" + siFacul
				+ ", siRange=" + siRange + ", amtRangeFrom=" + amtRangeFrom + ", amtRangeTo=" + amtRangeTo
				+ ", dateParam=" + dateParam + ", dateRange=" + dateRange + ", fromDate=" + fromDate + ", toDate="
				+ toDate + ", incRecTag=" + incRecTag + "]";
	}
}
