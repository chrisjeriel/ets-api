package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitJVClaimsLosses;

public class RetrieveAcitJVRcvblsAgnstLosResponse {
	private List<AcitJVClaimsLosses> receivables;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcitJVClaimsLosses> getReceivables() {
		return receivables;
	}
	public void setReceivables(List<AcitJVClaimsLosses> receivables) {
		this.receivables = receivables;
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
		return "RetrieveAcitJVRcvblsAgnstLosResponse [receivables=" + receivables + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
}
