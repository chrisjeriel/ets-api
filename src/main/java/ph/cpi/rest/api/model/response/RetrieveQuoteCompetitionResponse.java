package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.quote.QuotationOc;
import ph.cpi.rest.api.model.Quotation;

public class RetrieveQuoteCompetitionResponse {
	private List<Quotation> quotation;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<Quotation> getQuotation() {
		return quotation;
	}
	public void setQuotation(List<Quotation> quotation) {
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
