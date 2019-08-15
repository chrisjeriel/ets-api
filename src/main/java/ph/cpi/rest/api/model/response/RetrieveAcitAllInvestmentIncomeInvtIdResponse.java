package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.accountingintrust.AcitAllInvtIncome;

public class RetrieveAcitAllInvestmentIncomeInvtIdResponse {
	
	private List<AcitAllInvtIncome> allInvtIncomeList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<AcitAllInvtIncome> getAllInvtIncomeList() {
		return allInvtIncomeList;
	}
	public void setAllInvtIncomeList(List<AcitAllInvtIncome> allInvtIncomeList) {
		this.allInvtIncomeList = allInvtIncomeList;
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
		return "RetrieveAcitAllInvestmentIncomeInvtIdResponse [allInvtIncomeList=" + allInvtIncomeList
				+ ", paginationResponse=" + paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
