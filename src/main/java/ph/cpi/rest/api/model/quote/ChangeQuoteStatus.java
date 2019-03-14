package ph.cpi.rest.api.model.quote;

public class ChangeQuoteStatus {
	private Integer quoteId;
	private Integer status;
	private String reasonCode; 
	
	public Integer getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(Integer quoteId) {
		this.quoteId = quoteId;
	}
	
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public String getReasonCode() {
		return reasonCode;
	}
	public void setReasonCode(String reasonCode) {
		this.reasonCode = reasonCode;
	}
	@Override
	public String toString() {
		return "ChangeQuoteStatus [quoteId=" + quoteId + ", status=" + status + ", reasonCode=" + reasonCode + "]";
	}
	
	
	
	
	
	
}
