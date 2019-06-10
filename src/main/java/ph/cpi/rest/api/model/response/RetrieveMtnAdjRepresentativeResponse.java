package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.Adjuster;

public class RetrieveMtnAdjRepresentativeResponse {
	private Adjuster adjuster;
	private PaginationResponse paginationResponse = new PaginationResponse();
	private SortResponse sortResponse = new SortResponse();
	
	public Adjuster getAdjuster() {
		return adjuster;
	}
	public void setAdjuster(Adjuster adjuster) {
		this.adjuster = adjuster;
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
		return "RetrieveMtnAdjRepresentativeResponse [adjuster=" + adjuster + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
}
