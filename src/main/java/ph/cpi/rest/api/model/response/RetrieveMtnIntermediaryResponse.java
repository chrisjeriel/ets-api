package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.Response;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.Intermediary;

public class RetrieveMtnIntermediaryResponse extends Response {

	private List<Intermediary> intermediary;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<Intermediary> getIntermediary() {
		return intermediary;
	}
	public void setIntermediary(List<Intermediary> intermediary) {
		this.intermediary = intermediary;
	}
	
	/*public Intermediary getIntermediary() {
		return intermediary;
	}
	public void setIntermediary(Intermediary intermediary) {
		this.intermediary = intermediary;
	}*/
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
		return "RetrieveMtnIntermediaryResponse [intermediary=" + intermediary + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
	

	
	
}
