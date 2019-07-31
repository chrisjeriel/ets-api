package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.claims.ClaimReserveDistPool;

public class RetrieveClmReserveDistPoolResponse {
	List<ClaimReserveDistPool> claimsDistCeding;
	private PaginationResponse paginationResponse = new PaginationResponse();
	private SortResponse sortResponse = new SortResponse();
	public List<ClaimReserveDistPool> getClaimsDistCeding() {
		return claimsDistCeding;
	}
	public void setClaimsDistCeding(List<ClaimReserveDistPool> claimsDistCeding) {
		this.claimsDistCeding = claimsDistCeding;
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
		return "RetrieveClmReserveDistPoolResponse [claimsDistCeding=" + claimsDistCeding + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
