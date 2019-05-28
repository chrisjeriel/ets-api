package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.underwriting.PolDistribution;

public class RetrievePolDistResponse {
	private PolDistribution polDistribution;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public PolDistribution getPolDistribution() {
		return polDistribution;
	}
	public void setPolDistribution(PolDistribution polDistribution) {
		this.polDistribution = polDistribution;
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
		return "RetrievePolDistResponse [paginationResponse=" + paginationResponse + ", sortResponse=" + sortResponse
				+ "]";
	}
	
	
}
