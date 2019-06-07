package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.TreatyLimit;

public class RetrieveMtnTreatyLimitResponse {

	List<TreatyLimit> treatyLimitList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<TreatyLimit> getTreatyLimitList() {
		return treatyLimitList;
	}
	public void setTreatyLimitList(List<TreatyLimit> treatyLimitList) {
		this.treatyLimitList = treatyLimitList;
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
		return "RetrieveMtnTreatyLimitResponse [treatyLimitList=" + treatyLimitList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
