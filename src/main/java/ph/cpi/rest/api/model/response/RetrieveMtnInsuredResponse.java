package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.Response;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.Insured;

public class RetrieveMtnInsuredResponse extends Response{
	
	private List<Insured> insured;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<Insured> getInsured() {
		return insured;
	}
	public void setInsured(List<Insured> insured) {
		this.insured = insured;
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
		return "RetrieveMtnInsuredResponse [insured=" + insured + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
	
	
	

}
