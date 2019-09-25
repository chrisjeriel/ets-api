package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.AcitCheckSeries;

public class RetrieveMtnAcitCheckSeriesResponse {
	private List<AcitCheckSeries> checkSeriesList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcitCheckSeries> getCheckSeriesList() {
		return checkSeriesList;
	}
	public void setCheckSeriesList(List<AcitCheckSeries> checkSeriesList) {
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
		return "RetrieveMtnAcitCheckSeriesResponse [checkSeriesList=" + checkSeriesList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
