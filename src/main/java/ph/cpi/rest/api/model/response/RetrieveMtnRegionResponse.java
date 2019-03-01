package ph.cpi.rest.api.model.response;

import java.util.List;

import javax.swing.SortOrder;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.maintenance.Region;

public class RetrieveMtnRegionResponse {
	private List<Region> region;
	private PaginationRequest paginationRequest;
	private SortOrder sortOrder;
	
	public List<Region> getRegion() {
		return region;
	}
	public void setRegion(List<Region> region) {
		this.region = region;
	}
	public PaginationRequest getPaginationRequest() {
		return paginationRequest;
	}
	public void setPaginationRequest(PaginationRequest paginationRequest) {
		this.paginationRequest = paginationRequest;
	}
	public SortOrder getSortOrder() {
		return sortOrder;
	}
	public void setSortOrder(SortOrder sortOrder) {
		this.sortOrder = sortOrder;
	}
	@Override
	public String toString() {
		return "RetrieveMtnRegionResponse [region=" + region + ", paginationRequest=" + paginationRequest
				+ ", sortOrder=" + sortOrder + "]";
	}
	
}
