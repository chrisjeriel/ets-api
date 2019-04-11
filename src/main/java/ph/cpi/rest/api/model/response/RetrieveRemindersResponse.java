package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.workflow.Reminders;

public class RetrieveRemindersResponse {
	private List<Reminders> remindersList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<Reminders> getRemindersList() {
		return remindersList;
	}
	public void setRemindersList(List<Reminders> remindersList) {
		this.remindersList = remindersList;
	}
	public PaginationResponse getPaginationResponse() {
		if(paginationResponse == null){
			paginationResponse = new PaginationResponse();
		}
		return paginationResponse;
	}
	public void setPaginationResponse(PaginationResponse paginationResponse) {
		this.paginationResponse = paginationResponse;
	}
	public SortResponse getSortResponse() {
		if(sortResponse == null){
			sortResponse = new SortResponse();
		}
		return sortResponse;
	}
	public void setSortResponse(SortResponse sortResponse) {
		this.sortResponse = sortResponse;
	}
	@Override
	public String toString() {
		return "RetrieveRemindersResponse [remindersList=" + remindersList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
