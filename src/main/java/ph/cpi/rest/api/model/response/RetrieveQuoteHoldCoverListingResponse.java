package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;

public class RetrieveQuoteHoldCoverListingResponse {
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
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
		return "RetrieveQuoteHoldCoverListingResponse [paginationResponse=" + paginationResponse + ", sortResponse="
				+ sortResponse + "]";
	}
	
}
