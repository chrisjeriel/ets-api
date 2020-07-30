package ph.cpi.rest.api.model.utils;

import java.math.BigDecimal;

public class POLR044A {
	private String extractUser;
	private String extractDate;
	private String lineCdParam;
	private String cedingIdParam;
	private String dateParam;
	private String dateRange;
	private String fromDate;
	private String toDate;
	private String incRecTag;
	private String currencyCd;
	private String cedingId;
	private String cedingName;
	private String lineCd;
	private Integer policyId;
	private String policyNo;
	private String issueDate;
	private String effDate;
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
	public String getCurrencyCd() {
		return currencyCd;
	}
	public void setCurrencyCd(String currencyCd) {
		this.currencyCd = currencyCd;
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
	public String getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getEffDate() {
		return effDate;
	}
	public void setEffDate(String effDate) {
		this.effDate = effDate;
	}
	@Override
	public String toString() {
		return "POLR044A [extractUser=" + extractUser + ", extractDate=" + extractDate + ", lineCdParam=" + lineCdParam
				+ ", cedingIdParam=" + cedingIdParam + ", dateParam=" + dateParam + ", dateRange=" + dateRange
				+ ", fromDate=" + fromDate + ", toDate=" + toDate + ", incRecTag=" + incRecTag + ", currencyCd="
				+ currencyCd + ", cedingId=" + cedingId + ", cedingName=" + cedingName + ", lineCd=" + lineCd
				+ ", policyId=" + policyId + ", policyNo=" + policyNo + ", issueDate=" + issueDate + ", effDate="
				+ effDate + "]";
	}
}
