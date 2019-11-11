package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.utils.POLR044;

public class GenerateReportRequest {
	
	private String reportName;
	private String reportId;
	private POLR044 polr044Params;
	private Integer quoteId;
	private Integer adviceNo;
	private Integer holdCovId;
	private String userId;
	private Integer tranId;
	private Integer reqId;
	private String cedingId;
	private String policyId;
	
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getCedingId() {
		return cedingId;
	}
	public void setCedingId(String cedingId) {
		this.cedingId = cedingId;
	}
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
	public POLR044 getPolr044Params() {
		return polr044Params;
	}
	public void setPolr044Params(POLR044 polr044Params) {
		this.polr044Params = polr044Params;
	}
	@Override
	public String toString() {
		return "GenerateReportRequest [reportName=" + reportName + ", reportId=" + reportId + ", polr044Params="
				+ polr044Params + ", quoteId=" + quoteId + ", adviceNo=" + adviceNo + ", holdCovId=" + holdCovId
				+ ", userId=" + userId + ", tranId=" + tranId + ", reqId=" + reqId + ", cedingId=" + cedingId
				+ ", policyId=" + policyId + "]";
	}
	
}
