package ph.cpi.rest.api.model.request;

public class RetrieveQuReptextRequest {
	private String quoteId;
	private String reportId;
	public String getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}
	public String getReportId() {
		return reportId;
	}
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}
	@Override
	public String toString() {
		return "RetrieveQuReptextRequest [quoteId=" + quoteId + ", reportId=" + reportId + "]";
	}
	
}
