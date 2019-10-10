package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.AcseCheckSeries;

public class RetrieveMtnAcseCheckSeriesResponse {
	private List<AcseCheckSeries> checkSeriesList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcseCheckSeries> getCheckSeriesList() {
		return checkSeriesList;
	}
	public void setCheckSeriesList(List<AcseCheckSeries> checkSeriesList) {
		this.checkSeriesList = checkSeriesList;
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
		return "RetrieveMtnAcseCheckSeriesResponse [checkSeriesList=" + checkSeriesList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
