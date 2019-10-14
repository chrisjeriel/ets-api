package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.AcseCVSeries;

public class RetrieveMtnAcseGenCVSeriesResponse {
	private List<AcseCVSeries> cvSeries;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcseCVSeries> getCvSeries() {
		return cvSeries;
	}
	public void setCvSeries(List<AcseCVSeries> cvSeries) {
		this.cvSeries = cvSeries;
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
		return "RetrieveMtnAcseGenCVSeriesResponse [cvSeries=" + cvSeries + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
	
}
