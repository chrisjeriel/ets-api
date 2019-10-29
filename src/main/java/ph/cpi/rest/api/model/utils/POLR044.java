package ph.cpi.rest.api.model.utils;

import org.joda.time.DateTime;

public class POLR044 {

	private String extractUser;
	private String lineCdParam;
	private String cedingIdParam;
	private String dateParam;
	private String dateRange;
	private DateTime fromDate;
	private DateTime toDate;
	private String incRecTag;
	
	public String getExtractUser() {
		return extractUser;
	}
	public void setExtractUser(String extractUser) {
		this.extractUser = extractUser;
	}
	public String getLineCdParam() {
		return lineCdParam;
	}
	public void setLineCdParam(String lineCdParam) {
		this.lineCdParam = lineCdParam;
	}
	public String getCedingIdParam() {
		return cedingIdParam;
	}
	public void setCedingIdParam(String cedingIdParam) {
		this.cedingIdParam = cedingIdParam;
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
	public DateTime getFromDate() {
		return fromDate;
	}
	public void setFromDate(DateTime fromDate) {
		this.fromDate = fromDate;
	}
	public DateTime getToDate() {
		return toDate;
	}
	public void setToDate(DateTime toDate) {
		this.toDate = toDate;
	}
	public String getIncRecTag() {
		return incRecTag;
	}
	public void setIncRecTag(String incRecTag) {
		this.incRecTag = incRecTag;
	}
	
}
