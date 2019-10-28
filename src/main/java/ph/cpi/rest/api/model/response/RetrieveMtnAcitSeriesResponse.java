package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.AcitTranSeries;

public class RetrieveMtnAcitSeriesResponse {
	private AcitTranSeries allowGenerate;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public AcitTranSeries getAllowGenerate() {
		return allowGenerate;
	}
	public void setAllowGenerate(AcitTranSeries allowGenerate) {
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
		return "RetrieveMtnAcitSeriesResponse [allowGenerate=" + allowGenerate + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
}
