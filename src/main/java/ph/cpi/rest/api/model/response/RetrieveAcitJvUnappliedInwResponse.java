package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitJvUnappInw;

public class RetrieveAcitJvUnappliedInwResponse {
	private List<AcitJvUnappInw> inwUnappColl;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcitJvUnappInw> getInwUnappColl() {
		return inwUnappColl;
	}
	public void setInwUnappColl(List<AcitJvUnappInw> inwUnappColl) {
		this.inwUnappColl = inwUnappColl;
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
		return "RetrieveAcitJvUnappliedInwResponse [inwUnappColl=" + inwUnappColl + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
	
}
