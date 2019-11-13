package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingservice.AcseCancelledJV;

public class RetrieveAcseChangeToNewJVResponse {
	private List<AcseCancelledJV> cancelledJV;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcseCancelledJV> getCancelledJV() {
		return cancelledJV;
	}
	public void setCancelledJV(List<AcseCancelledJV> cancelledJV) {
		this.cancelledJV = cancelledJV;
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
		return "RetrieveAcseChangeToNewJVResponse [cancelledJV=" + cancelledJV + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
	
}