package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitTransactions;

public class RetrieveAcitJVEntryResponse {
	private AcitTransactions transactions;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public AcitTransactions getTransactions() {
		return transactions;
	}
	public void setTransactions(AcitTransactions transactions) {
		this.transactions = transactions;
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
		return "RetrieveAcitJVEntryResponse [transactions=" + transactions + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
