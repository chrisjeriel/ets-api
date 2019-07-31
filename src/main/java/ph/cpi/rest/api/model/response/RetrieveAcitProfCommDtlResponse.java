package ph.cpi.rest.api.model.response;
import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitProfCommDtl;

public class RetrieveAcitProfCommDtlResponse {

		private List<AcitProfCommDtl> acitProfCommDtl;
		private PaginationResponse paginationResponse;
		private SortResponse sortResponse;
		
		public List<AcitProfCommDtl> getAcitProfCommDtl() {
			return acitProfCommDtl;
		}
		public void setAcitProfCommDtl(List<AcitProfCommDtl> acitProfCommDtl) {
			this.acitProfCommDtl = acitProfCommDtl;
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
			return "RetrieveAcitProfCommDtlResponse [acitProfCommDtl=" + acitProfCommDtl + ", paginationResponse="
					+ paginationResponse + ", sortResponse=" + sortResponse + "]";
		}
}
