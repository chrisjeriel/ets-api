package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.AcseTranSeries;

public class RetrieveMtnAcseSeriesResponse {
	private AcseTranSeries allowGenerate;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public AcseTranSeries getAllowGenerate() {
		return allowGenerate;
	}
	public void setAllowGenerate(AcseTranSeries allowGenerate) {
		this.allowGenerate = allowGenerate;
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
		return "RetrieveMtnAcseSeriesResponse [allowGenerate=" + allowGenerate + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
}
