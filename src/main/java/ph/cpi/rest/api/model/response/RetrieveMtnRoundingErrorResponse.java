package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.RoundingError;

public class RetrieveMtnRoundingErrorResponse {
	private List<RoundingError> roundingError;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<RoundingError> getRoundingError() {
		return roundingError;
	}
	public void setRoundingError(List<RoundingError> roundingError) {
		this.roundingError = roundingError;
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
		return "RetrieveMtnRoundingErrorResponse [roundingError=" + roundingError + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
}
