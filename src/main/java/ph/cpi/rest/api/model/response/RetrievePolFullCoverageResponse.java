package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.underwriting.Policy;

public class RetrievePolFullCoverageResponse {
	private Policy policy;
	private String altWordings;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	
	public String getAltWordings() {
		return altWordings;
	}


	public void setAltWordings(String altWordings) {
		this.altWordings = altWordings;
	}


	public Policy getPolicy() {
		return policy;
	}


	public void setPolicy(Policy policy) {
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
		return "RetrievePolFullCoverageResponse [policy=" + policy + ", altWordings=" + altWordings
				+ ", paginationResponse=" + paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
