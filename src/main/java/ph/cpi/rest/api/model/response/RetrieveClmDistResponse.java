package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.claims.ClaimDist;

public class RetrieveClmDistResponse {
	List<ClaimDist> claimDist;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<ClaimDist> getClaimDist() {
		return claimDist;
	}
	public void setClaimDist(List<ClaimDist> claimDist) {
		this.claimDist = claimDist;
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
		return "RetrieveClmDistResponse [claimDist=" + claimDist + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
	
}
