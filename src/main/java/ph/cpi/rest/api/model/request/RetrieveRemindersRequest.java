package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveRemindersRequest {

		private Integer reminderId;
		private String 	assignedTo;
		private String  createUser;
		private String  module;
		private String  referenceId;
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
		public String getModule() {
			return module;
		}
		public void setModule(String module) {
			this.module = module;
		}
		public String getReferenceId() {
			return referenceId;
		}
		public void setReferenceId(String referenceId) {
			this.referenceId = referenceId;
		}
		@Override
		public String toString() {
			return "RetrieveRemindersRequest [reminderId=" + reminderId + ", assignedTo=" + assignedTo + ", createUser="
					+ createUser + ", module=" + module + ", referenceId=" + referenceId + ", paginationRequest="
					+ paginationRequest + ", sortRequest=" + sortRequest + "]";
		}
		
}
