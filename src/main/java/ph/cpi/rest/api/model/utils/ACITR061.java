package ph.cpi.rest.api.model.utils;

public class ACITR061 {
	
	private String reportId;
	private String reportName;
	private String tranPostDate;
	private String fromDate;
	private String toDate;
	private String paytType;
	private String paytMode;
	private String reportType;
	private String incClosedTran;
	private String incCancelTran;
	private String destination;
	private String printedBy;
	private String chkDate;
	
	public String getReportId() {
		return reportId;
	}
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}
	public String getReportName() {
		return reportName;
	}
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}
	public String getTranPostDate() {
		return tranPostDate;
	}
	public void setTranPostDate(String tranPostDate) {
		this.tranPostDate = tranPostDate;
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
	public String getPaytType() {
		return paytType;
	}
	public void setPaytType(String paytType) {
		this.paytType = paytType;
	}
	public String getPaytMode() {
		return paytMode;
	}
	public void setPaytMode(String paytMode) {
		this.paytMode = paytMode;
	}
	public String getReportType() {
		return reportType;
	}
	public void setReportType(String reportType) {
		this.reportType = reportType;
	}
	public String getIncClosedTran() {
		return incClosedTran;
	}
	public void setIncClosedTran(String incClosedTran) {
		this.incClosedTran = incClosedTran;
	}
	public String getIncCancelTran() {
		return incCancelTran;
	}
	public void setIncCancelTran(String incCancelTran) {
		this.incCancelTran = incCancelTran;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getPrintedBy() {
		return printedBy;
	}
	public void setPrintedBy(String printedBy) {
		this.printedBy = printedBy;
	}
	public String getChkDate() {
		return chkDate;
	}
	public void setChkDate(String chkDate) {
		this.chkDate = chkDate;
	}
	@Override
	public String toString() {
		return "ACITR061 [reportId=" + reportId + ", reportName=" + reportName + ", tranPostDate=" + tranPostDate
				+ ", fromDate=" + fromDate + ", toDate=" + toDate + ", paytType=" + paytType + ", paytMode=" + paytMode
				+ ", reportType=" + reportType + ", incClosedTran=" + incClosedTran + ", incCancelTran=" + incCancelTran
				+ ", destination=" + destination + ", printedBy=" + printedBy + ", chkDate=" + chkDate + "]";
	}
	
}
