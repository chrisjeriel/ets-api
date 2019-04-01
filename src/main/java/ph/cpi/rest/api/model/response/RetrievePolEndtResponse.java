package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.underwriting.Policy;

public class RetrievePolEndtResponse {
	private Policy endtList;
	private PaginationResponse paginationResponse = new PaginationResponse();
	private SortResponse sortResponse = new SortResponse();
	
	public Policy getEndtList() {
		return endtList;
	}
	public void setEndtList(Policy policy) {
		this.endtList = policy;
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
		return "RetrievePolEndtResponse [endtList=" + endtList
				+ ", paginationResponse=" + paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
