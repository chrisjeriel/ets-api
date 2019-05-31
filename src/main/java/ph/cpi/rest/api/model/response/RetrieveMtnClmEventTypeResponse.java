package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.MtnClmEventType;

public class RetrieveMtnClmEventTypeResponse {
	private List<MtnClmEventType> eventTypeList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<MtnClmEventType> getEventTypeList() {
		return eventTypeList;
	}
	public void setEventTypeList(List<MtnClmEventType> eventTypeList) {
		this.eventTypeList = eventTypeList;
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
		return "RetrieveMtnClmEventTypeResponse [eventTypeList=" + eventTypeList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
