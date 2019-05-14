package ph.cpi.rest.api.model.response;

import java.util.List;

import ph.cpi.rest.api.model.PaginationResponse;
import ph.cpi.rest.api.model.SortResponse;
import ph.cpi.rest.api.model.maintenance.QuoteStatusReason;

public class RetMtnQuoteReasonResponse {
	private List<QuoteStatusReason> reasonList;
	private PaginationResponse paginationResponse;
	private SortResponse sortResponse;
	public List<QuoteStatusReason> getReasonList() {
		return reasonList;
	}
	public void setReasonList(List<QuoteStatusReason> reasonList) {
		this.reasonList = reasonList;
	}
	public PaginationResponse getPaginationResponse() {
		return paginationResponse;
	}
	public void setPaginationResponse(PaginationResponse paginationResponse) {
		this.paginationResponse = paginationResponse;
	}
	public SortResponse getSortResponse() {
		return sortResponse;
	}
	public void setSortResponse(SortResponse sortResponse) {
		this.sortResponse = sortResponse;
	}
	@Override
	public String toString() {
		return "RetMtnQuoteReasonResponse [reasonList=" + reasonList + ", paginationResponse=" + paginationResponse
				+ ", sortResponse=" + sortResponse + "]";
	}
	
}
