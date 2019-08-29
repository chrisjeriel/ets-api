package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitJVRollOver;

public class RetrieveAcitJVInvtRollOverResponse {
	private List<AcitJVRollOver> invtRollOver;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcitJVRollOver> getInvtRollOver() {
		return invtRollOver;
	}
	public void setInvtRollOver(List<AcitJVRollOver> invtRollOver) {
		this.invtRollOver = invtRollOver;
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
		return "RetrieveAcitJVInvtRollOverResponse [invtRollOver=" + invtRollOver + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
}
