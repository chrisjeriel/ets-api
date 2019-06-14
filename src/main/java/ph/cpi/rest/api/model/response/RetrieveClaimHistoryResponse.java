package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.claims.ClaimHistory;

public class RetrieveClaimHistoryResponse {
	private List<ClaimHistory> claimHistoryList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<ClaimHistory> getClaimHistoryList() {
		return claimHistoryList;
	}
	public void setClaimHistoryList(List<ClaimHistory> claimHistoryList) {
		this.claimHistoryList = claimHistoryList;
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
		return "RetrieveClaimHistoryResponse [claimHistoryList=" + claimHistoryList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
}
