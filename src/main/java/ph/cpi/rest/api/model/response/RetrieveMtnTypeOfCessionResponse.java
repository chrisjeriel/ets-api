package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.Cession;

public class RetrieveMtnTypeOfCessionResponse {

	private List<Cession> cession;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<Cession> getCession() {
		return cession;
	}
	public void setCession(List<Cession> cession) {
		this.cession = cession;
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
		return "RetrieveMtnTypeOfCessionResponse [cession=" + cession + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
}
