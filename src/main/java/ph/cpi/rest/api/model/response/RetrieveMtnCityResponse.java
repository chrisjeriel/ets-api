package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.Region;

public class RetrieveMtnCityResponse {
	
	private List<Region> region;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	
	public List<Region> getRegion() {
		/*if(region == null){
			region = new Region();
		}*/
		return region;
	}
	public void setRegion(List<Region> region) {
		this.region = region;
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
		return "RetrieveMtnCityResponse [region=" + region + ", paginationResponse=" + paginationResponse + ", sortResponse="
				+ sortResponse + "]";
	}
	
}
