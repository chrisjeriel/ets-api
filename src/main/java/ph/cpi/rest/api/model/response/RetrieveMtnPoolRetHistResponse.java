package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.PoolRetHist;

public class RetrieveMtnPoolRetHistResponse {

	private List<PoolRetHist> poolRetHistList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<PoolRetHist> getPoolRetHistList() {
		return poolRetHistList;
	}
	public void setPoolRetHistList(List<PoolRetHist> poolRetHistList) {
		this.poolRetHistList = poolRetHistList;
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
		return "RetrieveMtnPoolRetHistResponse [poolRetHistList=" + poolRetHistList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
