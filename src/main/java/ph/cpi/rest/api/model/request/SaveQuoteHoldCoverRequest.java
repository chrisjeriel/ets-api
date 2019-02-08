package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.quote.Quotation;

public class SaveQuoteHoldCoverRequest {
	private Quotation quotation;

	public Quotation getQuotation() {
		return quotation;
	}

	public void setQuotation(Quotation quotation) {
		this.quotation = quotation;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SaveQuoteHoldCoverRequest [quotation=");
		builder.append(quotation);
		builder.append("]");
		return builder.toString();
	}
}
