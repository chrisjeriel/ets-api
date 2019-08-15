package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveAcitAllInvestmentIncomeInvtIdRequest {
	
			private Integer 	tranId;
			private PaginationRequest paginationRequest = new PaginationRequest();
			private SortRequest sortRequest = new SortRequest();
			
			public Integer getTranId() {
				return tranId;
			}
			public void setTranId(Integer tranId) {
				this.tranId = tranId;
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
				return "RetrieveAcitAllInvestmentIncomeInvtId [tranId=" + tranId + ", paginationRequest="
						+ paginationRequest + ", sortRequest=" + sortRequest + "]";
			}
			
}
