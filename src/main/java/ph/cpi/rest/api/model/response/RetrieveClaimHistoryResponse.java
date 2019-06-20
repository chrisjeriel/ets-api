package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.claims.ClaimHistory;
import ph.cpi.rest.api.model.claims.ClaimReserve;
import ph.cpi.rest.api.model.claims.Claims;

public class RetrieveClaimHistoryResponse {
	private List<ClaimReserve> claimReserveList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<ClaimReserve> getClaimReserveList() {
		return claimReserveList;
	}
	public void setClaimReserveList(List<ClaimReserve> claimReserveList) {
		this.claimReserveList = claimReserveList;
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
		return "RetrieveClaimHistoryResponse [claimReserveList=" + claimReserveList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
