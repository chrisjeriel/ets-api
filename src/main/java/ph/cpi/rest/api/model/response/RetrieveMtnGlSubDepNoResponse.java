package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.MtnGlSubDepNo;

public class RetrieveMtnGlSubDepNoResponse {
	private List<MtnGlSubDepNo> glSubDepNoList;
	private PaginationResponse paginationResponse = new PaginationResponse();
	private SortResponse sortResponse = new SortResponse();
	public List<MtnGlSubDepNo> getGlSubDepNoList() {
		return glSubDepNoList;
	}
	public void setGlSubDepNoList(List<MtnGlSubDepNo> glSubDepNoList) {
		this.glSubDepNoList = glSubDepNoList;
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
		return "RetrieveMtnGlSubDepNoResponse [glSubDepNoList=" + glSubDepNoList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
