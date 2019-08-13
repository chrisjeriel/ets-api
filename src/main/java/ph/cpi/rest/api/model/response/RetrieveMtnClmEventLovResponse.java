package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.MtnClmEvent;

public class RetrieveMtnClmEventLovResponse {

	private List<MtnClmEvent> clmEventList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<MtnClmEvent> getClmEventList() {
		return clmEventList;
	}
	public void setClmEventList(List<MtnClmEvent> clmEventList) {
		this.clmEventList = clmEventList;
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
		return "RetrieveMtnClmEventLovResponse [clmEventList=" + clmEventList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
