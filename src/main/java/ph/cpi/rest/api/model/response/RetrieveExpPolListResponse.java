package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.underwriting.ExpPolicy;

public class RetrieveExpPolListResponse {
	
	private List<ExpPolicy> expPolicyList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	

	public List<ExpPolicy> getExpPolicyList() {
		return expPolicyList;
	}

	public void setExpPolicyList(List<ExpPolicy> expPolicyList) {
		this.expPolicyList = expPolicyList;
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
	
}
