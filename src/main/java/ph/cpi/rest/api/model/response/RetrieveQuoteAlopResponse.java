package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.QuotationSample;
import ph.cpi.rest.api.model.Response;
import ph.cpi.rest.api.model.SortResponse;

public class RetrieveQuoteAlopResponse extends Response {

	private QuotationSample quotation;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public QuotationSample getQuotation() {
		if (quotation == null) {
			quotation = new QuotationSample();
		}
		return quotation;
	}
	public void setQuotation(QuotationSample quotation) {
		this.quotation = quotation;
	}
	public PaginationResponse getPaginationResponse() {
		return paginationResponse;
	}
	public void setPaginationResponse(PaginationResponse paginationResponse) {
		this.paginationResponse = paginationResponse;
	}
	public SortResponse getSortResponse() {
		return sortResponse;
	}
	public void setSortResponse(SortResponse sortResponse) {
		this.sortResponse = sortResponse;
	}
	@Override
	public String toString() {
		return "RetrieveQuoteAlopResponse [quotation=" + quotation + ", paginationResponse=" + paginationResponse + "]";
	}
	
	
	
}
