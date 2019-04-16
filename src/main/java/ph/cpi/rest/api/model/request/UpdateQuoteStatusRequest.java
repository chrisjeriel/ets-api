package ph.cpi.rest.api.model.request;

public class UpdateQuoteStatusRequest {

	private Integer quoteId;
	private String status;
	private String approvedBy;
	
	public Integer getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getApprovedBy() {
		return approvedBy;
	}
	public void setApprovedBy(String approvedBy) {
		this.approvedBy = approvedBy;
	}
	@Override
	public String toString() {
		return "UpdateQuoteStatusRequest [quoteId=" + quoteId + ", status=" + status + ", approvedBy=" + approvedBy
				+ "]";
	}
	
}
