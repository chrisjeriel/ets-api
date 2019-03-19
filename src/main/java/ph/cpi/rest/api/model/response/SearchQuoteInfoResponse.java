package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.quote.Quotation;

public class SearchQuoteInfoResponse {
	private List<Quotation> quotation;

	public List<Quotation> getQuotation() {
		return quotation;
	}

	public void setQuotation(List<Quotation> quotation) {
		this.quotation = quotation;
	}

	@Override
	public String toString() {
		return "SearchQuoteInfoResponse [quotation=" + quotation + "]";
	}
}