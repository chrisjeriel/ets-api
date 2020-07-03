package ph.cpi.rest.api.model.utils;

import java.math.BigDecimal;

public class CLMR010HA {
	private String dateFromTo;
	private String dateParam;
	private String dateRange;
	private String extractUser;
	private String extractDate;
	private String lineCd;
	private Integer uwYear;
	private String dateFrom;
	private String dateTo;
	private String treaty;
	private String treatyId;
	private String treatyName;
	private String trtyCedId;
	private String treatyCompany;
	private BigDecimal clmAmt;
	private Integer sortSeq;
	private String currencyCd;
	private Integer retLayer;
	private String eventCd;
	public String getDateFromTo() {
		return dateFromTo;
	}
	public void setDateFromTo(String dateFromTo) {
		this.dateFromTo = dateFromTo;
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
	public String getLineCd() {
		return lineCd;
	}
	public void setLineCd(String lineCd) {
		this.lineCd = lineCd;
	}
	public Integer getUwYear() {
		return uwYear;
	}
	public void setUwYear(Integer uwYear) {
		this.uwYear = uwYear;
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
	public String getTreaty() {
		return treaty;
	}
	public void setTreaty(String treaty) {
		this.treaty = treaty;
	}
	public String getTreatyId() {
		return treatyId;
	}
	public void setTreatyId(String treatyId) {
		this.treatyId = treatyId;
	}
	public String getTreatyName() {
		return treatyName;
	}
	public void setTreatyName(String treatyName) {
		this.treatyName = treatyName;
	}
	public String getTrtyCedId() {
		return trtyCedId;
	}
	public void setTrtyCedId(String trtyCedId) {
		this.trtyCedId = trtyCedId;
	}
	public String getTreatyCompany() {
		return treatyCompany;
	}
	public void setTreatyCompany(String treatyCompany) {
		this.treatyCompany = treatyCompany;
	}
	public BigDecimal getClmAmt() {
		return clmAmt;
	}
	public void setClmAmt(BigDecimal clmAmt) {
		this.clmAmt = clmAmt;
	}
	public Integer getSortSeq() {
		return sortSeq;
	}
	public void setSortSeq(Integer sortSeq) {
		this.sortSeq = sortSeq;
	}
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
	}
	public Integer getRetLayer() {
		return retLayer;
	}
	public void setRetLayer(Integer retLayer) {
		this.retLayer = retLayer;
	}
	public String getEventCd() {
		return eventCd;
	}
	public void setEventCd(String eventCd) {
		this.eventCd = eventCd;
	}
	@Override
	public String toString() {
		return "CLMR010HA [dateFromTo=" + dateFromTo + ", dateParam=" + dateParam + ", dateRange=" + dateRange
				+ ", extractUser=" + extractUser + ", extractDate=" + extractDate + ", lineCd=" + lineCd + ", uwYear="
				+ uwYear + ", dateFrom=" + dateFrom + ", dateTo=" + dateTo + ", treaty=" + treaty + ", treatyId="
				+ treatyId + ", treatyName=" + treatyName + ", trtyCedId=" + trtyCedId + ", treatyCompany="
				+ treatyCompany + ", clmAmt=" + clmAmt + ", sortSeq=" + sortSeq + ", currencyCd=" + currencyCd
				+ ", retLayer=" + retLayer + ", eventCd=" + eventCd + "]";
	}
}
