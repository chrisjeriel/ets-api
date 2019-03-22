package ph.cpi.rest.api.model.request;

public class RenumberQuoteOptionsRequest {
	private String quoteId;

	public String getQuoteId() {
		return quoteId;
	}

	public void setQuoteId(String quoteId) {
		this.quoteId = quoteId;
	}

	@Override
	public String toString() {
		return "RenumberQuoteOptionsRequest [quoteId=" + quoteId + "]";
	}
	
}
