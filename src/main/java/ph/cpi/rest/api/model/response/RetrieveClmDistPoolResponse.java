package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.claims.ClaimDistCeding;

public class RetrieveClmDistPoolResponse {
	List<ClaimDistCeding> claimsDistCeding;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<ClaimDistCeding> getClaimsDistCeding() {
		return claimsDistCeding;
	}
	public void setClaimsDistCeding(List<ClaimDistCeding> claimsDistCeding) {
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
		return "RetrieveClmDistPoolResponse [claimsDistCeding=" + claimsDistCeding + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
	
}
