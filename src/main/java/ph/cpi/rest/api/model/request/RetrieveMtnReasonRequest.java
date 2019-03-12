package ph.cpi.rest.api.model.request;


import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnReasonRequest {
	private String reasonCd;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	public String getReasonCd() {
		return reasonCd;
	}
	public void setReasonCd(String reasonCd) {
		this.reasonCd = reasonCd;
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
		return "RetrieveMtnReason [reasonCd=" + reasonCd + ", paginationRequest=" + paginationRequest + ", sortRequest="
				+ sortRequest + "]";
	}

}

