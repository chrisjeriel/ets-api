package ph.cpi.rest.api.model.response;

import java.util.ArrayList;
import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.UserWithGrpTransaction;

public class RetrieveTransactionsResponse {

	private List<UserWithGrpTransaction> transactions;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<UserWithGrpTransaction> getTransactions() {
		if (transactions == null) {
			transactions = new ArrayList<UserWithGrpTransaction>();
		}
		
		return transactions;
	}
	public void setTransactions(List<UserWithGrpTransaction> transactions) {
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
		return "RetrieveTransactionsResponse [transactions=" + transactions + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
	
	
}
