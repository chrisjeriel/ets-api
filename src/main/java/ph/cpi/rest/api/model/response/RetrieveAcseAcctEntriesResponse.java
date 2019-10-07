package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingservice.AcseAcctEntries;

public class RetrieveAcseAcctEntriesResponse {
	private List<AcseAcctEntries> acctEntries;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcseAcctEntries> getAcctEntries() {
		return acctEntries;
	}
	public void setAcctEntries(List<AcseAcctEntries> acctEntries) {
		this.acctEntries = acctEntries;
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
		return "RetrieveAcseAcctEntriesResponse [acctEntries=" + acctEntries + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
