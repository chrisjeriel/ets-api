package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.TreatyShare;

public class RetrieveMtnTreatyShareResponse {

	private List<TreatyShare> treatyShareList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<TreatyShare> getTreatyShareList() {
		return treatyShareList;
	}
	public void setTreatyShareList(List<TreatyShare> treatyShareList) {
		this.treatyShareList = treatyShareList;
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
		return "RetrieveMtnTreatyShareResponse [treatyShareList=" + treatyShareList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
