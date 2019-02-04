package ph.cpi.rest.api.model.response;

import com.sun.research.ws.wadl.Response;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.quote.QuotationOc;

public class RetrieveQuoteDetailsOcResponse extends Response{
	
	private QuotationOc quotationOc;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public QuotationOc getQuotationOC() {
		return quotationOc;
	}
	public void setQuotationOC(QuotationOc quotationOc) {
		this.quotationOc = quotationOc;
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
		return "RetrieveQuoteDetailsOcResponse [quotationOC=" + quotationOc + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
}
