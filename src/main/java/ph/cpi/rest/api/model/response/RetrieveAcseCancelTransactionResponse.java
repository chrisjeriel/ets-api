package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingservice.AcseCancelledTransactions;

public class RetrieveAcseCancelTransactionResponse {
	public List<AcseCancelledTransactions> cancelledTran;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcseCancelledTransactions> getCancelledTran() {
		return cancelledTran;
	}
	public void setCancelledTran(List<AcseCancelledTransactions> cancelledTran) {
		this.cancelledTran = cancelledTran;
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
		return "RetrieveAcseCancelTransactionResponse [cancelledTran=" + cancelledTran + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
}
