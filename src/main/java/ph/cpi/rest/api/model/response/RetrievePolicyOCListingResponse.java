package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.underwriting.PolicyOc;

public class RetrievePolicyOCListingResponse {
	private List<PolicyOc> policyList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<PolicyOc> getPolicyList() {
		return policyList;
	}
	public void setPolicyList(List<PolicyOc> policyList) {
		this.policyList = policyList;
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
		return "RetrievePolicyOCListingResponse [policyList=" + policyList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
}
