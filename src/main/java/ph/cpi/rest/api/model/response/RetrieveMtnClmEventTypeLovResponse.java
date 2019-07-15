package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.MtnClmEventType;

public class RetrieveMtnClmEventTypeLovResponse {

	private List<MtnClmEventType> clmEventTypeList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<MtnClmEventType> getClmEventTypeList() {
		return clmEventTypeList;
	}
	public void setClmEventTypeList(List<MtnClmEventType> clmEventTypeList) {
		this.clmEventTypeList = clmEventTypeList;
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
		return "RetrieveMtnClmEventTypeLovResponse [clmEventTypeList=" + clmEventTypeList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
