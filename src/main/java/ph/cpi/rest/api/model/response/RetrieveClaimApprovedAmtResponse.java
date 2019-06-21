package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.claims.ClaimApprovedAmt;

public class RetrieveClaimApprovedAmtResponse {
	private List<ClaimApprovedAmt> claimApprovedAmtList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<ClaimApprovedAmt> getClaimApprovedAmtList() {
		return claimApprovedAmtList;
	}
	public void setClaimApprovedAmtList(List<ClaimApprovedAmt> claimApprovedAmtList) {
		this.claimApprovedAmtList = claimApprovedAmtList;
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
		return "RetrieveClaimApprovedAmtResponse [claimApprovedAmtList=" + claimApprovedAmtList
				+ ", paginationResponse=" + paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
