package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitJVinvPullOut;

public class RetrieveAcitJVInvPullOutResponse {
	private List<AcitJVinvPullOut> pullOut;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcitJVinvPullOut> getPullOut() {
		return pullOut;
	}
	public void setPullOut(List<AcitJVinvPullOut> pullOut) {
		this.pullOut = pullOut;
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
		return "RetrieveAcitJVInvPullOutResponse [pullOut=" + pullOut + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
	
}
