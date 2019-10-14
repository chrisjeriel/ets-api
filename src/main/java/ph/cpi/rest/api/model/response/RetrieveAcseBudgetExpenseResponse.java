package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingservice.AcseBudgetExpense;

public class RetrieveAcseBudgetExpenseResponse {
	private List<AcseBudgetExpense> acseBudgetExpenseList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<AcseBudgetExpense> getAcseBudgetExpenseList() {
		return acseBudgetExpenseList;
	}
	public void setAcseBudgetExpenseList(List<AcseBudgetExpense> acseBudgetExpenseList) {
		this.acseBudgetExpenseList = acseBudgetExpenseList;
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
		return "RetrieveAcseBudgetYearResponse [acseBudgetExpenseList=" + acseBudgetExpenseList
				+ ", paginationResponse=" + paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
