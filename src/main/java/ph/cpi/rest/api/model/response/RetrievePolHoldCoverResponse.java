package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.underwriting.Policy;

public class RetrievePolHoldCoverResponse {

	private Policy policy;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	private List<Policy> policyList;  //pol hold cover listing
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
	public List<Policy> getPolicyList() {
		return policyList;
	}
	public void setPolicyList(List<Policy> policyList) {
		this.policyList = policyList;
	}
	@Override
	public String toString() {
		return "RetrievePolHoldCoverResponse [policy=" + policy + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + ", policyList=" + policyList + "]";
	}

		
}
