package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.AcseInvSeries;

public class RetrieveMtnAcseGenInvSeriesResponse {
	
	private List<AcseInvSeries> invSeries;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<AcseInvSeries> getInvSeries() {
		return invSeries;
	}
	public void setInvSeries(List<AcseInvSeries> invSeries) {
		this.invSeries = invSeries;
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
		return "RetrieveMtnAcseGenInvSeriesResponse [invSeries=" + invSeries
				+ ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
	
}
