package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.underwriting.Policy;

public class RetrievePolAlopResponse {
	
	private List<Policy> policy;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<Policy> getPolicy() {
		return policy;
	}
	public void setPolicy(List<Policy> policy) {
		this.policy = policy;
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
		return "RetrievePolAlopResponse [policy=" + policy + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
	
}