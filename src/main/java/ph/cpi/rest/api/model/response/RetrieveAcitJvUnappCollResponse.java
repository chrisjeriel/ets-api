package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitJVUnappliedCollection;

public class RetrieveAcitJvUnappCollResponse {
	private List<AcitJVUnappliedCollection> unappliedColl;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcitJVUnappliedCollection> getUnappliedColl() {
		return unappliedColl;
	}
	public void setUnappliedColl(List<AcitJVUnappliedCollection> unappliedColl) {
		this.unappliedColl = unappliedColl;
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
		return "RetrieveAcitJvUnappCollResponse [unappliedColl=" + unappliedColl + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
	
}
