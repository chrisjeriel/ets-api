package ph.cpi.rest.api.model.request;

public class GenerateReportRequest {
	
	private String reportName;
	private Integer quoteId;
	private Integer adviceNo;
	private Integer holdCovId;
	private String userId;
	
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
	public Integer getHoldCovId() {
		return holdCovId;
	}
	public void setHoldCovId(Integer holdCovId) {
		this.holdCovId = holdCovId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "GenerateReportRequest [reportName=" + reportName + ", quoteId=" + quoteId + ", adviceNo=" + adviceNo
				+ ", holdCovId=" + holdCovId + ", userId=" + userId + "]";
	}
}
