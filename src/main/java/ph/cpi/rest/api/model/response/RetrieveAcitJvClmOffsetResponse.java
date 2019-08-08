package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitJVClaimOffset;

public class RetrieveAcitJvClmOffsetResponse {
	private List<AcitJVClaimOffset> claimOffset;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcitJVClaimOffset> getClaimOffset() {
		return claimOffset;
	}
	public void setClaimOffset(List<AcitJVClaimOffset> claimOffset) {
		this.claimOffset = claimOffset;
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
		return "RetrieveAcitJvClmOffsetResponse [claimOffset=" + claimOffset + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
