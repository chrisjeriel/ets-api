package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.ClaimStatus;

public class RetrieveMtnClmStatusResponse {
	private List<ClaimStatus> claimStatus;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<ClaimStatus> getClaimStatus() {
		return claimStatus;
	}
	public void setClaimStatus(List<ClaimStatus> claimStatus) {
		this.claimStatus = claimStatus;
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
		return "RetrieveMtnClmStatusResponse [claimStatus=" + claimStatus + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
}
