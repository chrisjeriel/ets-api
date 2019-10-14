package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.AcseJVSeries;

public class RetrieveMtnAcseGenJVSeriesResponse {
	private List<AcseJVSeries> jvSeries;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcseJVSeries> getJvSeries() {
		return jvSeries;
	}
	public void setJvSeries(List<AcseJVSeries> jvSeries) {
		this.jvSeries = jvSeries;
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
		return "RetrieveMtnAcseGenJVSeriesResponse [jvSeries=" + jvSeries + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
	
}
