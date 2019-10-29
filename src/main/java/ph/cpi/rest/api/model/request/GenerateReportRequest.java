package ph.cpi.rest.api.model.request;

public class GenerateReportRequest {
	
	private String reportName;
	private String reportId;
	private Integer quoteId;
	private Integer adviceNo;
	private Integer holdCovId;
	private String userId;
	private Integer tranId;
	private Integer reqId;
	
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
	
	public Integer getTranId() {
		return tranId;
	}
	public void setTranId(Integer tranId) {
		this.tranId = tranId;
	}
	public Integer getReqId() {
		return reqId;
	}
	public void setReqId(Integer reqId) {
		this.reqId = reqId;
	}
	@Override
	public String toString() {
		return "GenerateReportRequest [reportName=" + reportName + ", reportId=" + reportId + ", quoteId=" + quoteId
				+ ", adviceNo=" + adviceNo + ", holdCovId=" + holdCovId + ", userId=" + userId + ", tranId=" + tranId
				+ ", reqId=" + reqId + "]";
	}
	
}
