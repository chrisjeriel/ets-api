package ph.cpi.rest.api.model.utils;

import java.math.BigDecimal;

public class CLMR010ZAP {

	private String extractUser;
	private String extractDate;
	private String currencyCd;
	private String lineCd;
	private String claimId;
	private String claimNo;
	private String policyId;
	private String policyNo;
	private BigDecimal tsiAmt;
	private String shrCedId;
	private String shrCedIdName;
	private BigDecimal clmAmtQuota;
	private BigDecimal clmAmtQuotaRet1;
	private BigDecimal clmAmtQuotaRet2;
	private Integer siRange;
	private BigDecimal amtRangeFrom;
	private BigDecimal amtRangeTo;
	private String dateParam;
	private String dateRange;
	private String dateFrom;
	private String dateTo;
	
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
	public String getClaimId() {
		return claimId;
	}
	public void setClaimId(String claimId) {
		this.claimId = claimId;
	}
	public String getClaimNo() {
		return claimNo;
	}
	public void setClaimNo(String claimNo) {
		this.claimNo = claimNo;
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
	public String getShrCedId() {
		return shrCedId;
	}
	public void setShrCedId(String shrCedId) {
		this.shrCedId = shrCedId;
	}
	public String getShrCedIdName() {
		return shrCedIdName;
	}
	public void setShrCedIdName(String shrCedIdName) {
		this.shrCedIdName = shrCedIdName;
	}
	public BigDecimal getClmAmtQuota() {
		return clmAmtQuota;
	}
	public void setClmAmtQuota(BigDecimal clmAmtQuota) {
		this.clmAmtQuota = clmAmtQuota;
	}
	public BigDecimal getClmAmtQuotaRet1() {
		return clmAmtQuotaRet1;
	}
	public void setClmAmtQuotaRet1(BigDecimal clmAmtQuotaRet1) {
		this.clmAmtQuotaRet1 = clmAmtQuotaRet1;
	}
	public BigDecimal getClmAmtQuotaRet2() {
		return clmAmtQuotaRet2;
	}
	public void setClmAmtQuotaRet2(BigDecimal clmAmtQuotaRet2) {
		this.clmAmtQuotaRet2 = clmAmtQuotaRet2;
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
	public String getDateFrom() {
		return dateFrom;
	}
	public void setDateFrom(String dateFrom) {
		this.dateFrom = dateFrom;
	}
	public String getDateTo() {
		return dateTo;
	}
	public void setDateTo(String dateTo) {
		this.dateTo = dateTo;
	}
	@Override
	public String toString() {
		return "CLMR010ZAP [extractUser=" + extractUser + ", extractDate=" + extractDate + ", currencyCd=" + currencyCd
				+ ", lineCd=" + lineCd + ", claimId=" + claimId + ", claimNo=" + claimNo + ", policyId=" + policyId
				+ ", policyNo=" + policyNo + ", tsiAmt=" + tsiAmt + ", shrCedId=" + shrCedId + ", shrCedIdName="
				+ shrCedIdName + ", clmAmtQuota=" + clmAmtQuota + ", clmAmtQuotaRet1=" + clmAmtQuotaRet1
				+ ", clmAmtQuotaRet2=" + clmAmtQuotaRet2 + ", siRange=" + siRange + ", amtRangeFrom=" + amtRangeFrom
				+ ", amtRangeTo=" + amtRangeTo + ", dateParam=" + dateParam + ", dateRange=" + dateRange + ", dateFrom="
				+ dateFrom + ", dateTo=" + dateTo + "]";
	}
}
