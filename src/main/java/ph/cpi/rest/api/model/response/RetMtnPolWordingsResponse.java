package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.MtnPolWordings;

public class RetMtnPolWordingsResponse {
	private List<MtnPolWordings> mtnPolWordings;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<MtnPolWordings> getMtnPolWordings() {
		return mtnPolWordings;
	}
	public void setMtnPolWordings(List<MtnPolWordings> mtnPolWordings) {
		this.mtnPolWordings = mtnPolWordings;
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
		return "RetMtnPolWordingsResponse [mtnPolWordings=" + mtnPolWordings + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
	
	
}
