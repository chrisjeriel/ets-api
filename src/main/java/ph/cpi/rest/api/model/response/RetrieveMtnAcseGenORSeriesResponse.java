package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.AcseOrSeries;

public class RetrieveMtnAcseGenORSeriesResponse {
	private List<AcseOrSeries> orSeries;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcseOrSeries> getOrSeries() {
		return orSeries;
	}
	public void setOrSeries(List<AcseOrSeries> orSeries) {
		this.orSeries = orSeries;
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
		return "RetrieveMtnAcseGenORSeriesResponse [orSeries=" + orSeries + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
	
}
