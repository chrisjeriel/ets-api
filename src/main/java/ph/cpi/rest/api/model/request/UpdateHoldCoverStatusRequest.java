package ph.cpi.rest.api.model.request;

public class UpdateHoldCoverStatusRequest {
	private String quoteId;
	private String holdCoverId;
	public String getQuoteId() {
		return quoteId;
	}
	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}
	public String getHoldCoverId() {
		return holdCoverId;
	}
	public void setHoldCoverId(String holdCoverId) {
		this.holdCoverId = holdCoverId;
	}
	@Override
	public String toString() {
		return "UpdateHoldCoverStatusRequest [quoteId=" + quoteId + ", holdCoverId=" + holdCoverId + "]";
	}
	
}
