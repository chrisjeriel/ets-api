package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;
import ph.cpi.rest.api.model.maintenance.PayeeCeding;

public class RetrieveMtnPayeeCedingResponse {
	private List<PayeeCeding> payeeCeding;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	public List<PayeeCeding> getPayeeCeding() {
		return payeeCeding;
	}
	public void setPayeeCeding(List<PayeeCeding> payeeCeding) {
		this.payeeCeding = payeeCeding;
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
		return "RetrievePayeeCedingResponse [payeeCeding=" + payeeCeding + ", paginationRequest=" + paginationRequest
				+ ", sortRequest=" + sortRequest + "]";
	}
	
}
