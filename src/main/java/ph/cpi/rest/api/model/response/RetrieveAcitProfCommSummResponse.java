package ph.cpi.rest.api.model.response;
import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitProfCommSumm;

public class RetrieveAcitProfCommSummResponse {

		private List<AcitProfCommSumm> acitProfCommSummList;
		private PaginationResponse paginationResponse;
		private SortResponse sortResponse;
		
		public List<AcitProfCommSumm> getAcitProfCommSummList() {
			return acitProfCommSummList;
		}
		public void setAcitProfCommSummList(List<AcitProfCommSumm> acitProfCommSummList) {
			this.acitProfCommSummList = acitProfCommSummList;
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
			return "RetrieveAcitProfCommSummResponse [acitProfCommSummList=" + acitProfCommSummList
					+ ", paginationResponse=" + paginationResponse + ", sortResponse=" + sortResponse + "]";
		}
}
