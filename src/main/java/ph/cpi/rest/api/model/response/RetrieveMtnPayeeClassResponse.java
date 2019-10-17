package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.PayeeClass;

public class RetrieveMtnPayeeClassResponse {
	
	List<PayeeClass> payeeClassList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<PayeeClass> getPayeeClassList() {
		return payeeClassList;
	}
	public void setPayeeClassList(List<PayeeClass> payeeClassList) {
		this.payeeClassList = payeeClassList;
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
		return "RetrieveMtnPayeeClassResponse [payeeClassList="
				+ payeeClassList + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
	
}
