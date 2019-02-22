package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.quote.EndorsementsOc;

public class RetrieveQuoteEndorsementsOcResponse {

	private List<EndorsementsOc> endorsementsOc;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;

	/*public EndorsementsOc getEndorsementsOc() {
		return endorsementsOc;
	}
	public void setEndorsementsOc(EndorsementsOc endorsementsOc) {
		this.endorsementsOc = endorsementsOc;
	}*/
	public List<EndorsementsOc> getEndorsementsOc() {
		return endorsementsOc;
	}
	public void setEndorsementsOc(List<EndorsementsOc> endorsementsOc) {
		this.endorsementsOc = endorsementsOc;
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
		return "RetrieveQuoteEndorsementsOcResponse [endorsementsOc=" + endorsementsOc + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}

	
	
}
