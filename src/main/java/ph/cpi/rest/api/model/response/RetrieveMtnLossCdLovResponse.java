package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.MtnLossCd;

public class RetrieveMtnLossCdLovResponse {

	private List<MtnLossCd> lossCdList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<MtnLossCd> getLossCdList() {
		return lossCdList;
	}
	public void setLossCdList(List<MtnLossCd> lossCdList) {
		this.lossCdList = lossCdList;
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
		return "RetrieveMtnLossCdLovResponse [lossCdList=" + lossCdList + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
}