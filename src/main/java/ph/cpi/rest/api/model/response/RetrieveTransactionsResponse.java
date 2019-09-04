package ph.cpi.rest.api.model.response;

import java.util.ArrayList;
import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.Transaction;

public class RetrieveTransactionsResponse {

	private List<Transaction> transactions;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<Transaction> getTransactions() {
		if (transactions == null) {
			transactions = new ArrayList<Transaction>();
		}
		
		return transactions;
	}
	public void setTransactions(List<Transaction> transactions) {
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
	
	
	
}
