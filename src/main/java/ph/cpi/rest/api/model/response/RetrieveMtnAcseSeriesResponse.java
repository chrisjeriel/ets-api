package ph.cpi.rest.api.model.response;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.AcseTranSeries;

public class RetrieveMtnAcseSeriesResponse {
	private AcseTranSeries maxTranNo;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public AcseTranSeries getMaxTranNo() {
		return maxTranNo;
	}
	public void setMaxTranNo(AcseTranSeries maxTranNo) {
		this.maxTranNo = maxTranNo;
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
		return "RetrieveMtnAcseSeriesResponse [maxTranNo=" + maxTranNo + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
	
}
