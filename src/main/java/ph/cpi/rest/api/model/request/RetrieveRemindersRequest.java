package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveRemindersRequest {

		private Integer reminderId;
		private String 	assignedTo;
		private String  createUser;
		private PaginationRequest paginationRequest;
		private SortRequest sortRequest;
		
		public Integer getReminderId() {
			return reminderId;
		}
		public void setReminderId(Integer reminderId) {
			this.reminderId = reminderId;
		}
		public String getAssignedTo() {
			return assignedTo;
		}
		public void setAssignedTo(String assignedTo) {
			this.assignedTo = assignedTo;
		}
		public String getCreateUser() {
			return createUser;
		}
		public void setCreateUser(String createUser) {
			this.createUser = createUser;
		}
		public PaginationRequest getPaginationRequest() {
			return paginationRequest;
		}
		public void setPaginationRequest(PaginationRequest paginationRequest) {
			this.paginationRequest = paginationRequest;
		}
		public SortRequest getSortRequest() {
			return sortRequest;
		}
		public void setSortRequest(SortRequest sortRequest) {
			this.sortRequest = sortRequest;
		}
		
		@Override
		public String toString() {
			return "RetrieveRemindersRequest [reminderId=" + reminderId + ", assignedTo=" + assignedTo + ", createUser="
					+ createUser + ", paginationRequest=" + paginationRequest + ", sortRequest=" + sortRequest + "]";
		}
		
}