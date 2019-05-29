package ph.cpi.rest.api.model.request;

import ph.cpi.rest.api.model.PaginationRequest;
import ph.cpi.rest.api.model.SortRequest;

public class RetrieveMtnTreatyCommissionRequest {
	private Integer quoteYear;
	private PaginationRequest paginationRequest = new PaginationRequest();
	private SortRequest sortRequest = new SortRequest();
	
	public Integer getQuoteYear() {
		return quoteYear;
	}
	public void setQuoteYear(Integer quoteYear) {
		this.quoteYear = quoteYear;
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
		return "RetrieveMtnTreatyCommissionRequest [quoteYear=" + quoteYear + ", paginationRequest=" + paginationRequest
				+ ", sortRequest=" + sortRequest + "]";
	}
}
