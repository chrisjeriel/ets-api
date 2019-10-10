package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitCancelledTransactions;

public class RetrieveAcitCancelTransactionResponse {
	public List<AcitCancelledTransactions> cancelledTran;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<AcitCancelledTransactions> getCancelledTran() {
		return cancelledTran;
	}

	public void setCancelledTran(List<AcitCancelledTransactions> cancelledTran) {
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
		return "RetrieveAcitCancelTransactionResponse [cancelledTran=" + cancelledTran + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
	
}
