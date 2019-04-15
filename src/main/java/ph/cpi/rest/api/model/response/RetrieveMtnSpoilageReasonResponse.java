package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.Spoil;

public class RetrieveMtnSpoilageReasonResponse {
	private List<Spoil> spoilageReason;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<Spoil> getSpoilageReason() {
		return spoilageReason;
	}
	public void setSpoilageReason(List<Spoil> spoilageReason) {
		this.spoilageReason = spoilageReason;
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
		return "RetrieveMtnSpoilageReasonResponse [spoilageReason=" + spoilageReason + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
}
