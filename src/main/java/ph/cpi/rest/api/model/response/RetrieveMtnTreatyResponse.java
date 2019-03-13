package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.Treaty;

public class RetrieveMtnTreatyResponse {
	private List<Treaty> treatyList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<Treaty> getTreatyList() {
		return treatyList;
	}
	public void setTreatyList(List<Treaty> treatyList) {
		this.treatyList = treatyList;
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
		return "RetrieveMtnTreatyResponse [treatyList=" + treatyList + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
	
	

}
