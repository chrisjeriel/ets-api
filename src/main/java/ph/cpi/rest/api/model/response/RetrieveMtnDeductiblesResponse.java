package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.Response;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.Deductibles;

public class RetrieveMtnDeductiblesResponse extends Response{
	
	private List<Deductibles> deductibles;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<Deductibles> getDeductibles() {
		return deductibles;
	}
	public void setDeductibles(List<Deductibles> deductibles) {
		this.deductibles = deductibles;
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
		return "RetrieveMtnDeductiblesResponse [deductibles=" + deductibles + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
	

}
