package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.MtnLossCd;

public class RetrieveMtnLossCdResponse {
	
	private List<MtnLossCd> lossCd;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<MtnLossCd> getLossCd() {
		return lossCd;
	}
	public void setLossCd(List<MtnLossCd> lossCd) {
		this.lossCd = lossCd;
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
		return "RetrieveMtnLossCdResponse [lossCd=" + lossCd + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
	

}
