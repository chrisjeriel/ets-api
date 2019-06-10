package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.MtnClmEvent;

public class RetrieveMtnClmEventResponse {
	private List<MtnClmEvent> eventList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<MtnClmEvent> getEventList() {
		return eventList;
	}
	public void setEventList(List<MtnClmEvent> eventList) {
		this.eventList = eventList;
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
		return "RetrieveMtnClmEventResponse [eventList=" + eventList + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
}
