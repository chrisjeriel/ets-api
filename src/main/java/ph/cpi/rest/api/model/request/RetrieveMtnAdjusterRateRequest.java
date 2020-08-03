package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnAdjusterRateRequest {
	private String adjRateId;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	public String getAdjRateId() {
		return adjRateId;
	}
	public void setAdjRateId(String adjRateId) {
		this.adjRateId = adjRateId;
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
		return "RetrieveMtnAdjusterRateRequest [adjRateId=" + adjRateId + ", paginationRequest=" + paginationRequest
				+ ", sortRequest=" + sortRequest + "]";
	}
}
