package ph.cpi.rest.api.model.request;

public class GenerateReportRequest {
	
	private String reportName;
	private Integer quoteId;
	private Integer adviceNo;
	
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
	public Integer getAdviceNo() {
		return adviceNo;
	}
	public void setAdviceNo(Integer adviceNo) {
		this.adviceNo = adviceNo;
	}
	@Override
	public String toString() {
		return "GenerateReportRequest [reportName=" + reportName + ", quoteId=" + quoteId + ", adviceNo=" + adviceNo
				+ "]";
	}
	
}
