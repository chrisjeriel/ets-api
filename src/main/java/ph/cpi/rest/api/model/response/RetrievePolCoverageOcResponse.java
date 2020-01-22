package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.underwriting.OpenPolicy;

public class RetrievePolCoverageOcResponse {
	private OpenPolicy policyOc;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public OpenPolicy getPolicyOc() {
		return policyOc;
	}
	public void setPolicyOc(OpenPolicy policyOc) {
		this.policyOc = policyOc;
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
		return "RetrievePolCoverageOcResponse [policyOc=" + policyOc + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
	
	
}
