package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.QuoteWordings;

public class RetrieveMtnQuoteWordingsResponse {
	private List<QuoteWordings> quoteWordings;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<QuoteWordings> getQuoteWordings() {
		return quoteWordings;
	}
	public void setQuoteWordings(List<QuoteWordings> list) {
		this.quoteWordings = list;
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
		return "RetrieveMtnQuoteWordingsResponse [quoteWordings=" + quoteWordings + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
}
