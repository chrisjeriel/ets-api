package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.SLType;

public class RetrieveMtnSLTypeResponse {
	List<SLType> list;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<SLType> getList() {
		return list;
	}
	public void setList(List<SLType> list) {
		this.list = list;
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
		return "RetrieveMtnSLTypeResponse [list=" + list + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
	
}
