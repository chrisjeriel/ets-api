package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnCrestaZoneRequest {
	private Integer zoneCd;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	
	public Integer getZoneCd() {
		return zoneCd;
	}
	public void setZoneCd(Integer zoneCd) {
		this.zoneCd = zoneCd;
	}
	public PaginationRequest getPaginationRequest() {
		return paginationRequest;
	}
	public void setPaginationRequest(PaginationRequest paginationRequest) {
		this.paginationRequest = paginationRequest;
	}
	public SortRequest getSortRequest() {
		return sortRequest;
	}
	public void setSortRequest(SortRequest sortRequest) {
		this.sortRequest = sortRequest;
	}
	
	@Override
	public String toString() {
		return "RetrieveMtnCrestaZoneRequest [zoneCd=" + zoneCd +", paginationRequest="
				+ paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
	
}
