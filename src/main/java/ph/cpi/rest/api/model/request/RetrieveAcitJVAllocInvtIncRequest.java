package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveAcitJVAllocInvtIncRequest {
	
	private Integer allocTranId;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	
	public Integer getAllocTranId() {
		return allocTranId;
	}
	public void setAllocTranId(Integer allocTranId) {
		this.allocTranId = allocTranId;
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
		return "RetrieveAcitJVAllocInvtIncRequest [allocTranId=" + allocTranId + ", paginationRequest="
				+ paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
}
