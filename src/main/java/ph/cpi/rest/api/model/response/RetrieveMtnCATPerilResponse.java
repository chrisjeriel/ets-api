package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.CATPeril;

public class RetrieveMtnCATPerilResponse {
	private List<CATPeril> catPerilList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<CATPeril> getCatPerilList() {
		return catPerilList;
	}
	public void setCatPerilList(List<CATPeril> catPerilList) {
		this.catPerilList = catPerilList;
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
		return "RetrieveMtnCATPerilResponse [catPerilList=" + catPerilList + ", paginationResponse="
				+ paginationResponse + ", sortResponse=" + sortResponse + "]";
	}
}
