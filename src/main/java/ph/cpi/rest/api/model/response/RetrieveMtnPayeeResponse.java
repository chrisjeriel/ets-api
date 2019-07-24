package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.Payee;

public class RetrieveMtnPayeeResponse {
	List<Payee> payeeList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<Payee> getPayeeList() {
		return payeeList;
	}
	public void setPayeeList(List<Payee> payeeList) {
		this.payeeList = payeeList;
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
		return "RetrieveMtnPayeeResponse [payeeList=" + payeeList + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
	
	
}
