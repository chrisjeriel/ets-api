package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.TreatyLayer;

public class RetrieveMtnTreatyLayerResponse {

	private List<TreatyLayer> treatyLayerList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<TreatyLayer> getTreatyLayerList() {
		return treatyLayerList;
	}
	public void setTreatyLayerList(List<TreatyLayer> treatyLayerList) {
		this.treatyLayerList = treatyLayerList;
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
		return "RetrieveMtnTreatyLayerResponse [treatyLayerList=" + treatyLayerList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
