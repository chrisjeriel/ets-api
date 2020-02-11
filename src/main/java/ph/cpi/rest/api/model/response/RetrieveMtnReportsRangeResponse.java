package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.MtnReportsRange;

public class RetrieveMtnReportsRangeResponse {
	private List<MtnReportsRange> reportsRange;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<MtnReportsRange> getReportsRange() {
		return reportsRange;
	}
	public void setReportsRange(List<MtnReportsRange> reportsRange) {
		this.reportsRange = reportsRange;
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
		return "RetrieveMtnReportsRangeResponse [reportsRange=" + reportsRange + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
}
