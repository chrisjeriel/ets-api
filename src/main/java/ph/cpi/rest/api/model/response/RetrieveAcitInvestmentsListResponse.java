package ph.cpi.rest.api.model.response;


import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitInvestments;

public class RetrieveAcitInvestmentsListResponse {
		
		private List<AcitInvestments> invtList;
		private PaginationResponse paginationResponse;
		private SortResponse sortResponse;
		
		public List<AcitInvestments> getInvtList() {
			return invtList;
		}
		public void setInvtList(List<AcitInvestments> invtList) {
			this.invtList = invtList;
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
			return "RetrieveAcitInvestmentsListRequest [invtList=" + invtList + ", paginationResponse="
					+ paginationResponse + ", sortResponse=" + sortResponse + "]";
		}
}
