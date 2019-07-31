package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.QSOA;

public class RetrieveQSOAListResponse {

	private List<QSOA> qsoaList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<QSOA> getQsoaList() {
		return qsoaList;
	}
	public void setQsoaList(List<QSOA> qsoaList) {
		this.qsoaList = qsoaList;
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
		return "RetrieveQSOAListResponse [qsoaList=" + qsoaList + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
}
