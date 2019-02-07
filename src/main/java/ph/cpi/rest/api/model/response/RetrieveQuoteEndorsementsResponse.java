package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;

import ph.cpi.rest.api.model.quote.Endorsements;

public class RetrieveQuoteEndorsementsResponse {

	private List<Endorsements> endorsements;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<Endorsements> getEndorsements() {
		return endorsements;
	}
	public void setEndorsements(List<Endorsements> endorsements) {
		this.endorsements = endorsements;
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
		return "RetrieveQuoteEndorsementsResponse [endorsements=" + endorsements + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}

	
	
	
	
}
