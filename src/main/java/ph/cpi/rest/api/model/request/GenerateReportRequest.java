package ph.cpi.rest.api.model.request;

public class GenerateReportRequest {
	
	private String reportName;
	private Integer quoteId;
	
	public String getReportName() {
		return reportName;
	}
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}
	public Integer getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}
	@Override
	public String toString() {
		return "GenerateReportRequest [reportName=" + reportName + ", quoteId=" + quoteId + "]";
	}
	
}
