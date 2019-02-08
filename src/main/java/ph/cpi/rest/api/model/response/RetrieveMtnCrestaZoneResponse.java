package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.CrestaZone;

public class RetrieveMtnCrestaZoneResponse {
	private List<CrestaZone> crestaZone;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<CrestaZone> getCrestaZone() {
		return crestaZone;
	}
	public void setCrestaZone(List<CrestaZone> crestaZone) {
		this.crestaZone = crestaZone;
	}
	public PaginationResponse getPaginationResponse() {
		if(paginationResponse == null){
			paginationResponse = new PaginationResponse();
		}
		return paginationResponse;
	}
	public void setPaginationResponse(PaginationResponse paginationResponse) {
		this.paginationResponse = paginationResponse;
	}
	public SortResponse getSortResponse() {
		if(sortResponse == null){
			sortResponse = new SortResponse();
		}
		return sortResponse;
	}
	public void setSortResponse(SortResponse sortResponse) {
		this.sortResponse = sortResponse;
	}
	
	@Override
	public String toString() {
		return "RetrieveMtnCrestaZoneResponse [crestaZone=" + crestaZone +", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
