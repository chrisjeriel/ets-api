package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.underwriting.PolForPurging;

public class RetrievePolForPurgingResponse {
	private List<PolForPurging> polForPurging;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<PolForPurging> getPolForPurging() {
		return polForPurging;
	}
	public void setPolForPurging(List<PolForPurging> polForPurging) {
		this.polForPurging = polForPurging;
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
		return "RetrievePolForPurgingResponse [polForPurging=" + polForPurging + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
	
}
