package ph.cpi.rest.api.model.response;
import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitProfCommDtl;
import ph.cpi.rest.api.model.accountingintrust.AcitProfCommSumm;

public class RetrieveAcitProfCommDtlResponse {

		private List<AcitProfCommDtl> acitProfCommDtl;
		private List<AcitProfCommSumm> acitProfCommSumm;
		private PaginationResponse paginationResponse;
		private SortResponse sortResponse;
		
		public List<AcitProfCommDtl> getAcitProfCommDtl() {
			return acitProfCommDtl;
		}
		public void setAcitProfCommDtl(List<AcitProfCommDtl> acitProfCommDtl) {
			this.acitProfCommDtl = acitProfCommDtl;
		}
		public List<AcitProfCommSumm> getAcitProfCommSumm() {
			return acitProfCommSumm;
		}
		public void setAcitProfCommSumm(List<AcitProfCommSumm> acitProfCommSumm) {
			this.acitProfCommSumm = acitProfCommSumm;
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
			return "RetrieveAcitProfCommDtlResponse [acitProfCommDtl=" + acitProfCommDtl + ", acitProfCommSumm="
					+ acitProfCommSumm + ", paginationResponse=" + paginationResponse + ", sortResponse=" + sortResponse
					+ "]";
		}
}
