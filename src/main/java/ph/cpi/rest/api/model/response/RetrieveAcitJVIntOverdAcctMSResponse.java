package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitJVIntOverdueAcctsMS;

public class RetrieveAcitJVIntOverdAcctMSResponse {
	private List<AcitJVIntOverdueAcctsMS> overDueAccts;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcitJVIntOverdueAcctsMS> getOverDueAccts() {
		return overDueAccts;
	}
	public void setOverDueAccts(List<AcitJVIntOverdueAcctsMS> overDueAccts) {
		this.overDueAccts = overDueAccts;
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
		return "RetrieveAcitJVIntOverdAcctMSResponse [overDueAccts=" + overDueAccts + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
