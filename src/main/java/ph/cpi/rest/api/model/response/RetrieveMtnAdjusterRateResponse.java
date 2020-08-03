package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.MtnAdjusterRate;

public class RetrieveMtnAdjusterRateResponse {
	private List<MtnAdjusterRate> adjusterRateList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<MtnAdjusterRate> getAdjusterRateList() {
		return adjusterRateList;
	}
	public void setAdjusterRateList(List<MtnAdjusterRate> adjusterRateList) {
		this.adjusterRateList = adjusterRateList;
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
		return "RetrieveMtnAdjusterRateResponse [adjusterRateList=" + adjusterRateList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
