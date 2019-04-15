package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnSpoilageReasonRequest {
	private String spoilCd;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	public String getSpoilCd() {
		return spoilCd;
	}
	public void setSpoilCd(String spoilCd) {
		this.spoilCd = spoilCd;
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
		return "RetrieveMtnSpoilageReasonRequest [spoilCd=" + spoilCd + ", paginationRequest=" + paginationRequest
				+ ", sortRequest=" + sortRequest + "]";
	}
}
