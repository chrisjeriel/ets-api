package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.Response;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.quote.Quotation;


public class RetrieveQuoteCoverageResponse extends Response{
	
	private Quotation quotation;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public Quotation getQuotation() {
		if (quotation == null) {
			quotation = new Quotation();
		}
		return quotation;
	}
	public void setQuotation(Quotation quotation) {
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
		return "RetrieveQuoteCoverageResponse [paginationResponse=" + paginationResponse + ", sortResponse="
				+ sortResponse + "]";
	}
	
	
}
