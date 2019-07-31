package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitAcctEntries;

public class RetrieveAcitAcctEntriesResponse {
	private List<AcitAcctEntries> list;
	private PaginationResponse paginationResponse = new PaginationResponse();
	private SortResponse sortResponse = new SortResponse();
	public List<AcitAcctEntries> getList() {
		return list;
	}
	public void setList(List<AcitAcctEntries> list) {
		this.list = list;
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
		return "RetrieveAcitAcctEntriesResponse [paginationResponse=" + paginationResponse + ", sortResponse="
				+ sortResponse + "]";
	} 
	
}
