package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.AcitCvSeries;

public class RetrieveMtnGenCVSeriesResponse {
	private List<AcitCvSeries> cvSeries;
	private PaginationResponse paginationResponse = new PaginationResponse();
	private SortResponse sortResponse = new SortResponse();
	public List<AcitCvSeries> getCvSeries() {
		return cvSeries;
	}
	public void setCvSeries(List<AcitCvSeries> cvSeries) {
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
		return "RetrieveMtnGenCVSeriesResponse [paginationResponse=" + paginationResponse + ", sortResponse="
				+ sortResponse + "]";
	}
	
}
