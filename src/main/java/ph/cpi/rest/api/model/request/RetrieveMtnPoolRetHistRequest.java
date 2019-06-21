package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnPoolRetHistRequest {

	private Integer retHistId;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	
	public Integer getRetHistId() {
		return retHistId;
	}
	public void setRetHistId(Integer retHistId) {
		this.retHistId = retHistId;
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
		return "RetrieveMtnPoolRetHistRequest [retHistId=" + retHistId + ", paginationRequest=" + paginationRequest
				+ ", sortRequest=" + sortRequest + "]";
	}
}
