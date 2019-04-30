package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.workflowmanager.Reminder;

public class RetrieveRemindersResponse {
	
		private List<Reminder> reminderList;
		private PaginationResponse paginationResponse;
		private SortResponse sortResponse;
		
		public List<Reminder> getReminderList() {
			return reminderList;
		}
		public void setReminderList(List<Reminder> reminderList) {
			this.reminderList = reminderList;
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
			return "RetrieveRemindersResponse [reminderList=" + reminderList + ", paginationResponse="
					+ paginationResponse + ", sortResponse=" + sortResponse + "]";
		}
		

}
