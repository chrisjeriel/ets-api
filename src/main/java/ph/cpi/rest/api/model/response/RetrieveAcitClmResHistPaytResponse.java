package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;
import ph.cpi.rest.api.model.accountingintrust.AcitClmResHistPayts;

public class RetrieveAcitClmResHistPaytResponse {
	private List<AcitClmResHistPayts> clmpayments;
	private PaginationRequest paginationRequest;
	private SortRequest sortRequest;
	public List<AcitClmResHistPayts> getClmpayments() {
		return clmpayments;
	}
	public void setClmpayments(List<AcitClmResHistPayts> clmpayments) {
		this.clmpayments = clmpayments;
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
		return "RetrieveAcitClmResHistPaytResponse [clmpayments=" + clmpayments + ", paginationRequest="
				+ paginationRequest + ", sortRequest=" + sortRequest + "]";
	}
	
}
